import java.util.*;

public class Quiz1 {
//雙向queue的應用
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> counts = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            int count = counts.getOrDefault(num, 0);
            counts.put(num, ++count);
            if (i >= m - 1) {
                if (counts.size() > max) max = counts.size();
                Integer removed = deque.removeFirst();
                int removing = counts.get(removed);
                removing--;
                if (removing == 0) {
                    counts.remove(removed);
                } else {
                    counts.put(removed, removing);
                }
            }
        }
        System.out.println(max);
    }

}

