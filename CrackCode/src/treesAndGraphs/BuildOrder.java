package treesAndGraphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BuildOrder {
	//Assuming that the dependencies are correctly put in char array.

	public String getBuildOrder(char[] projects, char[] dependencies) {
		StringBuilder order = new StringBuilder();
		//A set of nodes which contains all the projectNodes.
		Map<Character, TreeNode> projectRepo = new HashMap<Character, TreeNode>();
		for(char thisChar : projects) {
			TreeNode node = new TreeNode(thisChar);
			projectRepo.put(thisChar, node);
		}
		TreeNode root = null;
		for(int i=0; i<dependencies.length-1; i++) {
			char parent = dependencies[i];
			char child = dependencies[i+1];
			TreeNode parentNode;
			TreeNode childNode;
			//get Parent Node
			if(projectRepo.containsKey(parent)) {
				parentNode = projectRepo.get(parent);
			} else {
				parentNode = new TreeNode(parent);
				projectRepo.put(parent, parentNode);
			}
			//get child Node
			if(projectRepo.containsKey(child)) {
				childNode = projectRepo.get(child);
			} else {
				childNode = new TreeNode(child);
				projectRepo.put(child, childNode);
			}

			//set childnode, the parent on parentNOde.
			List<TreeNode> children = parentNode.getChildren();
			if(children == null || children.size() == 0) {
				children = new ArrayList<TreeNode>();
			}
			children.add(childNode);
			parentNode.setChildren(children);
			childNode.setParent(parentNode);
			i++;
		}

		//start from root and do level-order traversal, keep appending to the order.
		root = getAndRemoveRootNode(projectRepo);
		List<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode node = queue.remove(0);
			order.append(node.getData()+" ");
			List<TreeNode> children = node.getChildren();
			if(children != null && !children.isEmpty()) {
				for(TreeNode child : children) {
					projectRepo.remove(child.getData());
					queue.add(child);
				}
			}
			
		}
		for(Map.Entry<Character, TreeNode> thisEntry : projectRepo.entrySet()) {
			order.append(thisEntry.getKey()+" ");
		}
		return order.toString();
	}

	private TreeNode getAndRemoveRootNode(Map<Character, TreeNode> repo) {
		Character key = null;
		TreeNode root = null;
		for(Map.Entry<Character, TreeNode> thisEntry : repo.entrySet()) {
			if(thisEntry.getValue().getParent() == null) {
				root = thisEntry.getValue();
				key = thisEntry.getKey();
			}
		}
		repo.remove(key);
		return root;
	}
}
