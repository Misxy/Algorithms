public class Queue<Item> {
    private static class Node<Item> {
        private Item data;
        private Node<Item> next;

        public Node(Item data) {
            this.data = data;
        }
    }

    private Node<Item> head;
    private Node<Item> tail;

    public boolean isEmpty(){
        return head == null;
    }

    public Item peak(){
        return head.data;
    }
    public void enQueue(Item data){
        Node<Item> node = new Node<Item>(data);
        if(tail != null){
            tail.next = node;
        }
        tail = node;
        if(head == null){
            head = node;
        }
    }

    public Item deQueue(){
        Item data = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return data;
    }
    public static void main(String[] args) {
        Queue<String> q = new Queue<String>();
        q.enQueue("Kevin");
        q.enQueue("Marty");
        q.enQueue("Philip");
        System.out.println("Before remove a item form the queue.");
        System.out.println(q.peak());
        q.deQueue();
        System.out.println("After remove a item form the queue.");
        System.out.println(q.peak());
    }
}
