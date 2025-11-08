// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int n=Integer.parseInt(args[0]);
		double pi=0.0;
		for(int i=0;i<n;i++)
		{
			pi+=Math.pow(-1, i)/(2*i+1);
		}
		pi=pi*4;
		System.out.println("pi according to Java: "+pi);
		System.out.println("pi, approximated:");
		System.out.println(pi);
    }
		
	
	}
















	

