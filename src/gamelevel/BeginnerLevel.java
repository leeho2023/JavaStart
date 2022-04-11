package gamelevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	protected void run() {
		System.out.println("초보자라서 천천히 달립니다.");
	}

	@Override
	protected void jump() {
		System.out.println("점프할 줄 모르지롱");
	}

	@Override
	protected void turn() {
		System.out.println("턴 할 줄 모르지롱");		
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("===============초보자 레벨입니다.===============");		
	}

}
