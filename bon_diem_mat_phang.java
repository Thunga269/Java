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
public class bon_diem_mat_phang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}
class Point3D{
    private int x, y, z;

    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D(Point3D p){
        this.x = p.x;
        this.y = p.y;
        this.z = p.z;
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        
        int vtabx = (p2.x-p1.x), vtaby = (p2.y-p1.y),  vtabz = (p2.z-p1.z);
        int vtacx = (p3.x-p1.x), vtacy = (p3.y-p1.y),  vtacz = (p3.z-p1.z);
        int vtadx = (p4.x-p1.x), vtady = (p4.y-p1.y),  vtadz = (p4.z-p1.z);
        
        int vtx = vtaby*vtacz - vtacy*vtabz;
        int vty = vtabz*vtacx - vtabx*vtacz;
        int vtz = vtabx*vtacy - vtacx*vtaby;
        
        return vtadx*vtx + vtady*vty + vtadz*vtz == 0;
        
        
    }
}