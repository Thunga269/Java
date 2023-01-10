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
public class liet_ke_nhap_xuat_theo_nhom {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int n = Integer.valueOf(x);
        x.isEmpty();
        List<Product> list = new ArrayList<>();
        for(int i = 1; i <= n; ++i) list.add(Product.nextProduct(sc));
        String group = sc.nextLine();

        Collections.sort(list, new Comparator<Product>(){
            @Override
            public int compare(Product p1, Product p2){
                return (int)(p2.getTax()-p1.getTax());
            }
        });
        for (Product pr : list) {
            if(pr.getCode().equals(group)){
                System.out.println(pr);
            }
            
        }
    }
}
class Product{
    private String code;
    private long num_import, num_export, cost, total, tax;

    public Product(){
        this.code = "";
        this.num_export = this.num_import = this.cost = this.total = this.tax = 0;
    }
    public long getTax(){
        return tax;
    }
    public String getCode(){
        String k = code.substring(0, 1);
        return k;
    }
    public Product(String code, long num_import){
        this.code = code;
        this.num_import = num_import;

        // find export
//        this.num_export = (long)Math.round((code.charAt(0) == 'A') ? (double)(0.6 * num_import) : (long)(0.7 * num_import));
        if(code.charAt(0)=='A'){
            this.num_export=(long)Math.round((double) (0.6*num_import));
        }else
            this.num_export=(long)Math.round((double) (0.7*num_import));
        // find cost
        this.cost = (code.charAt(4) == 'Y') ? 110000 : 135000;
        this.total = (long)(this.num_export * this.cost);

        if(code.charAt(0) == 'A' && code.charAt(4) == 'Y')
            this.tax = (long) (0.08 * this.total);
        if(code.charAt(0) == 'A' && code.charAt(4) == 'N')
            this.tax = (long) (0.11 * this.total);
        if(code.charAt(0) == 'B' && code.charAt(4) == 'Y')
            this.tax = (long) (0.17 * this.total);
        if(code.charAt(0) == 'B' && code.charAt(4) == 'N')
            this.tax = (long) (0.22 * this.total);
    }

    public static Product nextProduct(Scanner sc){
        return new Product(sc.nextLine(), Long.valueOf(sc.nextLine()));
    }

    @Override 
    public String toString(){
        return code + " " + num_import + " " + num_export + " " + cost + " " + total + " " + tax;
    }

}