package QLNH;

public class ini {
    public static void main(String[] args) {
    	Lobby lb=new Lobby("Diamond",200,2,10000000);
    	Lobby lb1=new Lobby("Saphire",100,1,10000000);
    	QLSANH dsSanh= new QLSANH();
    	dsSanh.addSanh(lb);
    	dsSanh.addSanh(lb1);
    	dsSanh.displayLobbyList();
}
}
