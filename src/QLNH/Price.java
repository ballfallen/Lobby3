package QLNH;

public class Price {
private double giaNgayThuong[]=new double[3];
private double giaCuoiTuan[]=new double[3];

public double[] getGiaNgayThuong() {
	return giaNgayThuong;
}
public void setGiaNgayThuong(double value) {
	this.giaNgayThuong[0] = value;
	this.giaNgayThuong[1] = value*1.25;
	this.giaNgayThuong[2] = value*1.5;
}
public double[] getGiaCuoiTuan() {
	return giaCuoiTuan;
}
public void setGiaCuoiTuan(double value) {
	giaCuoiTuan[0] = value*1.5;
	giaCuoiTuan[1] = value*1.75;
	giaCuoiTuan[2] = value*2;
}

}
