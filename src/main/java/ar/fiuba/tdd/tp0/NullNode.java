package ar.fiuba.tdd.tp0;

/**
 * Created by joaquin on 01/09/16.
 */
public class NullNode<T> implements Node<T> {

    @Override
    public Node<T> getNextNode() {
        throw new AssertionError();
    }

    @Override
    public void setNextNode(Node<T> nextNode) {
        throw new AssertionError();
    }

    @Override
    public T getNodeItem() {
        throw new AssertionError();
    }

    @Override
    public void append(Node<T> previousNode, Node<T> newNode) {
        previousNode.setNextNode(newNode);
    }

    @Override
    public int getAmountOfSubsequentNodes() {
        return 0;
    }
}
