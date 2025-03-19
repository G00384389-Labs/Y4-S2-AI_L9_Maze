package atu.sw.ie;

import static java.lang.System.*;

public class IterativeDeepening<E> {
	public void search(){
		var limit = 0;
		var res = 0;
		while(res < Integer.MAX_VALUE) {
			out.print("Searching to depth " + limit + "...");
			res = new DepthLimitedDFS<String>()
					.search(new Maze().getSource(), limit);
			limit++;
		}
		out.println("Reached goal at depth " + limit);
	}
}