public class DynamicQueue extends CircularQueue {
    protected int[] data;
    private static final int DEFAULT_CAPACITY = 10;

    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
       super(size);
    }

    public boolean insert(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        return super.insert(item);
    }

}
