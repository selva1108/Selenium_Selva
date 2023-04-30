package week1.day1;

import java.util.Iterator;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstNum=0, secNum=1, Sum=0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 1; i < 11; i++) {
			Sum=firstNum+secNum;
			firstNum=secNum;
			secNum=Sum;
			System.out.println(Sum);
			
		}
	}

}
