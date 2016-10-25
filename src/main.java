import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		tidda d1 = new tidda();
		Scanner s1 = new Scanner(System.in);
		int a = 1;
		d1.tiddaa();
		while(a==1)
		{
			String ab;
			String y = "yes" , n = "no";
			System.out.printf("還要再輸入yes or no\n");
			ab =s1.next();
			if(ab.equals(y))
			{
				d1.tiddaa();
			}
			else
			{
				a = 0;
			}
			
		}

	}

}

