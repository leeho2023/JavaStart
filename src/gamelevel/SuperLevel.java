package gamelevel;

public class SuperLevel extends PlayerLevel{

	@Override
	protected void run() {
		System.out.println("상급자라서 완전 빨리 달립니다.");
	}

	@Override
	protected void jump() {
		System.out.println("완전 높이 점프를 합니다.");
	}

	@Override
	protected void turn() {
		System.out.println("한바퀴 구릅니다.");		
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("===============상급자 레벨입니다.===============");		
	}

}
