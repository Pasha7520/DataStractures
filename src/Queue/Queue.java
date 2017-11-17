package Queue;

public class Queue<T> implements Cloneable {
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
	private Node<T> first = null;

	
		public boolean isEmpty(){
			return first == null;
		}
	
	public void push(T data){
		size++;
		Node<T> node = new Node<T>(data);
		Node<T> firstFix = first;
		if(first == null){
			first = node;
			return;
		}
		while(first.next != null){
			first=first.next;
		}
		first.next = node;
		first = firstFix;
		
		System.out.println(first);
	}
	
	public T pop(){
		
		if(isEmpty()){
			System.out.println("Queue is empty!");
			return null;
		}
		else{
			
			size--;
			Node<T> node = first;
			first = first.next;
			return node.data;
		}
		
	}
	public T peek(){
		return first.data;
	}
	
	public int size(){
		return size;
	}
	
	@Override
	public Queue clone() throws CloneNotSupportedException{
		Queue s  = new Queue();
		Node<T> firstSave = this.first;
		while(!(isEmpty())){
			s.push(pop());
		}
		this.first = firstSave;
		this.size = s.size;
		return s;
	}
	
	public void clear(){
		this.first = null;
	
	}
	
	public <T>  T [] tuarei(){
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
	        Node currentNode = first;
	        while (currentNode != null) {
	            listBuilder.append(currentNode).append(",");
	            currentNode = currentNode.next;
	        }

		return " Queue [ " + listBuilder.toString() + "]";
	}
}

		

		
	

