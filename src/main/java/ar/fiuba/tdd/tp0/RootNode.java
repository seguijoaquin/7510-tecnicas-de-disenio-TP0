package ar.fiuba.tdd.tp0;

/**
 * Created by joaquin on 30/08/16.
 */
public class RootNode<T> implements Node<T> {

    private Node<T> nextNode = new NullNode<T>();

    @Override
    public Node<T> getNextNode() {
        return nextNode;
    }

    @Override
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public T getNodeItem() {
        return null;
    }

    @Override
    public void append(Node<T> previousNode, Node<T> newNode) {
        nextNode.append(this,newNode);
    }

    @Override
    public int getAmountOfSubsequentNodes() {
        return nextNode.getAmountOfSubsequentNodes();
    }
}
