# 프로그래머스 N번째수

```
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] arrayCopy = array;

        int i = 0;

        int j = 0;

        int k = 0;

        int ex = 0;

        //row 길이
        int[] answer = new int[commands.length];

        for (int m = 0; m < commands.length; m++) {
            
            i = commands[m][0];
            
            j = commands[m][1];
            
            k = commands[m][2];

            arrayCopy = Arrays.copyOfRange(arrayCopy, i - 1, j);

            Arrays.sort(arrayCopy);

            answer[m] = arrayCopy[k - 1];

            arrayCopy = array;
        }
        
        return answer;
}
}
```
