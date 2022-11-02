import java.util.Scanner;
public class StringsAndMethods {
	public static void capitalize (String s1)	{
		String firstLetStr = s1.substring(0,1);
		String remLetStr = s1.substring (1);
		firstLetStr = firstLetStr.toUpperCase();
		remLetStr = remLetStr.toLowerCase();
		System.out.println(firstLetStr + remLetStr);
	}
	public static void wheresWaldo (String s1) {
		String Waldo = "Waldo";
		int answer = s1.indexOf(Waldo);
		System.out.println(answer);
	}
	public static void firstThingsFirst (String s1,String s2)	{
		if (s1.compareTo(s2)<0) {
			System.out.println(s1 + " " + s2);
		}
		else if (s1.compareTo(s2)>0) {
			System.out.println(s2 + " " +s1);
		}else {System.out.println("Those are the same");
		}
	}
	
	public static void reverse (String str) {
		  StringBuilder sb=new StringBuilder(str);  
		    sb.reverse();  
		    System.out.println(sb);  
	}
	public static void soLong (String s1, String s2) {
		if (s1.length() < s2.length()) {
			System.out.println(s2 + " is longer");
		}else if (s1.length() > s2.length()) {
			System.out.println(s1 + " is longer");
		}else {System.out.println(s1 + " " + s2);
		}
	}
	public static void afterMath (String s1) {
		String math = "math";
		int answer = s1.indexOf(math);
		System.out.println(s1.substring(answer));
	}
	public static void letterize (String s1) {
		for(int i=0; i <= s1.length() -1; i++) {
			System.out.println(s1.charAt(i));
		}
	}
	public static void main(String[] args) {
		String str1;
		String str2;
		Scanner soloScanner = new Scanner (System.in);		//Han Solo scanner
		System.out.print("Enter a jumbled word - upper and lowercase:");
		str1 = soloScanner.nextLine();
		capitalize(str1);
		System.out.print("Enter a String with the word Waldo included:");
		str1 = soloScanner.nextLine();
		wheresWaldo(str1);
		System.out.print("Enter first String to be alphabetized:");
		str1 = soloScanner.nextLine();
		System.out.print("Enter second String to be alphabetized");
		str2 = soloScanner.nextLine();
		firstThingsFirst(str1,str2);
		System.out.print("Enter a String to be reversed:");
		str1 = soloScanner.nextLine();
		reverse(str1);
		System.out.print("Enter first String:");
		str1 = soloScanner.nextLine();
		System.out.print("Enter second String:");
		str2 = soloScanner.nextLine();
		soLong(str1,str2);
		System.out.print("Enter a phrase containing/not containing the word math:");
		str1 = soloScanner.nextLine();
		afterMath(str1);
		System.out.print("Enter a word to be printed one letter at a time:");
		str1 = soloScanner.nextLine();
		letterize(str1);
		
		
		System.out.println("Bye!");
		soloScanner.close();
		
		
	}

}
