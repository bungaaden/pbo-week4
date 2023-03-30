import java.util.Scanner;

public class AkarPersamaanKuadrat 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Akar Persamaan Kuadrat");
        System.out.println();
        int a,b,c;
        double x1,x2;
        char ulang = 'Y';

        do
        {
            System.out.println("ax^2 + bx + c");
            System.out.print("Input nilai a : ");
            a = input.nextInt();
            System.out.print("Input nilai b : ");
            b = input.nextInt();
            System.out.print("Input nilai c : ");
            c = input.nextInt();

            int D = (b*b) - (4*a*c);
            System.out.println("Determinan = "+D);
            if (D>0)
            {
                x1 = (-b + Math.sqrt(D)) / (2*a);
                x2 = (-b - Math.sqrt(D)) / (2*a);
                System.out.println("Memiliki akar persamaan x1 = "+x1+" dan x2 = "+x2);
            }
            else if (D==0)
            {
                x1 = x2 = (-b) / (2*a);
                System.out.println("Memiliki akar persamaan x1 = x2 = "+x1);
            }
            else 
            {
                x1 = (-b / (2*a)) + (Math.sqrt(-D) / (2*a));
                x2 = (-b / (2*a)) - (Math.sqrt(-D) / (2*a)); 
                System.out.println("Memiliki akar persamaan x1 = "+x1+" dan x2 = "+x2);
            }
            System.out.println();
            System.out.print("Input data lagi [Y/T]? ");
            ulang = input.next().charAt(0);
            System.out.println();
        } while (ulang =='Y');   
    }
}
