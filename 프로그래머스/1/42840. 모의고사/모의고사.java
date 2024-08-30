class Solution {
    public int[] solution(int[] answers) {
        
        // 1번 수포자가 찍는 방식 (1,2,3,4,5 반복)
        int[] arr1 = {1,2,3,4,5};
        // 2번 수포자가 찍는 방식 (2, 1, 2, 3, 2, 4, 2, 5 반복)
        int[] arr2 = {2,1,2,3,2,4,2,5};
        // 3번 수포자가 찍는 방식 (3, 3, 1, 1, 2, 2, 4, 4, 5, 5 반복)
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
            
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for (int i = 0; i < answers.length; i++){
            if(answers[i] == arr1[i % arr1.length]){
                count1++;
            }
            if (answers[i] == arr2[i % arr2.length]){
                count2++;
            }
            if (answers[i] == arr3[i % arr3.length]){
                count3++;
            }
        }
        
        int[] answer;
        if (count1 == count2 && count2 == count3){
            answer = new int[]{1, 2, 3};
        } else if ((count1 == count2 && count1 > count3) || (count1 == count3 && count1 > count2) || (count2 == count3 && count2 > count1)){
            if (count1 == count2 && count1 > count3){
                answer = new int[]{1, 2};
            } else if (count1 == count3 && count1 > count2){
                answer = new int[]{1, 3};
            } else {
                answer = new int[]{2, 3};
            }
        } else {
            if (count1 > count2 && count1 > count3){
                answer = new int[]{1};
            } else if (count2 > count3) {
                answer = new int[]{2};
            } else {
                answer = new int[]{3};
            }
        }

        return answer;
    }
}