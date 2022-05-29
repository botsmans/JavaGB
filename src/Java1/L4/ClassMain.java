package Java1.L4;

import java.util.Random;
import java.util.Scanner;

//1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;
//2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
//3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
//4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
public class ClassMain {
    static int SIZE;
    static int DOTS_TO_WIN;
    static String UselessSpace;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        System.out.println("Введите размер поля");
        SIZE = sc.nextInt();
        UselessSpace = sc.nextLine();
        System.out.println("Введите количество для победы");
        DOTS_TO_WIN = checkDOTS_TO_WIN(sc.nextInt());
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победитель!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }


    }

    public static int checkDOTS_TO_WIN(int DOTS_TO_WIN) {
        UselessSpace = sc.nextLine();
        while (DOTS_TO_WIN > SIZE || DOTS_TO_WIN < 0) {
            System.out.printf("Введите значение не больше %d", SIZE);
            System.out.println();
            DOTS_TO_WIN = sc.nextInt();
            UselessSpace = sc.nextLine();
        }
        return DOTS_TO_WIN;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("input koord X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
//        if(map[y][x]==DOT_EMPTY){
//            return true;
//        }else{
//            return false;
//        }
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        int k = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    k++;
                }
            }
        }
        return k == 0;
    }

    public static boolean checkWin(char symbol) {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    if (j + DOTS_TO_WIN - 1 < SIZE) {//horizontal
                        for (int k = 0; k < DOTS_TO_WIN; k++) {
                            if (map[i][j + k] == symbol) {
                                count++;
                                if (count == DOTS_TO_WIN) {
                                    return true;
                                }
                            } else{
                                count  = 0;
                                break;
                            }
                        }
                    }
                    if (i + DOTS_TO_WIN - 1 < SIZE) {//verticals
                        for (int k = 0; k < DOTS_TO_WIN; k++) {
                            if (map[i + k][j] == symbol) {
                                count++;
                                if (count == DOTS_TO_WIN) {
                                    return true;
                                }
                            } else{
                                count  = 0;
                                break;
                            }
                        }
                    }
                    if (i + DOTS_TO_WIN - 1 < SIZE && j + DOTS_TO_WIN - 1 < SIZE) {//diagonal
                        for (int k = 0; k < DOTS_TO_WIN; k++) {
                            if (map[i + k][j+k] == symbol) {
                                count++;
                                if (count == DOTS_TO_WIN) {
                                    return true;
                                }
                            } else{
                                count  = 0;
                                break;
                            }
                        }
                    }
                    if (i + DOTS_TO_WIN - 1 < SIZE && j - DOTS_TO_WIN + 1 > 0) {//back diagonal
                        for (int k = 0; k < DOTS_TO_WIN; k++) {
                            if (map[i + k][j-k] == symbol) {
                                count++;
                                if (count == DOTS_TO_WIN) {
                                    return true;
                                }
                            } else{
                                count  = 0;
                                break;
                            }
                        }
                    }

                }

            }
        }
        return false;
    }

}




