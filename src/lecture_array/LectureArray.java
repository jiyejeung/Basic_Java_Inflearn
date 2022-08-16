package lecture_array;

import java.util.Arrays;

public class LectureArray {

	public static void main(String[] args) {
		
		int intArr01[] = new int[3];
		
		intArr01[0] = 1;
		intArr01[1] = 2;
		intArr01[2] = 3;
		
		System.out.println(Arrays.toString(intArr01));
		
		int first = intArr01[0];
		int second = intArr01[1];
		int third = intArr01[2];
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		intArr01 = new int[] {3, 2, 1};
		
		System.out.println(Arrays.toString(intArr01));
		
		String strArr01[] = new String[] { "yejeung", "yein", "yerim" };
		
		System.out.println(Arrays.toString(strArr01));
		
		int arr02[][] = new int[2][1];
		int arr03[][] = new int[][] { { 1, 2 }, { 3, 4 } };
		
		arr02[0][0] = 1;
		arr02[1][0] = 2;
		
		System.out.println(Arrays.toString(arr02[0]));
		System.out.println(Arrays.toString(arr02[1]));
		
		for (int i = 0; i < arr03.length; i++) {
			for (int j = 0; j < arr03[0].length; j++) {
				System.out.println(arr03[i][j]);
			}
		}
		
		int arr04[] = new int[] { 1, 2, 3, 4, 5 };
		int arr05[] = new int[5];
		int arr06[] = new int[5];
		int arr07[] = new int[5];
		
		System.arraycopy(arr04, 2, arr05, 0, 2);
		System.out.println(Arrays.toString(arr05)); // [3, 4, 0, 0, 0]
		
		System.arraycopy(arr04, 0, arr06, 0, 5);
		System.out.println(Arrays.toString(arr06)); // [1, 2, 3, 4, 5]
		
		for (int i = 0; i < arr04.length; i++) {
			arr07[i] = arr04[i];
		}
		
		System.out.println(Arrays.toString(arr07)); // [1, 2, 3, 4, 5]
		
		int arr08[] = new int[] { 4, 1, 3, 5, 2 };
		
		System.out.println(Arrays.toString(arr08)); // [4, 1, 3, 5, 2]
		
		Arrays.sort(arr08);
		
		System.out.println(Arrays.toString(arr08)); // [1, 2, 3, 4, 5]
		
		String arr09[] = new String[] { "yejeung", "yein", "yerim" };
		
		System.out.println(Arrays.toString(arr09)); // [yejeung, yein, yerim]
		
		Arrays.sort(arr09);
		
		System.out.println(Arrays.toString(arr09)); // [yein, yejeung, yerim]
	}

}
