package cse360assign2;

public class Main {
	
	public static void main(String[] args) {
		SimpleList newList = new SimpleList();
		newList.add(5);
		newList.remove(5);
		System.out.println(newList.count());
		System.out.println(newList.toString());
	}

}
