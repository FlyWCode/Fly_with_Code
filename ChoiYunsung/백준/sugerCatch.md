# 설탕뽑기

in java

```
public class JavaSibal {

    public static void main(String[] args) {

        Scanner hAndw = new Scanner(System.in);
//        Scanner h = new Scanner(System.in);

        int h = hAndw.nextInt();
        int w = hAndw.nextInt();

        int[][] array = new int[w][h];

        //모든 배열을 0 으로 초기화 
        
        for (int i = 0; i < w; i++) {
            for (int j = 0; i < h; i++) {
                array[i][j] = 0;
            }
        }
        
        Scanner stick = new Scanner(System.in);

        int stickNum = stick.nextInt();

        Scanner stickLocation = new Scanner(System.in);

        //막대의 갯수만큼 돈다.
        
        for (int i = 0; i < stickNum; i++) {
        
            // 막대의 자세한 길이, (가로 세로) 좌표를 받아온다.
                
            int stickSize = stickLocation.nextInt();
            int stickDirection = stickLocation.nextInt();
            int stickLocationW = stickLocation.nextInt();
            int stickLocationH = stickLocation.nextInt();

            // 막대의 방향이 가로인지 세로인지 
            
            if (stickDirection == 0) {
                array[stickLocationW - 1][stickLocationH - 1] = 1;
                for (int stickValue = 0; stickValue < stickSize - 1; stickValue++) {
                
                // 만약 막대의 방향이 가로라면 x축으로 막대의 길이만큼 이동
                    array[(stickLocationW - 1) + (stickValue + 1)][stickLocationH - 1] = 1;
                }
            } else {
                array[stickLocationW - 1][stickLocationH - 1] = 1;
                for (int stickValue = 0; stickValue < stickSize - 1; stickValue++) {
                    // 2, 3 > 1,2  1,3  1,4
                    array[(stickLocationW - 1)][(stickLocationH - 1) + (stickValue + 1)] = 1;
                }
            }

        }

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}

```
