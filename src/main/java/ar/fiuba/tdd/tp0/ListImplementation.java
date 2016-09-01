package ar.fiuba.tdd.tp0;

/**
 * Created by joaquin on 30/08/16.
 */
public class ListImplementation<T> implements List<T> {

    private Node<T> rootNode = new RootNode<T>();

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public int size() {
        return (rootNode.getAmountOfSubsequentNodes());
    }

    @Override
    public void append(T item) {
        rootNode.append(rootNode,new NodeImplementation<T>(item));
    }

    @Override
    public T getFirst() throws AssertionError {
        return rootNode.getNextNode().getNodeItem();
    }

    @Override
    public void removeFirst() throws AssertionError {
        rootNode.setNextNode(rootNode.getNextNode().getNextNode());
    }
}
