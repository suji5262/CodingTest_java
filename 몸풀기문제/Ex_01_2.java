import java.util.Arrays;

public class Ex_01_2 { // 원본배열을 그대로 수정한 코드
    public static void main(String[] args) {

        int[] org = {4, 2, 3, 1, 5};
        int[] sorted = solution(org);

        System.out.println(Arrays.toString(org)); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(sorted)); // [1, 2, 3, 4, 5]

    }

    private static int[] solution(int[] arr) {
        int[] clone = arr;
        Arrays.sort(clone);
        return clone;
    }
}
