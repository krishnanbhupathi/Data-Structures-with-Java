package sprint1;

import java.util.ArrayList;

public class PascalsTriangle {

    public static ArrayList<ArrayList<Integer>>  generate(int number){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if(number == 0)
            return result;
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if(number == 1)
            return result;
        for(int i = 1; i < number; i++){
            ArrayList<Integer> prevRow = result.get(i-1);
            ArrayList<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for(int j = 0; j < i-1; j++){
                int val = prevRow.get(j) + prevRow.get(j+1);
                currentRow.add(val);
            }
            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> result  = generate(n);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
