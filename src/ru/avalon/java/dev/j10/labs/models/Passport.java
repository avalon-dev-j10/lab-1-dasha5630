package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 * <li> серию и номер документа;
 * <li> имя;
 * <li> фамилию;
 * <li> отчество;
 * <li> второе имя;
 * <li> день рождения;
 * <li> дату выдачи;
 * <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    //name and surname
    public Passport(String number, String series, String name, String surname, String bithday, String dateOfIssue, String ministry) {
        this.series = series;
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.bithday = bithday;
        this.dateOfIssue = dateOfIssue;
        this.ministry = ministry;

    }

    // Flag true - Partonymic; false - SecomdName
    public Passport(String number, String series, String name, String surname, boolean flag, String patronymicOrSecomdName, String bithday, String dateOfIssue, String ministry) {
        this(number, series, name, surname, bithday, dateOfIssue, ministry);
        if (flag) {
            this.patronymic = patronymic;
        } else {
            this.secondName = secondName;
        }
    }

    // + SecomdName and Partonymic
    public Passport(String number, String series, String name, String surname, String secondName, String patronymic, String bithday, String dateOfIssue, String ministry) {
        this(number, series, name, surname, bithday, dateOfIssue, ministry);
        this.secondName = secondName;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String secondName() {
        return secondName;
    }

    public String patronymic() {
        return patronymic;
    }

    public String getRegistration() {
        return registration.getCountry() + " " + registration.getCity() 
                + " " + registration.getStreet() + " " + registration.getHomeNumber() 
                + " " + registration.getBilding() + " " + registration.getFlat();
    }
    

    private String series;
    private String number;
    private String name;
    private String surname;
    private String patronymic;
    private String secondName;
    private String bithday;
    private String dateOfIssue;
    private String ministry;
    private Address registration;

}
