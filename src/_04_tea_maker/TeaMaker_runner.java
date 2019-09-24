package _04_tea_maker;

public class TeaMaker_runner {
public static void main(String[] args) {
	TeaBag bag = new TeaBag(TeaBag.PASSION_FRUIT);
	Kettle kettle = new Kettle();
	Cup cup = new Cup();
	System.out.println(bag.getFlavor()); 
	kettle.boil();
	cup.makeTea(bag, kettle.getWater());
}
}
