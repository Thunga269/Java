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
import java.text.*;
public class so_sanh_date {
    public static void main(String[] args)throws ParseException{
        Scanner sc = new Scanner(System.in);
         
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String s = "31/05/2002";
        String s2 = "12/04/2002";
        Date birthday = sdf.parse(s);
        Date birthday2 = sdf.parse(s2);
        System.out.println(birthday.compareTo(birthday2));
    }
}
