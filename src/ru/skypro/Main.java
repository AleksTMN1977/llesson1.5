package ru.skypro;

public class Main {

    public static void main(String[] args) {
	task3();
    }

    public static void task1() {
        //задача1,2
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println();
        double[] arr1 = {1.57, 7.654, 9.986};
        for (int f = 0; f < arr1.length; f++) {
            if (f == arr1.length - 1) {
                System.out.print(arr1[f]);
            } else {
                System.out.print(arr1[f] + ", ");
            }
        }

        System.out.println();
        int[] arr2 = new int[5];
        arr2[0] = 5;
        arr2[1] = 7;
        arr2[2] = 9;
        arr2[3] = 11;
        arr2[4] = 13;
        for (int g = 0; g < arr2.length; g++) {
            if (g == arr2.length - 1) {
                System.out.print(arr2[g]);
            } else {
                System.out.print(arr2[g] + ", ");
            }

        }
    }


    public static void task2() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
                System.out.println();
            }
        }
        double[] arr1 = {1.57, 7.654, 9.986};
        for (int f = 2; f >= 0; f--) {
            if (f > 0) {
                System.out.print(arr1[f] + ", ");
            } else {
                System.out.print(arr1[f]);
                System.out.println();
            }
        }

        int[] arr2 = new int[5];
        arr2[0] = 5;
        arr2[1] = 7;
        arr2[2] = 9;
        arr2[3] = 11;
        arr2[4] = 13;
        for (int g = 4; g >= 0; g--) {
            if (g > 0) {
                System.out.print(arr2[g] + ", ");
            } else {
                System.out.print(arr2[g]);
                System.out.println();
            }
        }
    }

    public static void task3() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 != 0 && i != arr.length - 1) {
                arr[i] = arr[i] + 1;
                System.out.print(arr[i] + ", ");
            } else if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ", ");
            } else {
                arr[i] = arr[i] + 1;
                System.out.println(arr[i]);
            }
    }
}

