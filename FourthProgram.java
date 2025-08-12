package Practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourthProgram {

    public static Map<Integer, Integer> countMultiples(List<Integer> inputList) {
        Map<Integer, Integer> multiplesMap = new HashMap<>();
        
       
        for (int i = 1; i <= 9; i++) {
            multiplesMap.put(i, 0);
        }

        
        for (Integer num : inputList) {
           
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multiplesMap.put(i, multiplesMap.get(i) + 1);
                }
            }
        }
        return multiplesMap;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        Map<Integer, Integer> output = countMultiples(inputList);
        System.out.println("Output: " + output);
        // Output: {1=11, 2=8, 3=4, 4=4, 5=3, 6=2, 7=0, 8=1, 9=1}
    }
}