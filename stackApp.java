
public class stackApp {

    public static void main(String [] args){
        Stackx stk = new Stackx(5);
        

        stk.push(66);
        stk.push(59);
        stk.push(5);
        stk.push(100);
        stk.push(19);

        stk.display(stk.arr);
        System.out.println(stk.peek());

        while(!stk.isEmpty()){
            stk.pop();
        }


        System.out.println("after pop");
        stk.display(stk.arr);
        System.out.println(stk.peek());

    }
    
}
