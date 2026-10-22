package TCS_CODE_VITA;

import java.util.*;

import java.util.*;

public class ActivityDay {
//    OOPS uh
    static class Box {
        int x1, y1, x2, y2;
        int area;
        String str;
        Box(int x1, int y1, int x2, int y2) {
            this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
            this.area = (x2 - x1) * (y2 - y1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int L = sc.nextInt();

        List<int[]> lines = new ArrayList<>();
        for (int i = 0; i < L; i++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
            lines.add(new int[]{x1, y1, x2, y2});
        }

        int R = sc.nextInt();
        sc.nextLine();
        String[] strings = sc.nextLine().trim().split("\\s+");

        // collect the unique x and y coordinates from partition lines and borders....
        TreeSet<Integer> xSet = new TreeSet<>(Arrays.asList(0, N));
        TreeSet<Integer> ySet = new TreeSet<>(Arrays.asList(0, M));

        for (int[] l : lines) {
            // vertical
            if (l[0] == l[2]) xSet.add(l[0]);
            // horizontal
            if (l[1] == l[3]) ySet.add(l[1]);
        }
//new llists for x nd y coordinates
        List<Integer> xs = new ArrayList<>(xSet);
        List<Integer> ys = new ArrayList<>(ySet);

        List<Box> boxes = new ArrayList<>();
        for (int j = 0; j < ys.size() - 1; j++) {
            for (int i = 0; i < xs.size() - 1; i++) {
                boxes.add(new Box(xs.get(i), ys.get(j), xs.get(i + 1), ys.get(j + 1)));
            }
        }

        // assign strings in left to right, bottom to top order
//        lambda function
        boxes.sort((a, b) -> {
            if (a.y1 != b.y1) return Integer.compare(a.y1, b.y1);
            return Integer.compare(a.x1, b.x1);
        });
        for (int i = 0; i < boxes.size() && i < strings.length; i++) {
            boxes.get(i).str = strings[i];
        }

        // ranking boxesss...........
        boxes.sort((a, b) -> {
            if (a.area != b.area) return Integer.compare(b.area, a.area);
            if (a.x1 != b.x1) return Integer.compare(a.x1, b.x1);
            return Integer.compare(a.y1, b.y1);
        });

        Box raghu = boxes.get(R - 1);
        int asciiSum = 0;
        for (char c : raghu.str.toCharArray()) asciiSum += c;
        System.out.println(asciiSum);
    }
}


