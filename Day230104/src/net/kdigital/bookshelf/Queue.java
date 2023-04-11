package net.kdigital.bookshelf;

public interface Queue {
	void enQueue(String title);
	String deQueue();
	int getSize();
}
