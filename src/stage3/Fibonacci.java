package stage3;

public class Fibonacci {
	private long fibo1=0;
	private long fibo2=1;
	private long fibonachi;
	
	public long getNumber(int position) {
		// PUT YOUR CODE HERE
		if(position == 1) {
			return fibo1;
		}
		if(position == 2){
			return fibo2;
		}
		if(position > 2){
			
			for (int i = 1;i < position; i++){
				
				fibonachi = fibo1 + fibo2;
				fibo1 = fibo2;
				fibo2 = fibonachi;
				System.out.println(fibonachi);
			}
			return fibonachi;
		}
		

	return -1;
		// PUT YOUR CODE HERE
	}
}
