package topan.jawaban.day4.materi1;

public class Soal1{
    public static void main(String[] args){

        int nilaiSatu, nilaiDua;

        nilaiSatu = 50;
        nilaiDua = 30;

        boolean kurangDari = nilaiSatu < nilaiDua;
        boolean lebihDari = nilaiSatu > nilaiDua;
        boolean samaDengan = nilaiDua == nilaiSatu;

        System.out.println( "Nilai satu cuy: " + nilaiSatu + " Nilai Dua ya: " + nilaiDua + ", " + nilaiSatu + " Kurang dari " + nilaiDua + " = " + kurangDari);
        nilaiSatu = 691;
        nilaiDua = 961;
        System.out.println( "Nilai satu nich: " + nilaiSatu + " Nilai Duah: " + nilaiDua + ", " + nilaiSatu + " Lebih dari " + nilaiDua + " = " + lebihDari);
        nilaiSatu = 1453;
        nilaiDua = 8755;
        System.out.println( "Nilai satuch: " + nilaiSatu + " Nilai Duach: " + nilaiDua + ", " + nilaiSatu + " Sama dengan " + nilaiDua + " = " + samaDengan);
    }
}