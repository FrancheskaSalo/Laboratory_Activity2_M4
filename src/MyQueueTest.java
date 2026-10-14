import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @org.junit.jupiter.api.Test
    void push() {
    }

    @org.junit.jupiter.api.Test
    void pop() {
    }

    @org.junit.jupiter.api.Test
    void front() {
    }

    @org.junit.jupiter.api.Test
    void back() {
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