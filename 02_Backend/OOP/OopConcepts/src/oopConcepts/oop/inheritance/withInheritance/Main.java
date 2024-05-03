package oopConcepts.oop.inheritance.withInheritance;

public class Main {

    public static void main(String[] args) {

        // teacher nesnesi olusturalim :
        Teacher teacher1= new Teacher();
        teacher1.name = "Ahmet";
        teacher1.surname="Yemes";
        teacher1.phoneNumber="000";
        teacher1.lesson="Java";

        teacher1.displayLessons(); // teacher sinifindaki metod calisti

        // student nesnesi olusturalim
        Student student1 = new Student();
        student1.name="Veli";
        student1.surname="Kara";
        student1.phoneNumber="111";
        student1.studentNumber="111";

        student1.displayLessons();
    }
}
