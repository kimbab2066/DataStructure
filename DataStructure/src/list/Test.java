package list;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < 200; i++) {
			al.add("" + i);
		}
		al.remove("10");
		al.remove(100);
		al.add("" + 201);

		for (int i = 0; i < 200; i++) {
			System.out.println(al.get(i));
		}
		//
		
	}
}

