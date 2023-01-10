/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class phan_tich_tsnt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        int k = 1;
        while (t-->0) {            
            int n = sc.nextInt();
            System.out.print("Test " + k +": ");
            k++;
            int i = 2;
            //long[] a = new long[];
            while(n>1){
                int dem = 0, m=0;
                while(n%i==0){
                    dem++;
                    n /= i;
                }
                if(n %i != 0 && dem>0){
                    System.out.print(i +"("+ dem +") ");
                }else if(n%i!=0 && dem==0){
                    i++;
                }
                //if(dem > 0) 
            }
            System.out.print("\n");
        }
    }
}
