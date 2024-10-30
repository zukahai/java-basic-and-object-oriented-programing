package models;

public class Cat {
	private String ten;
	private int soChan;
	private String mauLong;
	private int doTuoi;
	
	public Cat() {
		ten = "Tom";
		soChan = 4;
		mauLong = "Trắng";
		doTuoi = 1;
	}
	
	public Cat(String ten, int soChan, String mauLong, int doTuoi) {
		this.ten = ten;
		this.soChan = soChan;
		this.mauLong = mauLong;
		this.doTuoi = doTuoi;
	}
	
	public Cat(String ten, int soChan, String mauLong) {
		this.ten = ten;
		this.soChan = soChan;
		this.mauLong = mauLong;
		this.doTuoi = 0;
	}

	public String toString() {
		return "Cat [ten=" + ten + ", soChan=" + soChan + ", mauLong=" + mauLong + ", doTuoi=" + doTuoi + "]";
	}

	public void namNgu() {
		System.out.println(ten + " đang ngủ");
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

	public int getSoChan() {
		return soChan;
	}

	public void setSoChan(int soChan) {
		this.soChan = soChan;
	}

	public String getMauLong() {
		return mauLong;
	}

	public void setMauLong(String mauLong) {
		this.mauLong = mauLong;
	}

	public int getDoTuoi() {
		return doTuoi;
	}

	public void setDoTuoi(int doTuoi) {
		this.doTuoi = doTuoi;
	}

}
