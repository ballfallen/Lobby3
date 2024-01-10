/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNH;

/**
 *
 * @author DELL
 */
public class RentingKaraoke extends Service{
    private static int dem;
    private double timeKaraoke;
    private int id;
    private double giaTien;

    {
        this.setId(++dem);
    }

    public RentingKaraoke() {
    }
    
    public RentingKaraoke(double timeKaraoke, double giaTien) {
        this.timeKaraoke = timeKaraoke;
        this.giaTien = giaTien;
    }
    public void input(){
        System.out.print("Nhap so gio muon thue: ");
        this.giaTien = CauHinh.sc.nextDouble();
        System.out.print("Nhap gia tien(1 gio): ");
        this.giaTien = CauHinh.sc.nextDouble();
        
    }
    public double tinhTien(){
        return this.giaTien = giaTien * this.timeKaraoke;
    }
    
    public String toString(){
        return "Thue Karaoke";
    }

    public void hienThi(){
        System.out.printf("\nMa so: %s || %s || Thoi gian thue(gio): %.2f|| Gia tien: %.2f", 
                this.id, toString(), this.getTimeKaraoke(), this.giaTien);
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
     * @return the timeKaraoke
     */
    public double getTimeKaraoke() {
        return timeKaraoke;
    }

    /**
     * @param timeKaraoke the timeKaraoke to set
     */
    public void setTimeKaraoke(double timeKaraoke) {
        this.timeKaraoke = timeKaraoke;
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
