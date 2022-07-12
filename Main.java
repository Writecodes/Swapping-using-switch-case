import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the two integers you want to swap :");
        System.out.print("Enter the value for integer m=");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.print("\nEnter the value for integer n=");
        int n = sc.nextInt();
        System.out.println("Choose the number for performing swapping :\n1.with using third variable...\n2.Without using third variable...\n3.With using XOR operator....");
        int number=sc.nextInt();
        switch (number){
            case 1:
                withusing3var(m, n);
                break;
            case 2:
                withoutusing3var(m, n);
                break;
            case 3:
                withusingXOR(m,n);
                break;
        }
    }
        static void withusing3var ( int a, int b){
            int temp = a;
            a = b;
            b = temp;
            System.out.print("\nNumbers after swapping: " + "m=" + a + " n=" + b);
        }
        static void withoutusing3var ( int a, int b){
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.print("\nNumbers after swapping: " + "m=" + a + " n=" + b);
        }
        static void withusingXOR(int a,int b){
            a=a^b;
            b=a^b;
            a=a^b;
            System.out.print("\nNumbers after swapping: "+"m="+a+" n="+b);
        }
    }
