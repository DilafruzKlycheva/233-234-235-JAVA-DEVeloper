package oopConcepts.oop.abstraction;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.add(10,20);

        System.out.println("The result is : " + result);

        // JDBC den Abstraction ile iligli ornek:
        // Statement --> st.execute()
    }

}
