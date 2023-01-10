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
public class sx_time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        List<Time> L = new ArrayList<>();
        for (int i = 0; i < n; i++){
            L.add(Time.nextTime(sc));
        }
        Collections.sort(L, new Comparator<Time>(){
        @Override
        public int compare(Time t1, Time t2){
            if(t1.getGio()!=t2.getGio()){
                return (int) (t1.getGio()-t2.getGio());
            }
            if(t1.getPhut()!=t2.getPhut()){
                return (int) (t1.getPhut()-t2.getPhut());
            }
            return (int)(t1.getGiay()-t2.getGiay());
        }
    });
        for(Time x: L){
            x.Show();
        }
    }
}
class Time{
    private int gio, phut, giay;

    public Time() {
    }

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public int getGio(){
        return gio;
    }
    public int getPhut(){
        return phut;
    }
    public int getGiay(){
        return giay;
    }
    public static Time nextTime(Scanner sc){
        Time t = new Time();
        t.gio = sc.nextInt();
        t.phut = sc.nextInt();
        t.giay = sc.nextInt();
        return t;
    }
     public void Show(){
        System.out.println(this.gio + " " + this.phut + " " + this.giay);
    }
}