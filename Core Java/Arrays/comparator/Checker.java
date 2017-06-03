package comparator;

import java.util.Comparator;

public class Checker {

	public Comparator<Player> desc=new Comparator<Player>(){

		@Override
		public int compare(Player p1, Player p2) {
			if(p2.score==p1.score)
				return p2.name.compareTo(p1.name);
			return p2.score-p1.score;
		}
		
	};
}
