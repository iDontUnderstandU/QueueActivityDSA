public class Queue{
    private Node front;

    public Node createNode(String data) {
        return new Node(data);
    }

    public void enqueue(String data) {
        Node newnode = createNode(data);
        if (isEmpty()) {
            front = newnode;
        } else {
            Node temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }

    }

    public String dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            Node temp = front;
            front = front.next;
            temp.next = null;
            return temp.data;
        }

    }

    public String peekFront() {
        if(isEmpty()){
            return "None";
        }
        else{
            return front.data;
        }
        
    }

    public void displayQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println("\n");

    }
    
    public int getLength(){
      int len = 0;
      Node temp = front;
      
      while(temp != null){
         len++;
         temp = temp.next;
      }
      
      return len;
   }


    public boolean isEmpty() {
        return front == null;
    }

}