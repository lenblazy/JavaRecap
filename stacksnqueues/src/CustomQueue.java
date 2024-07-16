public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_CAPACITY = 10;
    int end = -1;

    public CustomQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CustomQueue(int size) {
        data = new int[size];
    }

    protected boolean isFull() {
        return end == data.length - 1;
    }

    protected boolean isEmpty() {
        return end == -1;
    }

    public boolean enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return false;
        }
        end++;
        data[end] = value;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty. Cannot dequeue");
        }
        int removed = data[0];

        // shift all elements to the left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        end--;

        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty. Cannot peek");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }

}
