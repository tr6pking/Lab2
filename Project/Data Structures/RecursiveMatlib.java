
public class RecursiveMatlib extends Mathlib{

	@Override
	public int gcd(int x, int y) {
		if (y==0) {
			return x;
		}
		if (x >= y && x!=0)
		{
			return gcd(x,y % y);
		}
    System.out.println("Recursive GCD not implemented");
	return 0;
	}

}
