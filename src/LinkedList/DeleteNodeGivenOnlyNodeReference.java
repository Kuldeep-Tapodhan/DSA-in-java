package LinkedList;

public class DeleteNodeGivenOnlyNodeReference {

    public static void deletenodevianode(node n) {
        if (n == null || n.getNext() == null) {
            throw new IllegalArgumentException("Cannot delete the given node.");
        }
        n.setData(n.getNext().getData());
        n.setNext(n.getNext().getNext());
    }



    public static void main(String[] args) {
        ll s = new ll();
        s.addatend("deep");
        s.addatend("kuldeep");
        s.addatend("nayan");
        s.addatend("jack");
        s.addatend("kevin");

        System.out.println("Before deletion:");
        s.printhelpeer();

        node nodeToDelete = s.find("nayan");
        deletenodevianode(nodeToDelete);

        System.out.println("After deletion:");
        s.printhelpeer();
    }
}
