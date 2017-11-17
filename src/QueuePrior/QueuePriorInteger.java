package QueuePrior;

public class QueuePriorInteger implements Cloneable {
	private int size;
	private static class NodeInteger implements Cloneable{
		private Integer data;
		private NodeInteger next;
		private NodeInteger prev;
		
			public NodeInteger(Integer data){
				this.data = data;
			}
			
			
		@Override
		public String toString() {
            return data.toString();
        }
		
	}
	private NodeInteger first = null;
	
	public boolean isEmpty(){
		return first == null;
	}
	public void push(Integer data){
		size++;
		NodeInteger node = new NodeInteger(data);
		NodeInteger firstSave = this.first;
		if(first == null){
			first = node;
			return;
		}
		while(first != null){
			if(first.data >= node.data ){
				if(first.prev == null){
				first.prev = node;
				node.next = first;
				this.first = node;
				break;
				}
				else{
					first.prev.next = node;
					node.prev = first.prev;
					node.next = first;
					first.prev = node;
					this.first = firstSave;
					break;
				}
			}
			else{
				if(first.next != null){
					first = first.next;
				}
				else{
					first.next = node;
					node.prev = first;
					this.first = firstSave;
					break;
				}
			}
			
		}
		
	}
	
	public Integer pop(){
		if(isEmpty()){
		System.out.println("Queue is empty!");
		return null;
		}
		NodeInteger node = first;
		first = first.next;
		size--;
		return node.data;
	}
	public Integer peek(){
		return first.data;
	}
	public void clear(){
		this.first = null;
	
	}
	public Integer[] tuarei(){
		int sizze = size;
		Integer []array = new Integer[size];
		for(int i = 0; i < sizze;i++){
			if(!(isEmpty())){
			array[i] = pop();
			}
			else{
			}
		}
		return array;
	}
	@Override
    public String toString() {
        StringBuilder listBuilder = new StringBuilder();
        NodeInteger currentNode = first;
        while (currentNode != null) {
            listBuilder.append(currentNode).append(",");
            currentNode = currentNode.next;
        }
        
        return " Queue [ "+listBuilder.toString()  + "]";
    }
	@Override
	public QueuePriorInteger clone() throws CloneNotSupportedException{
		NodeInteger firstSave = this.first;
		QueuePriorInteger l = new QueuePriorInteger();
		while(!(isEmpty())){
			l.push(pop());
		}
		this.first = firstSave;
		
		return l;
	}
	public int size(){
		return size;
	}

}
