package topan.soal.day3;

public class Materi1 {
    public static void main(String[] args) {
        int nilai1 = 20;
        int nilai2 = 10;

        //operator Arithmetic
        int pertambahan = nilai1 + nilai2;
        int pengurangan = nilai1 - nilai2;
        int perkalian = nilai1 * nilai2;
        int pembagian = nilai1 / nilai2;
        int habisBagi = nilai1 % nilai2;
        int contohIncrement = ++nilai1;
        int contohDecrement = --nilai2;

        System.out.println(pertambahan);
        System.out.println(pengurangan);
        System.out.println(perkalian);
        System.out.println(pembagian);
        System.out.println(habisBagi);
        System.out.println(contohIncrement);
        System.out.println(contohDecrement);
        System.out.println(pertambahan + contohDecrement * contohIncrement);
        System.out.println(++contohDecrement);
        System.out.println(pertambahan + (++contohDecrement));
    }
}

/*
soal 1 :
buat 1 kalimat yang mengabungkan 3 operator yang berbeda.

soal 2 :
buat 1 kalimat yang menggunakan 2 perkalian dan 2 increment dan 2 decrement.

 */