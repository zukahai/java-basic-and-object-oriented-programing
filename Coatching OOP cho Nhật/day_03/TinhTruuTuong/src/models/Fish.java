package models;

public class Fish extends Animal{
	private boolean isNuocNgot;

	public Fish() {
		super();
		this.isNuocNgot = true;
	}

	public Fish(String name, boolean isNuocNgot) {
		super(name);
		this.isNuocNgot = isNuocNgot;
	}

	@Override
	public String toString() {
		return "Fish [name=" + super.getName() + ", isNuocNgot=" + isNuocNgot + "]";
	}

	public boolean isNuocNgot() {
		return isNuocNgot;
	}

	public void setNuocNgot(boolean isNuocNgot) {
		this.isNuocNgot = isNuocNgot;
	}

	@Override
	public void diChuyen() {
		// TODO Auto-generated method stub

	}

	@Override
	public int abc() {
		// TODO Auto-generated method stub
		return 0;
	}

}
