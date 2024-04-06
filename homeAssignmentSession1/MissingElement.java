package homeAssignmentSession1;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={1,4,3,2,8, 6, 7};
//sum1=1+4+3+2+8+6+7=31
//sum2=31+5=36
//missing number = sum2-sum1 (36-31)=5;

int sum1=0;

for (int i = 0; i < a.length; i++) {
	sum1=sum1+a[i];
}

System.out.println("Sum of elements" + sum1);
	int sum2=0;
	for (int i = 1; i <=8; i++) {
		
	sum2=sum2+i;
	}
	System.out.println("Sum of elements" + sum2);
	System.out.println("Missing Number is" + (sum2-sum1));
	
	
}
	}

