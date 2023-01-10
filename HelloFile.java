/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class HelloFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Hello.txt");
        Scanner read = new Scanner(file);
        while(read.hasNext()){
            String line = read.nextLine();
            System.out.println(line);
        }
        read.close();
    }
}
