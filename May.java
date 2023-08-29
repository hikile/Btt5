/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_t5;
import java.util.Scanner;
/**
 *
 * @author TRAN HUYNH DUC
 */
public class May {
    private String MaMay;
    private String TenMay;
    private String Tinhtrang;
    public void setMaMay(String maMay){
        this.MaMay=maMay;
    }
    public void setTenMay(String tenMay){
        this.TenMay=tenMay;
    }
    public void setTinhtrang(String tinhTrang){
        this.Tinhtrang=tinhTrang;
    }
    
    public String getMaMay(){
        return MaMay;
    }
    public String getTenMay(){
        return TenMay;
    }
    public String getTinhtrang(){
        return Tinhtrang;
    }
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap ma may: ");
        MaMay=sc.nextLine();
        System.out.print("Nhap ten may: ");
        TenMay=sc.nextLine();
        System.out.print("nhap tinh trang: ");
        Tinhtrang=sc.nextLine();
    }
    public void Xuat(){
        System.out.println("ma may: "+MaMay);
        System.out.println("ten may: "+TenMay);
        System.out.println("tinh trang cua may: "+Tinhtrang);
    }
}
