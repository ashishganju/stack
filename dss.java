import java.util.*;

 class Node
{
	int data;
	Node prev;
	//Node top;
}
 class Stack
{
  Node top;
  void push(int num)
  {
  	Node node=new Node();

  	node.data=num;
  	if(top==null)

  	{
  		node.prev=top;
  		top=node;

  	}

  	else
  	{
  		node.prev=top;
  		top=node;
  	}

  }
  	void pop()
  	{
  		if(top==null)
  		{
  			System.out.print("stack underflow");
  		}
  		else
  		{
  		Node temp=top;
  		System.out.print(temp.data);
  		top=top.prev;
  		temp=null;
  	}

  	}
  	
  
  public static void main(String[]args)
  {
  	Stack stack=new Stack();
  	stack.push(10);
  	stack.push(20);
  	stack.push(30);
  	stack.push(40);
  	stack.push(50);
  	stack.pop();
  
  }

}