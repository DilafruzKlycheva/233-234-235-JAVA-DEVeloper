package d20instanceblock_oop;

public class Honda extends Car{
    public Honda(){
        super(); //1
        System.out.println("Civic");
    }
    //b
    public Honda(String model){
        super("Sport");
        System.out.println("Accord");
    }

}
