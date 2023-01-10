/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author ASUS
 */import java.util.*;
public class ds_thuc_tap2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String tm = sc.nextLine();
        int n = Integer.valueOf(tm);
        tm.isEmpty();
        List<ThucTap> list = new ArrayList<>();
        for(int i = 1; i <= n; ++i){
            list.add(ThucTap.nextThucTap(sc, i));
        }
        Collections.sort(list, new Comparator<ThucTap>(){
            @Override
            public int compare(ThucTap o1, ThucTap o2){
                return o1.getCode().compareTo(o2.getCode());
            }
        });
        tm = sc.nextLine();
        int q = Integer.valueOf(tm);
        tm.isEmpty();
        while(q-- > 0){
            String company = sc.nextLine();
            for (ThucTap st : list) {
                if(st.getComp().compareTo(company) == 0){
                    st.Show();
                }
            }
        }
        sc.close();
    }
}
class ThucTap{
    
    private String order, code, name, classes, email, comp;

    public ThucTap(){
        
    }
    public ThucTap( String code, String name, String classes, String email, String comp){
//        this.order = order;
        this.code = code;
        this.name = name;
        this.classes = classes;
        this.email = email;
        this.comp = comp;
    }
    public  void setCode(int cnt) {
        String s = ""+cnt;
        this.order=s;
    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public String getComp(){
        return comp;
    }

    public static ThucTap nextThucTap(Scanner sc, int cnt){
        ThucTap a = new ThucTap();
        a.setCode(cnt);
        a.code = sc.nextLine();
        a.name = sc.nextLine();
        a.classes = sc.nextLine();
        a.email = sc.nextLine();
        a.comp = sc.nextLine();
        return a;
    }

    public void Show(){
        System.out.println(this.order + " " + this.code + " " + this.name + " " + this.classes + " " + this.email + " " + this.comp);
    }
}