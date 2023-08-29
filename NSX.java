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
public class NSX {
    private String MaNSX;
    private String TenNSX;
    private String DcNSX;
    public void setMaNSX(String maNSX){
        this.MaNSX=maNSX;
    }
    public void setTenNSX(String tenNSX){
        this.TenNSX=tenNSX;
    }
    public void setDcNSX(String dcNSX){
       this.DcNSX=dcNSX;
    }
    
    public String getMaNSX(){
        return MaNSX;
    }
    public String getTenNSX(){
        return TenNSX;
    }
    public String getDcNSX(){
        return DcNSX;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma nha san xuat: ");
        MaNSX=sc.nextLine();
        System.out.print("nhap ten nha san xuat: ");
        TenNSX=sc.nextLine();
        System.out.print("nhap dia chi nha san xuat: ");
        DcNSX=sc.nextLine();
    }
   public void Xuat(){
        System.out.println("ma nha san xuat la: "+MaNSX);
        System.out.println("ten san xuat la: "+TenNSX);
        System.out.println("dia chi nha san xuat la: "+DcNSX);
    }
}
