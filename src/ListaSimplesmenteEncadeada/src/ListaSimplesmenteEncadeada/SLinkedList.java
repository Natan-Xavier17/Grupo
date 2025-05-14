package ListaSimplesmenteEncadeada;

public class SLinkedList {

	protected Node head; // nodo cabeça da lista

	protected Node tail; // nodo cabeça da lista

	protected long size; // número de nodos da lista

	// Construtor default que cria uma lista vazia

	public SLinkedList() {

	head = tail = null;

	size = 0;

	}
	 public void addHead(String element) {
	        head = new Node(element, head);
	        if (size == 0) {
	            tail = head;
	        }
	        size++;
	    }

	    public void addTail(String element) {
	        Node newNode = new Node(element, null);
	        if (size == 0) {
	            head = tail = newNode;
	        } else {
	            tail.setNext(newNode);
	            tail = newNode;
	        }
	        size++;
	    }

	    public String removeFirst() throws EmptySLinkedList {
	        if (size == 0) {
	            throw new EmptySLinkedList("A lista está vazia.");
	        }
	        String element = head.getElement();
	        head = head.getNext();
	        size--;
	        if (size == 0) {
	            tail = null;
	        }
	        return element;
	    }

	    public long size() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }
	    
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder("[");
	        Node current = head;
	        while (current != null) {
	            sb.append(current.getElement());
	            current = current.getNext();
	            if (current != null) {
	                sb.append(", ");
	            }
	        }
	        sb.append("]");
	        return sb.toString();
	    }
}