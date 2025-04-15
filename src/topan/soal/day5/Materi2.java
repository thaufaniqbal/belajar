package topan.soal.day5;

public class Materi2 {
    public static void main(String[] args) {
        int nilaiSiswa = 10;

        if (nilaiSiswa >= 85){
            System.out.println("A");
        } else if (nilaiSiswa >= 75) {
            System.out.println("B");
        } else if (nilaiSiswa >= 65) {
            System.out.println("C");
        } else if (nilaiSiswa >40) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}

/*
soal 1:
implementasi kan logika ini, seperti di atas :

kalau lebih dari sama dengan 100 atau kurang dari sama dengan 0, akan keluar output "invalid nilai siswa"

clue :
        if (){
            if (){
            //statement
            } else if (){
            //statement
            }else {
            //statement
            }
        } else {
            //statement
        }

 */