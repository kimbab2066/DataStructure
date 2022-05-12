package java;

public class Java_Concept {
	public static void main(String[] args) {
		String str = 1 + 2 + "123" + 123;
		System.out.println(str);
		byte b = 1 << 2;
		System.out.println(b);
		//
		float f = 0f;
		for (float i = 0.1f; i < 1f; i += 0.1f) {
			f += i;

		}
		//
		float fa = 0f;
		for (int i = 0; i < 10; i++) {
			fa += 0.1f;
		}
		//
		System.out.println("float사용법: " + f);
		System.out.println(fa);
		// ;로 이어서 입력 가능
		// if (true)System.out.println();System.out.println();

		int a = 0;
		while (a < 20) {
			a++;
			if (a % 2 == 0) {
				continue;
			}
			System.out.println(a);
		}
		// switch
		int ab = 4;

		switch (ab) {
		case 0:
			System.out.println("0 입니다");
			break;
		case 1:
			System.out.println("1 입니다.");
			break;
		case 2:
			System.out.println("2 입니다.");
			break;
		default:
			System.out.println("그 외 숫자입니다.");
		}

		//
		// 안쪽에서 break하되 바깥쪽 while문 빠져나감
		A: while (true) {
			while (true) {
				break A;
			}
		}
	}// end of main
}// end of class