import java.util.Arrays;

public class Ex_01_1 { // 원본 배열의 상태를 유지하면서 원본 배열로부터 새로운 배열을 복사
    public static void main(String[] args) {

        int[] org = {4, 2, 3, 1, 5};
        int[] sorted = solution(org);

        System.out.println(Arrays.toString(org)); // [4, 2, 3, 1, 5]
        System.out.println(Arrays.toString(sorted)); // [1, 2, 3, 4, 5]

    }

    private static int[] solution(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }
}
