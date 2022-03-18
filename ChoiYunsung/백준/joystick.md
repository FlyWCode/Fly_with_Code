# 조이스틱 문제
```
class Solution {
    public int solution(String name) {
        
            int answer = 0;

            int order = 0;

            int ascending = 0;

            int descending = 0;

            StringBuilder matchName = new StringBuilder();

            // 초기 이름 설정
            for(int i = 0; i< name.length(); i++) matchName.append("A");

            while (!matchName.equals(name)){

                // 만약 현재 이름의 알파벳과 초기 이름의 알파벳이 다르다면?
               if(matchName.charAt(order) != name.charAt(order)){

                   // 현재 이름의 알파벳과 초기 이름의 알파벳의 거리 구하기

                    ascending = Math.abs((int)'A' - (int) name.charAt(order));

                    descending = Math.abs((int)name.charAt(order) - (int)'Z') + 1;

                    answer += Math.min(ascending,descending);

               }

                   answer++;

               order++;

               if(order == name.length()){
                   break;
               }

            }

        for(int j = 1 ; j < name.length()-1; j++)
        {
            if(name.charAt(j) == 'A'){
               answer -= 1;
            }
        }

            answer-=1;
        
        return answer;  
    }
}
```
