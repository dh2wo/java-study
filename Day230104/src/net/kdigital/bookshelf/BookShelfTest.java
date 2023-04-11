package net.kdigital.bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");

		System.out.println("남은 권수 : " + shelfQueue.getSize());
		System.out.println(shelfQueue.deQueue());
		System.out.println("남은 권수 : " + shelfQueue.getSize());
		System.out.println(shelfQueue.deQueue());
		System.out.println("남은 권수 : " + shelfQueue.getSize());
		System.out.println(shelfQueue.deQueue());
		System.out.println("남은 권수 : " + shelfQueue.getSize());

	}

}
