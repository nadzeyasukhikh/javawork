package Javalessons;

import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {

        int[] array = {5, 4, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {
            boolean checked = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    checked = true;
                }
                }
            if (!checked) break;
            System.out.println(Arrays.toString(array));
            }

        }
    }
