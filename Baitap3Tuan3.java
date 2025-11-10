package JAVA;

import java.util.Scanner;

public class Bai3 {public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so nguyen thu nhat:");
        int a=scanner.nextInt();
        System.out.print("Nhap so nguyen thu hai:");
        int b=scanner.nextInt();
        int tong=a+b;
        int hieu=a-b;
        int tich=a*b;
        int thuong=0;
        int phanDu=0;
        if(b!=0){
            thuong=a/b;
            phanDu=a%b;
        }
        System.out.println("Tong:"+tong);
        System.out.println("Hieu:"+hieu);
        System.out.println("Tich:"+tich);
        if(b!=0){
            System.out.println("Thuong:"+thuong);
            System.out.println("Phan du:"+phanDu);
        }else{
            System.out.println("Khong the chia cho 0.");
        }
        scanner.close();
    }
}
    
