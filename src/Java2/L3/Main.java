//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
//Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().
package Java2.L3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[17];
        arr[0]="hello";
        arr[1]="hello";
        arr[2]="hello";
        arr[3]="world";
        arr[4]="world";
        arr[5]="hello";
        arr[6]="apple";
        arr[7]="blueberry";
        arr[8]="strawberry";
        arr[9]="juice";
        arr[10]="fresh";
        arr[11]="lemon";
        arr[12]="lyme";
        arr[13]="orange";
        arr[14]="cherry";
        arr[15]="pear";
        arr[16]="asgsdsadf";

        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++ ) {
            myMap.put(arr[i], myMap.getOrDefault(arr[i], 0)+1);
        }
        for (Map.Entry<String, Integer> o : myMap.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", 911234532);
        phonebook.add("Ivanov", 922234532);
        phonebook.get("Ivanov");

    }
}
