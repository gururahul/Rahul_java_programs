package Programming;

public class Count_Character {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String s="Rahul Guru";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total number of characters in a string>>>" +count);

	}

}
