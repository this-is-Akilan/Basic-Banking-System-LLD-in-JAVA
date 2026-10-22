//Given unsorted array find all combination of the element for a given sum. Order should be maintained.
//Input :
//    8 3 4 7 9 N=7
//Output
//{3 4 } {7}

//Given a 2D grid of characters, you have to search for all the words in a dictionary by
//moving only along two directions, either right or down. Print the word if it occurs.
//
//Sample :
//    a   z  o   l
//    n   x  h   o
//    v   y   i  v
//    o   r   s  e
//Dictionary = {van, zoho, love, are, is}
//
//Output:
//    zoho
//    love
//    Is


package Oct2;
import java.util.*;
public class GridWords {
    public static void main(String[] args) {
        char[][] grid = { {'a' , 'z' , 'o' , 'l'} , {'n', 'x', 'h','o'} ,
                {'v' , 'y' ,'i' , 'v'} , {'o' , 'r' , 's' , 'e'} };

        String[] dictionary = {"van", "zoho", "love", "are", "is"};

        findingWords(grid , dictionary);
    }
    public static void findingWords(char[][] grid, String[] dictionary) {
        int len = grid.length;
        int wordLen = grid[0].length;

        for (String word : dictionary) {
            boolean found = false;

            for (int i = 0; i < len && !found; i++) {
                for (int j = 0; j < wordLen ; j++) {

                    if (grid[i][j] == word.charAt(0)) {
                        int a = 0;
                        int r = i, d = j;

                        while (a < word.length() && r < len && d < wordLen) {

                            if (grid[r][d] != word.charAt(a)){
                                break;
                            }

                            if (a == word.length() - 1) {
                                System.out.println(word);
                                found = true;
                                break;
                            }

                            if (d + 1 < wordLen && grid[r][d + 1] == word.charAt(a + 1)) {
                                d++;
                                a++;
                            }
                            else if (r + 1 < len && grid[r + 1][d] == word.charAt(a + 1)) {
                                r++;
                                a++;
                            }
                            else {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

}



