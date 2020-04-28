//QusNo3. Write a program remove a specific element from an array.
import java.util.Scanner;
class QusNo3{
	public static void main(String[] arg){
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		System.out.println("Enter Element of array");
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter Which element are remove");
		int re = sc.nextInt();
		for(int i=0;i<size;i++){
			if(arr[i]==re){
				for(int j =i;j<size-1;j++){
					arr[j]=arr[j+1];
					count++;
				}
				break;
			}
			
		}
		if(count==0){
			System.out.println("Element Not found");
		}
		else{
			System.out.println("Element Deleted Successful");
		for(int i=0;i<size-1;i++){
			System.out.print(arr[i]);
		}
		}
	}
}