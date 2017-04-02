package recursionAndDynamicProgramming;

public class TripleStep {
	public static int numWays(int n) {
		if(n <= 1) {
			return n;
		} else if( n == 2) {
			return 2;
		} else if(n == 3) {
			return 4;
		} else {
			return numWays(n-1) + numWays(n-2) + numWays(n-3);
		}
	}
	
	public static void main(String args[]) {
		int n = 4;
		for(int i=10000; i<=10000; i = i+10) {
			System.out.println("For i="+i);
			long before=0, after=0;
//			System.out.println("Output by Recursive solution:");
//			before = System.currentTimeMillis();
//			System.out.println(numWays(i));
//			after = System.currentTimeMillis();
//			System.out.println("It took "+(after-before)+" milliseconds.");
			int[] memo = new int[i+1];
			memo[0] = 0;
			memo[1] = 1;
			memo[2] = 2;
			memo[3] = 4;
			System.out.println("Output by memoization solution:");
			before = System.currentTimeMillis();
			System.out.println(numWays1(i, memo));
			after = System.currentTimeMillis();
			System.out.println("It took "+(after-before)+" milliseconds. Before:"+before+", after:"+after);
			memo = new int[i+1];
			System.out.println("Output by tablization solution:");
			before = System.currentTimeMillis();
			System.out.println(numWays2(i, memo));
			after = System.currentTimeMillis();
			System.out.println("It took "+(after-before)+" milliseconds. Before:"+before+", after:"+after);
		}
		
	}
	
	public static int numWays1(int n, int[] memo) {
		if(n <= 1) {
			return n;
		} else if( n == 2) {
			return 2;
		} else if(n == 3) {
			return 4;
		} else {
			if(memo[n] == 0) {
				memo[n] = numWays1(n-1, memo) + numWays1(n-2, memo) + numWays1(n-3, memo);
			}
			return memo[n];
		}
	}
	
	public static int numWays2(int n, int[] arr) {
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for(int i=4; i<=n; i++) {
			arr[i] = arr[i-1] + arr[i-2] + arr[i-3]; 
		}
			return arr[n];
	}
}
