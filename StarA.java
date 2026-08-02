class StarA {
public static void main(String args[]) {

int rows = 9;
int column = 10;

for( int i = 1; i <= rows; i++) {
	if(i % 2 == 0){
		System.out.println();
	}
	
	if ( i == 1) {
		for( int j =1; j <= column; j++) {
				
			if( j == 5 || j == 6) {
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}	
		
		
	}
	
	if( i == 3) {
		for ( int k = 1; k <= column; k++){
			if( k == 4 || k == 7){
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		
	}
	
	if (i == 5){
		for( int l = 1; l <= column; l++) {
			if (l <= 2 || l >= 9){
				System.out.print(" ");
			}
			else{
				System.out.print("*");
			}
		}
	}
	if( i == 7) {
		for ( int s = 1; s <= column; s++){
			if( s == 2 || s == 9){
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		
	}
	if( i == 9) {
		for ( int p = 1; p <= column; p++){
			if( p == 1 || p == 10){
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		
	}
	

}

}

}