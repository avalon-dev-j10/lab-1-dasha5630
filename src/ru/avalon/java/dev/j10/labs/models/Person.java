package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.*;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность, наделённая:
 * <ol>
 * <li>именем;
 * <li>паспортными данными;
 * <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {

    String name;
    Passport passport;
    Address address;

    public Person(String name, Passport passport, Address address) {
        this.address = address;
        this.name = name;
        this.passport = passport;
    }

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то возвращет Имя, Фимилию и
     * Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то возвращает Имя,
     * Первую букву второго имени, и Фамилию, разделённые пробелом. После
     * Инициала второго имени должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а есть только Имя и
     * Фамилия, то возвращает их, разделённые пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        if ((passport.secondName() == null) || (passport.patronymic() == null)) {
            if (passport.secondName() == null) {
                return passport.getName() + " " + passport.patronymic() + " " + passport.getSurname();
            }
            else {
                return passport.getName() + " " + passport.secondName().charAt(1)
                        + ". " + passport.getSurname();
            }
        }
            return passport.getName() + " " + passport.getSurname();
        }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной регистрации человека,
     * согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        return address.getCountry() + " " + address.getCity() 
                + " " + address.getStreet() + " " + address.getHomeNumber() 
                + " " + address.getBilding() + " " + address.getFlat();
    }
}
