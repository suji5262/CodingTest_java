import java.util.Arrays;

public class Ex_01 { // 배열 정렬하기
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{1, -5, 2, 4, 3})));
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 1,3, 2, 5, 4})));
        System.out.println(Arrays.toString(solution(new int[]{6, 1, 7})));

    }

    private static int[] solution(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(arr);
        return arr;
    }
}
