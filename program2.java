class program2 
{
    public static void main(String args[])
  {
	
	int a=10, b=30, c=50, d=20;
	

	int greatest = (a > b && a > c && a > d) ? a : (b > c && b > d) ? b : (c > d) ? c : d;
	
	System.out.println("Greatest= "+greatest);	

	
  }
}