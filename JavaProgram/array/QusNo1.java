// Write a program to find the index of an array element.
import java.util.Scanner;
class QusNo1{
	int size;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array");
	size = sc.nextInt();
	int[] arr = int[size];
	System.out.println("Enter Element of Array");
	for(int i =0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		System.out.println("Index of "+ i +": "+arr[i]);
	}

}