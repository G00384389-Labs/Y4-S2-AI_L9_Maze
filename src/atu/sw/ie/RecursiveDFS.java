package atu.sw.ie;

import static java.lang.System.*;

public class RecursiveDFS<E> { //Depth-First Search with Recursion (Method Stack)
	
	public void search(Node<E> node){
		if (node.isGoal()){
			out.println("Reached " + node.getData());
		}else{
			if (!node.isVisited()){
				out.print(node.getData() + ",");
				node.setVisited(true);
				var children = node.children();
				for (int i = 0; i < children.length; i++) {
					search(children[i]); //Recursive call
				}
			}
		}
	}
}