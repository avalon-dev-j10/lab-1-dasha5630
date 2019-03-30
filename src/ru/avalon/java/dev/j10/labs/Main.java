package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

    public static void main(String[] args) {

        Passport passportIvanov = new Passport("111","222", "Иван",  "Иванов", true, "Иванович","23/03/17", "20/04/15","УФМС");
        Address adressIvanov = new Address("Россия", "Вологда", "Новгородская", "7", "А", "343");        
        Person ivanov = new Person("Иван", passportIvanov, adressIvanov);
                
        Passport passportSmith = new Passport("333","444", "John", "Smith", false, "Edvard",  "12/01/55", "01/01/14","BMM");
        Address adressSmith = new Address("USA", "New-York", "19-line", "4");        
        Person smith = new Person("John", passportSmith, adressSmith);

        
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
        
        String name1 = ivanov.getFullName();
        String name2 = smith.getFullName();
        String address1 = ivanov.getAddress();
        String address2 = smith.getAddress();

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(address1);
        System.out.println(address2);
        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
