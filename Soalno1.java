import java.util.Scanner;
public class Soalno1 {
    public static void main(String[] args) {

    int hour;
    int minute; 
    int Second;
    

    Scanner Input = new Scanner(System.in);
        System.out.print("Jam = ");
        hour = Input.nextInt();
        System.out.print("Menit = ");
        minute =  Input.nextInt();
        System.out.print("detik =  ");
        Second = Input.nextInt();
        
        int jam1 =  jam * 3600;
        int menit1 = menit * 60;

        int twaktu = jam1 + menit1 + detik;
        int pulsa = twaktu / 5;
        int biaya = pulsa * 150;

        System.out.println(jam+" jam : "+menit+" menit : "+detik+ " detik ");
        System.out.println("Biaya yang telah di keluarkan = "+ biaya);
    }
}