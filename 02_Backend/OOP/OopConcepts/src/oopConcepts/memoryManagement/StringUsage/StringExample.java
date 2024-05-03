package oopConcepts.memoryManagement.StringUsage;

public class StringExample {

    public static void main(String[] args) {

        String result = "";

        long startTime=  System.currentTimeMillis();

        for(long i =0; i<100000 ; i++){
            result += "some text";// her dongude "some text" eklenecek
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time : " + ( endTime - startTime) + " ms"); // 9.5 saniye
    }
}





















