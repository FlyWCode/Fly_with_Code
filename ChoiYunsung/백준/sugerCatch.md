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

        for (int i = 0; i < w; i++) {
            for (int j = 0; i < h; i++) {
                array[i][j] = 0;
            }
        }

        Scanner stick = new Scanner(System.in);

        int stickNum = stick.nextInt();

        Scanner stickLocation = new Scanner(System.in);

        for (int i = 0; i < stickNum; i++) {
            int stickSize = stickLocation.nextInt();
            int stickDirection = stickLocation.nextInt();
            int stickLocationW = stickLocation.nextInt();
            int stickLocationH = stickLocation.nextInt();

            if (stickDirection == 0) {
                array[stickLocationW - 1][stickLocationH - 1] = 1;
                for (int stickValue = 0; stickValue < stickSize - 1; stickValue++) {
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
