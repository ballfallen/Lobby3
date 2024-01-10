/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNH;
/**
 *
 * @author Minh Nghia
 */
public class Food extends SanPham {

    private static int dem;
    private boolean isVegan;
    private int id;

    {
        this.setId(++dem);
    }

    public Food(boolean isVegan, String name, double giaTien) {
        super(name, giaTien);
        this.isVegan = isVegan;
    }

    public Food() {
    }
    
    @Override
    public String loaiSanPham() {
        return "Mon an";
    }

    @Override
    public void inputSanPham() {
        int choice;
        super.inputSanPham();
        System.out.println("Co phai san pham chay khong? <1.Chay/2.Man>");
        choice = CauHinh.sc.nextInt();
        CauHinh.sc.nextLine();
        isVegan = (choice == 1 ) ? true : false;
    }

    @Override
    public void hienThi() {
        System.out.printf("|| Ma so: %s ||", this.getId());
        super.hienThi();
        if(isVegan)
            System.out.println("Chay ||");
        else
            System.out.println("Khong chay ||");
       
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
     * @return the isVegan
     */
    public boolean isIsVegan() {
        return isVegan;
    }

    /**
     * @param isVegan the isVegan to set
     */
    public void setIsVegan(boolean isVegan) {
        this.isVegan = isVegan;
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
