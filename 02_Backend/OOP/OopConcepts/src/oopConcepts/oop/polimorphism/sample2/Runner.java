package oopConcepts.oop.polimorphism.sample2;

public class Runner {

    public static void main(String[] args) {

        Student std1 = new Student();
        std1.name="Ogrenci";
        std1.age=18;
        std1.phoneNumber="000";

        Teacher tch1 = new Teacher();
        tch1.name="Mirac";
        tch1.age=41;
        tch1.phoneNumber="111";

        printInfoForStudent(std1);
        //printInfoForStudent(tch1);
        printInfoForTeacher(tch1);

        System.out.println("Ayni sonucu tek metod ve polymorphism ile yazalim");
        printInfoWithPolymorphism(tch1);
        printInfoWithPolymorphism(std1);

    }

    public static void printInfoForStudent(Student std){
        System.out.println("name : " + std.name);
        System.out.println("age : " + std.age);
        System.out.println("phone-number : " + std.phoneNumber);

    }

    public static void printInfoForTeacher(Teacher teacher){
        System.out.println("name : " + teacher.name);
        System.out.println("age : " + teacher.age);
        System.out.println("phone-number : " + teacher.phoneNumber);
    }

    public static void printInfoWithPolymorphism(User user){
        System.out.println("name : " + user.name);
        System.out.println("age : " + user.age);
        System.out.println("phone-number : " + user.phoneNumber);
    }



}
