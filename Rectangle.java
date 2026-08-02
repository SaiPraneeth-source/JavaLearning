class Rectangle {
public static void main(String args[]) {

int i;
int j;


for( i = 1; i <= 6; i++ ) {
	for( j = 1 ; j <= 20 ; j++  ) {
		if( i == 1 || i == 6 || j == 1 || j == 20 ) {
			System.out.print("* ");
		}	
		else {
			System.out.print("  ");
		}		
		}
		System.out.println(" ");

}

}

}