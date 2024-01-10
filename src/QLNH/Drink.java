/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNH;
/**
 *
 * @author Minh Nghia
 */
public class Drink extends SanPham {

    private static int dem;
    private String nhaSX;
    private int id;

    {
        this.setId(++dem);
    }

    public Drink(String name,double giaTien,String nhaSX) {
        super(name,giaTien);
        this.nhaSX = nhaSX;
    }

    public Drink() {
    } 

    @Override
    public String loaiSanPham() {
        return "Thuc uong ";
    }

    @Override
    public void inputSanPham() {
        super.inputSanPham();
        System.out.print("Nha san xuat ");
        this.setNhaSX(CauHinh.sc.nextLine());
    }

    @Override
    public void hienThi() {
        System.out.printf("\n|| Ma so: %s ||", this.getId());
        super.hienThi();
        System.out.printf("%s ||", this.nhaSX);
        System.out.println();
        
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
     * @return the nhaSX
     */
    public String getNhaSX() {
        return nhaSX;
    }

    /**
     * @param nhaSX the nhaSX to set
     */
    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
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
