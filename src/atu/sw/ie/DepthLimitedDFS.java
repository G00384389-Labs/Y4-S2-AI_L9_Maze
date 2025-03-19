package atu.sw.ie;

import static java.lang.System.*;

public class DepthLimitedDFS<E> {
	
	public int search(Node<E> node, int limit){
		return search(node, limit, 0);
	}
	
	public int search(Node<E> node, int limit, int depth){
		var res = 0;
		if (depth > limit){
			out.println("Maximum Depth Reached. Failed to locate goal node.");
			res = Integer.MIN_VALUE;
		}
		
		if (node.isGoal()){
			out.println("Reached " + node.getData());
			res = Integer.MAX_VALUE;
		}else{
			if (!node.isVisited()){
				out.print(node.getData() + ",");
				node.setVisited(true);
				var children = node.children();
				for (int i = 0; i < children.length; i++) {
					res = search(children[i], limit, depth + 1); //Recursive call
					if (res == Integer.MIN_VALUE || res == Integer.MAX_VALUE) break;
				}
			}
		}
		return res;
	}
}