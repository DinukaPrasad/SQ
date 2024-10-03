

public class stack {

    int stack[] = new int[5];
    int top = 0;

    public static void main(String[] args) {
        

        stack st = new stack();

        st.display(st.stack);
        
    }

    public void push(int value){

        if(isEmpty()){
            stack[top]=value;
            top++;
        }
        else{
            System.out.println("Stack is full");
        }
        
    }

    public void display(int arr[]){

        for (int i =arr.length ; i > 0 ; i--) {

            System.out.println(arr[i-1]);
        }
    }

    public void pop(){
        stack[top-1]=0;
        top--;
    }

    public int peak(){
        return stack[top-1];
    }

    public boolean isEmpty(){
        if(top<stack.length){
            return true;
        }
        else{
            return false;
        }
    }
}
