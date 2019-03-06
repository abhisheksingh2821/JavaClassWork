 class Node{
	int data;
	Node prev;
}

public class Stack{
	
	Node top;
	
	void push(int num){
	
		Node node = new Node();
		node.data = num;
		if(top==null){
		node.prev=top;
		top=node;
		}
		else{
		node.prev=top;
		top= node;
		}
	}

	int display(){
		
        int x=0;
		Node tmp = top;
        
		while(tmp != null)
		{
		System.out.println(tmp.data + " ");
           
		tmp= tmp.prev;
            x++;
	}
       
        return x;
}
    
   void peak(){
       Node tmp =top;
       System.out.println("peak element is:"+tmp.data + " ");
}
    

	void pop(){
		
	if(top==null){
		
	System.out.println("underflow");
		}
		else{
		Node temp = top;
		System.out.println("popped element is " + temp.data);
		top=top.prev;
		temp=null;
		}
	}


public static void main(String args[]){
	Stack stack = new Stack();
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.push(50);

	int a= stack.display();
   System.out.println("size of stack is:"+a);
	stack.pop();
	stack.pop();
    	
    	
	
     stack.peak();
}
}