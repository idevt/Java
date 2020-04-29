//QusNo6. Write a program to find and display reverse of an array without using third variable.
import java.util.Scanner;
class QusNo6{
	public static void main(String[] arg){
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		size = sc.nextInt();
		System.out.println("Enter Array of Elements");
		int[] arr = new int[size];
		for(int i = 0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = size-1; i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
	
}