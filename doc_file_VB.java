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
public class doc_file_VB {
    public static void main(String[] args)throws FileNotFoundException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}
