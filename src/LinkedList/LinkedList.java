package LinkedList;


class node{
    String data;
    node next;
    public  node(String data){
        this.data=data;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public node getNext() {
        return next;
    }
    public void setNext(node next) {
        this.next = next;
    }
}

class ll{

    private node head;
    private node tail;

    public node getHead() {
        return head;
    }

    public node getTail() {
        return tail;
    }

    public  void  addatend(String data){
        node n= new node(data);
        if (this.head==null){
            this.head=this.tail=n;
        }
     else {
            this.tail.setNext(n);
            this.tail=n;
        }
    }

    public void addatbegin(String data){
        node n = new node(data);
        if (this.head==null){
            this.head=this.tail=n;
        }
        else {
           n.setNext(this.head);
            this.head=n;
        }
    }

public boolean  delete(String data) {
    if (head == null) {
        return false;
    }
    if (head.getData().equals(data)) {
        head = head.getNext();
    }
    node current = this.head;
    while (current != null) {
        if (current.getData().equals(data)) {
            current.setNext(current.getNext().getNext());
            if (current.getNext() == null) tail = current;
            return true;
        }
        current = current.getNext();
    }
    return false;
}


public int lengthviarecusion(node head){
        if (head==null)return 0;
        return 1+lengthviarecusion(head.getNext());
}
    public int length() {
        node curre=this.head;
        int count=1;
        if (head==null){
            return 0;
        }
        while (curre.getNext()!=null){
            count++;
            curre=curre.getNext();
        }
        return count;
    }



    public node Searchelemt(String data){
      node current=this.head;
      while (current!=null){
        if (current.getData().equals(data))return current;
        else{
            current=current.getNext();
        }
      }
      return null;
    }


public  void printelememtviarescursion(node head){

    if (head==null)return;
    System.out.print(head.getData()+" ");
    printelememtviarescursion(head.getNext());
}

public void printhelpeer(){
        printelememtviarescursion(head);
    System.out.println("\n"+ lengthviarecusion(head));
}


    public void printAllElements() {
        node current = this.head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public  void  insetatindx(int index,String str){
        node current=head;
        node n=new node(str);
        for (int i = 0; i <index-1 ; i++) {
            current=current.getNext();
        }

        n.setNext(current.getNext());
        current.setNext(n);


    }


    public void insetatindx1(int index, String str) {
        node n = new node(str);

        // Case 1: Insert at beginning
        if (index == 0) {
            n.setNext(head);
            head = n;
            if (tail == null) tail = n; // if list was empty
            return;
        }

        node current = head;

        // Traverse to index - 1
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                System.out.println("Index out of bounds.");
                return;
            }
            current = current.getNext();
        }

        if (current == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        // Insert in middle or end
        n.setNext(current.getNext());
        current.setNext(n);

        //Update tail if inserted at end
        if (n.getNext() == null) {
            tail = n;
        }
    }

}
public class LinkedList {
    public static void main(String[] args) {

        ll l=new ll();
        l.addatend("Hello");
        l.addatbegin("World");
        l.addatbegin("Deep Tapodhan");
        l.addatend("Hello");
        l.addatbegin("World");
        l.addatbegin("Deep Tapodhan");
        l.addatend("Hello");
        l.addatbegin("World");
        l.addatbegin("Deep Tapodhan");
        l.addatend("Hello");
        l.addatbegin("World");
        l.addatbegin("Deep Tapodhan");
        l.addatend("Hello");
        l.addatbegin("World");
        l.addatbegin("Deep Tapodhan");
        l.printAllElements();
        System.out.println(l.Searchelemt("Hello"));
        l.delete("Harshil");
        l.printAllElements();
        System.out.println(l.length());
        l.printhelpeer();
        l.insetatindx(3,"Hey Anj");
        l.printhelpeer();


    }

}
