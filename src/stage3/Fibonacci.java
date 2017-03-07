package stage3;

public class Fibonacci {
	private long fibo1=1;
	private long fibo2=1;
	private long fibonachi;
	
	public long getNumber(int position) {
		// PUT YOUR CODE HERE
		if (position<=0) return -1;
		if(position == 1) {
			return fibo1;
		}
		if(position == 2){
			return fibo2;
		
		}
		return getNumber(position-1)+getNumber(position-2);
		
		// PUT YOUR CODE HERE
	}
}
