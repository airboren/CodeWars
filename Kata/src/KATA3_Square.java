
public class KATA3_Square {

	static int i=1;
	
	public static boolean isSquare(long n){
		if (n<0)
			return false;
		else{
			for (long i=0;i<=n/2;i++){
				long test=i*i;
				
				if (test==n){
					System.out.println("i="+i);
					System.out.println("i*i="+(i*i));
					System.out.println("test="+test);
					System.out.println("n="+n);
					return true;
				}
			}
			return false;
		}
	}
	
	public static int isSquare2(int n){
		
		if (n<0)
			return n;
			else if (n==1){
				return 1;
			}
		else{
			int low=0;
			int high=1+(n/2);
			int mid=0;
			int square;
			while (low+1<high){
				
				mid=low+(high-low)/2;
				square= mid*mid;
				if(square == n)
					return mid;
				else if(square<mid){
					low=mid;
				}
				else{
					high=mid;
				}
				
			}
			
			return low;
		}
		
	}
			
}
