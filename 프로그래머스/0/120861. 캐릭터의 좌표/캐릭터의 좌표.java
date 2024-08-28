class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // 캐릭터는 항상 [0,0]에서 시작한다.
        int[] answer = {0, 0};
        
        // board의 크기를 벗어난 방향키 입력은 무시된다.
        // 최대로 움직일 수 있는 x값, y값을 구한다.
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        // 키 입력을 순회한다. (up, down, left, right)
        for (String input : keyinput){
            switch(input) {
                case "up":
                    if (answer[1] < maxY){
                        answer[1]++;   
                    }
                    break;
                case "down":
                    if (answer[1] > -maxY){
                        answer[1]--;   
                    }
                    break;
                case "left":
                    if (answer[0] > -maxX){
                        answer[0]--;   
                    }
                    break;
                case "right":
                    if (answer[0] < maxX){
                        answer[0]++;   
                    }
                    break;
            }
        }
        
        return answer;
    }
}