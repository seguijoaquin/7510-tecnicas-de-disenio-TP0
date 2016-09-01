package ar.fiuba.tdd.tp0;

/**
 * Created by joaquin on 30/08/16.
 */
public class QueueImplementation<T> implements Queue<T> {

    private List<T> listOfItems = new ListImplementation<T>();

    @Override
    public boolean isEmpty() {
        return listOfItems.isEmpty();
    }

    @Override
    public int size() {
        return listOfItems.size();
    }

    @Override
    public void add(T item) {
        listOfItems.append(item);
    }

    @Override
    public T top() {
        return listOfItems.getFirst();
    }

    @Override
    public void remove() {
        listOfItems.removeFirst();
    }
}
