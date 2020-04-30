//QusNo7. Write a program sort array elements in ascending order using bubble sort.
import java.util.Scanner;
class QusNo7{
	public static void main(String[] arg){
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		size = sc.nextInt();
		System.out.println("Enter Array of elements");
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;					
				}
			}
		}
		for(int i =0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}		