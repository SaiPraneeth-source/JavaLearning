class NumberPattern{


public static void main(String args[]){

int n=4;
int i;
int j;


for (i=1;i<=4;i++){

for (j=1;j<=i;j++){

System.out.print(j);
}



for ( j = 1; j <= 2 * (n - i); j++){

System.out.print(" ");
}


for(j=i;j>=1;j--){
System.out.print(j);
}
System.out.println();
}
}

}


