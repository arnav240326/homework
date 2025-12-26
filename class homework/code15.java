class Demo{
	public static void main(String[]args){
		int n=3;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j){
			System.out.print("*");
			}else{
			System.out.print(" ");
			}
		}	
				
			for(int j=n;j>=0;j--){
				if(i==j){
			System.out.print("*");
			}else{
			System.out.print(" ");
			}
		}		
		
			System.out.println();
	}
 		for(int i=n;i>=0;i--){
			for(int j=0;j<=n;j++){
				if(i==j){
			System.out.print("*");
			}else{
			System.out.print(" ");
			}
		}
			for(int j=n;j>=0;j--){
				if(i==j){
			System.out.print("*");
			}else{
			System.out.print(" ");
			}
				
		}
			System.out.println();
	}
	}
}