package  ru.avalon.java.dev.j10.labs.commons;

import ru.avalon.java.dev.j10.labs.models.Passport;
        

/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */

public class Address {
    private String Country;
    private String City;
    private String Street;
    private String homeNumber;
    private String bilding;
    private String flat;

     public  Address( String Country, String City, String Street, String homeNumber){
        this.Country = Country;
        this.City = City;
        this.Street = Street;
        this.homeNumber = homeNumber;
    }


    public Address( String Country, String City, String Street, String homeNumber,String bilding){
        this(Country,  City,  Street,  homeNumber);
        this.bilding = bilding ;
      }


    public Address( String Country, String City, String Street, String homeNumber,String bilding,String flat){
        this(  Country,  City,  Street,  homeNumber, bilding);
        this.flat = flat;
    }

    public String getCountry() {
        return Country;
    }

    public String getCity() {
        return City;
    }

    public String getStreet() {
        return Street;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getBilding() {
        return bilding;
    }

    public String getFlat() {
        return flat;
    }
    
}