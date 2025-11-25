import java.util.Scanner;
public class Bai6Tuan4
{
    // Ham tim UCLN su dung thuat toan Euclid
    public static int ucln(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // dam bao so duong
    }
    // Ham tim BCNN dua tren UCLN
    public static int bcnn(int a, int b) 
    {
        return Math.abs(a * b) / ucln(a, b);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int so1 = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int so2 = sc.nextInt();
        int ketQuaUCLN = ucln(so1, so2);
        int ketQuaBCNN = bcnn(so1, so2);
        System.out.println("UCLN cua " + so1 + " va " + so2 + " la: " + ketQuaUCLN);
        System.out.println("BCNN cua " + so1 + " va " + so2 + " la: " + ketQuaBCNN);
        sc.close();
    }
}