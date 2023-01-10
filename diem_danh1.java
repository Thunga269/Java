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
import java.io.*;
public class diem_danh1 {
     public static void main(String[] args) throws FileNotFoundException{
//        File file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\DEMO.in");
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());
        List <Sin> L = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            L.add(Sin.nexSin(sc));
        }
//        int n = Integer.valueOf(sc.nextLine());
        for(int i=1; i <= t; i++){
            String m[]=sc.nextLine().split(" ");
            String maSV = m[0];
            String diemDanh = m[1];
            int sum = 10;
            for(int j = 0; j < diemDanh.length(); j++){
                if(diemDanh.charAt(j)=='m') sum -= 1;
                else if(diemDanh.charAt(j)=='v') sum -= 2;   
            }
            for(Sin s: L){
                if(s.getMa().equals(maSV)){
                    s.setD(sum);
                }
            }
            
        }
        for(Sin s: L){
            System.out.println(s);
        }
     }
}
class Sin{
    private String ma, name, lop, dk;
    private int d;

    public Sin() {
    }

    public Sin(String ma, String name, String lop) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
    }
    public void setD(int sum){
        if(sum <= 0) this.d = 0;
        else this.d = sum;
        if(sum <= 0) this.dk="KDDK";
        else this.dk = "";
    }
    
    public String getMa(){
        return ma;
    }
    public String getName(){
        return name;
    }
    public String getLop(){
        return lop;
    }
    public static Sin nexSin(Scanner sc) {
        Sin s = new Sin(sc.nextLine(), sc.nextLine(), sc.nextLine());
        return s;
    }
    @Override
    public String toString(){
        return ma+" "+name+" "+lop+" "+d+" "+dk;
    }
}