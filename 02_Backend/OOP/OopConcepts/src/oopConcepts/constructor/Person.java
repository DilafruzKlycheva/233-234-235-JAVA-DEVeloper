package oopConcepts.constructor;

public class Person {

    private String name; // zorunlu
    private String surname; // zorunlu
    private int age; // opsiyonel
    private int phoneNumber; // opsiyonel

    //!!! nesne olusturulurken zornlu degiskenler setlenmesi gerektigi icin, parametresiz const.
     // olmamasi gerekiyor

/*    public Person(){

    }*/

    //!!! sadece zorunlu alanlari iceren parametreli const.
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //!!! sadece zorunlu ve 1 opsiyonel ( age) alanlari iceren parametreli const.
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //!!! sadece zorunlu ve 2 opsiyonel ( phoneNumber, age) alanlari iceren parametreli const.

    public Person(String name, String surname, int age, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        //Person prs1 = new Person();
        Person prs2 = new Person("Ahmet", "Beyaz");
        prs2.age= 35;

        Person prs3 = new Person("A","B", 40);
    }

    // Problemin Cozumu :  Builder Design Pattern
}
