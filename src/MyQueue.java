// MyQueue.java
public class MyQueue implements QueueInterface {
    Object[] queue = new Object[10]; //creates array with fixed size = 10

    @Override
    public void push(Object item) {
    }
    @Override
    public Object pop() {
        return null;
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