package gamelevel;

public class AdvancedLevel extends PlayerLevel{

	@Override
	protected void run() {
		System.out.println("중급자라서 빨리 달립니다.");
	}

	@Override
	protected void jump() {
		System.out.println("높이 점프를 합니다.");
	}

	@Override
	protected void turn() {
		System.out.println("턴 할 줄 모르지롱");		
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("===============중급자 레벨입니다.===============");		
	}

}
