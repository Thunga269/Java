/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
public class xep_hag_hs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int n = Integer.valueOf(x);
        x.isEmpty();
        List<Student_XH> L = new ArrayList<>();
        List<Student_XH> tmp = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Student_XH a = Student_XH.nextStudent_XH(sc, i);
            L.add(a);
            tmp.add(a);
        }
        Collections.sort(tmp, new Comparator<Student_XH>(){
            @Override
            public int compare(Student_XH s1, Student_XH s2){
                
                    return (int)((int)10* (s2.getD()-s1.getD()));
            }
        });
        float dmax = tmp.get(0).getD();//lay diem cao nhat
        int cnt = 1, q = 1;
        for(Student_XH s: tmp){
            if(s.getD() == dmax){
                s.setRank(cnt);
                q++;
                continue;
            }else if(s.getD()<dmax){
                s.setRank(q);
                dmax = s.getD();
                cnt = q;
                q++;
                continue;
            }
        } 
        for(Student_XH st : tmp){
            for(Student_XH s : L){
                if(st.getD() == s.getD()){
                    s.setRank(Integer.valueOf(st.getRank()));
                }
            }
        }
        for(Student_XH s : L){
           s.Show();
        }
            
    }
}
class Student_XH{
    private String name, code, type, rank;
    private float d;
    private int STT;

    public Student_XH() {
        this.rank = "";
    }

    public Student_XH(String name, float d) {
        this.name = name;
        this.d = d;
    }
    public void setCode(int cnt){
        String s = "HS"+cnt;
        while(s.length()<4) s = s.substring(0, 2)+"0"+s.substring(2);
        this.code = s;
    }
    public float getD(){
        return d;
    }
    public void setRank(int cnt){
        this.rank = ""+cnt;
    }
    public String getRank(){
        return rank;
    }
    public static Student_XH nextStudent_XH(Scanner sc, int cnt){
        Student_XH s= new Student_XH();
        s.name = sc.nextLine();
        s.d = Float.valueOf(sc.nextLine());
        s.setCode(cnt);
        if(s.d < 5.0) s.type = "Yeu";
        else if(s.d < 7.0) s.type = "Trung Binh";
        else if(s.d<9.0) s.type = "Kha";
        else s.type = "Gioi";
        return s;
    }
    public void Show(){
        System.out.println(this.code +" "+this.name+" "+this.d+" "+this.type+" "+this.rank);
    }
}