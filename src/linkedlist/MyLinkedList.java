package linkedlist;


public class MyLinkedList {
    private Node head;
    private int length;
    public MyLinkedList(){
        this.head = new Node(null,null);
        this.length ++;
    }

    public void addItemInFront(Object item){
        Node node = new Node(item,null);
        node.next = head.next;
        head.next = node;
        length ++;
    }
    public void addItemInEnd(Object item){
        Node node = new Node(item,null);
        Node secondlastNode = head;
        while(secondlastNode.next!=null) {
        	secondlastNode = secondlastNode.next;
        }
        secondlastNode.next = node;
        length ++;
    }
    public void printAll(){
    	Node temp = head;
        while(temp!=null){
        	System.out.print("| " + temp.value  + " |"); 
        	temp = temp.next;
        }
    }
    
    public boolean deleteItem(Object item) {
    		Node a = head;
    		Node b = head.next;
    		while(true) {
        		if(b!=null && b.value != item) {
        			a = b;
        			b = b.next;
        		}else {
        			break;
        		}
        	}
    		if(b!=null) {
    			a.next = b.next;
    			length --;
    			return true;
    		}else {
    			return false;
    		}
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addItemInFront(1);
        list.addItemInFront(2);
        //list.addItemInEnd(3);
        list.printAll();
        list.reverse();
    }
    public int Length() {
    	return this.length;
    }void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.value + " "); 
            node = node.next; 
        } 
    } 
    private void reverse() {
    	Node temp = null;
		while(head!=null) {
			head = head.next;
		}
		System.out.println();
		System.out.println("--reversed--");
		printAll();
		
	}

	private class Node {
        private Object value;
        private Node next;
        public Node(Object value, Node next){
            this.value = value;
            this.next = next;
        }
		//@Override
		//public String toString() {
		//	return "Node [value=" + value + ", next=" + next + "]";
		//}
    }
}