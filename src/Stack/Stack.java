package Stack;

public class Stack<T> implements Cloneable{
	private int size;
		private static class Node<T> implements Cloneable{
			private T data;
			private Node<T> next;
		
				public Node(T data){
					this.data = data;
				}

				@Override
				public String toString() {
				return data.toString();
			}
		
		}
	private Node<T> top = null;
	
		

	public boolean isEmpty(){
		return top == null;
	}
	public void push(T data){
		size++;
		Node<T> node = new Node<T>(data);
		node.next = top;
		top = node;
	}
	public T pop(){
		
		if(isEmpty()){
			System.out.println("Stack is empty!");
			return null;
		}
		else{
			size--;
			Node<T> last = top;
			top = top.next;
			return last.data;
			
		}
		
	}
	public T peek(){
		return top.data;
	}
	public int size(){
		return size;
	}
	@Override
	public Stack clone() throws CloneNotSupportedException{
		Stack s  = new Stack();
		Node<T> topSave = this.top;
		while(!(isEmpty())){
			s.push(pop());
		}
		this.size = s.size;
		this.top = topSave;
		return s;
	}
	public void clear(){
		this.top = null;
	}
	public <T> T [] tuarei(){
		int sizze = size;
		T []array =  (T[])new Object[size];
		for(int i = 0; i < sizze;i++){
			if(!(isEmpty())){
			array[i] = (T) pop();
			}
			
		}
		return array;
	}
	@Override
	public String toString() {
		 StringBuilder listBuilder = new StringBuilder();
	        Node currentNode = top;
	        while (currentNode != null) {
	            listBuilder.append(currentNode).append(",");
	            currentNode = currentNode.next;
	        }
	        
		return "Stack [" + listBuilder.toString()+ "]";
	}
}

