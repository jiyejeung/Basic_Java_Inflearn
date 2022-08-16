package lecture_calculator;

public class LectureCalculator {

	public static void main(String[] args) {
		
		byte sumByte01 = 1 + 1;
		short sumShort01 = 2 + 2;
		int sumInt01 = 3 + 3;
		float sumFloat01 = 4.0F + 4.0F;
		double sumDouble01 = 5.0 + 5.0;
		
		System.out.println(sumByte01);
		System.out.println(sumShort01);
		System.out.println(sumInt01);
		System.out.println(sumFloat01);
		System.out.println(sumDouble01);
		
		byte minByte01 = 1 - 1;
		short mutShort01 = 2 * 2;
		float divFloat01 = 10.0F / 3.0F;
		float divFloat02 = 10 / 3;
		double restDouble01 = 10.0 % 3.0;
		
		System.out.println(minByte01);
		System.out.println(mutShort01);
		System.out.println(divFloat01);
		System.out.println(divFloat02);
		System.out.println(restDouble01);
		
		int first = 10;
		int second = 20;
		boolean cmpOrCondition = (first == 10) || (second == 20);
		
		System.out.println(cmpOrCondition);
		
		cmpOrCondition = (first == 10) || (second == 10);
		
		System.out.println(cmpOrCondition);
		
		cmpOrCondition = (first == 20) || (second == 20);
		
		System.out.println(cmpOrCondition);
		
		cmpOrCondition = (first == 0) || (second == 0);
		
		System.out.println(cmpOrCondition);
		
		cmpOrCondition = (first > 0) && (second > 10);
		
		System.out.println(cmpOrCondition);
		
		cmpOrCondition = (first > 10) && (second > 10);
		
		System.out.println(cmpOrCondition);
		
		cmpOrCondition = (first > 20) || (second > 20);
		
		System.out.println(cmpOrCondition);
		
		first = 1;
		
		first = first >> 1;
		
		System.out.println(first);
		
		first = 1;
		
		first = first << 1;
		
		System.out.println(first);
		
		first = first << 3;
		
		System.out.println(first);
		
	}

}
