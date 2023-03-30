import java.util.Scanner;

public class Konversi
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int detik, menit, jam, hari, sisa,sisa2;
        char ulang = 'Y';

        do 
        {
            System.out.print("Detik       : ");
            detik = keyboard.nextInt();

            hari = detik / 86400;
            sisa = detik % 86400;
            jam = sisa / 3600;
            sisa2 = sisa % 3600;
            menit = sisa2 / 60;
            detik = sisa2 % 60;

            System.out.println("Hari        : "+hari);
            System.out.println("Jam         : "+jam);
            System.out.println("Menit       : "+menit);
            System.out.println("Detik       : "+detik);

            System.out.println();
            System.out.print("Input data lagi [Y/T]? ");
            ulang = keyboard.next().charAt(0);
            System.out.println();
        } while (ulang == 'Y');
    }
}