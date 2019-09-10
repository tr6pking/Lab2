
public class Driver {
	public static void main(String[] args) 
	{
		RecursiveMatlib recursionlibrary = new RecursiveMatlib();
		IterativeMathlib iterationLibrary = new IterativeMathlib();
		System.out.println("---Recursion----");
		runTestCode(recursionlibrary);
		System.out.println("---Iteration----");
		runTestCode(iterationLibrary);
		
	}
	public static void runTestCode(Mathlib library)
	{
		System.out.println("GCD(4,2) = "+ library.gcd(4,2));
	}
}
