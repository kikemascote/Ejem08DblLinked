package app;

import doubleLinkedList.DoubleLinkedList;

public class App {
    public static void main(String[] args) {
    	DoubleLinkedList<String>  names 		= new DoubleLinkedList<String>();
	DoubleLinkedList<String>  lastnames 	= new DoubleLinkedList<String>();
	DoubleLinkedList<Integer> ages 		= new DoubleLinkedList<Integer>(19);
		names.addStart("Pedro");
		names.addStart("kike");
		names.addStart("Xavi");
		names.addStart("ricardos");
		names.addStart("ana");
		names.addStart("Juan");
		
		
		names.pronter();
		System.out.println("no hay error! no hay error!, el dinero es dinero!");
    }
}
