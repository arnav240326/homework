import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");	
		
		int n=sc.nextInt();	
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j+i<=n){
				System.out.print("  ");
				}else{
				System.out.print(" *");
				}
				
			}
			for(int j=1;j<i;j++){
				if(j<i){
				System.out.print(" *");
				}
			}
				System.out.println();
				
				
		}
	}
}