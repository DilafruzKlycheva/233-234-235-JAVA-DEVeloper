package d22oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s = new Student();

        //s. yaptigimda sadece public olan name gozukur

        //-----------get
        System.out.println(s.getAge()); //13

        System.out.println(s.isSuccessful()); //true

        //-----------set
        s.setAge(25);
        System.out.println(s.getAge()); //25

        s.setSuccessful(false);
        System.out.println(s.isSuccessful()); //false

        //Set ile verileri degistirebiliyoruz, constructor'larla da degistirebiliyoruz.Farki nedir?
        //set ==> mevcut bir nesnenin verilerini degistirmek icin kullanilir
        //constructor ==> Yeni nesnelerin baslangic durumunu belirlemek icin kullanilir.

        //Arastirma Odevi: encapsulation'da private ile gizlenen bir veri baska package'dan set method ile
        //degistirilebilir mi?

        //get ve set metodlarina sahip class'lar sikca Java Beans olarak adlandirilir.

        //------------
        //Encapsulation'da bir object olusturup,iki object gibi kullaniyoruz.
        //Kaliptan istedigimiz kadar boyle olusturabiliriz.
        //Memory problemini onler. Bircok object memoryi doldururdu.



    }
}
