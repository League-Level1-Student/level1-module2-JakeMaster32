package _02_sea_creature;

public class SeaCreature_runner {
	public static void main(String[] args) {
		SeaCreature Spongebob = new SeaCreature("Spongebob");
		SeaCreature Squidward = new SeaCreature("Squidward");
		SeaCreature Patrick = new SeaCreature("Patrick");
		Spongebob.eat();
		Spongebob.laugh();
		Squidward.getName();
		Squidward.eat();
		Squidward.laugh();
		Patrick.getName();
		Patrick.eat();
		Patrick.laugh();
	}
}
