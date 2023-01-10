/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit.quanlythisinh;

/**
 *
 * @author ASUS
 */
public class ThiSinh {
    private String sobaodanh;
    private String hoten;
    private float toan;
    private float ly;
    private float hoa;
    public ThiSinh(){
        
    }
    public ThiSinh(String SBD, String hoten, float toan, float ly, float hoa){
        this.sobaodanh=SBD;
        this.hoten=hoten;
        this.toan=toan;
        this.ly = ly;
        this.hoa=hoa;
    }
    public ThiSinh(String sobaodanh) {
        this.sobaodanh=sobaodanh;
        this.hoten="";
        toan=0.0f;
        ly=0.0f;
        hoa=0.0f;


    }
    public String toString() {
        return sobaodanh+"\t"+hoten+"\t"+
        toan+"\t"+ly+"\t"+hoa;
    }
    
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        ThiSinh other = (ThiSinh) o;
        if (sobaodanh == null) {
        if (other.sobaodanh != null)
            return false;
        } else
        if(!sobaodanh.equals(other.sobaodanh))
            return false;
            return true;
        }
}
