package testCases;

public class ReverseNumber {

	public static void main(String[] args) {
		int i=12345;
		int reverse =0;
		while(i!=0)
		{
			int remainder=i%10;
			reverse=reverse*10+remainder;
			i=i/10;
			
		}
       System.out.println(reverse);
	}

}
