package _06_minion;

public class Minion {
	int i;
	String name;
	String color;
	String master;

	public Minion(String name, int i, String color, String master) {
		this.name = name;
		this.color = color;
		this.master = master;
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public int getEyes() {
		return i;
	}

	public String getColor() {
		return color;
	}

	public String setMaster(String master) {
		this.master = master;
		return master;
	}

	public String getMaster() {
		return master;
	}

}
