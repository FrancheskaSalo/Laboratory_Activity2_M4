// MyQueue.java
public class MyQueue implements QueueInterface {
    Object[] queue = new Object[10]; //creates array with fixed size = 10

    @Override
    public void push(Object item) throws QueueOverflowException {
        if(isFull()){
            throw new QueueOverflowException("Queue is full");
        }

        for(int i=0; i<queue.length; i++){
            if(queue[i] == null){
                queue[i] = item;
                return;
            }
        }

    }

    @Override
    public Object pop() throws QueueEmptyException {
        if(queue[0] == null){
            throw new QueueEmptyException("Queue is empty");
        }

        Object frontItem = queue[0];

        for(int i = 0; i<queue.length-1;i++){
            queue[i] = queue[i+1];
        }

        queue[queue.length-1] = null;

        return frontItem;
    }

    @Override
    public Object front() {
        return null;
    }
    @Override
    public Object back() {
        return null;
    }
    @Override
    public int size() {
        int counter = 0;
        for(Object o : queue){
            if(o!=null){ //checks if any value is null
                counter++;
            }
        }
        return counter;
    }
    @Override
    public boolean empty() {
        for(Object o : queue){ //for-each loop starts at index 0
            if(o!=null){ //checks if any value isn't null
                return false;
            }
        }
        return true;
    }

}