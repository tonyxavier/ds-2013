package lab;

import lab.linkedlist.LinkedList;


import lab.general.*;
import lab.stack.Stack;
import lab.tree.*;
import lab.queue.*;
import lab.hashing.*;
import lab.heaps.MinHeap;
import lab.graph.*;




public class Runner {public static void main(String params[])
{
	
	System.out.println("Running LL...");
	
	LinkedList list=new LinkedList();
	
	list.insertEnd(new CustomerInfo("Amazon",1));
	list.insertBegining(new CustomerInfo("Tony",2));
	list.insertBegining(new CustomerInfo("Tina",3));
	list.insertBegining(new CustomerInfo("Rohan",4));
	
	
	list.startIterator();
	CustomerInfo strinfo=(CustomerInfo)list.getNextNode();
	while(strinfo!=null)
	{
		strinfo.show();
		strinfo=(CustomerInfo)list.getNextNode();
	}
	
//	strinfo=(CustomerInfo)list.search(new CustomerInfoKey(5));
//	System.out.println("List Search Result");
//	strinfo.show();
	
	System.out.println("Nth from last");
	strinfo=(CustomerInfo)list.getNthFromLast(4);
	strinfo.show();
	
	System.out.println("Reversed List...");
	list.reverseList();
	list.startIterator();
	strinfo=(CustomerInfo)list.getNextNode();
	while(strinfo!=null)
	{
		strinfo.show();
		strinfo=(CustomerInfo)list.getNextNode();
	}
	

	
	
	System.out.println("Running Stack...");
	Stack stack=new Stack();
    stack.push(new CustomerInfo("Tony",10)) ;
	stack.push(new CustomerInfo("Rohan",11));
	strinfo=(CustomerInfo)stack.pop();
	strinfo.show();
	stack.push(new CustomerInfo("Tina",15)) ;
	strinfo=(CustomerInfo)stack.pop();
	strinfo.show();
	
	
	System.out.println("Running Q...");
	Queue qu=new Queue();
	
	qu.enqueue(new CustomerInfo("Google",7));
	qu.enqueue(new CustomerInfo("Microsoft",14));
	strinfo=(CustomerInfo)qu.dequeue();
	strinfo.show();
	qu.enqueue(new CustomerInfo("Amazon",8));
	qu.enqueue(new CustomerInfo("Google",9));
	qu.enqueue(new CustomerInfo("Yahoo",10));
//	strinfo=(CustomerInfo)qu.dequeue();
//	strinfo.show();
//	strinfo=(CustomerInfo)qu.dequeue();
//	strinfo.show();
	
	while(true)
	{
		strinfo=(CustomerInfo)qu.dequeue();
		if(strinfo==null)
			break;
		else
			strinfo.show();
	}
	

	System.out.println("Running tree...");
	
   Tree tree1=new Tree();
	
	tree1.insert(new CustomerInfo("Bush",15));
	tree1.insert(new CustomerInfo("Hitler",9));
	tree1.insert(new CustomerInfo("Saddham",19));
	tree1.insert(new CustomerInfo("Gaddafi",7));
	tree1.insert(new CustomerInfo("Mubarak",21));
	tree1.insert(new CustomerInfo("Mussolini",11));
	
	System.out.println("Tree1 created:");
	
	tree1.inorder(tree1.root);
	
	 Tree tree2=new Tree();
	 
	    tree2.insert(new CustomerInfo("Manmohan",15));
		tree2.insert(new CustomerInfo("Kevin",9));
		tree2.insert(new CustomerInfo("Berlusconi",7));
		tree2.insert(new CustomerInfo("Hu",21));
		tree2.insert(new CustomerInfo("Tony",19));
		tree2.insert(new CustomerInfo("Achummama",11));
		tree2.insert(new CustomerInfo("Achumma",10));
		tree2.insert(new CustomerInfo("Achumma",30));
		tree2.insert(new CustomerInfo("Achumma",38));
		tree2.insert(new CustomerInfo("Achumma",45));
		tree2.insert(new CustomerInfo("Achumma",40));
		
		System.out.println("Tree2 created:");
		
		System.out.println("Height of tree is "+tree2.findHeight(tree2.root));
		
		tree1.inorder(tree2.root);
	 
		if(tree1.compareTree(tree1.root, tree2.root))
		{
			System.out.println("tree1 and tree2 are same");
		}
		else
		{
			System.out.println("tree1 and tree2 are different");
		}
	 
		 TreeNode tree3,tree5;	
		 
	     tree3=tree1.treeToDoublyLinkedList(tree1.root);
		
		 while(tree3.getLeft()!=null )
		 {
			 tree3=tree3.getLeft();
		 }
		 
 
		 
	
//	int [] preorder={15,18,7,4,17,11,9,5,21};
//	int [] inorder={7,18,17,4,11,15,5,9,21};
//	tree3=tree2.buildTree(preorder, inorder);
//	Tree tree4=new Tree();
	
//	char [] preorderNL={'N','N','N','L','N','L','L','N','L','L','N','L','L'};
	
//	tree5=tree4.buildNLTree(preorderNL);

		 /*
	HashTable hash=new HashTable();
	CustomerInfo cust=new CustomerInfo("Manmohan",1550);
	hash.put(cust.getKey(), cust);
	cust=new CustomerInfo("Manmohan",2550);	 
	hash.put(cust.getKey(), cust);
	cust=new CustomerInfo("Kevin",1990);  
	hash.put(cust.getKey(), cust);
	cust=new CustomerInfo("Berlusconi",7002);
	hash.put(cust.getKey(), cust);
	cust=new CustomerInfo("Hu",2101);
	hash.put(cust.getKey(), cust);
	cust=new CustomerInfo("Achummama",2002);
	hash.put(cust.getKey(), cust);
	cust=new CustomerInfo("Anthony",3002);
	hash.put(cust.getKey(), cust);
	
//	cust=(CustomerInfo)hash.get(new CustomerInfoKey(2002));
 //   cust.show();
    
    int i=2;
    
    i=i/2;    
    System.out.println("i IS:" +i);
    
 */   
    
	MinHeap minheap=new MinHeap();
	
	minheap.insert(new CustomerInfo("Kevin",21));
	minheap.insert(new CustomerInfo("Berlusconi",17));
	minheap.insert(new CustomerInfo("Hu",13));
	minheap.insert(new CustomerInfo("Tony",11));
	minheap.insert(new CustomerInfo("Achummama",7));
	minheap.insert(new CustomerInfo("Chandy",5));
	
    
	Graph graph=new Graph();
	
//    graph.updateGraph(2, j, weight)
		 
    
	
	System.out.println("End:");
	
	minheap.deleteMin();
	
//	lab.thread.Queue q=new lab.thread.Queue();
//	new lab.thread.Producer(q,1);
//	new lab.thread.Consumer(q,1);
//	new lab.thread.Producer(q,2);
//	new lab.thread.Consumer(q,2);
//	new lab.thread.Consumer(q,3);
	
	
	
	
}
	
	

}
