import java.util.Scanner;
public class ProcessAName5026201150{

	public static void main(String[] args){
		Scanner inputName = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = inputName.nextLine();
		int idx = name.indexOf(' ');
		String subName = name.substring(idx+1 , name.length());
		System.out.println(idx+
		"\nYour name is: " + subName + ", " + name.charAt(0));
		}
}
		