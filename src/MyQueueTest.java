import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyQueueTest {

    @org.junit.jupiter.api.Test
    void push() {
        MyQueue queue = new MyQueue();
        queue.push(2);
        queue.push(1);
        queue.push(3);
        assertEquals(3, queue.size());
        assertEquals(2, queue.front());
        assertEquals(2, queue.back());
    }

    @org.junit.jupiter.api.Test
    void pop() {
        MyQueue queue = new MyQueue();
        queue.push(2);
        queue.push(1);
        queue.push(3);
        assertEquals(2, queue.pop());
        assertEquals(1, queue.pop());
        assertEquals(1, queue.pop());
    }

    @org.junit.jupiter.api.Test
    void front() {
        MyQueue queue = new MyQueue();

        assertNull(queue.front(), "Front null");

        queue.push(1);
        assertEquals(1, queue.front(), "This is the front of the queue");

        queue.push(2);
        assertEquals(2, queue.front(), "The front should still be 'First' since Second, is second in line");

        queue.pop();
        assertEquals(2, queue.front(), "'First' has been removed, the front should now be 'Second'");
    }

    @org.junit.jupiter.api.Test
    void back() {
        MyQueue queue = new MyQueue();

        assertNull(queue.back(), "Back null");

        queue.push(1);
        assertEquals(1, queue.back(), "'First' is the back of the queue, it is the only element");

        queue.push(2);
        assertEquals(2, queue.back(), "The back is now 'Second'");

        queue.push(3);
        assertEquals(3, queue.back(), "'Third' is added to the queue, it is now the last element");

    }

    @org.junit.jupiter.api.Test
    void size() {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(1);
        queue.push(1);
        assertEquals(3, queue.size());
    }

    @org.junit.jupiter.api.Test
    void empty() {
        MyQueue queue = new MyQueue();
        assertTrue(queue.empty());
        queue.push(1);
        assertFalse(queue.empty());
    }

}