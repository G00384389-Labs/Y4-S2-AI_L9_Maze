package atu.sw.ie;

public class Runner {
	public static void main(String[] args) {
		new RecursiveDFS<String>().search(Maze.getInstance().getSource());
//		new StackDFS<String>().search(Maze.getInstance().getSource());
//		new BFS<String>().search(Maze.getInstance().getSource());
//		new DepthLimitedDFS<String>().search(Maze.getInstance().getSource(), 9);
//		new IterativeDeepening<>().search();
	}
}