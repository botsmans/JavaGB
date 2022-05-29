//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
package Java1.L5;

public class ClassMain {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Ivanov Ivan2", "Engineer2", "ivivan@mailbox.com2", "8923123122", 300002, 302);
        persArray[2] = new Person("Ivanov Ivan3", "Engineer3", "ivivan@mailbox.com3", "8923123123", 300003, 303);
        persArray[3] = new Person("Ivanov Ivan4", "Engineer4", "ivivan@mailbox.com4", "8923123124", 300004, 304);
        persArray[4] = new Person("Ivanov Ivan5", "Engineer5", "ivivan@mailbox.com5", "8923123125", 300005, 305);
        for (Person person: persArray
             ) {
            person.getInfo();
        }
    }
}
