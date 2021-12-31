package datastructures.badri.implementation.BadriDatastructures.stack;

import java.util.Scanner;

public class ArrayImplementation 
{	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
//		System.out.println("Tell us data to push: ");
//		MyArray.push(scan.nextDouble());
		
		MyArray.traverse();
		
		MyArray.push(1.9);MyArray.push(29.5);MyArray.push(34.5);
		MyArray.push(92.5);MyArray.push(0.0);MyArray.push(7.4);
		MyArray.push(6.7);MyArray.push(4.8);MyArray.push(9.9);
		MyArray.push(88.2);MyArray.push(10.5);MyArray.push(3.1);
		
		//MyArray.traverse();
		
		System.out.println(MyArray.getPeek());
		
		System.out.println("Popped is: "+MyArray.pop());
		System.out.println("Popped is: "+MyArray.pop());
		System.out.println("Popped is: "+MyArray.pop());
		System.out.println("Popped is: "+MyArray.pop());
		System.out.println("Popped is: "+MyArray.pop());
		
		MyArray.push(1.9);
		
		System.out.println("7.4 found @ "+MyArray.search(7.4));
		
		scan.close();
	}
}

class MyArray
{
	private static Double[] arr=new Double[10];
	private static int peek=-1;
	
	public static int search(double data)
	{
		if(peek!=-1)
		{
			while(peek>-1)
			{
				if(arr[peek]==data)
					return peek;
				peek-=1;
			}
		}
		System.out.println("Stack is empty");
		return -1;
	}
	
	public static void clear()
	{
		if(peek==-1)
			System.out.println("Stack is already empty");
		else {
			peek=-1;
			System.out.println("Stack is Empty now");
		}
	}
	
	public static Double pop()
	{
		Double elem=null;
		if(peek!=-1)
		{
			elem=arr[peek];
			peek-=1;
			return elem;
		}
		System.out.println("Stack is empty so ");
		return null;
	}
	
	public static int getPeek()
	{
		if(peek!=-1)
		{
			System.out.println(arr[peek]);
			return peek;
		}
		else
			return -1;
	}
	
	public static void traverse()
	{
		if(peek==-1)
		{
			System.out.println("Stack is EMPTY");
		}
		else
		{
			while(peek>-1&&arr[peek]!=null)
			{
				System.out.println(arr[peek]);
				peek-=1;
			}
		}
	}
	
	public static void push(double data)
	{
		if(peek==-1)
		{
			arr[0]=data;
			System.out.println(data+" Pushed @ 0 since stack is EMPTY");
			peek=0;
		}
		else
		{
			if(peek<arr.length-1)
			{
				arr[peek+1]=data;
				peek+=1;
				System.out.println(data+" pushed @ "+peek);
			}
			else {
				System.out.println(data+" can't push since stack is FULL");
			}
		}
	}
}