package oopConcepts.constructor;

public class Book {

    public String name = "A";
    public String author = "B";
    public String publisher = "C";
    public int pageNumber=150;
    public double price = 120.5;

    // parametreli const

    //!!! SORU : sadece parametreli const. yazarsam uygulamanin herhangi bir yerinde parametresiz
     // const kullanabilir miyim
    public Book(String name, String author, String publisher, int pageNumber, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.pageNumber = pageNumber;
        this.price = price;
    }

    public Book(){

    }

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.name="Seker Portakali";
        book1.author = "Vasconcelos";
        book1.publisher = "Can Yayinlari";
        book1.pageNumber = 180 ;
        book1.price = 100.0 ;

        Book book2 = new Book("A","B","C",100, 120.5);

        //!!! Soru : parametreli const. ile degiskenleri setlemek yerine , sinif tanimi icinde degiskenlerin
         // degerlerini yazsaydik ayni sey olur mu idi ? varsa farklari nelerdir ??
    }
}
