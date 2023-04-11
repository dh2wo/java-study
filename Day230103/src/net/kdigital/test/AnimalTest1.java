package net.kdigital.test;

import java.util.ArrayList;


//다형성
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}


public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 at = new AnimalTest1(); //moveAnimal에 static 없이 접근하는 방법
		at.moveAnimal(new Animal());		//static이 있으면 두 줄 필요X
//		Animal a = new Animal();
//		at.moveAnimal(a); //윗줄이랑 같은 말 -> 두줄을 한줄으로
		at.moveAnimal(new Human());
		at.moveAnimal(new Tiger());
		at.moveAnimal(new Eagle());
		
		//이런것도 가능 
		Animal[] array = new Animal[5];
		array[0] = new Human();
		
		ArrayList<Animal> list = new ArrayList<>();
		list.add(new Human());//		
	}
	
	public void moveAnimal(Animal animal) { //static이 있으면 AnimalTest1 접근 가능
		animal.move();
		
	}
}
