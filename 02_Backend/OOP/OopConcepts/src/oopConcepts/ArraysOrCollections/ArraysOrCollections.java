package oopConcepts.ArraysOrCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//!!! AMACIMIZ : hangi durumlarda Array hangi durumlarda Collection kullanmaliyiz ?? Ilk bakisda 2 side
    // ayni ise yariyor gibi gozukuyor, AMA aralarindaki farki anlamak icin kendimize su soruyu sormamiz
    // gerekiyor : ACABA Array'ler ile neyi yapamiyorum ki Collection gibi yapilar JAVA diline dahil oldu??
public class ArraysOrCollections {

    public static void main(String[] args) {

        int[] grades = new int[3]; // En fazla 3 eleman eklenebilir
        int[] grades2 = {85,93, 45, 75};

        // Araryi ekrana basmak istrsem
        System.out.println(Arrays.toString(grades2));

        // sabit boyut
        grades[0]= 85;
        grades[1]= 95;
        grades[2]= 65;
        // grades[3]= 65;

        // grades  dizisi icinde 70 degeri var mi ??
        // CEVAP --> for --> if

        // not ortalamasini hesapliyalim
        int total = 0;
        for(int grade : grades){
            total += grade;
        }
        double avg = total / grades.length;
        System.out.println("Arrayin elemanlarinin ortalamasi : " + avg);

        // *********************** LIST ***********************************

        List<Integer> stfGrades = new ArrayList<>();

        // eleman ekliyoruz :
        stfGrades.add(92);
        stfGrades.add(99);
        stfGrades.add(99);
        stfGrades.add(94);
        stfGrades.add(100);

        //eleman silme
        stfGrades.remove(Integer.valueOf(100));

        // listi ekrana yazalim
        System.out.println(stfGrades);

        // list icinde 70 degeri var mi ?
        System.out.println(stfGrades.contains(70));

        // list icindeki elemanlarin ortalamasi  ( contains . stream API , isEmpty , replace gibi komutlari kullanabiliyoruz)
        int totalGrades = stfGrades.stream().reduce(Math::addExact).get();
        double avgGrade = totalGrades / stfGrades.size();
        System.out.println(avgGrade);
    }


}
