/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNH;/**
 *
 * @author Minh Nghia
 */
public class Lobby {
    private String ten;
    private String id;
    private static int dem;
    private int capacity;
    private int tang;
    private double giaBase;
    private double a;
    private Price Price;
  
    {
        this.id=String.format("S%03d", ++dem);
    }

    public Lobby(String ten, int capacity, int tang,double giaBase) {
        this.ten = ten;
        this.capacity = capacity;
        this.tang = tang;
        this.giaBase=giaBase;
        this.Price=new Price();
        setGiaThoiGian();
    }
    public void setGiaThoiGian() {
    	Price.setGiaNgayThuong(this.giaBase);
    	Price.setGiaCuoiTuan(this.giaBase);
    }
   
    public Lobby() {
    	this.Price=new Price();
    }
    
    public void getTimeNgayThuong(int time){
        if(time==1){
           a=Price.getGiaNgayThuong()[0];
        }
        else if(time==2){
           a=Price.getGiaNgayThuong()[1];
        }
        else{
           a=Price.getGiaNgayThuong()[2];
        }
        
    }
      public void getTimeCuoiTuan(int time){
        if(time==1){
             a=Price.getGiaCuoiTuan()[0];
        }
        else if(time==2){
        	  a=Price.getGiaCuoiTuan()[1];        }
        else{
        	  a=Price.getGiaCuoiTuan()[2];        }
    }
   
 

    
    public void displayLobby(){
        System.out.printf("%s. Ten Sanh: %s || Vi tri: Tang %d ||So ban: %d \n",this.id,getTen(),getTang(),getCapacity());   
        System.out.println("Gia Ngay thuong(Thu 2-> Thu 6)");
        System.out.println("Sang || Trua || Chieu");
        for(int i=0;i<Price.getGiaNgayThuong().length;i++) {
            System.out.printf("%.1f || ", Price.getGiaNgayThuong()[i]);
        }        
        System.out.println();
        System.out.println("Gia Cuoi Tuan(Thu 7-> Chu nhat)");
        System.out.println("Sang || Trua || Chieu");
        for(int i=0;i<Price.getGiaCuoiTuan().length;i++){
            System.out.printf("%.1f || ", Price.getGiaCuoiTuan()[i]);
        }
        System.out.println();
        System.out.println();
        
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the dem
     */
    public int getDem() {
        return dem;
    }

    /**
     * @param dem the dem to set
     */
    public void setDem(int dem) {
        this.dem = dem;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the tang
     */
    public int getTang() {
        return tang;
    }

    /**
     * @param tang the tang to set
     */
    public void setTang(int tang) {
        this.tang = tang;
    }

    /**
     * @return the giaBase
     */
    public double getGiaBase() {
        return giaBase;
    }

    /**
     * @param giaBase the giaBase to set
     */
    public void setGiaBase(double giaBase) {
        this.giaBase = giaBase;
    }

    /**
     * @return the giaNgayThuong
     */
 
    
    
}
