package d18datetime_stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        //1-reverse(): StringBuilder Object'inin içeriğini ters çevirir.String class'ta yoktur

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1); //Java is easy

        sb1.reverse();
        System.out.println(sb1); //ysae si avaJ

    }
}
