package com.Bridgelabz.functional;
import java.util.Scanner;
public class TwoDarray {
        public static void main(String args[]) {
            // initialize here.
            int M, N, i, j;
            int arr[][] = new int[10][10];
            Scanner scan = new Scanner(System.in);

            // enter row and column for array.
            System.out.print("Enter row for the array (max 10) : ");
            M = scan.nextInt();
            System.out.print("Enter column for the array (max 10) : ");
            N = scan.nextInt();

            // enter array elements.
            System.out.println("Enter " + (M * N) + " Array Elements : ");
            for (i = 0; i < M; i++) {
                for (j = 0; j < N; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            // the 2D array is here.
            System.out.print("The Array is :\n");
            for (i = 0; i < M; i++) {
                for (j = 0; j < N; j++) {
                    System.out.print(arr[i][j] + "  ");
                }
                System.out.println();
            }
        }
    }

