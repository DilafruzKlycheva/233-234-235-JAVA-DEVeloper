package oopConcepts.oop.encapsulation;

public class UserWithEncapsulation {

    private String name;
    private String surname;
    private String password;

    public UserWithEncapsulation(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    //!!! SORU 1 : degiskenlere disardan hic erisemiyeceksem, nasil degistirecegim ve degerini okuyacagim ?
     // CEVAP 1 : Public erisim belirleyicileri ile yazilmis Getter-Setter metdodlari
    //!!! SORU 2 : butun degiskenlerin getter ve setter larini yazacaksam, bu sekilde cok bir farklilik
     // olmadi sanki, yani ben setter metodlarini kullnarak yine istedigim degiskeni degistirebiliyorum ?
    // CEVAP 2 : degistirilmesini istemedigim degiskenin setter metodunu yazmam, alin size encapsulation :)


    public String getName() {
        return name;
    }

/*    public void setName(String name) {
        this.name = name;
    }*/

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        UserWithEncapsulation user1 = new UserWithEncapsulation("Emre","Sani","123456");
        //!!! Alttaki metod encapsulation dan dolayi kullanilamiyor
        //user1.setName("Kasim");
    }
}
