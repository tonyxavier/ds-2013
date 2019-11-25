package lab.tree;

import lab.general.Node;

public class TreeNode extends Node{

	 TreeNode left;
	 TreeNode right;


TreeNode()
{   super.data=null;
	left=null;
	right=null;
	
}

public TreeNode getLeft()
{
	return left;
}

public TreeNode getRight()
{
	return right;
}

public Object getData()
{
	return data;
}

public void setLeft(TreeNode node)
{
	left=node;
}

public void setRight(TreeNode node)
{
	right=node;
}

public void setData(Object info)
{
	data=info;
}

TreeNode(Object o)
{
	super.data=o;
}

}