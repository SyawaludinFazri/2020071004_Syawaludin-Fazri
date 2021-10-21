import java.util.Scanner;
public class Soalno2 {
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        int jk;
        float berat, tinggi, bmi, meter;
     
        System.out.println("Menghitung berat badan ideal");
        System.out.println(" ");
        System.out.print ("Masukan Berat: ");
        berat = masuk.nextFloat();
        System.out.print ("Masukan Tinggi: ");
        tinggi = masuk.nextFloat();
        meter=tinggi/100;
   
        bmi=(berat/(meter*meter));
  
        System.out.println(" ");
        
        if (bmi<18.5){
            System.out.println("(Kurus)");
        }else if (bmi>= 18.5){
            System.out.println("(Normal)");
        }else if (bmi> 22.9){
            System.out.println("(Overweight)"); 
        }
   }
}