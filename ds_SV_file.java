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
public class ds_SV_file {
     public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\JavaApplication1\\src\\codeptit\\MONHOC.in");
        Scanner sc = new Scanner(file);
        int t = Integer.valueOf(sc.nextLine());
        List <StuFile> L = new ArrayList<>();
        
        for(int i = 1; i <= t; i++){
            L.add(StuFile.nexStuFile(sc));
        }
        Collections.sort(L, new Comparator<StuFile>(){
            @Override
            public int compare(StuFile m1, StuFile m2){
                
                return m1.getMa().compareTo(m2.getMa());
            }
        });
        for (StuFile m: L)
            System.out.println(m);
    }
}
class StuFile{
    private String code, name, lop, email;

    public StuFile() {
    }

    public StuFile(String code, String k, String lop, String email) {
        this.code = code;
//        this.name = name;
        this.lop = lop;
        this.email = email;
       this.name = this.getName(k);
    }
    public String getMa(){
        return code;
    }
    public String getName(String k){
        
        k = k.trim();
        k = k.replaceAll("\\s+", " ");
        String m = k.toLowerCase();
        String res = "";
        String p[] = m.split(" ");
        for(int i = 0; i < p.length; i++){
            String f = p[i].substring(0,1).toUpperCase();
            String s = p[i].substring(1);
            res += f+s;
            res+=" ";
        }
        return res;
        
    }
    public static StuFile nexStuFile(Scanner sc){
        StuFile s = new StuFile(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//        s.name = s.getName(s.name);
        return s;
    }
    @Override
    public String toString(){
        return (code +" "+name+lop+" "+email);
    }
}