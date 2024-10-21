package Array;

public class Array2 {
	 public static void main(String[] args) {
  	   int num[]=new int[10];
  		num[0]=11;
  		num[1]=22;
  		num[2]=33;
  		num[3]=44;
  		num[4]=55;
  		num[5]=66;
  		num[6]=77;
  		num[7]=88;
  		num[8]=99;
  		num[9]=01;
  		
  		System.out.println("Array Elements");
  		int largest = num[0];
  		
  		for(int  i=0;i<num.length;i++)
  		{
  			System.out.println(num[i]);
  			
  			 if (num[i] > largest) {
  	                largest = num[i];
  	            }
  		    			
  			
  		}
  		System.out.println("Largest No is " + largest);

	 }}

