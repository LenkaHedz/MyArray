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
        
        Map<Integer, Integer> ress = new TreeMap<>();
        for (Integer i: list) {
                if(!ress.containsKey(i)){
                        ress.put(i, 1);
                } else {
                        ress.replace(i, ress.get(i).intValue()+1);
                }
        }

        for (Map.Entry entry: ress.entrySet()) {
                System.out.print(entry.getKey());
                System.out.print(" - ");
                System.out.println(entry.getValue());
        }


    }
}
