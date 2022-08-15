//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
package Java2.L2;

public class Main {
    public static void main(String[] args) {
        String[][] a = {{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","a"}};
        try {
            System.out.println(MySum(a));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.i+" "+e.j);

        }
    }

    public static int MySum(String[][] someArray) throws MyArraySizeException, MyArrayDataException{
        if (someArray.length!=4){
            throw new MyArraySizeException("array size no equals 4");
        }
        for (int i = 0; i<4; i++){
            if (someArray[i].length!=4){
                throw new MyArraySizeException("array size no equals 4x4");
            }
        }
        int sum = 0;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){

                try {
                    sum += Integer.valueOf(someArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("не цифра в "+ i + " " + j, i, j);
                }
            }
        }
    return sum;
    }

}
