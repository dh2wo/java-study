package net.kdigital.scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 정화를 먼저 가져옵니다.");
		
	}

	@Override
	public void snedCallToAgent() {
		System.out.println("업무 skill 값이 높은 상담원에게 우선적으로 배분합니다.");
		
	}
	
}
