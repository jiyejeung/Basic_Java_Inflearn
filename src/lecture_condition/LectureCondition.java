package lecture_condition;

import java.util.Scanner;

public class LectureCondition {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Score: ");
		
		String strScore = scanner.next();
		String str01;
		
		int intScore = Integer.parseInt(strScore);
		
		if (intScore > 80) {
			str01 = String.valueOf("S");
		} else if (intScore > 60) {
			str01 = String.valueOf("A");
		} else if (intScore > 40) {
			str01 = String.valueOf("B");
		} else {
			str01 = String.valueOf("C");
		}
		
		switch (str01) {
			case "S":
				System.out.println("최우수 등급입니다.");
				break;
			case "A":
				System.out.println("우수 등급입니다.");
				break;
			case "B": 
				System.out.println("보통 등급입니다.");
				break;
			case "C": 
				System.out.println("최하 등급입니다.");
				break;
		}
		
		
	}

}
