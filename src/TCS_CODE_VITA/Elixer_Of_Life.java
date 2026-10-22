package TCS_CODE_VITA;

import java.util.*;

public class Elixer_Of_Life {
//    OOPS uh
    static Map<String, List<List<String>>> formulas = new HashMap<>();
    static Map<String, Integer> memo = new HashMap<>();

//    main method uh.....
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String haha = in.nextLine().trim();
            String[] parts = haha.split(" ");
            String chemical = parts[0];
            String[] compo = parts[1].split("\\+");

            formulas.putIfAbsent(chemical, new ArrayList<>());
            formulas.get(chemical).add(Arrays.asList(compo));
        }

        String targetPotion = in.nextLine().trim();

        int result = getLowOrbs(targetPotion);
        System.out.println(result);
    }

//    again OOPS

    static int getLowOrbs(String chemical) {
        // If  calculated already.....this goes
        if (memo.containsKey(chemical)) return memo.get(chemical);

        // If chemical not in formulas ==== it is a base ingredient i.e cost 0
        if (!formulas.containsKey(chemical)) {
            memo.put(chemical, 0);
            return 0;
        }

        int minCost = Integer.MAX_VALUE;
        for (List<String> compo : formulas.get(chemical)) {
            // orb cost for combining
            int cost = compo.size() - 1;
            boolean valid = true;

            for (String ing : compo) {
                int subCost = getLowOrbs(ing);
                if (subCost == Integer.MAX_VALUE) {
                    // unreachable ingredient
                    valid = false;
                    break;
                }
                cost += subCost;
            }

            if (valid) {
                minCost = Math.min(minCost, cost);
            }
        }

        memo.put(chemical, minCost);
        return minCost;
    }
}

