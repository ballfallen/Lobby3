/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package QLNH;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Minh Nghia
 */
public class BTL {

	public static void main(String[] args) {
		int choice = 0;
		QLSANH qlsanh = new QLSANH();
		QLSanPham qlsp = new QLSanPham();
		QLDichVu qldv = new QLDichVu();
		Lobby lb = new Lobby("Diamond", 200, 2, 10000000);
		Lobby lb1 = new Lobby("Saphire", 100, 1, 10000000);
		qlsanh.addSanh(lb);
		qlsanh.addSanh(lb1);

		Decoration a = new Decoration("Co dien", 30);
		Decoration a1 = new Decoration("Hien dai", 50);

		RentingKaraoke b = new RentingKaraoke(315, 150);
		RentingKaraoke b1 = new RentingKaraoke(200, 200);

		Singer c = new Singer("Ha Anh Tuan", 3, 1000);
		Singer c1 = new Singer("My Tam", 4, 2500);
		qldv.themCaSi(c, c1);
		qldv.themKara(b, b1);
		qldv.themTrangTri(a, a1);
		Food f = new Food(true, "Rau xao", 10);
		Food f1 = new Food(false, "Ga quay", 50);
		Drink d = new Drink("Cocacola", 10, "Cocacola");
		Drink d1 = new Drink("Sting", 15, "PepsiCo");
		qlsp.themFood(f, f1);
		qlsp.themDrink(d, d1);

		do {
			System.out.println("---------------THAO TAC---------------");
			System.out.println("1.Quan ly sanh");
			System.out.println("2.Quan ly thuc an nuoc uong");
			System.out.println("3.Quan ly dich vu");
			System.out.println("4.Dat tiec ");
			System.out.println("--------------------------------------");
			System.out.println("Hay chon mot hanh dong");
			choice = CauHinh.sc.nextInt();
			CauHinh.sc.nextLine();
			switch (choice) {
			case 1:
				int choice1 = 0;
				do {
					System.out.println("-------------QUAN LY SANH-------------");
					System.out.println("1. Them sanh ");
					System.out.println("2. Xoa sanh");
					System.out.println("3. Cap nhat sanh");
					System.out.println("4. Tim kiem sanh theo ten");
					System.out.println("5. Tim kiem sanh theo tang");
					System.out.println("6. Tim kiem sanh theo suc chua");
					System.out.println("0. Thoat chuong trinh");
					System.out.println("--------------------------------------");
					System.out.println("Hay chon 1 hanh dong: ");
					choice1= CauHinh.sc.nextInt();
					CauHinh.sc.nextLine();
					switch (choice1) {
					case 1:

						System.out.println("Nhap ten sanh: ");
						String name = CauHinh.sc.nextLine();
						System.out.println("Nhap suc chua sanh: ");
						int sucChua = CauHinh.sc.nextInt();
						CauHinh.sc.nextLine();
						System.out.println("Nhap vi tri sanh: ");
						int vt = CauHinh.sc.nextInt();
						CauHinh.sc.nextLine();
						System.out.println("Nhap gia tien sanh: ");
						double gia = CauHinh.sc.nextDouble();
						CauHinh.sc.nextLine();
						Lobby lobby = new Lobby(name, sucChua, vt, gia);
						qlsanh.addSanh(lobby);
						qlsanh.displayLobbyList();
						break;
					case 2:
						int idSanh2;
						qlsanh.displayLobbyList();
						System.out.println("Nhap id cua sanh muon xoa");
						idSanh2 = CauHinh.sc.nextInt();
						System.out.println();
						qlsanh.xoaSanh(idSanh2 - 1);
						qlsanh.displayLobbyList();
						break;
					case 3:
						qlsanh.displayLobbyList();
						System.out.println("Hay nhap id cua sanh muon thay doi(S---): ");
						String idSanh;
						idSanh = CauHinh.sc.nextLine();
						qlsanh.updateLobby(idSanh);
						break;
					case 4:
						System.out.println("Hay nhap ten sanh muon tim: ");
						String tenSanh = CauHinh.sc.nextLine();
						qlsanh.searchByName(tenSanh);
						break;
					case 5:
						System.out.println("Hay nhap suc chua sanh muon tim: ");
						int capa = CauHinh.sc.nextInt();
						qlsanh.searchByCapacity(capa);
						break;
					case 6:
						System.out.println("Hay nhap suc chua sanh muon tim: ");
						int loca = CauHinh.sc.nextInt();
						qlsanh.searchByLocation(loca);
						break;
					}
				} while (choice1 != 0);
				break;
			case 2:
				int choice2;
				do {
					System.out.println("------------------QUAN LY MON AN---------------------");
					System.out.println("1.Them Thuc An");
					System.out.println("2.Xoa Thuc An");
					System.out.println("3.Cap Nhat Thuc An");
					System.out.println("4.Tim kiem Thuc An");
					System.out.println("5.Hien thi danh sach Thuc An");
					System.out.println("6.Them Do Uong");
					System.out.println("7.Xoa Do Uong");
					System.out.println("8.Cap nhat Uong");
					System.out.println("9.Tim kiem Do Uong");
					System.out.println("10.Hien thi danh sach Do Uong");
					System.out.println("0.Thoat");
					System.out.println("-----------------------------------------------------");
					System.out.println("Hay chon mot thao tac tu 0-10: ");
					choice2 = CauHinh.sc.nextInt();
					CauHinh.sc.nextLine();
					switch (choice2) {
					case 1 -> {
						System.out.println("Them mon an vao danh sach");
						qlsp.nhapFood();
						break;
					}
					case 3 -> {
						System.out.println("Nhap mon can cap nhat(1,2...): ");
						qlsp.showFood();
						int chon = CauHinh.sc.nextInt();
						CauHinh.sc.nextLine();
						qlsp.updateFood(chon);
						break;
					}
					case 2 -> {
						System.out.println("Xoa Thuc An");
						qlsp.showFood();
						System.out.println("\nHay nhap id cua thuc an can xoa: ");
						int idFood;
						idFood = CauHinh.sc.nextInt();
						CauHinh.sc.nextLine();
						qlsp.xoaFood(idFood);
						break;
					}
					case 4 -> {
						System.out.println("Hay nhap ten mon an muon tim kiem");
						String tenMonAn;
						tenMonAn = CauHinh.sc.nextLine();
						qlsp.timKiemFood(tenMonAn);
						System.out.println("");
						break;
					}
					case 5 -> {
						System.out.println("Hien thi danh sach Thuc An ");
						qlsp.showFood();
						break;
					}
					case 6 -> {
						System.out.println("Them Do Uong vao danh sach");
						qlsp.themDrink();
						break;
					}
					case 7 -> {
						System.out.println("Xoa Do Uong");
						qlsp.showDrink();
						System.out.println("\nHay nhap id cua Do Uong can xoa: ");
						int idx;
						idx = CauHinh.sc.nextInt();
						qlsp.xoaDrink(idx);
						break;
					}
					case 8 -> {
						System.out.print("Nhap do uong can cap nhat(1,2...): ");
						int idDrink;
						idDrink = CauHinh.sc.nextInt();
						CauHinh.sc.nextLine();
						qlsp.updateDrink(idDrink);
						break;
					}
					case 9 -> {
						System.out.println("Hay nhap ten do uong muon tim kiem");
						String tim;
						tim = CauHinh.sc.nextLine();
						qlsp.timKiemFood(tim);
						System.out.println("");
						break;
					}
					case 10 -> {
						System.out.println("Hien thi danh sach do uong ");
						qlsp.showDrink();
						break;
					}
					}
				} while (choice2 != 0);
				break;
			case 3:
				int choice3;
				do {
					System.out.println("\n------------------QUAN LY DICH VU---------------------\n");
					System.out.println("1.Them trang ti");
					System.out.println("2.Xoa trang tri");
					System.out.println("3.Cap Nhat trang tri");
					System.out.println("4.Tim kiem trang tri theo ten");
					System.out.println("5.Hien thi danh sach cac trang tri");
					System.out.println("6.Them karaoke");
					System.out.println("7.Xoa karaoke");
					System.out.println("8.Cap nhat karaoke");
					System.out.println("9.Tim kiem karaoke");
					System.out.println("10.Hien thi danh sach karaoke");
					System.out.println("11.Them ca si");
					System.out.println("12.Xoa ca si");
					System.out.println("13.Cap Nhat ca si");
					System.out.println("14.Tim kiem Ca si theo ten");
					System.out.println("15.Hien thi danh sach cac Ca si");
					System.out.println("0.Thoat");
					System.out.println("-----------------------------------------------------");
					System.out.println("Hay chon mot thao tac tu 0-10: ");
					choice3 = CauHinh.sc.nextInt();
					CauHinh.sc.nextLine();
					switch (choice3) {
					case 1 -> {
						System.out.println("Them trang tri vao dich vu");
						qldv.nhapTrangTri();
					}
					case 2 -> {
						qldv.showDecoration();
						System.out.print("\nNhap id trang tri can xoa: ");
						int idDec = CauHinh.sc.nextInt();
						CauHinh.sc.nextLine();
						qldv.xoaTrangTri(idDec);
					}
					case 3 -> {
						System.out.println("Nhap id trang tri can cap nhat: ");
						qldv.showDecoration();
						int chon = CauHinh.sc.nextInt();
						CauHinh.sc.nextLine();
						qldv.updateTrangTri(chon);
					}
					case 4 -> {

						System.out.print("Nhap ten trang tri de tim kiem: ");
						String kw = CauHinh.sc.nextLine();
						qldv.searchTrangTriByName(kw);

					}
					case 5 -> {
						System.out.print("\n===========Trang tri==========\n");
						qldv.showDecoration();
					}
					case 6 -> {
						System.out.println("Them karaoke vao dich vu");
						qldv.nhapKara();
					}
					case 7 -> {
						qldv.showKara();
						System.out.print("\nNhap id kara can xoa: ");
						int id = CauHinh.sc.nextInt();
						CauHinh.sc.nextLine();
						qldv.xoaKaraoke(id);
					}
					case 8 -> {
						System.out.println("Nhap id kara can cap nhat: ");
						qldv.showKara();
						int chon = CauHinh.sc.nextInt();
						CauHinh.sc.nextLine();
						qldv.updateKaraoke(chon);
					}
					case 9 -> {

						System.out.print("Nhap ten kara de tim kiem: ");
						double kw = CauHinh.sc.nextDouble();
						qldv.searchKaraByRentingTime(choice).hienThi();

					}
					case 10 -> {
						System.out.print("\n===========Karaoke==========\n");
						qldv.showKara();
					}
					case 11 -> {
						System.out.println("Them thue ca si vao dich vu");
						qldv.nhapThueCaSi();
					}
					case 12 -> {
						qldv.showCaSi();
						System.out.print("\nNhap id ca si can xoa: ");
						int idDec = CauHinh.sc.nextInt();
						CauHinh.sc.nextLine();
						qldv.xoaCaSi(idDec);
					}
					case 13 -> {
						System.out.println("Nhap id ca si can cap nhat: ");
						qldv.showCaSi();
						int chon = CauHinh.sc.nextInt();
						CauHinh.sc.nextLine();
						qldv.updateCaSi(chon);
					}
					case 14 -> {

						System.out.print("Nhap ten ca si de tim kiem: ");
						String kw = CauHinh.sc.nextLine();
						qldv.searchSingerByName(kw);

					}
					case 15 -> {
						System.out.print("\n===========Cac ca si==========\n");
						qldv.showCaSi();
					}
					}
				} while (choice3 != 0);
				break;
			case 4:
				DatTiec dt= new DatTiec();
				System.out.println("Hay nhap ten bua tiec: ");
				String tenBuaTiec=CauHinh.sc.nextLine();
				System.out.println("Hay chon sanh muon dat: ");
				qlsanh.displayLobbyList();
				String thuTu;
				Lobby lobby1= new Lobby();
				lobby1=qlsanh.laySanh(thuTu);
				System.out.println("Hay chon ngay dat ");
				String date;
				LocalDate lich;
				dt.setNgayDat(LocalDate.parse(date,DateTimeFormatter.ofPattern("DD-MM-YYYY")));
				break;
				
		} while (choice != 0);
	}
}