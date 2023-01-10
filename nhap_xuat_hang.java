/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */


import java.util.ArrayList;
import java.util.Scanner;

public class nhap_xuat_hang {
    private String ma, ten, xepLoai;
    ;

    public nhap_xuat_hang(String ma, String ten, String xepLoai) {
        this.ma = ma;
        this.ten = ten;
        this.xepLoai = xepLoai;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<nhap_xuat_hang> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(new XuatHang(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            String s = sc.next();
            int soLuongNhap = sc.nextInt();
            int donGiaNhap = sc.nextInt();
            int soLuongXuat = sc.nextInt();
            for (XuatHang x : list) {
                int tong = 0;
                if (x.ma.equals(s)) {
                    System.out.print(x.toString());
                    System.out.print(soLuongNhap * donGiaNhap + " ");
                    if (x.xepLoai.equals("A")) {
                        tong = (int) Math.round((soLuongXuat * donGiaNhap) * 1.08);
                    } else if (x.xepLoai.equals("B")) {
                        tong = (int) Math.round((soLuongXuat * donGiaNhap) * 1.05);
                    } else {
                        tong = (int) Math.round((soLuongXuat * donGiaNhap) * 1.02);
                    }
                    System.out.println(tong);
                }
            }
        }
    }
}
