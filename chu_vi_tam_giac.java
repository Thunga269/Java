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
public class chu_vi_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -->0){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point p1 = new Point(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point p2 = new Point(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point p3 = new Point(x, y);
            double c1 = (double) p1.distance(p2);
            double c2 = (double) p2.distance(p3);
            double c3 = (double) p1.distance(p3);
//            System.out.println(c1 + " "+c2 +" "+c3);
            double p = (double)(c1+c2+c3);
            if(c1+c2<=c3 || c1+c3<=c2 || c2+c3<=c1){
                System.out.println("INVALID");
            }else{
                System.out.format("%.3f", p);
                System.out.println("");
            }
            
        }
    }
}
class Point{
    private double x;
    private double y;
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y,2));
    }
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p1.x-p2.x), 2)+Math.pow(p1.y-p2.y,2));
    }
    public String toString(){
        return "("+this.x +","+this.y+")";
    }
}
