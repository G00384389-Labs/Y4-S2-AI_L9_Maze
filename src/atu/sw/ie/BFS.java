package atu.sw.ie;

import static java.lang.System.out;

import java.util.ArrayDeque;

public class BFS<E> { //Breadth-First Search
	
	public void search(Node<E> node){
		var fifo = new ArrayDeque<Node<E>>();
		fifo.offer(node);
		
		while(!fifo.isEmpty()){
			node = fifo.poll(); //Remove from the front
			out.print(node.getData() + ",");
			node.setVisited(true);

			if (node.isGoal()){
				out.println("Reached " + node.getData());
				break; //We're done. Bail out of loop.
			}else{
				var children = node.children();
				for (int i = children.length - 1; i >= 0; i--) {
					if (!children[i].isVisited()){
						fifo.offer(children[i]); //Add to the end
					}
				}
			}
		}
	}
}
