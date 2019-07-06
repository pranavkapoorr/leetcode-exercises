package linkedlist;


public class MyLinkedList {
    private Node head;
    public MyLinkedList(){
        this.head = new Node(null,null);
    }

    public void addItemInFront(Object item){
        Node node = new Node(item,null);
        node.next = head.next;
        head.next = node;
    }
    public void addItemInEnd(Object item){
        Node node = new Node(item,null);
        Node secondlastNode = head;
        while(secondlastNode.next!=null) {
        	secondlastNode = secondlastNode.next;
        }
        secondlastNode.next = node;
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
        list.addItemInFront(1);
        list.addItemInFront(2);
        list.addItemInEnd(3);
        list.printAll();
        System.out.println();
        list.deleteItem(3);
        list.addItemInEnd(4);
        list.addItemInFront(5);
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