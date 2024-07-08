package data_structures;

public class StackWithLinkedList {
    private class Item{
        Object data;
        Item next;
        Item(Object data, Item next){
            this.data = data;
            this.next = next;
        }
    }

    private Item base = null;
    private int size = 0;

    private Object push(Object data){
        base = new Item(data, base);
        size ++;
        return data;
    }

    private Object pop(){
        if(size < 1){
            throw new IllegalArgumentException("Stack already empty");
        }
        Object data = base.data;
        base = base.next;
        size -- ;
        return data;
    }

    private void showStack(){
        Item current = base;
        System.out.println("elements of stack:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        var myStack = new StackWithLinkedList();
        myStack.push("oranges");
        myStack.push("mangoes");
        myStack.push("bananas");
        myStack.showStack();
        myStack.pop();
        myStack.showStack();

    }
}
