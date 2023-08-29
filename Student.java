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
public class Student {
    private String Name;
    private String Lop;
    private double Score;
    private final Faculty y= new Faculty();
    public void setName(String name){
        this.Name=name;
    }
    public void setLop(String classx){
        this.Lop=classx;
    }
    public void setScore(double score){
        this.Score=score;
    }
    public String getName(){
        return Name;
    }
    public String getLop(){
        return Lop;
    }
    public double getScore(){
        return Score;
    }
    public void Nhap(){
       Scanner sc = new Scanner(System.in);
       System.out.print("nhap ten hoc sinh: ");
       Name=sc.nextLine();
       System.out.print("nhap ten lop hoc: ");
       Lop=sc.nextLine();
       System.out.print("nhap diem so: ");
       Score=sc.nextDouble();
       y.Nhap();
    }
    public void Xuat(){
       y.Xuat();
       System.out.println("ten hoc sinh la: "+Name);
       System.out.println("Lop cua hoc sinh la: "+Lop);
       System.out.println("Diem cua hoc sinh la: "+Score);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap so luong hoc sinh: ");
        int n=sc.nextInt();
        Student[] student = new Student[n+1];
        for(int i=1; i<=n ;i++){
            student[i]= new Student();
            student[i].Nhap();
        }
        for(int i=1; i<=n ;i++){
            student[i].Xuat();
        }
    }
}
