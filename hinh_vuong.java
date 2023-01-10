/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.math.*;
public class hinh_vuong {
    final static int mod = 1000*1000*1000+7;
    public class Point{
        public int x;
        public int y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax = sc.nextInt(); int ay = sc.nextInt();
        int bx = sc.nextInt(); int by = sc.nextInt();
        
        int cx = sc.nextInt(); int cy = sc.nextInt();
        int dx = sc.nextInt(); int dy = sc.nextInt();
        int duoi_x = Math.min(cx, ax);
        int duoi_y = Math.min(cy,ay);
        int tren_y = Math.max(dy, by);
        int tren_x = Math.max(dx, bx);
        int res = Math.max(tren_x-duoi_x, tren_y-duoi_y);
//        System.out.println(tren_x + " "+duoi_x+" "+tren_y+" "+duoi_y);
        System.out.println(res*res);
    }
}
