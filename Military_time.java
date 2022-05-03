import java.util.Scanner;
public class Military_time {

	public static void main(String [] args)
	{
		String str="01:00 pm";
		String result=time(str);
		System.out.println("time = "+result);
	}
	
	static String time(String str)
	{
		if(str.charAt(str.length()-2)=='a')	
		{
			if(str.substring(0,2).equals("12"))
			return "00"+str.substring(2,5);
		}
		else 
		{
			if(!(str.substring(0,2).equals("12")))
			{
				return (Integer.parseInt(str.substring(0,2)))+12+str.substring(2,6);
			}
		}
			return str;
	}
}
