package QLNH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QLSANH {

    private ArrayList<Lobby> dsSanh = new ArrayList<>();

    public void addSanh(Lobby a) {
        this.dsSanh.add(a);
    }
    public void addSanh(Lobby...a){
        this.dsSanh.addAll(Arrays.asList(a));
    }
    public void xoaSanh(int id) {
        this.dsSanh.remove(id);
    }
    public Lobby laySanh(String id) {
	return this.dsSanh.stream().filter(h->h.getId().contains(id)).findFirst().get();
}

   
    public void searchByName(String kw) {
        List<Lobby> lobbies = this.dsSanh.stream().filter(d -> d.getTen().contains(kw)).collect(Collectors.toList());
        for (Lobby lobby : lobbies) {
            System.out.println(lobby.getTen());
        }
    }

    public Lobby searchByCapacity(int capacity) {
        return this.dsSanh.stream().filter(h -> h.getCapacity() == capacity).findFirst().get();
    }

    public Lobby searchByLocation(int vt) {
        return this.dsSanh.stream().filter(h -> h.getTang() == vt).findFirst().get();
    }

    public Lobby updateLobby(String id) {
        Lobby a = new Lobby();
        a = this.dsSanh.stream().filter(h -> h.getId().contains(id)).findFirst().get();
        System.out.print("Nhap ten sanh: ");
        a.setTen(CauHinh.sc.nextLine());
        System.out.print("Nhap suc chua: ");
        a.setCapacity(CauHinh.sc.nextInt());
        System.out.print("Nhap vi tri: ");
        a.setTang(CauHinh.sc.nextInt());
        System.out.print("Nhap gia: ");
        a.setGiaBase(CauHinh.sc.nextDouble());
        return a;
    }

    public void displayLobbyList() {
        this.dsSanh.forEach(a -> a.displayLobby());
    }

    public ArrayList<Lobby> getDsSanh() {
        return dsSanh;
    }

    public void setDsSanh(ArrayList<Lobby> dsSanh) {
        this.dsSanh = dsSanh;
    }
}
