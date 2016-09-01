package ar.fiuba.tdd.tp0;

/**
 * Created by joaquin on 30/08/16.
 */
public class NodeImplementation<T> implements Node<T> {

    private Node<T> nextNode = new NullNode<T>();
    private T item;

    NodeImplementation(T item) {
        this.item = item;
    }

    @Override
    public Node<T> getNextNode() {
        return this.nextNode;
    }

    @Override
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public T getNodeItem() {
        return this.item;
    }

    @Override
    public void append(Node<T> previousNode, Node<T> newNode) {
        nextNode.append(this,newNode);
    }

    @Override
    public int getAmountOfSubsequentNodes() {
        return (1 + nextNode.getAmountOfSubsequentNodes());
    }
}
