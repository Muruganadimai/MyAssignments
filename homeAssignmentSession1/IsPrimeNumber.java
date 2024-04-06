package homeAssignmentSession1;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		int m=0,flag=0;
	    int num = 3;  
	      m=num/2;
	    for (int i = 0; i < m; i++) {
	      
if (num%2==0) {
	System.out.println(num + " is not a prime number");
	flag=1;
	break;
}

if (flag==0 && !(num==0||num==1)) {
	System.out.println(num + " is a prime number");
	break;
}
	           
	    }
	}
}

		
	

