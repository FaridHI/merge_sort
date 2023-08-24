/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.merge_sort;
import java.util.Scanner;

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
            arr[k] = leftArray[i];
            i++;
            k++;
        }
<<<<<<< HEAD
    
=======

        
>>>>>>> refs/remotes/origin/main
        while (j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
<<<<<<< HEAD

=======
        
    }
    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int middle = left + (right - left) / 2;
        
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            
            merge(arr, left, middle, right);
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de digitos: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Ingrese " + n + " digito: ");
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        System.out.println("Conjunto original: " + Arrays.toString(arr));
        
        mergeSort(arr, 0, arr.length - 1);
        
        System.out.println("Conjunto ordenado. " + Arrays.toString(arr));
>>>>>>> refs/remotes/origin/main
    }
    public static void mergeSort(int[] arr, int left, int right ) {
        if (left < right){
            int middle = left + (right - left) / 2;
         
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right); 
        
            merge(arr, left, middle, right);
     }
    }
 }

