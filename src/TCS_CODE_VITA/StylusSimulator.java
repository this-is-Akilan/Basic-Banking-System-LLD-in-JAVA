package TCS_CODE_VITA;

import java.io.*;
import java.util.*;

public class StylusSimulator {
    static class Rect {
        int x, y, w, h; // top-left (x,y), width, height
        int left, right, top, bottom; // derived
        Rect(int x, int y, int w, int h) {
            this.x = x; this.y = y; this.w = w; this.h = h;
            recompute();
        }
        void recompute() {
            left = x;
            right = x + w;
            top = y;
            bottom = y - h;
        }
    }

    static int M, N; // M = height, N = width (as per problem wording)
    static List<Rect> rects = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); // height
        N = Integer.parseInt(st.nextToken()); // width

        int C = Integer.parseInt(br.readLine().trim());
        List<String> invalid = new ArrayList<>();

        for (int i = 0; i < C; i++) {
            String line = br.readLine();
            if (line == null) line = "";
            String s = line.trim();
            if (s.isEmpty()) { invalid.add(line); continue; }
            String[] p = s.split("\\s+");
            String cmd = p[0];
            int x = Integer.parseInt(p[1]);
            int y = Integer.parseInt(p[2]);
            int w = Integer.parseInt(p[3]);
            int h = Integer.parseInt(p[4]);

            boolean ok;
            switch (cmd) {
                case "draw":   ok = cmdDraw(x,y,w,h); break;
                case "remove": ok = cmdRemove(x,y,w,h); break;
                case "extend": ok = cmdExtend(x,y,w,h); break;
                case "shrink": ok = cmdShrink(x,y,w,h); break;
                default: ok = false;
            }
            if (!ok) invalid.add(s);
        }

        // print invalid commands (in order) then number of rectangles left
        for (String iv : invalid) System.out.println(iv);
        System.out.println(rects.size());
    }

    static boolean inBounds(Rect r) {
        // left >=0, right <= width N, bottom >=0, top <= height M
        if (r.w <= 0 || r.h <= 0) return false;
        if (r.left < 0 || r.right > N) return false;
        if (r.bottom < 0 || r.top > M) return false;
        return true;
    }

    // returns true if a and b overlap or touch (touching edges/corners counts as invalid)
    static boolean overlapOrTouch(Rect a, Rect b) {
        boolean separated = (a.right < b.left) || (b.right < a.left) || (a.top < b.bottom) || (b.top < a.bottom);
        return !separated;
    }

    static boolean cmdDraw(int x, int y, int w, int h) {
        Rect r = new Rect(x,y,w,h);
        if (!inBounds(r)) return false;
        for (Rect o : rects) if (overlapOrTouch(r, o)) return false;
        rects.add(r);
        return true;
    }

    static boolean cmdRemove(int x, int y, int w, int h) {
        for (int i = 0; i < rects.size(); i++) {
            Rect r = rects.get(i);
            if (r.x == x && r.y == y && r.w == w && r.h == h) {
                rects.remove(i);
                return true;
            }
        }
        return false;
    }

    static boolean cmdExtend(int x, int y, int w, int h) {
        for (Rect r : rects) {
            if (r.x == x && r.y == y) {
                if (r.w == w && r.h == h) return true;       // same size is valid
                if (r.w > w || r.h > h) return false;        // already larger -> invalid
                Rect nr = new Rect(x,y,w,h);
                if (!inBounds(nr)) return false;
                for (Rect o : rects) {
                    if (o == r) continue;
                    if (overlapOrTouch(nr, o)) return false;
                }
                // apply
                r.w = w; r.h = h; r.recompute();
                return true;
            }
        }
        return false; // rectangle doesn't exist
    }

    static boolean cmdShrink(int x, int y, int w, int h) {
        for (Rect r : rects) {
            if (r.x == x && r.y == y) {
                if (r.w == w && r.h == h) return true;      // same size ok
                if (r.w < w || r.h < h) return false;        // already smaller -> invalid
                r.w = w; r.h = h; r.recompute();
                return true;
            }
        }
        return false; // not found
    }
}

