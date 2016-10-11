package btr;

import java.util.Scanner;
import java.util.*;

public class QuickCoding03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc1 = "피제수를 입력하세요.";
		String abc2 = "제수를 입력하세요.";
		
		Scanner cd = new Scanner(System.in);
		
		try{
			System.out.println(abc1);
			String n1 = cd.nextLine();
			System.out.println(abc2);
			String n2 = cd.nextLine();
			
			int a = Integer.parseInt(n1);
			int b = Integer.parseInt(n2);
			Errornum(a, b);
			
			System.out.println(a + "를" + b + "로 나눈 값은" + a/b);
	
		}catch(InputMismatchException e){
			System.out.println("에러");
		}catch(ArithmeticException e){
			System.out.println("숫자 0");
		}catch(NumberFormatException e){
			System.out.println("입력 오류");
		}catch(Exception e){
			System.out.println("3자리수가 넘어감");
		}

		
		

	}
	
	public static void Errornum(int a, int b) throws Exception
	{
		if(a >= 100 || b >= 100)
		{
			throw new Exception();
		}
	}
	

		
}


