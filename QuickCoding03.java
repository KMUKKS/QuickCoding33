package btr;

import java.util.Scanner;
import java.util.*;

public class QuickCoding03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc1 = "�������� �Է��ϼ���.";
		String abc2 = "������ �Է��ϼ���.";
		
		Scanner cd = new Scanner(System.in);
		
		try{
			System.out.println(abc1);
			String n1 = cd.nextLine();
			System.out.println(abc2);
			String n2 = cd.nextLine();
			
			int a = Integer.parseInt(n1);
			int b = Integer.parseInt(n2);
			Errornum(a, b);
			
			System.out.println(a + "��" + b + "�� ���� ����" + a/b);
	
		}catch(InputMismatchException e){
			System.out.println("����");
		}catch(ArithmeticException e){
			System.out.println("���� 0");
		}catch(NumberFormatException e){
			System.out.println("�Է� ����");
		}catch(Exception e){
			System.out.println("3�ڸ����� �Ѿ");
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


