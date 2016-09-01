package ar.fiuba.tdd.tp0;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joaquin on 29/08/16.
 */
public class QueueImplementationTest {

    @Test
    public void queuesMustBeCreatedEmpty() {
        Queue<Integer> queue = new QueueImplementation<Integer>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void sizeOfAnEmptyQueueMustReturnZero() {
        Queue<Integer> queue = new QueueImplementation<Integer>();
        assertEquals(0,queue.size());
    }

    @Test
    public void addingAnElementToQueueAndAskingSizeMustReturnOne() {
        Queue<Integer> queue = new QueueImplementation<Integer>();
        queue.add(91451);
        assertEquals(1,queue.size());
    }

    @Test
    public void toppingFromEmptyQueueMustThrowAssertionError() {
        Queue<Integer> queue = new QueueImplementation<Integer>();
        boolean exceptionThrown = false;
        try {
            queue.top();
        } catch (AssertionError e) {
            exceptionThrown = !exceptionThrown;
        }
        assertTrue(exceptionThrown);
    }

    @Test
    public void addingAnElementToQueueAndToppingItMustReturnTheSameElement() {
        Queue<Integer> queue = new QueueImplementation<Integer>();
        Integer element = 91451;
        queue.add(element);
        assertEquals(element,queue.top());
    }

    @Test
    public void addingTwoElementsToQueueAndToppingOneFromQueueItMustReturnTheSFirstElementAdded() {
        Queue<Integer> queue = new QueueImplementation<Integer>();
        Integer firstElement = 91451;
        Integer secondElement = 00000;
        queue.add(firstElement);
        queue.add(secondElement);
        assertEquals(firstElement,queue.top());
    }

    @Test
    public void addingTwoElementsToQueueAndRemovingOneAndThenToppingOneFromQueueItMustReturnTheSecondElementAdded() {
        Queue<Integer> queue = new QueueImplementation<Integer>();
        Integer firstElement = 91451;
        Integer secondElement = 00000;
        queue.add(firstElement);
        queue.add(secondElement);
        queue.remove();
        assertEquals(secondElement,queue.top());
    }

    @Test
    public void removingFromEmptyQueueMustThrowAssertionError() {
        Queue<Integer> queue = new QueueImplementation<Integer>();
        boolean exceptionThrown = false;
        try {
            queue.remove();
        } catch (AssertionError e) {
            exceptionThrown = !exceptionThrown;
        }
        assertTrue(exceptionThrown);
    }

    @Test
    public void addingOneItemAndRemovingOneItemEmptiesTheQueue() {
        Queue<Integer> queue = new QueueImplementation<Integer>();
        queue.add(91451);
        queue.remove();
        assertTrue(queue.isEmpty());
    }
}