package ua.training;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);

        list.remove(1);
        list.clear();
        list.removeRange(1, 6);
        list.removeAll(list);

        System.out.println(list.stream().sorted((p1, p2) -> p1.compareTo(p2)).count());


    }
}
