//QusNo4. Write a program to find and display reverse of an array using third variable.
import java.util.Scanner;
class QusNo4{
	public static void main(String[] arg){
		int size,temp,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of element");
		size = sc.nextInt();
		System.out.println("Enter element of array");
		int[] arr = new int[size];
		for( i=0;i<size;i++){
			arr[i]= sc.nextInt();
		}
		for( i=0;i<size;i++){
			for(int j =size-1;j>i;j--)
			{
				temp = arr[j];
				arr[j] =arr[j-1];
				arr[j-1]=temp;				
			}				
		}
		for( i = 0;i<size;i++)
		{
			System.out.print(arr[i]);
		}
		
	}
}