/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLNH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Minh Nghia
 */
public class QLSanPham {
    
    private final ArrayList<Drink> dsDrink = new ArrayList<>();
    private final ArrayList<Food> dsFood = new ArrayList<>();
    
    public void themDrink(Drink... a) {
        this.dsDrink.addAll(Arrays.asList(a));
    }
    
    public void nhapDrink() {
        Drink d = new Drink();
        d.inputSanPham();
        this.dsDrink.add(d);
    }
    
    public void themFood(Food... a) {
        this.dsFood.addAll(Arrays.asList(a));
    }
    
    public void nhapFood() {
        Food f = new Food();
        f.inputSanPham();
        this.dsFood.add(f);
    }
    
    public Food updateFood(int id) {
        Food b = this.dsFood.stream().filter(h -> h.getId() == id).findFirst().get();
        
        System.out.print("Cap nhat ten mon: ");
        b.setName(CauHinh.sc.nextLine());
        System.out.print("Cap nhat gia tien: ");
        b.setGiaTien(CauHinh.sc.nextDouble());
        System.out.print("Co an chay duoc khong:(true/false): ");
        b.setIsVegan(CauHinh.sc.nextBoolean());
        
        return b;
    }
    
    public Drink updateDrink(int id) {
        Drink b = this.dsDrink.stream().filter(h -> h.getId() == id).findFirst().get();
        
        System.out.print("Cap nhat ten mon: ");
        b.setName(CauHinh.sc.nextLine());
        System.out.print("Cap nhat nha san xuat: ");
        b.setNhaSX(CauHinh.sc.nextLine());
        System.out.print("Cap nhat gia tien: ");
        b.setGiaTien(CauHinh.sc.nextDouble());
        
        return b;
    }
    
    public void timKiemDrink(String kw) {
        List<Drink> drinks = dsDrink.stream().filter(d -> d.getName().contains(kw)).collect(Collectors.toList());
        for (Drink drink : drinks) {
            System.out.println(drink.getName());
            
        }
    }
    
    public void timKiemFood(String kw) {
        List<Food> Foods = dsFood.stream().filter(f -> f.getName().contains(kw)).collect(Collectors.toList());
        for (Food food : Foods) {
            System.out.println(food.getName());
        }
    }
    
    public void showDrink() {
        this.dsDrink.forEach(d -> d.hienThi());
    }
    
    public void showFood() {
        this.dsFood.forEach(f -> f.hienThi());
    }
    
    public void xoaFood(int id) {
        this.dsFood.remove(id);
    }
    
    public void xoaDrink(int id) {
        this.dsDrink.remove(id);
    }
    public ArrayList<Drink> getDsDrink() {
		return dsDrink;
	}
    public ArrayList<Food> getDsFood() {
		return dsFood;
	}
}
