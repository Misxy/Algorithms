public class Stack<Item> {
    private static class Node<Item> {
        private Item data;
        private Node<Item> next;

        public Node(Item data) {
            this.data = data;
        }
    }

    private Node<Item> top;

    public boolean isEmpty() {
        return top == null;
    }

    public Item peak(){
        return top.data;
    }

    public void push(Item data){
        Node<Item> node = new Node<Item>(data);
        if(top != null){
            node.next = top;
        }
        top = node;
    }
            
    public Item pop(){
        Item data = top.data;
        top = top.next;
        return data;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(10);
        System.out.println("Top element is: "+ stack.peak());
        stack.pop();       
        System.out.println("Top element is: "+ stack.peak());
    }
}