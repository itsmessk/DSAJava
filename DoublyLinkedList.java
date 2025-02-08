public class DoublyLinkedList {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Node head = arrayToLinkedList(arr);
        printLinkedList(head);
        System.out.println();
        head = deleteAtHead(head);
        printLinkedList(head);
        System.out.println();
        head = deleteAtTail(head);
        printLinkedList(head);
        System.out.println();
        head = deleteAtPosition(head, 4);
        printLinkedList(head);
        System.out.println();
        head = deleteNodeElement(head, 1);
        printLinkedList(head);
        System.out.println();
        head = insertAtHead(head, 0);
        printLinkedList(head);  

        System.out.println();
        head = insertAtEnd(head, 10);
        printLinkedList(head);

        System.out.println();
        head = insertAtPosition(head, 4, 100);
        printLinkedList(head);

        System.out.println();
        head = insertNodeElement(head, 100, 200);
        printLinkedList(head);

        System.out.println();
        head = reverseDLL(head);
        printLinkedList(head);
    }


    public static Node reverseDLL(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        Node current = head;
        Node prev = null;

        while(current != null){
            prev = current.back;
            current.back = current.next;
            current.next = prev;
            current = current.back;
        }

        return prev.back;
        
        
    }

    public static Node insertNodeElement(Node head, int data, int element){
        if(head == null){
            return new Node(data);
        }

        if(head.data == data){
            return insertAtHead(head, element);

        }

        Node temp = head;

        while(temp != null){
            if(temp.data == data){
                if(temp.next == null){
                    return insertAtEnd(head, element);
                }
                Node newNode = new Node(element);
                Node prev = temp.back;
                
                prev.next = newNode;
                newNode.back = prev;
                newNode.next = temp;
                temp.back = newNode;

                break;


            }
            temp = temp.next;
        }
        return head;
    }


    public static Node insertAtPosition(Node head, int position, int data){
        if(head == null){
            return new Node(data);
        }

        if(head.next == null && position == 1){
            insertAtHead(head, data);
        }
        if(position == 1){
            return insertAtHead(head, data);
        }


        Node temp = head;
        int count = 0;
        
        while(temp != null){
            count++;
            if(count == position){
                if(head.next == null){
                    return insertAtEnd(head, data);
                }
                Node newNode = new Node(data);
                newNode.next = temp;
                newNode.back = temp.back;
                temp.back.next = newNode;
                temp.back = newNode;
                break;

            }
            temp = temp.next;
            

        }
        return head;
    }


    public static Node insertAtEnd(Node head, int data){
        if(head == null){
            return new Node(data);

        }
        if(head.next == null){
            Node temp = new Node(data);
            head.next = temp;
            temp.back = head;
            return head;
        }
        Node t = head;
        while(t.next != null){
            t = t.next;
        }
        Node temp = new Node(data);
        t.next = temp;
        temp.back = t;
        return head;

        
    }

    
    public static Node insertAtHead(Node head, int data){
        if(head == null){
            return new Node(data);
        }
        if(head.next == null){
            Node temp = new Node(data);
            temp.next = head;
            head.back = temp;
            return temp;
        }

        Node temp = new Node(data);
        temp.next = head;
        head.back = temp;
        return temp;
        



    }

    public static Node deleteNodeElement(Node head, int data){
        if(head == null){
            return null;
        }

        if(head.next == null && head.data == data){
            return null;
        }

        if(head.next == null && head.data != data){
            return head;
        }

        Node temp = head;

        while(temp != null){
            if(temp.data == data){
                if(temp.next == null){
                    return deleteAtTail(head);
                }
                if(temp.back == null){
                    return deleteAtHead(head);
                }
                temp.back.next = temp.next;
                temp.next.back = temp.back;
                break;
            }
            
            temp = temp.next;
        }
        return head;
    }


    public static Node arrayToLinkedList(int[] arr){

        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i  = 1; i< arr.length; i++){
            Node temp = new Node(arr[i]);
            temp.back = prev;
            prev.next = temp;
            prev = temp;
        }
        return head;
    }



    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null){
            if(temp.next == null){
                System.out.print(temp.data);
            }
            else{
                System.out.print(temp.data + "<->");
            }
            temp = temp.next;
        }
    }

    public static Node deleteAtHead(Node head){
        if(head == null){
            return null;
        }

        if(head.next == null){
            return null;
        }

        head = head.next;
        head.back = null;

        return head;
    }

    public static Node deleteAtTail(Node head){
        if(head == null){
            return null;

        }
        if(head.next == null){
            return null;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.back.next = null;

        return head;
    }


    public static Node deleteAtPosition(Node head, int k){
        if(head == null){
            return null;

        }

        if(k == 1){
            return deleteAtHead(head);
        }

        Node temp = head;
        int count = 0;

        while(temp != null){
            count++;
            if(count == k){

                if(temp.next == null){
                    return deleteAtTail(head);
                }
                temp.back.next = temp.next;
                temp.next.back = temp.back;
                break;
            }
            temp = temp.next;
        }


        return head;
    }
    
}

class Node{
    int data;
    Node next;
    Node back;

    Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }

    Node(int data, Node next, Node back){
        this.data = data;
        this.next = next;
        this.back = back;
    }
}
