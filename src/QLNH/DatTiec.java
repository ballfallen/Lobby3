package QLNH;

import java.time.LocalDate;

public class DatTiec {
private String name;
private Lobby sanh;
private double giaSanh;
private LocalDate ngayDat;
public DatTiec() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Lobby getSanh() {
	return sanh;
}
public void setSanh(Lobby sanh) {
	this.sanh = sanh;
}
public double getGiaSanh() {
	return giaSanh;
}
public void setGiaSanh(double giaSanh) {
	this.giaSanh = giaSanh;
}
public LocalDate getNgayDat() {
	return ngayDat;
}
public void setNgayDat(LocalDate ngayDat) {
	this.ngayDat = ngayDat;
}

}
