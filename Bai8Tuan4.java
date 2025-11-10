package JAVA.T4_hdt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
              
public class bai8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> dem = new HashMap<>();
        for (int x : arr) {
            dem.put(x, dem.getOrDefault(x, 0) + 1);
        }

        int phanTu = arr[0];
        int tanSuat = 0;

        for (Map.Entry<Integer, Integer> e : dem.entrySet()) {
            if (e.getValue() > tanSuat) {
                phanTu = e.getKey();
                tanSuat = e.getValue();
            }
        }

        System.out.println("Phan tu xuat hien nhieu nhat: " + phanTu);
        System.out.println("So lan xuat hien: " + tanSuat);

        sc.close();
    }
}
