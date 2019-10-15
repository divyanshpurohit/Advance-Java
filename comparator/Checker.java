package exercise.collections.comparator;
import java.util.*;
public class Checker implements Comparator<Player> {
	public int compare(Player a, Player b) {
		if(a.getscore()<b.getscore())
			return -1;
		if(a.getscore()>b.getscore())
			return 1;
		if(a.getscore()==b.getscore())
		{
			 if(a.getname().compareTo(b.getname()) < 0){
	                return -1;
	            }
	            else if(a.getname().compareTo(b.getname()) > 0){
	                return 1;
	            }
			
		}
	return 0;	
	
	}

}
