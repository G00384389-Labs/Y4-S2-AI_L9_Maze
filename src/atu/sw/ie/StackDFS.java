package atu.sw.ie;

import static java.lang.System.out;
import java.util.ArrayDeque;

public class StackDFS<E> { //Depth-First Search with a Stack
	
	public void search(Node<E> node){
		var lifo = new ArrayDeque<Node<E>>();
		lifo.push(node);
		
		while(!lifo.isEmpty()){
			node = lifo.pop(); //Remove from the front
			out.print(node.getData() + ",");
			node.setVisited(true);

			if (node.isGoal()){
				out.println("Reached " + node.getData());
				break; //We're done. Bail out of loop.
			}else{
				var children = node.children();
				for (int i = children.length - 1; i >= 0; i--) {
					if (!children[i].isVisited()){
						lifo.push(children[i]); //Add to the front
					}
				}
			}
		}
	}
}