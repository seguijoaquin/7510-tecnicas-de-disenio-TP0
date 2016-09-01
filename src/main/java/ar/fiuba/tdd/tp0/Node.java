package ar.fiuba.tdd.tp0;

/**
 * Created by joaquin on 29/08/16.
 */
public interface Node<T> {
    Node<T> getNextNode();

    void setNextNode(Node<T> nextNode);

    T getNodeItem();

    void append(Node<T> previousNode, Node<T> newNode);

    int getAmountOfSubsequentNodes();
}
