package calendar;
import java.util.*;
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		String s1, s2;
		s1 = sc.next();
		s2 = sc.next();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.printf("%d와 %d의 합은 %d입니다.",a, b, a+b);

	}

}
