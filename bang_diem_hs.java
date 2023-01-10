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
public class bang_diem_hs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.valueOf(s);
        s.isEmpty();
        List<Student> L = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            L.add(Student.nextStudent(sc, i));
        }
        Collections.sort(L, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                if((int) 10*(s1.getSum()- s2.getSum())!=0)
                    return (int) (10*(s2.getSum()- s1.getSum()));
                return s1.getCode().compareTo(s2.getCode());
            }
        });
        for (Student st : L) {
            st.Show();
        }
        sc.close();
    }
}
class Student{
    private final int mx = 10;
    private String name, code, type;
    private double [] Point = new double[mx];
    private double avg, sum;

    public Student() {
        this.name = this.code = this.type =  "";
        Arrays.fill(this.Point, 0.0);
        this.avg = this.sum= 0.0;
    }

    public Student(String name, double []Poin) {
        this.name = name;        
        this.Point = Point.clone();
        
    }
    public void setCode(int cnt){
       String s = "HS"+cnt;
       while(s.length()<4) s = s.substring(0,2)+"0"+s.substring(2);
       this.code=s;
    }
    public void setType(){
        double p = this.avg;
        if(p >= 9.0) this.type = "XUAT SAC";
        else if (p >= 8.0) this.type = "GIOI";
        else if (p >= 7.0) this.type = "KHA";
        else if (p >= 5.0) this.type = "TB";
        else this.type = "YEU";        
    }

    
    public double getSum(){
//        double p = 0;
//        for(int i = 0; i < this.mx; ++i){
//            p += this.Point[i];
//        }
//        p += (this.Point[1] + this.Point[0]);
//        return p;
          return sum;
    }
    public String getCode(){
        return code;
    }
    public static Student nextStudent(Scanner sc, int cnt){
        Student s = new Student();
        s.name=sc.nextLine();
        s.setCode(cnt);
         for(int i = 0; i < s.mx; ++i){
            s.Point[i] = sc.nextDouble();
            s.sum += s.Point[i];
        }
        s.sum += (s.Point[0] + s.Point[1]);
        s.avg = s.sum/12.0;
        s.avg = (double) Math.round((double)s.avg * 10.0) / 10.0;
        String x = sc.nextLine(); 
        x.isEmpty();
//        sc.nextLine();
        s.setType();
        return s;
    }
    public void Show(){
        System.out.print(this.code + " " + this.name + " " );
        System.out.format("%.1f ",(double) this.avg);
        System.out.println(this.type);
    }
}