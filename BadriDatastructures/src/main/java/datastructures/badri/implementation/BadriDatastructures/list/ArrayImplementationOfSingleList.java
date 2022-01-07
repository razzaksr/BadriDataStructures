package datastructures.badri.implementation.BadriDatastructures.list;

/*
 * LinkedList: any direction
 * adding:first,last,position by adding
 * remove: first,last,any
 * read&update: first,last,any
 * traverse
 * search
 * sort
 *  
 */

public class ArrayImplementationOfSingleList 
{
	public static void main(String[] args) 
	{
		SinglyList.traverse();
		SinglyList.addEnd("Badri");
		SinglyList.addEnd("ZOHO");
		SinglyList.addBegin("IBM");
		SinglyList.addBegin("Infoview");
		SinglyList.addPOs("Birlasoft", 2);
		SinglyList.addPOs("TCS", 9);
		SinglyList.traverse();
	}
}

class SinglyList
{
	private static String[] ware=new String[10];
	public static void traverse()
	{
		System.out.println("Single Linked List");
		for(String h:ware)
		{
			System.out.print(h+" ");
		}
		System.out.println();
	}
	public static void addPOs(String data,int pos)
	{
		int index=ware.length-2;
		while(index>=pos)
		{
			//swap
			ware[index+1]=ware[index];
			index--;
		}
		ware[pos]=data;
		System.out.println(data+" has added @ "+pos);
	}
	public static void addBegin(String data)
	{
		String third="";
		if(ware[0]==null)
		{
			ware[0]=data;
			System.out.println("List is Empty so data added first immediatly");
		}
		else
		{
			int index=ware.length-2;
			while(index>=0)
			{
				//swap
				ware[index+1]=ware[index];
				index--;
			}
			ware[0]=data;
		}
		System.out.println(data+" has added @ first in linked list");
	}
	public static void addEnd(String data)
	{
		if(ware[0]==null)
		{
			ware[0]=data;
			System.out.println(data+" has added @ first in linked list");
		}
		else
		{
			for(int index=0;index<ware.length;index++)
			{
				if(ware[index]==null)
				{
					ware[index]=data;
					System.out.println(data+" has added @ end in linked list");
					return;
				}
			}
		}
	}
}