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
public class tinh_tien_dien {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int n = Integer.valueOf(x);
        x.isEmpty();
        List<Electronic> list = new ArrayList<>();
        for(int i = 1; i <= n; ++i) list.add(Electronic.nextElectronic(sc, i));
        for (Electronic el : list) {
            System.out.println(el);
        }
    }
}
class Electronic{
    private String code, type;
    private long oldnum, newnum, cost, tax, total;
    private int count;

    public Electronic(){
        this.code = this.type;
        this.oldnum = this.newnum = this.cost = this.tax = this.total = 0;
        this.count = 0;
    }
//    public void setCode(int cnt){
//        String k = "KH" + cnt;
//        while(this.code.length() < 4) k = k.substring(0, 2) + "0" + k.substring(2);
//        this.code = k;
//    }
    public Electronic(String type, long oldnum, long newnum, int cnt){
        this.type = type;
//        this.setCode(cnt);
        this.code = "KH" + cnt;
        while(this.code.length() < 4) this.code = this.code.substring(0, 2) + "0" + this.code.substring(2);
        this.oldnum = oldnum;
        this.newnum = newnum;
        Map<String, Integer> mp = new HashMap<>();
        mp.put("KD", 3); mp.put("NN", 5); mp.put("TT", 4); mp.put("CN", 2);
        this.count = (int)mp.get(type);

        this.cost = (long) ((newnum - oldnum) * this.count * 550);
        if(this.newnum - this.oldnum < 50) this.tax = 0;
        else if(this.newnum - this.oldnum <= 100) this.tax =  (long) ((long) Math.round(this.cost / 100.0 * 35));
        else this.tax = (long)this.cost;
        this.total = this.tax + this.cost;
    }

    public static Electronic nextElectronic(Scanner sc, int cnt){
        return new Electronic(sc.nextLine(), Long.valueOf(sc.nextLine()), Long.valueOf(sc.nextLine()), cnt);
    }

    @Override
    public String toString(){
        return code + " " + count + " " + cost + " " + tax + " " + total;
    }
}