package topan.iseng;

public class Train4{
    public static void main(String[] args) {

        int sisiSatu = 5;
        int sisiDua = 5;
        int sisiTiga = 5;
        int segitigaSamsis = sisiSatu * sisiDua * sisiTiga;

        System.out.println("Sisi A: " + sisiSatu + " Sisi B: " + sisiDua + "Sisi C: " + sisiTiga + " Caranya: A*B*C " + "Dan hasilnya adalah " + segitigaSamsis);

        sisiSatu = 10;
        sisiDua = 10;
        sisiTiga = 10;
        segitigaSamsis = sisiSatu * sisiDua * sisiTiga;
        System.out.println("Sisi A: " + sisiSatu + " Sisi B: " + sisiDua + "Sisi C: " + sisiTiga + " Caranya: A*B*C " + "Dan hasilnya adalah " + segitigaSamsis);

        sisiTiga = 20;
        segitigaSamsis = sisiSatu * sisiDua * sisiTiga;
        System.out.println("Sisi A: " + sisiSatu + " Sisi B: " + sisiDua + "Sisi C: " + sisiTiga + " Caranya: A*B*C " + "Dan hasilnya adalah " + segitigaSamsis);
    }
}