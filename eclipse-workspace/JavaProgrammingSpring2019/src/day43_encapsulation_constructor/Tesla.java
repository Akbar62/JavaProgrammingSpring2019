package day43_encapsulation_constructor;

public class Tesla {
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;

	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}

	public void setModel(String model) {
		if(!(isValidModel(model))) {
			System.out.println("Invalid model - "+model);
			model = "unknown";
		}
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getRange() {
		return range;
	}

	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}

	public double getZeroTo60() {
		return zeroTo60;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSelfDriving() {
		return selfDriving;
	}

	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}

	public boolean isValidModel(String model) {
		if (model.equalsIgnoreCase("Model S") || model.equalsIgnoreCase("Model 3") || model.equalsIgnoreCase("model x")
				|| model.equalsIgnoreCase("Model y") || model.equalsIgnoreCase("roadster")) {
			return true;
		}
		return false;
	}
	
	public void setTeslasInfo(String model, int range, double zeroTo60, double price, boolean selfDriving) {
		setModel(model);
		setRange(range);
		setZeroTo60(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
	}

}
