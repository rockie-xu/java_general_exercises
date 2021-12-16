package dev.rockie;

public class Solution6 {

    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        System.out.println(solution.solution(new int[]{2, -2, -3, 3}, new int[]{0, 0, 4, -4}));
//        System.out.println(solution.solution(new int[] {7,1,2,8,2}));
    }

    public Solution6() {
    }

    public int solution(int[] A, int[] B) {

        int arrayLength = A.length;
        int fairNumber = 0;

        for (int i = 0; i < arrayLength; i++) {
            int sumLeftA = 0;
            int sumRightA = 0;

            int sumLeftB = 0;
            int sumRightB = 0;

            for (int aLeft = 0; aLeft < i; aLeft++) {
                sumLeftA += A[aLeft];
            }

            for (int aRight = i; aRight < arrayLength; aRight++) {
                sumRightA += A[aRight];
            }

            for (int bLeft = 0; bLeft < i; bLeft++) {
                sumLeftB += B[bLeft];
            }

            for (int bRight = i; bRight < arrayLength; bRight++) {
                sumRightB += B[bRight];
            }

            if ((sumLeftB == sumRightB) && (sumLeftA == sumLeftB) &&
                    (sumRightA == sumRightB) && i != 0) {
                fairNumber++;
                System.out.println("hoho: " + i);
            }

        }

        return fairNumber;
    }


}
