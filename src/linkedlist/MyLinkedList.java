package linkedlist;

public class MyLinkedList {
    private Node head;
    public MyLinkedList(){
        this.head = new Node(null,null);
    }

    public void addItem(Object item){
        Node node = new Node(item,null);
        node.next = head.next;
        head.next = node;
    }
    public void printAll(){
    	Node temp = head;
        while(temp.next!=null){
        	temp = temp.next;
            System.out.print("| " + temp.value  + " |");   
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
    			return true;
    		}else {
    			return false;
    		}
    	
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addItem(1);
        list.addItem(3);
        list.addItem(2);
        list.addItem(4);
        list.printAll();
        System.out.println();
        list.deleteItem(2);
        list.printAll();
        System.out.println();
        list.deleteItem(3);
        list.printAll();
    }

    private class Node {
        private Object value;
        private Node next;
        public Node(Object value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}