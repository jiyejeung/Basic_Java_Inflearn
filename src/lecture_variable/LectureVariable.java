package lecture_variable;

import java.util.Date;

class Product {
	
	public String productNo; // 상품번호
	public String productName; // 상품명
	public int productPrice; // 상품가격
	public int productQuantity; // 상품수량
	
}

public class LectureVariable {

	public static void main(String[] args) {
		
		Product product01 = new Product();
		
		product01.productNo = "product001";
		product01.productName = "water";
		product01.productPrice = 500;
		product01.productQuantity = 1;
		
		System.out.println(product01.productNo);
		System.out.println(product01.productName);
		System.out.println(product01.productPrice);
		System.out.println(product01.productQuantity);
		
		double doubleValue01 = 3.141592;
		int intValue01 = (int) doubleValue01;
		
		System.out.println(intValue01);
		
		int intValue02 = 3;
		double doubleValue02 = intValue02;
		
		System.out.println(doubleValue02);
		
		char charValue01 = 'a';
		int intValue03 = charValue01;
		
		System.out.println(intValue03);
		
		int intValue04 = 97;
		char charValue02 = (char) intValue04;
		
		System.out.println(charValue02);
		
		String strValue01 = "yejeung";
		String strValue02 = "yejeung";
		
		boolean booleanValue01 = strValue01 == strValue02;
		boolean booleanValue02 = strValue01.equals(strValue02);
		
		System.out.println(booleanValue01);
		System.out.println(booleanValue02);
		
		String strValue03 = new String("yejeung");
		String strValue04 = new String("yejeung");
		
		boolean booleanValue03 = strValue03 == strValue04;
		boolean booleanValue04 = strValue03.equals(strValue04);
		
		System.out.println(booleanValue03);
		System.out.println(booleanValue04);
		
		StringBuilder stringBuilderValue01 = new StringBuilder("Hello ");
		stringBuilderValue01.append("yejeung");
		
		System.out.println(stringBuilderValue01);
		
		StringBuffer stringBufferValue01 = new StringBuffer("Hello ");
		stringBufferValue01.append("yejeung");
		
		System.out.println(stringBufferValue01);
		
		Date date = new Date();
		System.out.println(date);
		
	}

}
