public class Stackx {
    public int [] arr;
    private int arrSize;
    private int top;

    public Stackx(int arrSize){
        arr = new int[arrSize];
        top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (arrSize -1 == top);
    }

    public void push(int value){
        arr[++top] = value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return 0;
        }
        else{
            return top--;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            return arr[top];
        }
        
    }

    public void display(int [] arr){

        for(int i =0 ; i<arr.length;i++){
            System.out.println(i+".Index - "+ arr[i]);
        }
    }
    
}
