package Oct2;

public class Char_Matrix {
    public static void main(String[] args) {
        char[][] matrix = {
                {'P', 'W', 'K', 'C', 'T'},
                {'B', 'O', 'F', 'A', 'L'},
                {'O', 'O', 'E', 'R', 'M'},
                {'X', 'L', 'A', 'T', 'E'},
                {'A', 'C', 'O', 'T', 'N'}
        };

        String[] words = {"POET", "WOOL", "MOUSE", "CAMP", "ROAM" , "BOX"};

        charMatrix(matrix , words);
    }
    public static void charMatrix(char[][] matrix , String[] words){
        boolean found  = false;
        int row = matrix.length;
        int col = matrix[0].length;

        for(String word : words){
            for(int i = 0 ; i < row ; i++){
                for(int j = 0 ; j < col ; j++){
                    if( matrix[i][j] == word.charAt(0)  ){
                        int s = 0;
                        int r = i , d = j;
                        int l = i , u = j;
                        int dr = i , dl = j;
                        int ur = i , ul = j;

                        while(s < word.length() && r < row && d < col){
                            if(matrix[r][d] != word.charAt(s)) break;

                            if(s == word.length() -1 ){
                                System.out.println(word);
                                found = true;
                                break;
                            }
//                            this for down
                            if(d + 1 < word.length() && matrix[r][d+1] == word.charAt(s + 1)){
                                d++;
                                s++;
                            }

//                            this for right
                            else if(r + 1 < word.length() && matrix[r+1][d] == word.charAt(s + 1)){
                                r++;
                                s++;
                            }

//                            this for left
                            else if(l-1 >= 0 && l - 1 < word.length() && matrix[l-1][u] == word.charAt(s + 1)){
                                l--;
                                s++;
                            }

//                            this for up
                            else if( u-1 >=0 && u - 1 < word.length() && matrix[l][u-1] == word.charAt(s + 1)){
                                u--;
                                s++;
                            }

//                            this for down right
                            else if(r + 1 < word.length() && d + 1 < word.length() && matrix[r+1][d+1] == word.charAt(s + 1)){
                                d++;
                                r++;
                                s++;
                            }

//                            this for downleft
                            else if(l + 1 < word.length() && d + 1 < word.length() && matrix[l+1][d+1] == word.charAt(s + 1)){
                                d++;
                                l++;
                                s++;
                            }

//                            this for upright
                            else if( r-1 >=0 && r - 1 < word.length() && u-1 >= 0 && u - 1 < word.length() && matrix[r-1][u-1] == word.charAt(s + 1)){
                                r--;
                                u--;
                                s++;
                            }

//                            this for upleft
                            else if( l-1 >=0 && l - 1 < word.length() && u-1 >= 0 && u - 1 < word.length() && matrix[l-1][i-1] == word.charAt(s + 1)){
                                u--;
                                l--;
                                s++;
                            }

                            else{
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
