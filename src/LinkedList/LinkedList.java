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

    public int getCount() {
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


    public void printAllElements() {
        node current = this.head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

   public void  deleteatend(){

   }


}
public class LinkedList {
    public static void main(String[] args) {

        ll l=new ll();
        l.addatend("Hello");
        l.addatbegin("World");
        l.addatbegin("Harshil");
        l.addatend("Hello");
        l.addatbegin("World");
        l.addatbegin("Harshil");
        l.addatend("Hello");
        l.addatbegin("World");
        l.addatbegin("Harshil");
        l.addatend("Hello");
        l.addatbegin("World");
        l.addatbegin("Harshil");
        l.addatend("Hello");
        l.addatbegin("World");
        l.addatbegin("Harshil");
        l.printAllElements();
        System.out.println(l.Searchelemt("Hello"));
//        l.delete("Harshil");

        l.printAllElements();
        System.out.println(l.getCount());

    }

}
