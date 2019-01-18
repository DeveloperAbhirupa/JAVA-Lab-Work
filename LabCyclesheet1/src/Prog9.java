import java.util.*;
import java.lang.*;
public class Prog9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] data = {{"a","b","s","x"},{"d","f","s","d"}};
		System.out.println("Enter statement: ");
		String ip = scan.nextLine();
		String parts[] = ip.split("%");
		String parts2[] = ip.split(",");
		int i,j,k;
		char format[] = new char[10];
		char var[] = new char[10];
		for(i=0;i<parts.length;i++)
		{
			format[i]=parts[i].charAt(0); 
		}
		for(i=0;i<parts2.length;i++)
		{
			var[i]=parts2[i].charAt(0);
		}
		int check=0;
		for(i=1;i<(parts.length-1);i++)
		{
			for(j=0;j<data[0].length;j++)
			{
				if(Character.toString(var[i])==data[0][j])
				{
					System.out.println("variable was found here.");
					if(Character.toString(format[i])==data[1][j])
					{
						System.out.println("Format was found here");
						check=check+1;
					}
				}
			}
		}
		if(check>var.length)
		{
			System.out.println("Syntax is wrong.");
		}
		else
		{
			System.out.println("Syntax is correct.");
		}
		

	}

}