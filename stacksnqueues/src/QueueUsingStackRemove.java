import java.util.Stack;

public class QueueUsingStackRemove {

    public static void main(String[] args) {
        Stack<Integer> firstStack = new Stack<>();
        Stack<Integer> secondStack = new Stack<>();

        QueueUsingStackRemove queue = new QueueUsingStackRemove(firstStack, secondStack);


        try{
            queue.add(1);
            queue.add(2);
            queue.add(3);
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

    public QueueUsingStackRemove(Stack<Integer> first, Stack<Integer> second) {
        this.first = first;
        this.second = second;
    }

    public void add(int value) throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        first.push(value);

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

    }

    public int remove() throws Exception {
        return first.pop();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    public int peek() throws Exception {
        return first.peek();
    }

}
