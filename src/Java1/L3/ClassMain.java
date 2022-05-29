package Java1.L3;

import java.util.Random;
import java.util.Scanner;

//Делать только одну задачу
//1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
//2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно, можно пользоваться:
//String str = "apple";
//str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово
//Используем только маленькие буквы
public class ClassMain {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        victorina();
        fieldWord();

    }

    public static void victorina() {
        int a = rand.nextInt(10);
        System.out.println("Enter the number from 0 to 9");
        for (int i = 0; i < 3; i++) {
            int b = sc.nextInt();
            String s = sc.nextLine();
            if (a == b) {
                System.out.println("Win");
                break;
            } else {
                if (i == 2) {
                    System.out.println("Loos");
                    break;
                }
                System.out.println("No");
                if (a > b) {
                    System.out.println("введенное число меньше чем загаданное");
                } else {
                    System.out.println("введенное число больше чем загаданное");
                }
            }
        }
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int anser = sc.nextInt();
        while (!(anser == 0 || anser == 1)) {
            System.out.println("Не верный ввод \nПовторить игру еще раз? 1 – да / 0 – нет");
            anser = sc.nextInt();
        }
        if (anser == 1) {
            victorina();
        } else {
            System.out.println("Bye");
        }
    }

    public static void fieldWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        for (String word: words
             ) {
            System.out.print(word+" ");
        }
        System.out.println();
        int a = rand.nextInt(words.length);
        String question = words[a];
        String answer = "";
        while (!question.equals(answer)) {
            System.out.println();
            System.out.println("Enter the word");
            answer = sc.nextLine();
            for (int i = 0; i < Math.min(question.length(), answer.length()); i++) {
                if (question.charAt(i) == answer.charAt(i)) {
                    System.out.print(question.charAt(i));
                } else {
                    System.out.print("*");
                }
            }
            for (int i = 0; i < 15-Math.min(question.length(), answer.length()); i++) {
                System.out.print("*");
            }

        }
    System.out.println();
    System.out.println("You are win!!!");
    }
}
