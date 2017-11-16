package Queue;

public class Queue<T> implements Cloneable {
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
	private Node<T> value = null;
	private int size;

	
		public boolean isEmpty(){
			return first == null;
		}
	
	public void push(T data){
		Node<T> node = new Node<T>(data);
		if(first == null){
			first = node;
			value = node;
		}
		else{
			this.value.next = node;
			value = node;
		}
		size++;
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
		s.size = this.size;
		Node<T> firstSave = this.first;
		while(!(isEmpty())){
			s.push(pop());
		}
		this.first = firstSave;
		return s;
	}
	
	public void clear(){
		this.first = null;
		this.value = null;
	
	}
	
	public <T>  T [] tuarei(){
		T []array =  (T[])new Object[size];
		for(int i = 0; i < size;i++){
			if(!(isEmpty())){
			array[i] = (T) pop();
			}
			else{
				
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

		

		
	

