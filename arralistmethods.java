import java.util.ArrayList;

public class arralistmethods {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        arr.add(1);
        System.out.println(arr.get(0));
        System.out.println(arr.set(0, 4));
        System.out.println(arr.remove(0));
        System.out.println(arr.contains(1));
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        arr.add(0, 67);
        System.out.println(arr.toString());
        arr.clear();
        System.out.println(arr.add(77));
        System.out.println(arr.addAll(arr));
        System.out.println(arr.indexOf(77));
        System.out.println(arr.lastIndexOf(77));
        System.out.println(arr.subList(0, 1));
        System.out.println(arr.toString());
    }
}
