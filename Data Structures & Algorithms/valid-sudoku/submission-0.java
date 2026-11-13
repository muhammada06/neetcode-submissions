class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap <Integer, HashSet<Character>> rowCheck=new HashMap<>();
        HashMap <Integer, HashSet<Character>> colCheck=new HashMap<>();
        HashMap <List<Integer>, HashSet<Character>> boxCheck=new HashMap<>();


        //Check All 
        for (int row=0;row<board.length;row++){
            for (int col=0;col<board[0].length;col++){
                if (board[row][col]!='.'){

                    //Row checking
                    if (rowCheck.containsKey(row)){
                        if (rowCheck.get(row).contains(board[row][col])){
                            return false;
                        }
                        else{
                            HashSet<Character> set =rowCheck.get(row);
                            set.add(board[row][col]);
                        }
                    }
                    else{
                        HashSet<Character> set = new HashSet<>();
                        set.add(board[row][col]);
                        rowCheck.put(row,set); 
                    }

                    //COL CHECKING
                    if (colCheck.containsKey(col)){
                        if (colCheck.get(col).contains(board[row][col])){
                            return false;
                        }
                        else{
                            HashSet<Character> set =colCheck.get(col);
                            set.add(board[row][col]);
                        }
                    }
                    else{
                        HashSet<Character> set = new HashSet<>();
                        set.add(board[row][col]);
                        colCheck.put(col,set); 
                    }

                    //3X3 Checking
                    int row_value=row/3;
                    int col_value=col/3;
                    List<Integer> fixedList = List.of(row_value,col_value);


                     if (boxCheck.containsKey(fixedList)){
                        if (boxCheck.get(fixedList).contains(board[row][col])){
                            return false;
                        }
                        else{
                            HashSet<Character> set =boxCheck.get(fixedList);
                            set.add(board[row][col]);
                        }
                    }
                    else{
                        HashSet<Character> set = new HashSet<>();
                        set.add(board[row][col]);
                        boxCheck.put(fixedList,set); 
                    }



                






                


                






                }
            }
        }



        return true;







        
    }
}
