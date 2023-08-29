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
public class Faculty {
   private String Name;
   private String Date;
   private final School x = new School();
   public void setName(String name){
        this.Name=name;
   }
   public void setDate(String date){
        Date=date;
   }
   public String getName(){
        return Name;
   }
   public String getDate(){
        return Date;
   }
   public void Nhap(){
       Scanner sc = new Scanner(System.in);
       System.out.print("nhap ten truong: ");
       String name1=sc.nextLine();
       x.setName(name1);
       System.out.print("nhap ngay vao truong: ");
       String date1=sc.nextLine();
       x.setDate(date1);
       System.out.print("nhap ten khoa: ");
       Name=sc.nextLine();
       System.out.print("nhap ngay vao khoa: ");
       Date=sc.nextLine();
   }
   public void Xuat(){
       System.out.println("ten truong la: "+x.getName());
       System.out.println("ngay vao truong la: "+x.getDate());
       System.out.println("ten khoa la: "+Name);
       System.out.println("ngay vao khoa la: "+Date);
   }
}
