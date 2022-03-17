# 쉬운 최소 합 구하기 시간정해놓고 풀기

15분

```
     Scanner num = new Scanner(System.in);

             int sum = num.nextInt();

             int numSum = 0;

             int answer = 0;

            for(int i =1 ;i < sum ; i++){
                numSum +=i;
                if(sum>numSum){
                    answer = i;
                }
            }

         System.out.println(answer);
 ```
