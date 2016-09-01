package ar.fiuba.tdd.tp0;

/**
 * Created by joaquin on 29/08/16.
 */
public interface Queue<T> {
    boolean isEmpty();

    int size();

    void add(T item);//agregar un item

    T top();//retornar el primer item, lanzar exception si esta vacio.

    void remove();//remover el primer item, lanzar exception si esta vacio.
}
