package topan.soal.day4;

public class Materi1 {
    public static void main(String[] args) {
        //operator pembanding, hasil nya jadi tipe data boolean (true/false)

        int nilai1, nilai2;

        nilai1 = 20;
        nilai2 = 10;

        boolean kurangDari = nilai1 < nilai2;
        boolean kurangDariSamaDengan = nilai1 <= nilai2;

        boolean lebihDari = nilai1 > nilai2;
        boolean lebihDariSamaDengan = nilai1 >= nilai2;

        boolean samaDengan = nilai1 == nilai2;
        boolean tidakSamaDengan = nilai1 != nilai2;

        System.out.println(kurangDari);
        System.out.println(kurangDariSamaDengan);
        System.out.println(lebihDari);
        System.out.println(lebihDariSamaDengan);
        System.out.println(samaDengan);
        System.out.println(tidakSamaDengan);
    }
}

/*
soal 1 :
buat lah 3 contoh penggunaan operator pembanding, dengan tambahan kalimat pembanding tersebut.

$ - > variable nilai

       contoh output :

       nilai 1 $nilai1 dan nilai 2 $nilai2 , $nilai1 "kurang dari sama dengan" $nilai2 , $hasil

 */