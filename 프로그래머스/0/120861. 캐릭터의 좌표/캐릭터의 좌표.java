class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // 캐릭터는 항상 [0,0]에서 시작한다.
        int[] answer = {0, 0};
        
        // board의 크기를 벗어난 방향키 입력은 무시된다.
        int boardWidth = board[0] / 2;
        int boardHeight = board[1] / 2;
        
        // 키 입력을 순회한다.
        int x = 0;
        int y = 0;
        for (String input : keyinput){
            x = answer[0];
            y = answer[1];
            switch(input) {
                case "up":
                    y++;
                    break;
                case "down":
                    y--;
                    break;
                case "left":
                    x--;
                    break;
                case "right":
                    x++;
                    break;
            }
            
            if (x >= -boardWidth && x <= boardWidth && y <= boardHeight && y >= -boardHeight) {
                answer[0] = x;
                answer[1] = y;
            }
        }
        
        return answer;
    }
}