package net.kdigital.test;

import java.util.ArrayList;

public class AnimalTest2 {

	ArrayList<Animal> aniList = new ArrayList<>();

	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		aTest.addAnimal();
		System.out.println(">>원래 형으로 다운 캐스팅<<"); //형변환
		aTest.testCasting();
	}

	private void testCasting() {
		for(Animal a : aniList) {
			if(a instanceof Human) {
				Human h = (Human)a;
				h.readBook();
			}
			else if(a instanceof Tiger) {
				Tiger t = (Tiger)a;
				t.hunting();
			}
			else if(a instanceof Eagle) {
				Eagle e = (Eagle)a;
				e.flying();
			}
			else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());

		for(Animal a : aniList) {
			a.move();
		}
	}
}
