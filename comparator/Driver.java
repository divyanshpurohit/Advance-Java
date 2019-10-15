package exercise.collections.comparator;
import java.util.*;

public class Driver {

	public static void main(String args[] ) {
		Scanner in=new Scanner(System.in);
		System.out.print("How many numbers are you going to enter:");

		System.out.println();
		int n=in.nextInt();
		Player[] player =new Player[n];
		Checker checker=new Checker();
		int i=0;
		for(;i<n;i++) {
			System.out.println("enter player name and score");
			player[i]=new Player(in.next(),in.nextInt()); 
		}
		in.close();
		Arrays.sort(player,checker);
		for(int j=0;j<player.length;j++) {
			System.out.printf("%s %s \n",player[j].name,player[j].score);
		}
				
	}
	
}
