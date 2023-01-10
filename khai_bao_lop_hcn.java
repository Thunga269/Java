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
public class khai_bao_lop_hcn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        String color = sc.nextLine();
        if(w <= 0||h <=0){
            System.out.println("INVALID");
        }else{
            String s = color.substring(2).toLowerCase();
//            System.out.println(s);
            color = color.substring(1, 2).toUpperCase()+ s ;
            Rectange r = new Rectange(w, h, color);
            System.out.print(r.findPerimeter()+" ");
            System.out.print(r.findArea()+" ");
            System.out.print(r.getColor());
        }
    }
}
class Rectange{
    private int width;
    private int height;
    private String color;
    //tao hcn do dai co dinh
    public  Rectange(){
        this.width=1;
        this.height=1;
    }
    //tao hcn qua tham so
    public Rectange(int width, int height, String color){
        this.width=width;
        this.height=height;
        this.color=color;
    }
    public int getWidth(){
        return width;
    }
    //thiet lap chieu rong moi
    public void setWidth(int width){
        this.width = width;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){//thiet lap chieu cao moi
        this.height=height;
    }
    public String getColor(){
        return color;
    }
    public void setCorlor(String color){//thiet lap mau moi
        this.color = color;
    }
    public int findArea(){
        return this.height*this.width;
    }
    public int findPerimeter(){
        return (this.height+this.width)*2;
    }
}