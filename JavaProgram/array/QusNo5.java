//Write a program to copy an array by iteratiing the array.
import java.util.Scanner;
class QusNo5 
{
	public static void main(String[] arg)
	{
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		size  =sc.nextInt();
		System.out.println("Enter Element of array");
		int[] arr = new int[size];
		for(int i= 0;i<size;i++)
		{
			arr[i]= sc.nextInt();
		}
		//System.out.println("Array Element is : "+ arr[i]);
		int[] copyarray = new int[size];
		for(int i = 0;i<size;i++)
		{
			copyarray[i] = arr[i];
		}
		System.out.println("Copy Array Are: ");
		for(int i =0;i<size;i++)
		{
			System.out.print(copyarray[i]);
		}
	}
}