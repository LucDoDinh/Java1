/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVien;

import java.util.Scanner;
public class SinhVien {
    private String hoTen;
    private double diem;
    public SinhVien(){
      this.hoTen="N/A";
      this.diem=0;
    }
    public SinhVien(String hoten,double diem){
      this.hoTen=hoten;
      this.diem=diem;
    }
    public void nhap(){
      System.out.print("\nNhap ho ten:");
      Scanner sc=new Scanner(System.in);hoTen=sc.nextLine();
      System.out.print("\nNhap diem:");diem=Double.parseDouble(sc.nextLine());
         }
    public void xuat(){
        System.out.print("\n"+hoTen+" "+diem);
    }
    public void xepLoai(){
        if(diem>=9)System.out.print("\nXuat sac");
        else if(diem>=8)System.out.print("\nGioi");
        else if(diem>=7)System.out.print("\nKha");
        else if(diem>=5.5)System.out.print("\nTrung binh");
        else if(diem>=4)System.out.print("\nYeu");
            else System.out.print("\nKem");
    }
}
