/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class giaiPTbacnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        DecimalFormat format = new DecimalFormat("#0.00");
        if(a == 0 && b != 0){
            System.out.println("VN");
        }else if(a==0 && b==0){
            System.out.println("VSN");
        }else{
            double kq = 1.0*-b/a;
            System.out.println(format.format(kq));
        }
    }
}
