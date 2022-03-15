동전 최소 (그리디 알고리즘)

```
public class JavaSibal {

    public static void main(String[] args) {

        Scanner price = new Scanner(System.in);

        int [] array = {500,100,50,1};

        int [] count = {0,0,0,0};

        int arrayNum = 0;

        int returnNum = 0;

        int priceNum = price.nextInt();

        //

        int priceNumIn = priceNum;

        while (priceNum != 0){

            //현제 뺄려는 금액이 비교하려는 동전보다 작은지 판별 
            
            if( priceNum > array[arrayNum]){
               priceNum = priceNum - array[arrayNum];

            // 해당 동전의 뺄셈 횟수 더하기
               ++returnNum;

            }

            // 만약 0 원이라면 모든 횟수 정산 후 나옴 
            
            else if(priceNum == array[arrayNum] ){

                    priceNum = priceNum - array[arrayNum];

                    ++returnNum;

                    count[arrayNum] = returnNum;
                    returnNum = 0;
                    ++arrayNum;
            }
            
            // 만약 현제 뺄려는 금액이 비교하려는 동전보다 작은경우 다음 동전으로 넘어감
            
            else{
                    count[arrayNum] = returnNum;
                    returnNum = 0;
                    ++arrayNum;
            }

        }

        System.out.print("500 , 100 , 50 , 10 , 1 각각 순서대로 : ");

        for(int i = 0; i<4; i++){
           System.out.print(count[i] + " ");
        }

        System.out.println();
        ```
