package day03;

public class Ex07_Array07 {
    public static void main(String[] args) {
        // 2차원 배열
        int[][] arr1;
        int arr2[][];
        int[] arr3[];

        arr1 = new int[3][2];

        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[1][0] = 30;
        arr1[1][1] = 40;
        arr1[2][0] = 50;
        arr1[2][1] = 60;

        System.out.println(arr1[0][0]);
        System.out.println(arr1[2][1]);
    }
}
