package models;

public class Cat {
	String ten;
	int tuoi;
	String mauLong;
	
	public Cat(String ten, int tuoi, String mauLong) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.mauLong = mauLong;
	}
	
	public void an() {
		System.out.println(ten + " đang ăn");
	}
	
	public void tam() {
		System.out.println(ten + " đang tắm");
	}
	
}
