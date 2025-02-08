
public class LinkedList {
    public static void main(String[] args) {
        int arr[] = {9,9,9,9};
        int arr2[] = {9,9,9,9,9,9,9};

        Node head1 = arrayToLinkedList(arr);
        Node head2 = arrayToLinkedList(arr);

        Node head3 = createList(10009998);

        printLinkedList(head3);





        

        //head = deleteHead(head);
        //head = deleteTail(head);
        //head = deleteNode(head,6);
        //head = deleteNodeValue(head,4);
        //head = insertHead(head, 10);
        //head = insertTail(head, 10);
        //head = insertPos(head, 55, 3);
        //head = insertPos(head, 43, 6);
        //head = insertValBefore(head, 5454, 3);

        


        
        
        //System.out.println();

        //System.out.println("Length of Linked List: " + lengthOfLinkedList(head));
        
    }
    static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            if(temp.next == null){
                System.out.print(temp.data);
            }
            else{
                System.out.print(temp.data + "->");
            }
            temp = temp.next;
        }
    }

    static Node arrayToLinkedList(int[] arr){
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1; i< n; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static int lengthOfLinkedList(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    static Node deleteHead(Node head){
        if(head == null){
            return null;
        }
        head = head.next;
        
        return head;
        
    }
    static Node deleteTail(Node head){
        if((head == null) || (head.next == null)){
            return null;
        }

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

        return head;

        
    }


    static Node deleteNode(Node head, int key){
        if(head == null){
            return head;
        }
        if(key == 1){
            head = head.next;
            return head;
        }

        Node temp = head;

        int count =1;

        Node prev = null;

        while(temp != null){
            
            if(count == key){
                if(prev != null){

                    prev.next = temp.next;
                    break;
                }   
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
        return head;
    }

    static Node deleteNodeValue(Node head, int value){
        if(head == null){
            return head;
        }
        if(value == head.data){
            head = head.next;
            return head;
        }

        Node temp = head;

        

        Node prev = null;

        while(temp != null){
            
            if(value == temp.data){
                if(prev != null){

                    prev.next = temp.next;
                    break;
                }   
            }
            prev = temp;
            temp = temp.next;
            
        }
        return head;
    }

    public static Node insertHead(Node head, int val){
        if(head == null){
            return new Node(val);
        }
        
        Node newNode = new Node(val);

        newNode.next = head;

        return newNode;
        
    }

    public static Node insertTail(Node head, int val){
        if(head == null){
            return new Node(val);
        }

        Node temp = head;

        while(temp.next !=null){
            temp = temp.next;
        }

        temp.next = new Node(val);

        return head;
    }

    public static Node insertValBefore(Node head, int newVal, int aEle){

        if(head == null){
            return null;
        }

        if(aEle == head.data){
            return new Node(newVal, head);
        }

        Node temp = head;
        boolean found = false;
        while(temp.next != null){
            if(temp.next.data == aEle){
                Node n = new Node(newVal, temp.next);
                temp.next = n;
                found = true;
                break;
            }
            found = false;
            temp = temp.next;
        }

        if(!found) {System.out.println(" element not found");}

        



        return head;
    }

    public static Node insertPos(Node head, int val, int pos){
        if(head == null){
            if(pos == 1 ){
                return new Node(val);
            }
            else{
                return head;
            }
        }
        if(pos==1){
            return new Node(val, head);
        }

        Node temp = head;
        int count = 0;

        while(temp != null){
            count++;
            if(count == (pos-1)){
                Node n = new Node(val, temp.next);
                temp.next = n;
                break;
            }
            temp = temp.next;
        }
        


        return head;
    }


    public static int count(Node head){
        Node temp = head;
        int ans = 0;
        int point = 1;
        while(temp != null){
            ans += temp.data * point;
            point *= 10;
            temp = temp.next;
        }
        return ans;
    }

    public static Node createList(int ans){
        int val = ans;
        Node head = null;
        while(val != 0){
            int last = val % 10;
            val /= 10;
            Node temp = new Node(last);
            temp.next = head;
            head = temp;
        }
        return head;
        
    }
}


class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }

    
}