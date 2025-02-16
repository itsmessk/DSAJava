public class StackClass {

    //lifo - last in first out
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.println("Top element: " + stack.peek());
    }

    
}

class Stack{
    private int maxSize;
    private int top;
    private int[] stack;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.top = -1;
    }
    public Stack(){
        this.maxSize = 1000;
        this.stack = new int[maxSize];
        this.top = -1;
    }


    public boolean isFull(){
        return top == maxSize -1;
    }

    public boolean isEmpty(){
        return top == -1;

    }

    public void push(int data)
    {
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];

        
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public void display(){
        for(int i =0; i< top+1; i++){
            System.out.print(stack[i] + " ");
            System.out.println();
        }
    }
}
