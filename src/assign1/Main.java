package assign1;

public class Main {
	
	public static void main(String[] args) {
		SimpleList newList = new SimpleList();
		newList.add(3);
		newList.add(6);
		newList.add(2);
		newList.add(3);
		newList.add(3);
		newList.add(7);
		newList.add(7);
		newList.add(7);
		newList.add(7);
		newList.add(7);
		newList.add(15);
		newList.add(2);
		newList.add(9);
		System.out.println(newList.count());
		System.out.println(newList.toString());
	}

}
