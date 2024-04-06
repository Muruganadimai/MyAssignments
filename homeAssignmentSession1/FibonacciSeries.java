package homeAssignmentSession1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalseries =8;
		int a=0;
		int b=1;
		for (int i =0; i <=totalseries; i++) {
			System.out.print("," + a);
			int sum=a+b;
			a=b;
			b=sum;
			}
		}
}
