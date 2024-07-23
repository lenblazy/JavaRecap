import java.util.Stack;

public class QueueUsingStack {

    public static void main(String[] args) {
        Stack<Integer> firstStack = new Stack<>();
        Stack<Integer> secondStack = new Stack<>();

        QueueUsingStack queue = new QueueUsingStack(firstStack, secondStack);

        queue.add(1);
        queue.add(2);
        queue.add(3);

        try{
            System.out.println(queue.remove()); // 1
            System.out.println(queue.remove()); // 2
            System.out.println(queue.remove()); // 3
            System.out.println(queue.isEmpty()); // true

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(Stack<Integer> first, Stack<Integer> second) {
        this.first = first;
        this.second = second;
    }

    public void add(int value) {
        first.push(value);
    }

    public int remove() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int removedValue = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return removedValue;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    public int peek() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peeked = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return peeked;
    }

}
