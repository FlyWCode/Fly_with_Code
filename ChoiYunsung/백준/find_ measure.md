# 약수구하기
 자바로 푸는 문제 
``` 
 
 class JavaIsLove {

    public static void main(String[] args) {
     
     Scanner num = new Scanner(System.in);

        int [] array = new int[100];

        int p = num.nextInt();
        int q = num.nextInt();

        for(int i = 1; i<= p ; i++){

            if(p % i == 0){
                array[i-1] = i;
            }
        }
        if(array.length > q)
        {
            for(int i = 0 ; i< p ; i++){

                if(i == q-1){
                    System.out.println(array[i]);
                }
            }
        }
        else System.out.println(0);
}

```
