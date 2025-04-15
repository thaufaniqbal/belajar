package topan.soal.day4;

public class Materi2 {
    public static void main(String[] args) {
        //operator pembanding, gerbang logika

        int nilai1, nilai2;

        nilai1 = 20;
        nilai2 = 10;

        boolean samaDengan = nilai1 == nilai2;
        boolean tidakSamaDengan = nilai1 != nilai2;

        boolean duaDuaNyaHarusTrue = samaDengan && tidakSamaDengan;
        boolean salahSatuNyaHarusTrue = samaDengan || tidakSamaDengan;

        System.out.println(duaDuaNyaHarusTrue);
        System.out.println(salahSatuNyaHarusTrue);
    }
}

/*
soal 1 :
implementasikan dibawah ini :

nilai 1 = 10
nilai 2 = 20

perkalian = nilai 1 * 2

hasil  = (nilai 2 == perkalian) && nilai 1 != nilai 2

print (nilai 2 == perkalian)

 */