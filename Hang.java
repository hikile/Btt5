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
public class Hang {
    private String MaHang;
    private String TenHang;
    private final NSX x= new NSX();
    public void setMaHang(String maHang){
        this.MaHang=maHang;
    }
     public void setTenHang(String tenHang){
        this.TenHang=tenHang;
    }
     public String getMaHang(){
         return MaHang;
     }
     public String getTenHang(){
         return TenHang;
     }
     public void Nhap(){
         Scanner sc = new Scanner(System.in);
         System.out.print("nhap ma hang: ");
         MaHang=sc.nextLine();
         System.out.print("Nhap ten hang: ");
         TenHang=sc.nextLine();
         x.Nhap();
     }
     public void Xuat(){
         System.out.println("Ma hang la: "+MaHang);
         System.out.println("Ten hang la: "+TenHang);
         x.Xuat();
     }
    public static void main(String[] args) {
        Hang hang=new Hang();
        hang.Nhap();
        hang.Xuat();
    }
}
