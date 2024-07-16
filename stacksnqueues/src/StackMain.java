public class StackMain {

    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(2);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.peek()); // Output: 2

    }

}
