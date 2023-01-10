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
public class danh_sach_MH {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\MONHOC.in");
        Scanner sc = new Scanner(file);
        int t = Integer.valueOf(sc.nextLine());
        List <MonHocFile> L = new ArrayList<>();
        
        for(int i = 1; i <= t; i++){
            L.add(MonHocFile.nexMonHocFile(sc));
        }
        Collections.sort(L, new Comparator<MonHocFile>(){
            @Override
            public int compare(MonHocFile m1, MonHocFile m2){
                return m1.getName().compareTo(m2.getName());
            }
        });
        for (MonHocFile m: L)
            m.Show();
    }
}
class MonHocFile{
    private String code, name;
    private int sotin;

    public MonHocFile() {
    }

    public MonHocFile(String code, String name, int sotin) {
        this.code = code;
        this.name = name;
        this.sotin = sotin;
    }
    public String getName(){
        return name;
    }
    public static MonHocFile nexMonHocFile(Scanner sc) {
        MonHocFile m = new MonHocFile(sc.nextLine(), sc.nextLine(), Integer.valueOf(sc.nextLine()));
        return m;
        
    }
    public void Show(){
        System.out.println(this.code+" "+this.name+" "+this.sotin);
    }
}