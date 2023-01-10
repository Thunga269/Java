/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */

import java.io.*;
import java.util.*;
public class tao_file_nhi_phan {
    public static Scanner sc;
    public static void main(String []args) throws IOException{
        sc=new Scanner(new File ("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\DATA.txt"));//Đọc file text đầu vào
        List <String> list=new ArrayList<>();         // Tạo list các số nguyên bình thường
        while (sc.hasNextInt()) list.add(sc.nextLine());//Thêm các số
        FileOutputStream fos=new FileOutputStream("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\NHIPHAN.in");   //File nhị phân đầu ra
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(list);
        System.out.println("Success");
        oos.close();
    }
}