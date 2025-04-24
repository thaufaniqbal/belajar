package topan.jawaban.day5.materi1;

public class Soal2{

    public static void main(String[] args){

        boolean kamuJelek = true;
        boolean kamuMalasBelajar = false;

        if (kamuJelek && kamuMalasBelajar) {
            System.out.println("Kamu jelek dan malas belajar.");
        }
        else if (kamuJelek || kamuMalasBelajar) {
            System.out.println("Kamu jelek atau malas belajar.");
        }
        else if (!kamuJelek && !kamuMalasBelajar) {
            System.out.println("Kamu tidak jelek dan rajin belajar.");
        } else {
            System.out.println("Tidak ada kondisi yang terpenuhi.");
        }
    }
}
//sumpah pnas banget pala coach tpi sbnernya kurang pahamn jg, ini cuma pngaplikasian yg dipelajarin dgn nalar aja