Ctrl + O - @Overrate
Alt+Insert - create getter setter constructor, Override method
Ctrl+Alt+T - select code and обернуть at somethink
Ctrl+Alt+L - форматирование кода
Alt+J - delete same line
Ctrl+W  Ctrl+Shift+W- расширить или сузить выделение
Ctrl+Shift+UpиCtrl+Shift+Down - перемещение строки
Ctrl + P — информация о параметре (применяется на аргументе метода при вызове)
Ctrl + D - Дублировать строку
Ctrl + Y - Удалить строку
Ctrl + Shift + J  - Объединить строку
Ctrl + Enter - Разделить строки
Shift + Enter - добавление строки снизу и перемещение курсора
Ctrl + Shift + U    Переключить стоящее слово рядом с кареткой в нижний / верхний регистр
Ctrl + Shift + ] / [    Выделить код до конца / начала блока
Ctrl + Delete   Удалить слово после каретки
Ctrl + Backspace    Удалить слово перед каретки
Ctrl + NumPad+/-    Развернуть / свернуть блок кода
Ctrl + Shift + NumPad+  Развернуть все
Ctrl + Shift + NumPad-  Свернуть все
Ctrl + F4   Операция «закрыть активное окно редактора»
Alt + Right/Left    Перейти к следующей / предыдущей вкладки редактора
F12 Вернуть предыдущее окно инструмента
Esc Переход к редактору


JDK=JRE+библиотеки - Java Developer Kit (для компиляции)  ]]]]]]] 
JRE - Java Runtime Environment Набор инструментов для запуска Java-программ, включая виртуальную машину
JVM - Java Virtual Machine

#CMD (after install JDK and restart PC)
javac -version
javac HelloWorld.java //происходит компиляция и в текущей дирректории появляется HelloWorld.class
javap -v HelloWorld.class //инструмент в JDK для просмотра скомпилированного файла
java HelloWorld //исполнения файла HelloWorld.class
java -classpath class_dir HelloWorld // classpath is указание dir
jar cfe HelloWorld.jar HelloWorld HelloWorld.class // cfe HelloWorld.jar is name jar, HelloWorld is name main class
//HelloWorld.class is name всех файлов которые будут упакованы в архив
jar tf HelloWorld.jar // просмотр архива не распаковывая
jar xf HW.jar //распаковка
java -jar HW.jar// run program from jar
java -classpath HW.jar HelloWorld //if не прописан главный класс
java -classpath lib.jar;HW.jar HelloWorld //добавление библиотек в classpath если они нужны для исполнения
для Linux вместо ";" ":"

#ИМЕНОВАНИЕ
первым символом может быть [a-z],"_", "$".
CamelCase
anyMethod
anyPackage
AnyClass
CONSTANTA_NAME



public class level1.s2.HelloWorld {  //class
    public static void main(String... args){ //method  //psvm - short key
        System.out.println("Hello World"); //call method (вызов метода) //sout - shot key
        int a;
        a = 5;
        int b = 10;
        int c = a + b;
        c = c + 5;
        c++;
        c+=4;
        b = c / a; //c devided by a
        b = c % a; // (остаток) residual from 9 when divided by  a
        System.out.println("a + b = " + c);


        int temp = 30;    // operator if
        if (temp > 25) {
               System.out.println("temp more 25");
        }else if (temp < 22) {
               System.out.println("temp less 22");
        }else {
           System.out.println("somethink");
        }
    }
}

public class HelloWorld{
    public static void main(String args) {
        System.out.println("Hello World!");
    }
    class Foo{} //есть возможность обьявлять несколько классов в одном файле если они вложены в основной
}
class Boo{} // или если находятся рядом не не имеют модификатора public




#ОТЛАДКА
https://javarush.ru/groups/posts/753-rukovodstvo-poljhzovatelja-intellij-idea-otladchik
режиме отладки, нажав Shift + F9
Установить/снять точку останова - Ctrl + F8 (Cmd + F8 для Mac)
Возобновить выполнение программы - F9
Перейти к следующей инструкции - F8
Перейти внутрь функции - F7
Приостановить выполнение - Ctrl + F2 (Cmd + F2)
Переключить между просмотром списка точек останова и подробной информацией о выбранной точке - Shift + Ctrl + F8 (Shift + Ctrl + F8)
Запустить отладку кода с точки на которой стоит курсор - Shift + Ctrl + F9 (если это внутри метода main())
перейти внутрь Shift + F7 (Cmd + F7 для Mac)
остановиться на какой-то другой строчке кода Alt + F9
цветную метку F11
В режиме отладки вы можете вычислить любое выражение Alt + F8

#VARIABLES
#Переменные типы
#WHOLE NUMBERS ЦЕЛЫЕ ЧИСЛА
byte is 1 byte from -128 to 127
short is 2 byte from -32768 to 32767
int is 4 byte form ~ -2billion to 2billion (Integer.MIN_VALUE, Integer.MAX_VALUE)
long is 8 byte from ~ -10 on 19power to 10 on 19power в конце надо приписать"L" (1234567890L)

byte a = 100;
int b = a; // при переводе в больший размер ошибки не возникает
byte a = (byte) b; // при переводе в меньший размер перевод делается в ручную

byte c = 100;
int d = a + c; // будет отриц. число так как сначала произойдет сложение,
//при операции которого слагаемые приводятся к большему типу переменной, но так как оба byte произойдет
переполнение и только после произойдет перевод в int

#FRACTIONAL NUMBERS ДРОБНЫЕ ЧИСЛА
float is 4 byte x,xx
double is 8 byte x,xx...

float pi = 3.14f // нужно приписывать f для float
double a = 10.8
float pi2 = pi * pi // приписывать f не нужно так как pi is float

#CHAR СИМВОЛЬНЫЙ ТИП
char ch1 = 89; //~y
char ch2 = 'Y'; //~Y
ch2 += 1; //~Z
char ch3 = \ufa34 // \u-Unicod, далее 16-ричная кодировка
#int to char
int a = 65;
char c = (char)a;
#scanner
Scanner sc = new Scanner(System.in);
char c = sc.next().charAt(0);
#проверка на char
if(c >= '0' && c <= '9')

#BOOLEAN is logical type
int temp = 26;
boolean hot = temp > 25; // ~true
if (hot) ....

<, >, <=, >=, ==, !=, &&, ||, ^ //  && - and, || - or, ^ - nor

#ПОСТИНКРЕМЕНТ и ПРЕДИНКРЕМЕНТ
#Постинкримент сначала возвращает значение переменной, а потом увеличивает его, а прединкремент наоборот.
int a = 10;
int b = a++; // b = 10, a = 11 
int c = ++a; // c = 12, a = 12


#СЫЛОЧНЫЕ ТИПЫ

#STRING
String s = "hello World";
int age = 33;
String result = "Hello, " + age //~Hello, 33 // \n - new line, \" ,

String s ="qwerty" //присвоено значение в переменную s
String s0="qwerty" //для экономии пямити s0 будет ссылаться на туже область памяти что и s
String s1 = new String("qqq") //выделено заначение в новой области и присвоено значение
s == "qwerty" //true
s1 == "qqq" //false //так как происходит сравнение со ссылкой на область памяти
s1.equals("qqq")//true

#PrRINTF
String firstName = "James";
String lastName = "Smith";
int age = 20;
System.out.printf("My name is %s %S, I'm %d years old.", firstName, lastName, age); #My name is James SMITH, I'm 20 years old.

%d   decimal integer byte, short, int, long
%f   floating-point number   float, double
%b   Boolean Object
%B   will uppercase the boolean  Object
%c   Character Capital   String
%C   will uppercase the letter   String
%s   String Capital  String
%S   will uppercase all the letters in the string    String
%h   hashcode - A hashcode is like an address. This is useful for printing a reference   Object
%n  newline - Platform specific newline character - use %n instead of \n for greater compatibility

#сравнение строк
!s1.equals(s2) //! - отрицание
str1.equalsIgnoreCase(str2) //ignorecase
regionMatches(boolean ignoreCase, int toffset, String other, int oofset, int len) //ignoreCase: надо ли игнорировать регистр символов при сравнении. Если значение true, регистр игнорируется, toffset: начальный индекс в вызывающей строке, с которого начнется сравнение, other: строка, с которой сравнивается вызывающая, oofset: начальный индекс в сравниваемой строке, с которого начнется сравнение, len: количество сравниваемых символов в обеих строках
str1.compareTo(str2) //Если возвращаемое значение больше 0, то первая строка больше второй, если меньше нуля, то, наоборот, вторая больше первой. Если строки равны, то возвращается 0

String str1 = "Java";
String str2 = new String(); // пустая строка
String s = null;   // строка не указывает на объект
String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'}); //hello
//Для следующей строки 3 -начальный индекс, 4 -кол-во символов
String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4); //come
Так как переменная не указывает ни на какой объект String, то соответственно мы не можем обращаться к методам объекта String. Чтобы избежать подобных ошибок, можно предварительно проверять строку на null: Значение null не эквивалентно пустой строке. Например, в следующем случае мы столкнемся с ошибкой выполнения:
String s = null;   // строка не указывает на объект
if(s!=null && s.length()==0)
    System.out.println("String is empty");
s.concat()   объединяет строки
s.length()   возвращает длину строки
s.valueOf()  преобразует объект в строковый вид
s.join()     соединяет строки с учетом разделителя String str = String.join(" - ", str2, str1, str3); // Hello - Java - Legasoft
s.сompare()  сравнивает две строки
s.charAt()   возвращает символ строки по индексу
s.getChars()     возвращает группу символов
s.equals()   сравнивает строки с учетом регистра
s.equalsIgnoreCase()     сравнивает строки без учета регистра
s.regionMatches()    сравнивает подстроки в строках
s.indexOf()  находит индекс первого вхождения подстроки в строку
s.isEmpty()  возвращает true, если строка пуста, иначе - false
s.lastIndexOf()  находит индекс последнего вхождения подстроки в строку
s.startsWith()   определяет, начинается ли строка с подстроки
s.endsWith()     определяет, заканчивается ли строка на определенную подстроку
s.replace()  заменяет в строке одну подстроку на другую
s.trim()     удаляет начальные и конечные пробелы
s.substring()   возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
s.toLowerCase()  переводит все символы строки в нижний регистр
s.toUpperCase()  переводит все символы строки в верхний регистр
s.toCharArray()  преобразовывает строку в массив символов

#join massive to string
String[] m = {"123", "456", "789"};
String ans = String.join(" ", m);//123456789

#split string to massive
String s = "qqq www rrr";
String[] words = s.split(" ");

#string to char
String str = "Java";
char c = str.charAt(2);
System.out.println(c); // v

#string to char array
String str = "1000000000";
//преобразовываем строку в массив
char[] chArray = str.toCharArray();


#split
String text = "FIFA will never regret it";
String[] words = text.split(" ");
for(String word : words){System.out.println(word);}

#если с начала сканируется число, а потом текст, то необходима данная конструкция
int a = sc.nextInt();
sc.next();//принимает \n после числа
String s = sc.next(); //или даже nextLine(), без разницы

#STRINGBUILDER //для одного потока//StringBuilder более производительный, чем StringBuffer, поскольку не обременен синронизацией
#STRINGBUFFET //для нескольких потоков
//Класс String представляет собой неизменяемые последовательности символов постоянной длины и частое использование объектов класса занимают много места в памяти. Класс StringBuffer представляет расширяемые и доступные для изменений последовательности символов, позволяя вставлять символы и подстроки в существующую строку и в любом месте. Данный класс гораздо экономичнее в плане потребления памяти и настоятельно рекомендуется к использованию.

#ОБОЛОЧКИ ТИПОВ
byte c;
Byte c1;
short s;
Short s1;
int a = 5;
Integer b = 5; //оболочка типа //примитивный тип int преобразуется в объект типа Integer
//что плохо сказывается на производительности
long l;
Long l1;
char ch;
Character ch1;
float f;
Float f1;
double d;
Double d1;
boolean booll;
Boolean bool;

public class Main { // пригождается во время перевода из строк в приметивные типы
    public static void main(String[] args) {
        String s = "1000";
        String s2 = "2000";
        String bool = "true";
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s2);
        System.out.println(a + b);
        boolean bool1 = Boolean.parseBoolean(bool); //всё что не true преобразуется в false
        System.out.println(bool1);

    }
}
#substring
String s = "It is Igor. He is developer.";
String name = s.substring(6, 10); //~Igor


#OBJECT
Human friend;
Human mom = new Human();
Car car = null;


#SCANNER
import java.util.Scanner;
...
Scanner sc = new Scanner(System.in);

String s1 = sc.next(); // считает строку до первого пробела
String s2 = sc.nextLine(); //считает следующую строку полностью
int i = sc.nextInt();
double d = sc.nextDouble();
float f = sc.nextFloat();
boolean b = sc.nextBoolean();//и т.д.
//после nextInt если мы хотим считать еще строки необходимо вписать String s = sc.nextLine(); так как nextInt оставляет не принятым  "\n"

#FINAL
//Первый способ: создание именованной константы.
final int n = 10 //final - неизменяемый, значение применяется только один раз 
n++ //не даст скомпилироваться
//with final workin is faster
//Второй способ: предотвращение переопределения методов
public final void run() {
//Третий способ: запрет наследования от текущего класса.
public final class A { // final в объявлении класса
}


#IF
if (a > 0) {
    System.out.println("Ваше число положительное");
}else{
    if (a < 0) {
        System.out.println("Ваше число отрицательное");
    }else{
        System.out.println("Ваше число - 0");
    }
}

//сокращенно
System.out.println((a < b) ? a : b);//сокращенный if else
return (a < 0) ? -a : a;
//сокращенно в цикле
arr[i] = arr[i]==0?1:0;

#CYCLES
#WHILE
int i = 1;
while (i <= 1000) {
sout(i);
i++;
}
sout(i)
//облость видимости у while распростроняется вне цикла (можем узнать значения i после выхода из цикла) в отличии от for

#DO WHILE
int a = 0;
do {
sout(3)
}while(a > 0) // блок кода выполняется один раз, а дальше как обычные while

#BREAK CONTINUE
break; //прерывание cycle
continue;// мгновенно завершает текущую итерацию

#FOR

for(int = 1; i < 100; i++) {
sout(i) // ~1 - 99
}

fori - сокращенная запись в idea
for(;;) - infiniti cicle
for (bite i = 100; true; i++) - infiniti cicle
for (int i = 0, j = 10; i < j; i++, j--) - несколько переменных

#FOR EACH
// подходит only for reading array
// плюсы не выйдет за пределы array and don't need to обращатся к elements of array throught its index
for (int i : nums) { // берет по очереди all elements array and присваивает them to i
sout(i);
}

String[][] words = {
       {"qqqq", "wwww", "eee"},
       {"tttttt", "asdasd", "asd"},
       {"werwe"}
};
for (String[] line : words) {
   for (String word : line) {
       System.out.print(word + " ");
   }
   System.out.println();
}


//Вывести список строк, как и массив строк
System.out.println(String.join(" ", list));

#FOR .. IN
for (E <имя переменной>: mas){/*тело цикла*/}

int[] mas = {1, 6, 4, 3, 9, 4, 5, 2, 1};
for(int r: mas){

#SWITCH CASE

switch (numberOfMonth) {
    case 1:
        sout("Jenuary");
        break;  // with out break run all
    case 2:
        sout("February");
        breack
        ...
    case 12:
        sout("December");
        breack;
    default: // действия по умолчанию
        sout("none")
        breack
}

#FLAGS
//Представим, что перед нами стоит задача определить, есть ли среди чисел, введённых пользователем, число 0. И, если нет, вывести сообщение "NO", если же есть, то вывести "YES". На самом деле, если бы не было условия с "NO", то задача решалась бы очевидно
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for (int i = 0; i < n; i++){
    int a = sc.nextInt();
    if (a == 0){
        System.out.println("YES");
        break;
    }
//Но когда же тогда выводить "NO"? Тут нам поможет понятие флага. Флаг в программировании - булевая переменная, отвечающая за ответ на какой-либо вопрос. В данном случае - есть ли 0? Как правило такие переменные называют очень понятным именем и чаще всего называют начиная с is. Вот, как решается эта задача
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
boolean is_0 = false;
for (int i = 0; i < n; i++){
    int a = sc.nextInt();
    if (a == 0){
        is_0 = true;
        break;
    }
}
if (is_0)
    System.out.println("YES");
else
    System.out.println("NO");

#RANDOM
Random rand = new Random();
int a = rand.nextInt(n);// n is max number
или
int b =(int) Math.random()*n;

#METHOD MATH
double sqrt = Math.sqrt(36); // ~6.0

#ARRAY МАССИВ
double[] a; // объявление массива, содержащего действительные числа
char[] c = {'c', 'a', 't'}; // объявление массива, содержащего символы и его заполнение

int[] nameArray = new int[12]; // 12 is array size
nameArray[0] = 31;
...
nameArray[11] = 28; // по умоланию значения 0
int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };//ДВУМЕРНЫЙ ARRAY

#вывод массива
int a = nameArray[11];
for (int i = 0; i < nameArray.th; i++) { // .length - array length
sout(nameArray[i]);
}

#заполнение массива
int[] nums = new int[100];
for (int i = 0; i < nums.length; i++) {
nums[i] = i * 10;
}

#array with two variables
for (int i = 0, j = nums.lenght - 1; i < 1000; i++, j--) 



#ARRAY
int[] arr = new int[10];- create massive with length 10
int arr1[] = new int[10];- create massive with length 10
int[][] arr2 = new int[10][10]; - two-dimensional array
#заполнение массива
for (int i = 0; i <10; i++){
    arr[i] = i* i
}
или
int[] array = {1,2,4,5,6,7}

#вывод массива
for (int i=0; i< 10;i++){
    sout(arr[i]);
}
или
sout(Arrays.toString(arr));

array.length // length of array

#создание массива объектов
Сat[] cats = new Cat[3];
cats[0].name; //если объект не проинициализирован, то обращение к его методам или переменным вызовет ошибку. //cats[0].name = "Mursik" 

#*если мы хотим передовать массив в параметр
public Team(String name, Competitor[] competitors)//нужно будет передавать new Competitor[4]
public Team(String name, Competitor... competitors)//нужно будет передавать new Human("bobi"), new Cat("Mursik"), new Dog("Sharik"), new Human("tomi")


#CLASS and CLASS INSTANCE - OBJECT
class - набор свойств // name of classes capitalized(пишутся с большой буквы)
object is instance of class - объект - экземпляр класса - это что то конкретное созданное на основе класса

класс содержит:
данные, переменные или поля// int a;
код(методы) //void b();
все вместе (переменные и методы и т.д) называются челенами класса


public class Box { //create class "Box" with wariable
    double width;
    double height;
    double length;
}

public class Main { //crate in new file class "Main", и проинициализировали class "Box"
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.height =10.3;
        myBox.length = 10.4;
        myBox.width = 39;
        double volume = myBox.height * myBox.length * myBox.width;
        System.out.println(volume);
        Box myBox2 = new Box();
        myBox2 = myBox; // коробка 2 ссылается на 1
        myBox2.length = 1.3;// длинна коробки 1 также изментится так как 2 ссылаетя на 1
        volume = myBox.height * myBox.length * myBox.width; //нужно вызвать функцию volume второй раз так как она вычисляетя в момент присвоения значения
        System.out.println(volume);
    }
}

#METHODS
//тип имяМетода(список_параметров){ тело метода ...} //тип может быть любым как примитивным(int, boolean) так и созданный нами(Box)
//void - в качестве типа если метод не возвращает ни каких данных
//если тип не void then method must to end with "return". Должен возвращатся тот тип что указан в начале метода
#METHODS in one files with Main
public class ClassMain {
    public static void main(String[] args) {
        myMethod(4)

        public static void myMethod(double a){//void - ничего не возвращает
            System.out.println(a*a)
        }


    }
}

#Переменные которые обьявлены до psvm видны всем методам
public class ClassMain {
    static int SIZE;}
    public static void main(String[] args) {}
    public static int checkDOTS_TO_WIN(){
        SIZE = sc.nextInt();}

#ООП
package lesson5

public class Cat{
    String name;
    int age;
}

public void info(){//static не пишем
 sout("Cat "+ name + age);
}

package lesson5


public class Main{
    public static void main{
        Cat cat = new Cat(); //создание экземпляра Cat (так как одном пакете обращаться можно на прямую)
        cat.name = "Barsik";
        cat.age = 5;
        cat.info();

        Cat cat2 = new Cat();
        cat.name = "Mursic";
        cat.age = 1;
        cat.info();
    }
}





#METHOD with param

public class Test {
    int square(int i) { //"int i" is param
        return i * i;
    }
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        int squere = test.square(80);
        System.out.println(squere);
    }
}

#IMPORT
import lesson1.Cat // если в одном пакете можно не импортировать

lesson1.Cat// можно писать прямо в коде без импорта или если Cat уже есть в данном пакете 

#THIS
//this - указатель на текущий объект
//так как в методе/конструкторе имя входящей переменной перекрывает имя параметра класса
//когда имя параметра и имя переменной класа совпадают пишут this. this.width - переменная класса, width - параметр, this.width = width - присвоение переменной параметра
public class Box {
    double width;
    double height;
    double length;

    void setDimens(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }
    void showVolume() {
        double volume = width * height * length;
        System.out.println(volume);
    }
    double volume() {
        return width * height * length;
    }
}
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setDimens(15, 15, 15);
        System.out.println(box1.volume());
    }
}

#Constructors Конструкторы
new Cat() // пустой конструктор, который создается автоматически
Alt+Isert // вызов конструктора
//как метод только без возвращаемого параметра(void например)

//нужны для задания начальных параметров сразу
ИмяКласса(список_Параметров) {тело конструктора}
package level1.s3OOP.lesson1;

public class Box {
    double width;
    double height;
    double length;

    public Box() { //Consrtuctor
        width = 10;//параметры заданы заранее, но их можно переопределить в main
        height = 10;
        length = 10;
    }

    void setDimens(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }
    void showVolume() {
        double volume = width * height * length;
        System.out.println(volume);
    }
    double volume() {
        return width * height * length;
    }
}

public class Main {
    public static void main(String[] args) {
        level1.s3OOP.lesson1.Box box1 = new level1.s3OOP.lesson1.Box();
        System.out.println(box1.volume());
    }
}

#Consrtructor with param (Параметризированные конструкторы)
//если создан конструктор с параметрами то создать объект без параметров уже нельзя будет
for create object сразу с param
(for fast create constructor alt+insert / constructor / select nessessary поля )
public class Box {
    double width;
    double height;
    double length;

    Box(double width, double height, double length){ //Constructor
        this.width = width;
        this.height = height;
        this.length = length;
    }

    void setDimens(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }
    void showVolume() {
        double volume = width * height * length;
        System.out.println(volume);
    }
    double volume() {
        return width * height * length;
    }
}
//now all object need to create with param else error
public class Main {
    public static void main(String[] args) {
        level1.s3OOP.lesson1.Box box1 = new level1.s3OOP.lesson1.Box(25,25,25);
        System.out.println(box1.volume());
    }
}

#Перегрузка method не путать с переопределением(@Override)
public class Test {//two methods with the same name, but diferent param and output(возращаемое значение)
    int multiple(int a, int b){
        return a * b;
    }
    double multiple(double a, double b){
        return a * b;
}
    int multiple(int a){
        return a *a;
    }
    int multiple(){
        }//пустой метод
}

    int multiple(int ... arr) { //произвольное количество аргументов
        int summ=0;
        for (int i = 0; i < arr.length; i++){
            summ += arr[i];
        }
        return summ;
    }

public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        int resultInt = test.multiple(6, 5);
        double resultDouble = test.multiple(6.8, 5.8);
        int resultQuadro = test.multiple(6);
        System.out.println(resultInt+" "+resultDouble+" "+resultQuadro);
    }
}
#если параметры одинаковые то будет выведет первым по порядку добавления в Java
    int a = 5;
    int b = 7;
    testInfo(a, b);//2

    void testInfo(int... a){
        sout(1);
    }

    void testInfo(long a, long b){
        sout(2)
    }
    void testInfo(Integer a, Integer b){
        sout(3)
    }

#Перегрузка constructors
public class Box {
    double width ;
    double height;
    double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double size){
        width = size;
        height = size;
        length = size;
    }

    public Box(){
        width =0;
        height = 0;
        length = 0;
    }

    void setDimens(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }
    void showVolume() {
        System.out.println(volume());
    }
    double volume() {
        return width * height * length;
    }
}
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(20);
        Box box2 = new Box(25,252,2);
        Box box3 = new Box();
        box1.showVolume();
        box2.showVolume();
        box3.showVolume();
    }
}

#Objects в качестве param
+++Box.java
    void compare(Box box){
        double thisVolume = volume();
        double boxVolume = box.volume();
        if (thisVolume > boxVolume) {
            System.out.println("Our box is big");
        } else if (thisVolume < boxVolume) {
            System.out.println("Those box is big");
        } else {
            System.out.println("Boxes is equals");
        }
    }
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(20);
        Box box2 = new Box(25,252,2);
        box1.compare(box2);
    }
}
#create copy of object
значения при этом ссылаются на разные переменные
+++Box.java
    public Box(Box box){
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(20);
        Box box2 = new Box(box1);
        box1.compare(box2);
    }
}

#STATIC
//означает что метод относится не к экземпляру класса а ко всему классу
//static method нельзя переопределять
public class Box {
    double width;
    double height;
    static double length;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.length = 3;
        Box box2 = new Box();
        sout(box2.length)//3 - так как static относится к классу (один для всех у экземпляров)




#если метод не использует переменных экземпляра, то мы можем добавить слово статик
public class Test {
    static int multiple(int a, int b){
        return a * b;
    }
    static double multiple(double a, double b){
        return a * b;
}
    static int multiple(int a){
        return a *a;
    }
}
# и тогда для вызова этого метода не нужно будет создавать отдельный объект
public class Main {

    public static void main(String[] args) {
        int result = Test.multiple(5);
        System.out.println(result);
    }
}
#static
public class MyMath {
    public static int square (int number){ //после добавления у метода static
    //можно в Main испльзовать метод не создавая объекта
        return number * number;
    }
    private static final double PI  = 3.14; //что бы static-method can read variable, variable must be static
    //final означает что это константа и задать её только в момент объявления
    //имя final пишестя большими буквами
    public static double length(double radius) {
        return 2 * PI * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(MyMath.square(8));
        System.out.println(MyMath.length(10));
    }
}
#передача array and some arguments
public static int sum(int[] numbers){}//array is param

public static int sum(int... numbers){//some arguments is param
    int sum = 0;
    for (int i : numbers){
        sum += i;
    }
    return sum;
    }
}


#возвращение обьекта в методе
+++Box.java
    Box increase() {
    Box box = new Box(width*2,height*2,length*2);
    return box;
    }
    #same
    Box increase() {
        return new Box(width*2,height*2,length*2);
    }
    #посложнее
    Box increase(int i) {
        return new Box(width*i,height*i,length*i);
    }
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(20);
        Box box2 = box1.increase(2);
        box1.compare(box2);
    }
}
#МОДИФИКАТОРЫ ДОСТУПА
//public//доступность отовсюду
//private //не доступен из других классов
//default (когда ничего не написано) //доступность из своего пакета
//protected //ещё не пройдено

Особенности всех уровней доступа в языке Java сведены в таблицу:
                                                         private  Модификатор отсутствует protected public
Один и тот же класс                                      +        +                       +         +
Подкласс, производный от класса из того же самого пакета -        +                       +         +
Класс из того же самого пакета, не являющийся подклассом -        +                       +         +
Подкласс, производный(extended) от класса другого пакета -        -                       +         +
Класс из другого пакета, не являющийся подклассом,
производный от класса данного пакета                     -        -                       -         +

public class Man {
    private String name; //делаем поля приватными(доступ есть только у класса), что бы оне не был
    доступен из Main
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showInfo(){
        System.out.println(name + " " + age);
    }
    public void setAge(int age){ //создаем сеттер для указания верного значения полей через Main
        if (age > 0){
        this.age = age;}
        else {
            System.out.println("age must to bo more than zero");
        }
    }
    public int getAge(){//геттер (alt+insert)
        return age;
    }
}
public class Main {
    public static void main(String[] args) {
        Man man = new Man("ivan", 27);
        man.setAge(28);
        man.showInfo();
    }
}


#import
#import using when classes locate in different package
import test.Man
если класс выделен красным, то на него можно нажать alt+Enter и строка import добавится
всё что находится в пакете java.lang не требует импорта (example: Math, String)

#НАСЛЕДОВАНИЕ CLASS
//Супер класс - родительский класс
//Подкласс - дочерний класс
//если методы и переменные в класах дублируются, проще создать один общий класс и наследовать от него другие
public class Cat extendens Animal{//extended - наследовать(расширение)
    int liveCount;//этой переменной нет
    public Cat(){//пустой конструктор
        super();//supes - означает родительский класс(тоже самое что и this но указывает на объект суперкласса)//для пустых конструкторов(тоесть для данного случая эту строку можно не писать)
        //super работает только внутри конструкторов
        //super работает так же как this но ведет к суперклассу
    }
    public Cat(String name){
        super(name);
        age = 2;//кутсруктор родителя должен вызываться первым, иначе на age будет ругаться
    }    
    public Cat(String name, int age, int liveCount){
        super(name);
        this.age = age;//так же будет обращение к родительскому классу 
        this.liveCount = liveCount; //это поле есть только у дочернего класса
    }
    @Override
    public void voice(){//переопределение метода animal Alt+Insert
        sout("mau")
    }
}
public class Dog extendens Animal{}
public class Animal {
    String name;
    int age;
    public Animal(){}//пустой конструктор
    public Animal(String name){
        this.name = name;
    }
    public Animal(String name, int age){//constructor with param
        this.name = name;
        this.age = age;
    }
    public void info(){
        sout(name+ age)
    }
    @Override//переопределение метода Object(все классы унаследованы от Object) Alt+Insert
    public String toString(){
        return "Animal"+name
    }
    public void voice(){
        sout("животное издает звук")
    }
}
public class Main{
    psvm{
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.name ="Barsik"
        dog.name = "Tusik"
        cat.info()//Barsik2
        sout(dog);//так как метод переопределен то будет выведет "Animal"+name
    }
}
#проверка наследования
cat instanceof Animal//true


#родительский обЪект, а ссылка на дочерний
public class Animal {}
public class Cat extendens Animal{
    public void findMouse{
        sout("findMouse")
    }
}
public class Main{
    psvm{
        Animal cat = new Cat();//бывает нужно если хотим создать массив из дочерних объектов
        ((Cat) cat).findMouse();//cat из Animal преобразуется в Cat иначе метод нельзя вызвать
        //сar.findMouse(); данный метод не вызовется
    }
}


#АБСТРАКТНЫЕ CLASS (про FINAL CLASS написано выше)
//Иногда суперкласс требуется определить таким образом, чтобы объявить в нём структуру заданной
//1Нельзя создать объект абстрактного класса;
//2В абстрактном классе могут быть конкретные реализации методов абстракции, не предоставляя полную реализацию каждого метода.
public abstract class Animal {// 3Класс,содержащий хоть один абстрактный метод, должен быть объявлен как абстрактный (в объявлении класса также добавляется ключевое слово abstract).
    public abstract void voice();// поскольку в суперклассе для них никакой реализации не предусмотрено, и они обязательно должны быть переопределены в подклассе
    public void jump() {
        System.out.println("Животное подпрыгнуло");
    }
}
public class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("Кот мяукнул");
    }
}

#HASHCODE
Car1.hashCode()
//if objects равны по equals then hashCode тоже будут одинаквыми. (if override)
//желательно переопределять equals и hashCode вместе
@Override
    public int hashCode() {
        return brand.hashCode() + number;//у приметивов нет hashCode
    }
//есть крохотная вероятность что hashCode совпадут при разных обьектах
//по этому лучше override through IDE alt+insert
//java7+ select поля по которым мы хотим определять

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//проверяем что две var ссылаются на один и тотже объект
        if (o == null || getClass() != o.getClass()) return false;//переданный объект не равен нул, или классы обьектов не совпадают
        Car car = (Car) o;
        return number == car.number && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, number);
    }
#EQUALS
public class Box{
    String color;
    int size;
    public Box(String color, int size){
        this.color = color;
        this.size = size;
    }
    @Override
    public boolean equals(Object obj){
        return this.color.equals(((Box)obj).color) && this.size == ((Box)obj).size;
    }
}
public class Main{
    psvm(){
        Box box1 =new Bow("red", 7);
        Box box2 =new Bow("red", 7);
        sout(box1==box2); //false//так как сравниваются ссылки
        sout(box1.equals(box2));//true//так как мы переопределили метод сравнения
    }
}

#ВЗАИМОДЕЙСТВИЕ ОБЪЕКТОВ
public class Cat{
    private String name;
    public Cat(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void eat(Plate plate){
        plate.setFood(plate.getFood()-10);
        sout(name+ " eat ");
    }
}
public class Plate{
    private int food;
    public Plate(int food){
        this.food = food;
    }
    @Override
    public String toString(){
        return "Plate{" + "food=" + food +'}';
    }
    public int getFood(){
        return food;
    }
    public void setFood(int food){
        this.food = food;
    }
}
public class Main{
    psvm{
        Cat cat = new Cat("Mursik");
        Plate plate = new Plate(100);
        sout(plate);
        cat.eat(plate);
        sout(plate);
    }
}

#SWING

public class GameWindow extends JFrame {//обязательно должен быть унаследован от JFrame
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_WIDTH = 505;
    private static final int WIN_POS_X = 500;
    private static final int WIN_POS_Y = 500;

    StartNewGameWindow startNewGameWindow;


    public GameWindow(){
        setBounds(WIN_POS_X, WIN_POS_Y, WIN_WIDTH, WIN_HEIGHT);//позиция и размер окна
        setTitel("GameWindow");//заголовок окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//при нажатии крестика закроется окно и остановится программа

        //setLayout(new BorderLayout());//по умолчанию
        //setLayout(new FlowLayout());//FlowLayout - элементы распологаются подряд
        //setLayout(new GridLayout(2, 2));//табличный, 2 столбца и строки

        JPanel jPanel = new JPanel(new GridLayout(1, 2));


        //JTexArea textArea = new JTextArea();//create text area
        //add(textArea, BorderLayout.CENTER);//add text area, закрепляя по центру

        JButton btnNewGame = new JButton("Start New Game");//create button
        jPanel.add(btnNewGame);//add button in jPanel
        btnNewGame.setPrefferedSize(new Dimension(1, 100))//1-ширина(без разницы размер), 100 - высота



        JButton btnExit = new JButton("Exit game");//create button
        jPanel.add(btnExit);//add button in jPanel

        startNewGameWindow = new StartNewGameWindow(this);


        btnExit.addActionListener(new ActionListener() {//подключение слушателя к btnExit
                    @Override
                    public void actionPerformed(ActionEvent e){
                        System.exit(0);//exit to programm
                    }
                })

        btnNewGame.addActionListener(new ActionListener() {//подключение слушателя к btnNewGame
            @Override
            public void actionPerformed(ActionEvent e){
                //sout("press btnNewGame");//output to console
                //textArea.appand("press btnNewGame\n");//вывод в textArea
                startNewGameWindow.setVisible(true);
            }
        })


        add(jPanel, BorderLayout.SOUTH);//add jPanel to down





        setVisible(true);//показать экран

        
    }
}

public class StartNewGameWindow extends JFrame{
    private final GameWindow gameWindow;

    public StartNewGameWindow(GameWindow gameWindow){
        this.gameWindow = gameWindow;
        setVisible = false;
    }
}

public class Main{
    psvm(){
        new GameWindow();
    }
}

#INTERFACE
//определяет какие методы должны быть, но не определяет как они должны быть реализованы (c версии 1.8 разрешает реализовывать)
//методы в классах наследниках должны быть переопределены иначе будет ругаться
//полиморфзм - один интерфейс, множество реализаций (у всех дочерних классов вызывается один итот же метод)
//Interface - cоздан для того что бы не создавать метод у родительского класса, так как не для всех дочерних классов он должен работать
//интерфейс по своей сути является абстрактным классом у которого нет полей, а есть только методы которые обязательно
public interface CanRun {
    void run(int dist);
}

public interface CanJump {
    void jump(int height);
    default void superJump(int height){//default - реализация прямо в интерфейсе
        sout("jump")
    }
}

public interface ActionGo extends CanJump, CanRun {//интерфейсы могут наследоваться от других интерфейсов
    int height = 5; //у интерфейсов могут быть классы, но они должны быть проинициализированы
    void swim(int dist);
}

public class Cat implements CanRun, CanJump{//implements - наследование от интерфейса
}

    @Override void run(int dist){
    }
    @Override void jump(int height){
    }

public class Dog implements{


    @Override void run(int dist){
    }
    @Override void jump(int height){
    }
    @Override void superJump(int height){
    }
    @Override void swim(int dist){
    }
}

public class Main{
    msvm{
        Cat cat = new Cat();
        cat.run(5);
        cat.jump(6);
        cat.superJump(8);
    }
}

#массивы из интерфейсов //можно делать массивы из интерфейсов в которые вписаны объекты у которых есть данный интерфейс
public class Human implements Competitor {
    String name;

public class Сфе implements Competitor {
    String name;

public interface Competitor {
    void run(int dist);
public class Main {
    public static void main(String[] args) {
        Competitor[] competitors={new Human("Bob"),
        new Cat("Vaska")}

#ENUM перечисления
//перечисление значений
//статические по этому new писать не нужно
public enum Fruit {
    ORANGE, APPLE, BANNANA, CHERY;
}

public class Main {
    psvm(){
        Fruit fruit = Fruit.APPLE; //fruit му можем присвоить только то что есть в Fruit
        //добавлять новые значения во Fruit тоже нльзя
        sout(fruit);//APPLE
        for (Fruit f:Fruit.values()) {
            sout(f.ordinal()+" ");//show position
            sout(f.name());//show value
            sout(f == Fruit.APPLE);
            sout(f.price);
        }
    }
}

#можно добавить параметры
public enum Fruit {
    ORANGE(5), APPLE(7), BANNANA(9), CHERY(8);
    int price;

    Fruit(int price) {
        this.price = price;
    }
    Fruin(){
        this.price = price;
    }

}

#ВНУТРЕННИЕ , ВЛОЖЕННЫЕ(статик) и ЛОКАЛЬНЫЕ КЛАССЫ
//для внешних ничего не доступно, для внутренних доступно всё
public class Outer {
    private int outX = 8;
    private static int outY = 9;

    class Inner {
        private int inX = 10;

        public void info(){
            sout(outX);
            sout(inX);
        }
    }

    static class StatInner{//вложенный класс  (статик) классы могут вызвать только статик переменные
        public void info(){
            sout(outY);
        }
    }

    public void someThing(){
        int someX=7;

        class LocalClass{//локальный класс находиться внутру какого либо метода или кодового блока
            public void info(){
                sout(outX);
                sout(someX);
            }
        }
        new LocalClass().info();
    }
}
public class Main {
    psvm(){
        Outer.Inner inner = new Outer.new Inner();//так можно создать экземпляр внутреннего коласса
        inner.info();

        Outer outer = new Outer();
        outer.someThing();//print outX and someX//таким образом к локальному классу есть доступ
    }

#EXCEPTIONS

try{//блок кода с ошибкой
    int a = 0;
    int b = 5;
    sout(b/a); //первое исключение


    int[] arr = {3, 5, 6};
    sout("exception")
    arr[99] = 67;//до данного исключения не дойдет так как будет поймано первое
}catch (ArithmeticException e){//поимка типа исключения ArithmeticException
    sout(e.getMessage());//show exception
}catch (ArrayIndexOutOfBoundsException e){//поимка типа исключения ArrayIndexOutOfBoundsException
    sout(e.getMessage());//show exception
}catch (ArrayIndexOutOfBoundsException | ArithmeticException e){//вариант записи сразу нескольких исключений
    sout(e.getMessage())
    e.printStackTrace(); //вывод трасировки ошибки в консоль




#throw //перекидывание исключений
try {

    try{
        int[] arr = {3, 5, 6};
    sout("exception")
    arr[99] = 67;
    }catch (ArrayIndexOutOfBoundsException e){
    sout(внутреннее exception);
    throw e; //генерирует исключение, тем самым показывая его внешнему try catch

}}catch (ArrayIndexOutOfBoundsException e){
    sout(внешнее exception);
//будет выведено: внутреннее exception\n внешнее exception



throw new ArithmeticException("новое exception");//создание нового exception



public static int mySqrt(int x){
    if (x>=0){
        return x/2;
    }
    throw new ArithmeticException("Корень из отрицательного числа" + x)
}


#finally

try{
    FileInputStream fis = new FileInputStream("1.txt");//если эту строку напечатать без try catch то будет ругаться и предлагать Alt+Enter где можно выбрать try catch
}catch (FileNotFoundException e){
    e.printStackTrace();
}finally{//данный блок выполняется в любом случаи даже если происходит необработанное исключение
    sout("строка которая выведется в любом случае")
}


#проброска сигнатуры метода

    try{
        someThink("2.txt");
    } catch (FileNotFoundException e) {
        e.printStackTrace
    }

public static void someThink(String fileName) throws FileNotFoundException {
    FileInputStream fis = new FileInputStream(fileName);//если эту строку напечатать без throw то будет ругаться и предлагать Alt+Enter где можно выбрать throw
}


#создание своего класса exception

public class FactorialException extends Exception {
    private int number;
    public int getNumber(){
        return number;
    }
    public FactorialException(String message, int number) {//при выборе конструктора можно выбрать также передачу Exception e
        super(message);
        this.number = message;
    }
}

public class Main{
    psvm(){
        try{
            sout(fact(5));//если эту строку напечатать без try catch то будет ругаться и предлагать Alt+Enter где можно выбрать try catch так как в методе есть throw c exception
        }catch(FactorialException e){
            sout(e.getNumber)//также можем выводить параметры 
            e.printStackTrace
        }


    }
    public static int fact(int n) throws FactorialException {
        if (n < 1) {
            throw new FactorialException("Значение меньше 0", n);
        }
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}








   


     












#COLLECTOIONS

//у всех коллекций toString переопределен
//поддерживают итератор

#ARRAYLIST //по простому
//Для создания простых списков применяется интерфейс List, который расширяет функцональность интерфейса Collection
//create ArrayList
import java.util.ArrayList;
class Example {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(); // в <> можно указывать что принимать, что бы не принять лишнего
    }
}

sp.add(index, obj)//    добавляет в список по индексу index объект obj
sp.addAll(index, col)// добавляет в список по индексу index все элементы списка col. Если в результате добавления список был изменен, то возвращается true, иначе возвращается false
sp.get(index)// возвращает объект из списка по индексу index
sp.set(index, obj)//    присваивает значение объекта obj элементу, который находится по индексу index
sp.indexOf(obj)//   возвращает индекс первого вхождения объекта obj в список. Если объект не найден, то возвращается -1
sp.lastIndexOf(obj)//   возвращает индекс последнего вхождения объекта obj в список. Если объект не найден, то возвращается -1
sp.remove(index)//  удаляет объект из списка по индексу index, возвращая при этом удаленный объект
sp.remove((String) obj)//  удаляет первый объект из списка поиском объекту, возвращая при этом удаленный объект
sp.toArray()//  превращает список в массив
sp.contains(obj)//  проверяет, есть ли элемент obj в списке sp. Возвращает значение boolean
sp.size()// находит размер списка (количество элементов)
sp.subList( start, end)//получает набор элементов, которые находятся в списке между индексами start и end
sp.ensureCapacity(2000);//по умолчанию ArrayList add массив с capacity 10, так можно задать за ранее большой
sp.trimToSixe();//убирает лишнюю capacity

ArrayList<String> al2 = new ArrayList<>(al);//al2 вберет в себя весь al

people.add("Sam");
people.add(1, "Bob"); // добавляем элемент по индексу 1
// проверяем наличие элемента
if(people.contains("Tom")){System.out.println("ArrayList contains Tom");}
people.remove("Robert");// удаление конкретного элемента
people.remove(0);// удаление по индексу
for(String person : people)//поскольку класс ArrayList реализует интерфейс Iterable, то мы можем пробежаться по списку в цикле аля for-each
//Хотя мы можем свободно добавлять в объект ArrayList дополнительные объекты, в отличие от массива, однако в реальности ArrayList использует для хранения объектов опять же массив. По умолчанию данный массив предназначен для 10 объектов. Если в процессе программы добавляется гораздо больше, то создается новый массив, который может вместить в себя все количество. Подобные перераспределения памяти уменьшают производительность. Поэтому если мы точно знаем, что у нас список не будет содержать больше определенного количества элементов, например, 25, то мы можем сразу же явным образом установить это количество, либо в конструкторе: ArrayList<String> people = new ArrayList<String>(25);, либо с помощью метода ensureCapacity: people.ensureCapacity(25)

//Большая часть коллекций, таких как список работает только с ссылочными типами данных. не Int, а Integer

#перевод arrayList to array
List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
Integer[] arr = new Integer[list.size()];
list.toArray(arr);


public class MyArrayList {//посложнее
    private String[] array = new String[10]; //изначальный размер массива
    private int size = 0; //реальное количество элементов в массиве

    public void add(String s) {//method for add element
        array[size] = s;
        size++;
        if (size == array.length) {//if array full, create array with double size
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index > 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }
    public void remove(String s){
        int index = -1;
        for (int i = 0; i < size; i++){
            if(s.equals(array[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            remove(index);
        }
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index > 0 && index < size) {
            return array[index];
        } else {
            return "Element not found";
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyArrayList employees =new MyArrayList();
        employees.add("Nikita");
        employees.add("Igor");
        employees.add("Daniil");
        employees.add("Ilya");
        employees.add("Aleksey");
        employees.add("Sergey");
        employees.add("Ivan");
        employees.remove(2);
        employees.remove("Ivan");
        employees.remove("Ivan");
        for(int i = 0; i < 100; i++){
            employees.add("employess" + i);
        }
        for (int i = 0; i < employees.getSize(); i++){
            System.out.println(employees.get(i));
        }
    }
}


#ИТЕРАТОР ITERATOR

Iterator<String> iter = al.iterator(); //al - какойто arrayList
while (iter.hasNext()){
    if (iter.next().equals("somethink")){
        iter.remove();
    }
}

#LISTERATOR
//При работе с List мы можем использовать “расширенный” вариант итератора
hasPrevious() - проверка есть ли элемент слева;
previous() - переход на левый элемент и возврат ссылки на него;
nextIndex() - получение индекса следующего элемента;
previousIndex() - получение индекса предыдущего элемента;
add() - добавить новый элемент на то место, на которое указывает итератор;
set() - изменить элемент, на который указывает итератор.

#LINKEDLIST

LinkedList<Integer> ll = new LinkedList<>();
ll.add(3);//add(2, 66)//вставить перед 2-ым индексом
ll.offer(8);//тоже самое
ll.offerLast(8);
ll.addLast(6);//тоже самое (для двухсвязной очереди)

ll.offerFirst(8);//добавить элемент в начало строки
ll.addFirst(8);//добавить элемент в начало строки

ll.getFirst();//возвращает элемент, но выдает exception если элемента нет
ll.peekFirst();//возвращает элемент, выдает Null если элемента нет

ll.getLast();//возвращает элемент, но выдает exception если элемента нет
ll.peekLast();//возвращает элемент, выдает Null если элемента нет
ll.elemint();//возвращает элемент, но выдает exception если элемента нет
ll.peek();//возвращает элемент, выдает Null если элемента нет

ll.removeFirst();//возвращает первый элемент и удаляет его
ll.pollFirst();//возвращает первый элемент и удаляет его

ll.removeLast();//возвращает последний элемент и удаляет его
ll.remove();//возвращает последний элемент и удаляет его
ll.poll();//возвращает первый элемент и удаляет его
ll.pollLast();//возвращает первый элемент и удаляет его


Queue<Integer> queue = new LinkedList<>(ll);//очередь основана на linkedList, но в ней нужно пользоваться толь ко методами из очереди (poll, peek, pop...)

PreorityQueue<Integer> pq = new PreorityQueue<>();//выдает по приоритету а не по первенству добавления 
pq.add(5);
pq.add(9);
pq.add(1);
sout(pq.poll());//1
sout(pq.poll());//5
sout(pq.poll());//9

#COMPARATOR

#HASHSET

public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();//используется в том случаи когда в коллекции не должно быть повторяющихся значений
        //аналогична словарю в python //нет индексов, перебор только foreach //основан на вычислении hash у объекта
        names.add("Jon");
        names.add("lola");
        names.add("Stive");
        names.add("Anna");
        names.add("Anna");
        for (String name : names) {
            System.out.println(name);

        }
    }
}
#TREESET
public class Main {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();//тотже HashSet но хранит всё в алфавитном порядке
        //или в порядке возрастания для Integer и работает медленнее
        names.add("Jon");
        names.add("lola");
        names.add("Stive");
        names.add("Anna");
        names.add("Anna");
        for (String name : names) {
            System.out.println(name);

        }
    }

#LINKEDHASHSET
//тотже HashSet но сохраняет все в порядке добавления

#MAP
//не относится к коллекциям так как нет итератора//как словарь в питоне//при добавлении одинакового ключа, значения перезаписываются
Map<String, Integer> map = new HashMap<>();//<Key, Value>
map.put("Vaska", 5);//add element
map.put("Murka", 7);
map.put("Rizik", 9);
hm.getOrDefault(id, "Default");//если такого ключа нет присвоит "Default"

Set<Map.Entry<String, Integer>> setM = map.entrySet();//так как итератора в мапе нет и быват нужно пройти по всем элементам, то можно перобразовать в set
for (Map.Entry<String, Integer>, Integer es:setM){
    sout(es.getKey()+"="+es.getValue());
}

#OBJECT
//all classes in Java extend from class Object
//sout(box)//~Box@13e123d//так можно увидеть полное имя обьекта и его насдовательность (класс Object не показывается)
public class Empty {//пустой класс
}
public class Main {
    public static void main(String[] args) {
        Empty empty = new Empty();
        empty.toString();//даже у пустого класа есть методы так как он extend of Object
        //и как и любой метод его можно переопределить
    }
}
public class Box {
...
    @Override//method toString is overrided
    public String toString() {
        return "hight: "+ height+",\nwidth: "+ width+",\nlength: "+ length;
    }
}
public class Main {
    public static void main(String[] args) {
        Box box = new Box(2,5,6);
        System.out.println(box);
    }
}
#String.format()
String s = String.format("width: %d,\nlength: %d,\nheight: %d", width, length, heigth);//%d - подставка var

#Math.random();//0-0.9999999...
double Math.random() * 6;//0-5.99999...
sout(random)
int result1 = (int) (Math.random()*6 +1)//1-6

#МНОГОПОТОЧНОСТЬ
#Первый способ создания многопоточности создать класс наследуемый от Thread
public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(getName()+" "+ i);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1")
        MyThread t2 = new MyThread("t2")

//        t1.start();//потоки запускаются параллельно
//        t2.start();

        t1.run();//потоки запускаются последовательно
        t2.run();
    }
}

#Второй способ создания многопоточности создать класс наследуемый от интерфейса Runnabl
#второй способ более предпочтителен так как при наследовании от класса больше не от чего наследоваться не получиться
public class MyRunnable implements Runnable{
    private String name;

    public MyRunnable(
    this.name = name;
)
    @Override
    public void run(){

    }

    public String getName(){
        public void run(){
            for (int i = 0; i < 10; i++){
                System.out.println(getName()+" "+ i);
            }
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("t1"));
        Thread t2 = new Thread(new MyRunnable("t2"));

        t1.start();//потоки запускаются параллельно
        t2.start();
        t1.run();//потоки запускаются последовательно
        t2.run();

    }
}

#Третий способ через анонимные классы
public class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable{
            @Override
            public voi run(){
                for (int i = 0; i < 10; i++){
                    System.out.println(i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable{
            @Override
            public voi run(){
                for (int i = 0; i < 10; i++){
                    System.out.println(i);
                }
            }
        });
    }
}

#Четвертый способ через лямда выражения
#лямда выражения можно применять только если у интерфейса определен только один метод, то его прожно переписать через люмду
public class Main{
    public static void main(String[] args) {
        Thread t1 - new Thread(()->{ // ()- метод у которого нет аргументов // -> - заменить // {тело метода Run}
            for (int i = 0; i < 10; i++){
                System.out.println(i);
            });
            Thread t2 - new Thread(()->{
                for (int i = 0; i < 10; i++){
                    System.out.println(i);
                });
                t1.start();//потоки запускаются параллельно
                t2.start();
                t1.run();//потоки запускаются последовательно
                t2.run();
            }
        }

//Thread is class
//Runnable is interface
public class RunnableTimer implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 1_000_000; i++) {
                System.out.println("ClassThread " + i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {

        }
    }
}
public class Main {
    public static void main(String[] args) {
        RunnableTimer runnableTimer = new RunnableTimer();//create class with interface Runnable
        Thread timer = new Thread(runnableTimer); //create new thread
        timer.start();//запуск потока
        Thread timer1 = new Thread(new Runnable() { //anonymous class
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 1_000_000; i++) {
                        System.out.println("AnonymousThread " + i);
                        Thread.sleep(1000);//stop thread in 1 second
                        // обязательно оборачивать в tryCatch иначе ругается, лучше обернуть всё тело потока так, как
                        // если не сработает sleep будет не то, лучше весь поток
                    }
                } catch (Exception e) {
                }
            }
        });
        try {//обычный поток в майне
            for (int i = 0; i < 1_000_000; i++) {
                System.out.println("MainThread " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e1) {
        }
    }
}
#становка одного потока другим
public class Main {
    static boolean isFive = false;//global var// static because, идет аобращение из потока метода main который static
    public static void main(String[] args) {
        Thread timer2 = new Thread(new Runnable() {//поток с while
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (true) {
                        System.out.println("WhileAnonymousThread " + i);
                        i++;
                        Thread.sleep(1000);
                        if (i > 4){
                            isFive = true;//change global var
                            System.out.println(isFive);
                        }
                    }
                } catch (Exception e2) {
                }
            }
        });
        timer2.start();
        Thread timer3 = new Thread(new Runnable() {//поток с while which ending when isFive = false
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (!isFive) {
                        System.out.println("WhileAnonymousThread2 " + i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception e2) {
                }
            }
        });
        timer3.start();

    }
}
#ТЕСТИРОВАНИЕ
//JUnit - библиотека для тестирования //что бы дабавить зависимость нужно использовать систему сборки Gradle and Maven
//Gradle часто используется в андройде
//Можно добавить в новом проекте//file/new.../project/Gradle/Next
//file build.gradle - for add зависимостей в проект.//Зависимость добавляется в группу dependencies
//lib junit добавлена по умолчанию
//в модуль src/main/java add our class
public class Calc {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a + b;
    }
}
//для создания теста select class alt+Enter create test/ select last teesting library (JUnit 5) , (below) select method
//for testing (add).
//тестировочный класс создается src/test/java/ClassNameTest c анотацией @Test in method
class CalcTest {

    @Test
    void add() {
        Calc calc = new Calc();
        int expected = 15;//какой должен быть результат
        int result = calc.add(5, 10);//использование метода
        assertEquals(expected, result);//сравнивает полученные значения
        int expected1 = 25;//второй тест
        int result1 = calc.add(5, 20);
        assertEquals(expected1, result1);
        double expected2 = 15; //тест с double
        double result2 = calc.add(5.0, 10.0);
        assertEquals(expected2, result2, 0.001);//0.001 величена погрешности необходимо для double
    }
}

#если методов много и чтобы для каждого не создавать экземпляр, есть конструкция @Before и @After для прописи в конце
class CalcTest {
    private Calc calc;//создаем переменную экземпляра
    @BeforeEach//will add before each method
    public void setUp(){
        calc = new Calc();
    }
    @Test
    void add() {
        int expected = 15;//какой должен быть результат
        int result = calc.add(5, 10);//использование метода
        assertEquals(expected, result);//сравнивает полученные значения
        int expected1 = 25;
        int result1 = calc.add(5, 20);
        assertEquals(expected1, result1);
        double expected2 = 15; //тест с double
        double result2 = calc.add(5.0, 10.0);
        assertEquals(expected2, result2, 0.001);//0.001 величена погрешности необходимо для double
    }
    @Test
    void divide() {
        int epected = 4;
        int result = calc.divide(8, 2);
        assertEquals(epected, result);
    }
    @AfterEach
    public  void close(){}

    #общепринято делать тест под одн значение и называть соответственно
    @Test
    public void whenAddTenToFiveAsIntThenResultFifteen(){//такое название норма
        int expected = 15;//какой должен быть результат
        int result = calc.add(5, 10);//использование метода
        assertEquals(expected, result);//сравнивает полученные значения
    }
}
#test на ввод некорректного значения
@Test
void whenInputIncorrectValueThenThrowException() {
    int  expected = 1;
    int result = 0;
    try {//есл ловится ошибка то result = 1 что совпадает с ответом
        result = calc.add("asdfsfa", "5");
    } catch (Exception e) {
        result = 1;
    }
    assertEquals(expected, result);
}
//или более коротко и правильно
@Test
void whenInputIncorrectValueThenThrowException() {
    boolean wasException = false;
    try {//есл ловится ошибка то result = 1 что совпадает с ответом
        calc.add("asdfsfa", "5");
    } catch (Exception e) {
        wasException = true;
    }
    assertTrue(wasException);//проверка на True is assertTrue
}
//ещё короче но у меня не заработало
@Test(expected = NumberFormatException.class)
void whenInputIncorrectValueThenThrowException() {
    calc.add("asdfsfa", "5");
}
#Бросание исключений
public Car get(int index) {
    if (index<0 || index>=size){
        throw new IndexOutOfBoundsException();//throw - бросает исключение
    }
    return array[index];
}

#ArrayList
public class Car {
    private String brand;
    private int number;

    public Car(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return number;
    }
}
//принцип solid когда с начала пишется интерфейс и тесты, а потом всё остальное
public interface CarList {
    Car get(int index);
    void add(Car car);
    boolean remove(Car car);
    boolean removeAt(int index);
    int size();
    void claer();
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarListTest {

    private CarList carList;

    @BeforeEach
    public void setUp() throws Exception{
        carList = new CarArrayList();
    }
    @Test
    public void whenAdded100ElementsThenSizeBe100(){
        for(int i = 0; i < 100; i++){
            carList.add(new Car("Brand"+i, i));
        }
        assertEquals(100, carList.size());
    }
    @Test
    public void whenElementRemovedByIndexThenSizeMustBeDecreased(){
        assertTrue(carList.removeAt(5));
        assertEquals(99, carList.size());
    }
    @Test
    public void whenElementRemovedThenSizeMustBeDecreased(){
        Car car = new Car("Toyota", 15);
        carList.add(car);
        assertEquals(101, carList.size());
        assertTrue(carList.remove(car));
        assertEquals(100,carList.size());
    }
    @Test
    public void whenNonExistentElementRemovedThenReturnFalse(){
        Car car = new Car("Toyota", 15);
        assertFalse(carList.remove(car));
        assertEquals(100, carList.size());
    }
    @Test
    public void whenListClearedThenSizeMustBe0(){
        carList.claer();
        assertEquals(0, carList.size());
    }
    @Test
    public void whenIndexOutOfBoundsThenThrownException(){
        Assertions.assertThrows(IndexOutOfBoundsException.class, () ->{
            carList.get(100);
        });
    }

    @Test
    public void methodGetReturnedRightValue() {
        Car car = carList.get(0);
        assertEquals("Brand0", car.getBrand());
    }
}
import java.util.Arrays;

public class CarArrayList implements CarList {

    private Car[] array = new Car[10];
    private int size = 0;

    @Override
    public Car get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public void add(Car car) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);//below more long copy array
//            Car[] newArray = new Car[array.length*2];
//            for(int i = 0; i <array.length; i++){
//                newArray[i] = array[i];
//            }
//            array = newArray;
        }
        array[size] = car;
        size++;
    }

    @Override
    public boolean remove(Car car) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(car)) {//сравнивать обьекты следует через equals
                removeAt(i);
            }
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {//при удалении одного элемента все следующие смещаются на один
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void claer() {
        array = new Car[10];
        size = 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
#System.arraycopy
//coppy array, arraycopy may copy elements of array to array, and elements of array to otherArray
int[] arraySource = {0, 1, 2, 3, 4, 5, 6};
int[] arrayDestination = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
System.arraycopy(arraySource, 2, arrayDestination, 3, 4);//~0, 0, 0, 2, 3, 4, 5, 0, 0, 0
//arraySource-откуда, 2 - откуда-позиция, arrayDestination - куда, 3 - куда-позиция, 4 - сколько элементов скопировать
//можно делать не создавая доп массива

#LinkedList (Collection) (Связанный список)
//in LinkedList have class Node
class Node{// Node is ветвь
    Node previous; //previous element with type is Node
    T value; //текущий элемент, того типа которые мы хотим хранить в коллекции
    Node next; //next element with type is Node
}
//when we create экземпляр of class LinkedList when created two var type of Node (link to fist
// and last elements )
Node first;
Node last;
int size = 0;

//if we create first element (add(5))
Node
previous = null; // ни на что не ссылается
value = 5;
next = null; // ни на что не ссылается
//так как это единственный элемент он и записывается в переменные нашего экземпляра first and last, size = 1;
// (add(7))
Node
previous; //равен значению предыдущему элементу
value = 7;
next = null; // ни на что не ссылается
//значение next в предыдущем элементе присваевыем ссылку на этот элемент, меняем last в переменной экземпляра
// и size + 1;
//и т.д. у нас получается связанный список

//если мы хотим узнать значение первого элемента (get(0)) , то ссылаемся на первый элемент,
//если второго то ссылаемся на первый, а с него на второй и т.д.

//вставка в середину массива (add(100, 2)) переписываем previous третьего(в последствии четвертого)
//элемента на этот(в последствии третьего) и next второго на этот(в последствии третьего), size + 1
//удаление наоборот

//в качестве примера создадим class CarLinkedList в пакете прошлого урока (ArrayList)
//подключаем тот же интерфейс CarList и Ctrl+O
//тесты также уже написаны
//также создаем внутри класса приватный класс Node
    private static class Node { //так как мы не испльзуем методы класса, до делаем его static, но таже мы не сможем
    //ссылаться на переменные класса в котором мы находимся
        private Node previous;
        private Car value;
        private Node next;
    }

public class CarLinkedList implements CarList {

    private Node first;//ссылка на первый элемент
    private Node last;//ссылка на последний элемент
    private int size = 0;//размер цепи

    @Override
    public Car get(int index) {
        return getNode(index).value;
    }

    @Override
    public void add(Car car) {
        if (size == 0) {
            first = new Node(null, car, null);//create constructor to class Node
            last = first;
        } else {
            Node secondLast = last;//предпоследний элемент
            last = new Node(secondLast, car, null);
            secondLast.next = last;//присваиваем предпоследнему элементу link to next(last) Node
        }
        size++;
    }

    @Override
    public void add(Car car, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(); //Then throw exception
        }
        if (index == size) {
            add(car);
            return; //что бы цикл закончился
        }
        Node nodeNext = getNode(index);
        Node nodePrevious = nodeNext.previous;
        Node newNode = new Node(nodePrevious, car, nodeNext);
        nodeNext.previous = newNode;
        if (nodePrevious != null) {//если индекс равен нулю то строки ниже вызовет ошибку так как будет null.next
            nodePrevious.next = newNode;
        } else {
            first = newNode;
        }
        size++;
    }

    @Override
    public boolean remove(Car car) {
        Node node = first;
        for (int i = 0; i < size; i++){
            if (node.value.equals(car)) {//do сравнение through .equals
                return removeAt(i); //return , что бы прервать метод и возвращает true,
            }
            node = node.next;//если сравнение не удалось
        }
        return false;//false если ничего не нашел
    }

    @Override
    public boolean removeAt(int index) {
        Node node = getNode(index);
        Node nodeNext = node.next;
        Node nodePrevious = node.previous;
        if (nodeNext != null) {//when remove last element
            nodeNext.previous = nodePrevious;
        } else {
            last = nodePrevious;
        }
        if (nodePrevious != null) {//when remove first element
            nodePrevious.next = nodeNext;
        } else {
            first = nodeNext;
        }

        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    private Node getNode(int index) {
        if (index<0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private static class Node {
        private Node previous;
        private Car value;
        private Node next;

        public Node(Node previous, Car value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }

}
//and change in CarListTest(in Test Folder) CarArrayList to CarLinkedList

#Память в Java
//есть Stack and Heap(куча)
//в Stack хранятся все примитивные типы и ссылки ссылочного типа
//размер Stack 1Mb
//в Heap хранятся сами объекты ссылочного типа
//размер Heap - размер оперативной памят

#сравнение through equals
//все не примитивные(ссылочные) типы следует сравнивать через equals так как иначе будем сравнивать
//links but not value, а для object ещё need to override method
 @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {//instanceof - проверка на тип обьекта
            Car car = (Car) obj;//приводи obj к типу Car что бы у него появились методы и поля
            return car.brand.equals(this.brand) && car.number == this.number;
        } else {
            return false;
        }
    }

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW",1);
        Car car2 = new Car("BMW",1);
        System.out.println(car1 == car2);//false
        System.out.println(car1.equals(car2));//true так как сравнивает объекты, а не ссылки на них
        //но только после того как мы переопределим метод, так как equals изначально сравнивает только ссылки
        String brand = "BMW";
        System.out.println(car1.getBrand() == brand);//false так как при этом сравниваются адреса ссылок
    }
}


#Set - коллекция не допускающая хранения одинаковых элементов

public interface CarSet{
    boolean add(Car car);
    boolean remove(Car car);
    int size();
    void clear();
}

class CarSetTest {

    private CarSet carSet;

    @BeforeEach
    private void setUp() throws Exception {
    //init
        for (int i =0; i < 100; i++){
            carSet.add(new Car("Brand"+i, i));
        }

    }

    @Test
    public void whenAdd3SimilarObjectThenSizeIncreaseBy1() {
        assertEquals(100, carSet.size());
        assertTrue(carSet.add(new Car("BMW", 10)));
        assertFalse(carSet.add(new Car("BMW", 10)));
        assertFalse(carSet.add(new Car("BMW", 10)));
        assertEquals(101, carSet.size());
    }

    @Test
    public void whenRemoved1ObjectsThenSizeDecreaseBy1() {
        assertEquals(100, carSet.size());

    }

    @Test
    void size() {
    }

    @Test
    public void whenSetClearedThenSize0() {
        carSet.clear();
        assertEquals(0,carSet.size());
    }

    @Test
    public void whenElementRemovedThenSizeDecreased(){
        assertTrue(carSet.remove(new Car("Brand30", 30)));
        assertEquals(99, carSet.size());
        assertFalse(carSet.remove(new Car("Brand30", 30)));
        assertEquals(99, carSet.size());
    }


}

Для реализации collection Set, we need class HashSet внутри которого есть
class Entry{ //похож на Node из LinkedList, but simple
    T value//значение
    Entry next//ссылка на след класс
}

#Iterable - итератор говорит как перебирать элементы
во всех колекциях работает
//List<Car> cars = new ArrayList<>();
//Collection<Car> cars = new ArrayList<>();
//Collection<Car> cars = new LinkedList<>();
//Collection<Car> cars = new HashSet<>();
for (int i = 0 ; i< 10;i ++){
    cars.add(new Car("Brand"+i, i));
}
for (Car car : cars) {
    System.out.println(car.getBrand()+ " " + car.getNumber());
}
//это значит что интерфейс Collection extended Iterable

while (carCollection.iterator().hasNext()) {// то что вызывается под капотом у цикла foreach
        Car car = carCollection.iterator().next();}


//реализация в ArrayList
 @Override
    public Iterator<Car> iterator() {//что бы начать создавать Iterator need ctrl+O and вместо null написать new Iter..
        return new Iterator<Car>() {

            int index = 0; //index of first element mast be equals zero

            @Override
            public boolean hasNext() {//проверяет существует ли следующий элемент в коллекции
            //if hasNext = false, then foreach stop
                return index < size; //elements in collection не будет after того как index = size
            }

            @Override
            public Car next() {//if hasNext = true when итератор получает обьект на который нужно переключится
                return array[index++];//возвращаем сам обьект car
//                Car car = array[index++];
//                return car;
            }
        };
    }

#TreeSet
//коллекция в которой нельзя добавлять одинаковые элементы, а также они автоматически сортируются

//для TreeSet необходимо что бы он знал что сравнивать поэтому класс должен быть унаследован от интерфейса Comparable
public class Car implements Comparable<Car>{}

//treeSet работает c comparable

#Comparable - ст=равнитель

Set<Car> cars = new TreeSet<>(new Comparator<Car>() {//если нет доступа к классу Сar то мы можем в параметрах создать Corparator
    //даже если реализован comparable, мы можем применять Comparator если нам нужно отсортировать каким либо другим не стандартным способом.
    @Override
    public int compare(Car o1, Car o2) {
        //return o1.getBrand().compareTo(o2.getBrand());//сравнивает два объекта по бренду
        if (o1.getNumber() > o2.getNumber()) {
            return 1;
        } else if (o1.getNumber() < o2.getNumber()) {
            return -1;
        } else {
            return 0;//сравнивает по числам, но для этого надо переопределить
            //compareTo для чисел
        }
    }
});
for (int i = 0; i < 100; i++) {
    cars.add(new Car("Brand" + i, i));
}
for (Car car : cars) {
    System.out.println(car);
}

//можно переопределить в класе
public class Car implements Comparable<Car>{
...
    @Override
    public int compareTo(Car o) {//in case 0 is обьекты одинаковые, больше нуля - объект больше сравниваемого,
        //меньше нуля - обьект меньше сравниваемого.

        //if we want to compare(сравнить) по number
//        if (number < o.number){
//            return -1;
//        } else if (number > o.number){
//            return 1;
//        } else {
//            return 0;
//        }

        //if we want to compare по brand
        return brand.compareTo(o.brand); //y String метод compareTo от object
    }

        Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                if (o1 > o2){
//                    return -1;
//                } else if (o1 < o2){
//                    return 1;
//                } else {
//                    return 0;
//                }
                return -o1.compareTo(o2);//минус с переди
            }
        });
        for (int i = 0; i < 100; i++) {
            numbers.add((int)(Math.random()*10));
        }
        for (int number : numbers) {
            System.out.println(number);
        }

#Map (dictionary in Python)
как Set но имеет ещё ключь, нельзя хранить одинаковые ключи

    private static final int INITIAL_CAPACITY = 16;//start size of array

    private Entry[] array = new Entry[INITIAL_CAPACITY];//array
    private int size = 0; //how many elements in array

    private static class Entry{
        private CarOwner key;
        private Car value;
        private Entry next;

        public Entry(CarOwner key, Car value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }