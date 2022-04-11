package gamelevel;

public class MainBoard {

	public static void main(String[] args) {

		Player beginner = new Player();
		beginner.play(1);
		
		AdvancedLevel advancedLevel = new AdvancedLevel();
		
		beginner.upgradeLevel(advancedLevel);
		beginner.play(3);
		
		SuperLevel superLever = new SuperLevel();
		
		beginner.upgradeLevel(superLever);
		beginner.play(3);
		
	}

}
