package atu.sw.ie;

public class Maze{
	private static Maze maze = new Maze();
	private Node<String> source;
	
	Maze() {
		init();
	}
	
	public static Maze getInstance(){
		return maze;
	}
	
	public Node<String> getSource(){
		return source;
	}
	
	/*
	 * This static graph is intended to get you through this lab quickly and
	 * is not something that you will encounter in the wild. Normally, a semantic
	 * network or graph will be created as follows:
	 * 
	 *  1) Dynamically from some resource like a file or a URL. The graph is
	 *     constructed during the parsing of the entities and their relationships.
	 *  
	 *  2) Implicity by applying some transformation to an entity over and over. This
	 *     is logically the same as traversing a graph. For example, if we have a 
	 *     32 bit key and we keep randomly changing one bit at a time in an attempt
	 *     to unlock something, then each time we change a bit we will have "moved" 
	 *     one step further from the starting point.
	 *  
	 *  3) The graph already exists. For example, the global Internet and World Wide
	 *     Web are both graphs. Similarily, a social network or a file system is a
	 *     graph structure and can be traversed using standard generalised algorithms.
	 */
	private void init() {
		source = new Node<>("S");
		var goal = new Node<String>("T", true);
		var node1 = new Node<String>("1");
		var node2 = new Node<String>("2");
		var node3 = new Node<String>("3");
		var node4 = new Node<String>("4");
		var node5 = new Node<String>("5");
		var node6 = new Node<String>("6");
		var node7 = new Node<String>("7");
		var node8 = new Node<String>("8");
		var node9 = new Node<String>("9");
		var node10 = new Node<String>("10");
		var node11 = new Node<String>("11");
		var node12 = new Node<String>("12");
		var node13 = new Node<String>("13");
		var node14 = new Node<String>("14");
		
		source.addChild(node1);
		source.addChild(node6);
		source.addChild(node8);
		
		node1.addChild(source);
		node1.addChild(node2);
		node1.addChild(node3);
		
		node2.addChild(node1);
		node2.addChild(node10);
		node2.addChild(node11);
		
		node11.addChild(node2);
		
		node10.addChild(node2);
		
		node3.addChild(node1);
		node3.addChild(node12);
		node3.addChild(node4);
		
		node12.addChild(node3);
		
		node4.addChild(node3);
		node4.addChild(node13);
		node4.addChild(node5);
		
		node13.addChild(node4);
		
		node5.addChild(node4);
		node5.addChild(node6);
		node5.addChild(node9);
		
		node6.addChild(node5);
		node6.addChild(source);
		node6.addChild(node7);
		
		node8.addChild(source);
		node8.addChild(node7);
		node8.addChild(node14);
		
		node14.addChild(node8);
		
		node7.addChild(node6);
		node7.addChild(node8);
		node7.addChild(node9);
		
		node9.addChild(node5);
		node9.addChild(node7);
		node9.addChild(goal);
		
		goal.addChild(node9);
	}
}