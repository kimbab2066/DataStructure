package 권오흠자료구조.Chap1;

public class FindPrime {
	public static void main(String[] args) {
		// 1~10만 사이의 모든 소수를 찾아라.
		// n = 2 to sqrt(n) 사이의 정수로 n을 나눠보고 나눠 떨어지면 소수가 아닌 것
		// root n 까지만 해도 되는 이유는 결국 소수가 아니라면 n * ? 인 경우인데 절반만 조회해도 알 수 있기 때문임
		// i <= Math.sqrt(n)

		for (int n = 2; n < 100_000; n++) {
			boolean isPrime = true;// 근거 추정의 법칙
			for (int i = 2; i * i <= n && isPrime; i++) {
				if (n % i == 0)
					isPrime = false;
			}
			if (isPrime) {
				System.out.println(n);
			}
		}

	}// end of main
}// end of class