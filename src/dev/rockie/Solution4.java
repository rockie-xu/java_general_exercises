package dev.rockie;

public class Solution4 {

    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        System.out.println(solution.solution(new int[]{2, 2, 2, 2, 2, 2, 3, 4, 4, 4, 6}));
    }

    public Solution4() {
    }


    int solution(int[] A) {
        int n = A.length;
        int[] L = new int[n + 1];
        L[0] = -1;
        for (int i = 0; i < n; i++) {
            L[i + 1] = A[i];
        }
        int count = 0;
        int pos = (n + 1) / 2;
        int candidate = L[pos];
        for (int i = 1; i <= n; i++) {
            if (L[i] == candidate)
                count = count + 1;
        }
//        if (count > pos)
        if (2 * count > n)
            return candidate;
        return (-1);
    }

}
