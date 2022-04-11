package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("1 : 한명씩 차례로 할당 ");
		System.out.println("2 : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("3 : 우선순위가 높은 고객 먼저 할당 ");
		System.out.println("4 : 상담원이 전화를 필요로 할 때 할당");
		
		int num = System.in.read();
		Scheduler scd = null;
		
		if(num == '1' || num == '2') {
			scd = new RoundRobin();
		}else if(num == '2') {
			scd = new LeastJob();
		}else if(num == '3') {
			scd = new PriorityAllocation();
		}else if(num == '4'){
			scd = new AgentGetCall();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		scd.getNextCall();
		scd.sendCallToAgent();
		
	}

}
