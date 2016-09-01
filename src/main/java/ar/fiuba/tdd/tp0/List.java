package ar.fiuba.tdd.tp0;

/**
 * Created by joaquin on 29/08/16.
 */
public interface List<T> {
    boolean isEmpty();

    int size();

    void append(T item);

    T getFirst() throws AssertionError;

    void removeFirst() throws AssertionError;
}
