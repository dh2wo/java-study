package net.kdigital.scheduler;

import java.util.Scanner;

public class SchedulerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Scheduler scheduler = null;

		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("1 : 한명씩 차례로 할당");
		System.out.println("2 : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("3 : 우선순위가 높은 고객 먼저 할당");
		System.out.println("4 : 상담원이 본인이 필요할 때 가져오기");
		System.out.print(">> 선택 : ");
		String choice = sc.next();
		
		switch(choice) {
		case "1":
			scheduler = new RoundRobin();
			break;
		case "2":
			scheduler = new LeastJob();
			break;
		case "3":
			scheduler = new PriorityAllocation();
			break;
		case "4":
			scheduler = new AgentGetCall();
			break;
		default:
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.snedCallToAgent();
	}

}
