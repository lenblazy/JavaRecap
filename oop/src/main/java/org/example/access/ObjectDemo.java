package org.example.access;

public class ObjectDemo {

    int num;
    String name;

    public ObjectDemo(int num, String name) {
        this.num = num;
        this.name = "Lennox";
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34, "Lennox");
        ObjectDemo obj2 = new ObjectDemo(12, "Brown");
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());


    }

}
