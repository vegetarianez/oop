package L7;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(3);
        list.add(4);
        list.add(7);

        list.print();

        list.delete();
        list.print();

        list.delete(3);
        list.print();
    }

}
