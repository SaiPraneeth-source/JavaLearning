class StarP {
 public static void main(String args[]) {
 
 int row = 9;
 int column = 5; 
 
 
for (int i = 1; i <= row; i++){
	
	if(i % 2 == 0){
		System.out.println();
	}
	
	if ( i == 1 || i == 5) {
		for (int j = 0; j < column; j++) {
	
			System.out.print("*");
		
		}
	}
	
		
	if( i == 3) {
		
		for (int k = 1; k <= column+1; k++) {
			if( k == 1 || k == column+1) {
			System.out.print("*");
		
			}
			else{
				System.out.print(" ");
			}
		
		}	
	}
	
	if ( i == 7 || i == 9) {
		System.out.print("*");
		
	}

	
		
		
	
}


} 
}
 