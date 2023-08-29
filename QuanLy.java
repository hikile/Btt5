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
public class QuanLy {
    private String MaQl;
    private String HoTen;
    public void setMaQl(String ma){
        this.MaQl=ma;
    }
    public void setHoTen(String HoTen){
        this.HoTen=HoTen;
    }

    public String getMaQl(){
        return MaQl;
    }
    public String getHoTen(){
        return HoTen;
    }
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap ma quan li: ");
        MaQl=sc.nextLine();
        System.out.print("Nhap ho va ten: ");
        HoTen=sc.nextLine();
    }
     public void Xuat(){
        System.out.println("ma quan li la: "+MaQl);
        System.out.println("ho va ten quan li la: : "+HoTen);
    }
}
