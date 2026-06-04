class SignalStrength {
    public static void main(String[] args) {

        int[] A = { 4, 2, 7, 3, 5 };
        int N = A.length;

        int[] ans = new int[N];

        for (int i = 0; i < N; i++) {

            int left = (i - 1 + N) % N;
            int right = (i + 1) % N;

            if (A[left] > A[i])
                ans[i]++;

            if (A[right] > A[i])
                ans[i]++;
        }

        for (int x : ans)
            System.out.print(x + " ");
    }
}