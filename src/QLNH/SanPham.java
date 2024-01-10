/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNH;

/**
 *
 * @author Minh Nghia
 */
public abstract class SanPham {

    private String name;
    private double giaTien;

    public SanPham(String name, double giaTien) {
        this.name = name;
        this.giaTien = giaTien;
    }

    public SanPham() {
    }

    public String loaiSanPham() {
        return "San Pham";
    }

    public void inputSanPham() {
        System.out.printf("Nhap ten %s: ", this.loaiSanPham());
        this.name = CauHinh.sc.nextLine();
        System.out.print("Gia tien ");
        this.giaTien = CauHinh.sc.nextDouble();
    }

    public void hienThi() {
        System.out.printf("%s: %s || Gia tien: %.2f || ", this.loaiSanPham(), this.name, this.giaTien);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

}
