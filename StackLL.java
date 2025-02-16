public class StackLL {

    public static void main(String args[]) {
  
      stack s = new stack();
  
      s.stackPush(10);
  

  
      s.printStack();
  
      System.out.println("Element popped " + s.stackPop());
  
      System.out.println("Stack size: " + s.stackSize());
  
      System.out.println("Stack is empty or not: " + s.stackIsEmpty());
  
    }
  
  }
  
  class stack {
  
    int curSize;
  
    Node stackTop;
  
    stack() {
  
      this.curSize = 0;
  
      this.stackTop = null;
  
    }
  
    public int stackSize() {
  
      return curSize;
  
    }
  
    public boolean stackIsEmpty() {
  
      return curSize == 0;
  
    }
  
    public void stackPush(int val) {
  
      Node temp = new Node(val);
  
      temp.next = stackTop;
  
      stackTop = temp;
  
      curSize++;
  
    }
  
    public int stackPop() {
  
      if (stackIsEmpty()) {
  
        System.out.println("Stack Empty");
  
        return -1;
  
      } else {
  
        int data = stackTop.data;
  
        stackTop = stackTop.next;
  
        curSize--;
  
        return data;
  
      }
  
    }
  
    public int top() {
  
      return stackTop.data;
  
    }
  
    public void printStack() {
  
      Node t = stackTop;
  
      while (t != null) {
  
        System.out.print(t.data);
  
        if (t.next != null) {
  
          System.out.print(" -> ");
  
        }
  
        t = t.next;
  
      }
  
      System.out.println();
  
    }
  
  }
  
  class Node {
  
    int data;
  
    Node next;
  
    Node(int data) {
  
      this.data = data;
  
      this.next = null;
  
    }
  
    Node(int data, Node next) {
  
      this.data = data;
  
      this.next = next;
  
    }
  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  