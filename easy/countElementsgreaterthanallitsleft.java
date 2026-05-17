import java.util.*;

class countElementsgreaterthanallitsleft {

    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 3, 5};

        int n = arr.length;

        int max = arr[0];

        int count = 1;

        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for (int i = 1; i < n; i++) {

            if (arr[i] > max) {

                count++;

                list.add(arr[i]);

                max = arr[i];
            }
        }

        System.out.println("Number of elements greater than all left elements : " + count);

        System.out.println("Elements are : " + list);
    }
}