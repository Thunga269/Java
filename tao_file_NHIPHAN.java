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
public class tao_file_NHIPHAN {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\DATA.txt"));
        OutputStream os = new FileOutputStream("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\DATA.in");
        DataOutputStream dos = new DataOutputStream(os);
        while(sc.hasNextInt()){
            dos.writeInt(sc.nextInt());
        }
        sc.close();
        os.close();
        System.out.println("Success...");
          
    }
}