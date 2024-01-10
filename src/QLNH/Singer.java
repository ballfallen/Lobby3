/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNH;

/**
 *
 * @author DELL
 */
public class Singer {
    private static int dem;
    private String tenCaSi;
    private int soBaiHat;
    private int id;
    private double giaTien;
    
    {
        this.setId(++dem);
    }

    public Singer() {
    }

    public Singer(String tenCaSi, int soBaiHat, double giaTien) {
        this.tenCaSi = tenCaSi;
        this.soBaiHat = soBaiHat;
        this.giaTien = soBaiHat * giaTien;
    }

    
    
    public void input(){
        System.out.print("Nhap ten ca si: ");
        this.tenCaSi = CauHinh.sc.nextLine();
        System.out.print("Nhap so bai hat: ");
        this.giaTien = CauHinh.sc.nextInt();
        System.out.print("Nhap gia tien(1 bai): ");
        this.giaTien = CauHinh.sc.nextDouble();
        
    }
    
    public String toString(){
        return "Thue ca si";
    }
    
    public double tinhTien(){
        return this.giaTien = giaTien * this.soBaiHat;
    }
    
    public void hienThi(){
        System.out.printf("--%s--\nTen ca si: %s || So luong bai hat: %d || Gia tien: %.1f",
                toString(), this.getTenCaSi(), this.getSoBaiHat(), this.getGiaTien());
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the tenCaSi
     */
    public String getTenCaSi() {
        return tenCaSi;
    }

    /**
     * @param tenCaSi the tenCaSi to set
     */
    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    /**
     * @return the soBaiHat
     */
    public int getSoBaiHat() {
        return soBaiHat;
    }

    /**
     * @param soBaiHat the soBaiHat to set
     */
    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    

    /**
     * @return the giaTien
     */
    public double getGiaTien() {
        return giaTien;
    }

    /**
     * @param giaTien the giaTien to set
     */
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
