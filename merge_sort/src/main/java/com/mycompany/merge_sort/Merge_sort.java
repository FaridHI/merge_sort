/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.merge_sort;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Alumno
 */
public class Merge_sort {

    public static void merge(int[] arr, int left, int middle, int right ) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        for (int i = 0; i < n1; i++){
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++){
            rightArray[j] = arr[middle + 1 + j];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2){
            if (leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = leftArray[j];
            j++;
            k++;
        }
    
        while (j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
 }

