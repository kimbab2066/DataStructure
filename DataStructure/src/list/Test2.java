package list;

public class Test2 {
	public static void main(String[] args) {
		SinglyLinkedList<String> sll = new SinglyLinkedList<String>();
		sll.add("1");
		sll.add("2");
		sll.add("3");
		System.out.println(sll.toString());

		sll.remove("2");
		System.out.println(sll.toString());

		sll.addFirst("first");
		System.out.println(sll.toString());

		sll.remove("0");
		System.out.println(sll);

	}// end of main
}// end of class
