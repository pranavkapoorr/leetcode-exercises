package data_structures;

import java.sql.Array;

/**stack with array**/
public class StackWithArray {
    private Object[] arr = new Object[0];
    private int size = 0;

    public int getSize(){
        return size;
    }
    private Object push(Object data){
        if(arr.length < 1){
            arr = new Object[1];
            arr[0] = data;
        }else{
            var newArr = new Object[size + 1];
            for(int i = 0 ; i < arr.length ; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
            arr[size] = data;
        }
        size ++;
        return data;
    }

    private Object pop(){
        if(size < 1){
            throw new IllegalArgumentException("Stack already empty");
        }
        Object data = arr[size - 1];
        arr[size - 1] = null;
        var newArr = new Object[size - 1];
        for(int i = 0 ; i < arr.length - 1; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
        size -- ;
        return data;
    }

    private void showStack() {
        System.out.println("elements of stack:");
        for(int i = arr.length - 1 ; i >= 0 ; i --){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        var myStack = new StackWithArray();
        myStack.push("oranges");
        myStack.push("mangoes");
        myStack.push("bananas");
        myStack.showStack();
        myStack.pop();
        myStack.showStack();
    }
}
