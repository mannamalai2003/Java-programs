import java.util.Scanner;
public class RemDuplicates{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int arr[] = new int[10];
		System.out.println("Enter the elements one by one:");
		for(int i=0;i<num;i++){
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for(int i=0;i<num;i++){
			for(int j=0;j<num-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("the elements after removing duplicates: ");
		for(int i=0;i<num;i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		int left = 0;int right = left+1;
		while(right < num){
			if(arr[left]==arr[right]){
				right++;
			}
			else if(arr[left] != arr[right]){
				left++;
				arr[left]=arr[right];
				right++;
			}
		}
		System.out.println("the elements after removing duplicates: ");
		for(int i=0;i<left+1;i++){
			System.out.print(arr[i]+ " ");
		}
	}
}	 
		
		
		