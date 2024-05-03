package oopConcepts.memoryManagement.StringUsage;

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        long startTime = System.currentTimeMillis();

        for(long i=0; i<100000; i++){
            builder.append("some text");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time : " + ( endTime - startTime) + " ms"); // 9.5 saniye
    }
}
