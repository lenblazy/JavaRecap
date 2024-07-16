public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_CAPACITY = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_CAPACITY);
    }

    public CustomStack(int size) {
        data = new int[size];
    }

    public boolean push(int value)  {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;

    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty. Cannot pop");
        }
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty. Cannot peek");
        }
        return data[ptr];
    }

    protected boolean isFull() {
        return ptr == data.length - 1;
    }

    protected boolean isEmpty() {
        return ptr == -1;
    }


}
