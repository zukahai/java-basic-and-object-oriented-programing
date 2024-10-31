package models;

public class Cat {
	private String ten;
	private int tuoi;
	private String mauLong;
	
	public Cat() {
		this.ten = "New Cat";
		this.tuoi = 0;
		this.mauLong = "";
	}
	
	public Cat(String ten, int tuoi) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.mauLong = "";
	}
	
	public Cat(String ten) {
		this.ten = ten;
		this.tuoi = 100;
		this.mauLong = "Hahaha";
	}
	
	public Cat(String ten, int tuoi, String mauLong) {
		this.ten = ten;
		if (tuoi >= 1 && tuoi <= 30)
			this.tuoi = tuoi;
		else
			this.tuoi = 122395;
		this.mauLong = mauLong;
	}

	public String toString() {
		return "Cat [ten=" + ten + ", tuoi=" + tuoi + ", mauLong=" + mauLong + "]";
	}

	public void an() {
		System.out.println(ten + " đang ăn");
	}
	
	public void tam() {
		System.out.println(ten + " đang tắm");
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		if (tuoi >= 1 && tuoi <= 30)
			this.tuoi = tuoi;
	}

	public String getMauLong() {
		return mauLong;
	}

	public void setMauLong(String mauLong) {
		this.mauLong = mauLong;
	}
}
