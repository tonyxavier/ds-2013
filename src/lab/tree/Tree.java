package lab.tree;

import lab.general.Processable;


public class Tree {
	
	public TreeNode root;
	
public Tree()
{
	root=null;
}
	
public void insert(Object info)
{

Comparable compdata;

compdata=(Comparable)info;

TreeNode newnode=new TreeNode();
newnode.data=info;



	if(root==null)
	{
		root=newnode;
		root.left=null;
		root.right=null;
		return;
		
	}
	
	TreeNode tmpnode;
	tmpnode=root;
	while(tmpnode!=null)
	{
		if((compdata.compareTo(tmpnode.data))<0 )
		{
			if(tmpnode.left==null)
			{
				tmpnode.left=newnode;
				return;
			}
			else
			{
				tmpnode=tmpnode.left;
			}
			
		}
		else
		{
			if(tmpnode.right==null)
			{
				tmpnode.right=newnode;
				return;
			}
			else
			{
				tmpnode=tmpnode.right;
			}
		}
	}
}




public void inorder(TreeNode rootnode)
{
  if(rootnode !=null)
  {
	  Processable info;
	  
	  inorder(rootnode.left);
      info=(Processable)rootnode.data;
      info.process();
      inorder(rootnode.right);
 }

  //Terminating condition -there's no inorder traversal for a null tree
  
}

public TreeNode buildTree(int[] preorder,int[] inorder )
{
	  int length_p=preorder.length;
	  int length_i=inorder.length;
	  
	  if(length_p<1 ||length_i<1 )
	     {
		  //Wrong input
		  return null;		 
	     }
	  
	  if(length_p==1)
	  { //Stop condition for the recursion;
		  TreeNode node=new TreeNode();
		  node.left=null;
		  node.right=null;
		  node.data=preorder[0];
		  return node;
	  }
	  
	  int preorder_root_val=preorder[0];
	  int inorder_root_pos=0;
	  
	  for(int i=0;i<length_i;i++)
	  {// Get the position of the root in inorder array
		  if(inorder[i]==preorder_root_val)
		  {
			  inorder_root_pos=i;
			  break;
		  }
	  }
	  
	  //Create arrays which will hold the traversals of 
	  //left and right subtrees
	  int[] newinorder_left=new int[inorder_root_pos];
      int[] newpreorder_left=new int[inorder_root_pos];
	  int[] newinorder_right=new int[length_i-inorder_root_pos-1];
      int[] newpreorder_right=new int[length_i-inorder_root_pos-1];
		   
      //Fill the arrays that hold the subtree traversals
	  System.arraycopy(inorder, 0, newinorder_left, 0, inorder_root_pos);
	  System.arraycopy(preorder, 1, newpreorder_left, 0, inorder_root_pos);
	  System.arraycopy(inorder, inorder_root_pos+1, newinorder_right, 0, length_i-inorder_root_pos-1);
	  System.arraycopy(preorder, inorder_root_pos+1, newpreorder_right, 0, length_i-inorder_root_pos-1);
	  
	  //Create the root Node
	  TreeNode treeroot=new TreeNode();
	  treeroot.data=preorder[0];
	  
	  //Recursive call to buildTree with subtree traversals
	  TreeNode leftsubtree=buildTree(newpreorder_left,newinorder_left);
	  TreeNode rightsubtree=buildTree(newpreorder_right,newinorder_right);
	  
	  //Join the subtrees with the root
	  treeroot.left=leftsubtree;
	  treeroot.right=rightsubtree;
	  
	  //Return the created tree;
	  return treeroot;	  
	  
}

public TreeNode buildNLTree(char[] preorder)
{
//There exists a special kind of tree which has the 
//node value 'N' if it is an internal node and 'L'
// if it is a leaf node. An internal node can have either 
// 0 or 2 children, not 1. Build the tree from preorder traversal.
	
	 int length_p=preorder.length;
	 if(length_p<1 )
     {
	  //Wrong input
	  return null;		 
     }
  
	 if(length_p==1)
	  { //Stop condition for the recursion;
		  TreeNode node=new TreeNode();
		  node.left=null;
		  node.right=null;
		  node.data=preorder[0];
		  return node;
	  }
	 
	 int n_count=0,l_count=0;
	 int pos_right_sub_tree=0;
	 
	 for(int i=0;i<length_p;i++)
	 {
		 if(preorder[i]=='N')
			 n_count++;
		 else
			 l_count++;
		 
		if(n_count==l_count)
		{
		 pos_right_sub_tree=i+1;
		 break;
		}
	 }
	 
	 char[] newpreorder_left=new char[pos_right_sub_tree-1];
     char[] newpreorder_right=new char[length_p-pos_right_sub_tree];
	 
	 System.arraycopy(preorder, 1, newpreorder_left, 0, pos_right_sub_tree-1);
	 System.arraycopy(preorder, pos_right_sub_tree, newpreorder_right, 0, length_p-pos_right_sub_tree);
	 
	 TreeNode treeroot=new TreeNode();
	 treeroot.data=preorder[0];
	 
	 TreeNode leftsubtree=buildNLTree(newpreorder_left);
	 TreeNode rightsubtree=buildNLTree(newpreorder_right);
	 
	  treeroot.left=leftsubtree;
	  treeroot.right=rightsubtree;
	
	  return treeroot;	  
}


public boolean compareTree(TreeNode root1,TreeNode root2)
{
	if(root1==null && root2==null )
	{
		return true;
	}
	
	Comparable data1,data2;
	data1=(Comparable)root1.data;
	data2=(Comparable)root2.data;
	
	if(data1.compareTo(data2)==0 && compareTree(root1.left,root2.left) 
	      && compareTree(root1.right,root2.right))
	{
		return true;
	}
	else
		return false;
		
	
}

public TreeNode treeToDoublyLinkedList(TreeNode root)
{
// Converts a tree to doubly linked list, in place	

	
	if(root==null)
	{//Stop condition for recursion
	 // If the tree is null, resulting DLL is also null
		return null;
	}
	
	TreeNode leftsubtree=treeToDoublyLinkedList(root.left);
	TreeNode rightsubtree=treeToDoublyLinkedList(root.right);
	
	if(leftsubtree!=null)
	{
	  while(leftsubtree.right!=null)
	   {
		leftsubtree=leftsubtree.right;
	    }
	    leftsubtree.right=root;
	}
    root.left=leftsubtree;
	
    
	if(rightsubtree!=null)
	{
	  while(rightsubtree.left!=null)
	   {
		  rightsubtree=rightsubtree.left;
	    }
	    rightsubtree.left=root;
	}
	root.right=rightsubtree;
	
	return root;	
	
}


public int findHeight(TreeNode root)
{
	int leftheight,rightheight;
	
	if(root==null)//Invalid tree
		return -1;
	
	if(root.left==null && root.right==null)
		return 0;
	
	if(root.left==null)
		return 1+findHeight(root.right);
		
	if(root.right==null)
		return 1+findHeight(root.left);
	
	leftheight=findHeight(root.left);
	rightheight=findHeight(root.right);
	return 1+ ((leftheight>rightheight)?leftheight:rightheight);
	
	
}
	
	


}
