package dev.rockie;

public class Solution7 {

    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        System.out.println(solution.solution(new int[]{0, 9, 0, 2, 6, 8, 0, 8, 3, 0}));
    }

    public Solution7() {
    }

    public int solution(int[] T) {
        boolean isTicketUsed = false;

        int longestWay = 1;
        int indexOfNextStop = 0;

        for (int i = 1; i < T.length; i++) {
            // the new way
            if (T[i] == 0) {
                indexOfNextStop = i;
            }

            if ((i & 1) != 0) {
                isTicketUsed = true;
            }

            for (int j = i; i < T.length; i++) {
                if (isTicketUsed && (j & 1) == 0) {
                    break;
                }
                if (T[j] == indexOfNextStop) {
                    indexOfNextStop = j;
                    longestWay++;
                }
            }

        }

        return longestWay;
    }


}
