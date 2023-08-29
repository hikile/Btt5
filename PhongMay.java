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
public class PhongMay {
    private String MaPhong;
    private String TenPhong;
    private double DienTich;
    private final QuanLy x = new QuanLy();
    private int n;
    private final May[] y =new May[1000];
    public void setMaPhong(String ma){
        this.MaPhong=ma;
    }
    public void setTenPhong(String TenPhong){
        this.TenPhong=TenPhong;
    }
    public void setDienTich(double DienTich){
        this.DienTich=DienTich;
    }
    public String getMaPhong(){
        return MaPhong;
    }
    public String getTenPhong(){
        return TenPhong;
    }
    public double getDienTich(){
        return DienTich;
    }
    
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap ma phong: ");
        MaPhong=sc.nextLine();
        System.out.print("nhap ten phong: ");
        TenPhong=sc.nextLine();
        System.out.print("nhap dien tich: ");
        DienTich=sc.nextDouble();
        System.out.print("nhap so may co trong phong: ");
        n=sc.nextInt();
        x.Nhap();
        for(int i=0;i<n ;i++){
            y[i]=new May();
            y[i].Nhap();
        }
    }
     public void Xuat(){
        System.out.println("ma phong la: "+MaPhong);
        System.out.println("Ten phong la: "+TenPhong);
        System.out.println("dien tich cua phong la: "+DienTich);
        x.Xuat();
        for(int i=0;i<n;i++){
            y[i].Xuat();
        }
     }
    public static void main(String[] args) {
        PhongMay Phongmay = new PhongMay();
        Phongmay.Nhap();
        Phongmay.Xuat();
    }
}
