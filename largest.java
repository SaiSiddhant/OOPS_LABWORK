class Hello
	{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]); 
		int c=Integer.parseInt(args[2]);
		if (a>b && a>c) {
			System.out.println(Integer.parseInt(args[0])+"is the largest number.");
				}
		else if(b>a && b>c) {
			System.out.println(Integer.parseInt(args[1])+"is the largest number.");
				}
		else {
			System.out.println(Integer.parseInt(args[2])+"is the largest number.");
			}
			
	}
	}