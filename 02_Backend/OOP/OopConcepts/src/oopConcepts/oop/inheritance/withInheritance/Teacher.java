package oopConcepts.oop.inheritance.withInheritance;

public class Teacher extends User{

    public String lesson;

    @Override
    public void displayLessons() {
        System.out.println("ogretmenin tum dersleri : ..");
    }

    public void displayLessons(String lesson){
        System.out.println("Ogretmenin tum dersleri");
    }
}
