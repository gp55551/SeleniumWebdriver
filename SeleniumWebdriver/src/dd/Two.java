package dd;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a  ="Racecar";
		String rev = "";
		
		for(int i = a.length()-1 ; i >=0 ; i--)
		{
			rev =  rev + a.charAt(i);
		}
		
		if(rev.equals(a))
		{
			System.out.println(a+" is  a pallindrome");
		}
		
		else
		{
			System.out.println(a+" is  not a pallindrome");
		}
	}

}
