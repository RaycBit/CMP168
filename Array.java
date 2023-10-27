import java.util.*;

public class Array {
		      
	public static int sum(int[] arr) {
		            return sum(arr, 0, arr.length - 1);
		      }
		      
		      public static int sum(int[] arr, int firstIndex, int lastIndex) {
		            if (firstIndex < 0 || firstIndex >= arr.length || lastIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex) {
		                  return -666;
		            }

		            if (firstIndex == lastIndex) {
		                  return arr[firstIndex];
		            }
		            return arr[firstIndex] + sum(arr, firstIndex + 1, lastIndex);
		      }

		      public static double average(int[] arr) {
		            return average(arr, 0, arr.length - 1);
		      }
		      
		      public static double average(int[] arr, int firstIndex, int lastIndex) {
		            if (firstIndex < 0 || firstIndex >= arr.length || lastIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex) {
		                  return -666;
		            }
		            
		            double sumTotal = sum(arr, firstIndex, lastIndex);
		            int count = lastIndex - firstIndex + 1;
		            double avg = (double) sumTotal / count;
		            return avg;
		      }
		      
		      public static int maxValue(int[] arr) {
		            return maxValue(arr, 0, arr.length - 1);
		      }
		      
		      public static int maxValue(int[] arr, int firstIndex, int lastIndex) {

		            if (firstIndex < 0 || firstIndex >= arr.length || lastIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex) {
		                  return -666;
		            }

		            if (firstIndex == lastIndex) {
		                  return arr[firstIndex];
		            }

		            int max = maxValue(arr, firstIndex + 1, lastIndex);

		            if (arr[firstIndex] > max) {
		                  return arr[firstIndex];
		            } 
		            else {
		                  return max;
		            }

		      }
		      public static int indexOfFirstMaxValue(int[] arr) {
		            return indexOfFirstMaxValue(arr, 0, arr.length - 1);
		      }
		      
		      public static int indexOfFirstMaxValue(int[] arr, int firstIndex, int lastIndex) {
		            if (firstIndex < 0 || firstIndex >= arr.length || lastIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex) {
		                  return -1;
		            }
		            
		            if (firstIndex == lastIndex) {
		                  return firstIndex;
		            }

		            int indexMax = indexOfFirstMaxValue(arr, firstIndex + 1, lastIndex);
		            if (arr[firstIndex] > arr[indexMax]) {
		                  return firstIndex;
		            }
		            else {

		                  return indexMax;

		            }

		      }

		      public static int numberOfBelowAverageElements(int[] arr) {
		            return numberOfBelowAverageElements(arr, 0, arr.length - 1);
		      }

		      public static int numberOfBelowAverageElements(int[] arr, int firstIndex, int lastIndex) {

		            if (firstIndex < 0 || firstIndex >= arr.length || lastIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex) {
		            	return -666;
		            }

		            double avg = average(arr, firstIndex, lastIndex);
		            int count = 0;
		            
		            for (int i = firstIndex; i <= lastIndex; i++) {
		                  if (arr[i] < avg) {
		                        count++;
		                  }
		            }
		            return count;
		      }

		      public static void rotateElements(int[] arr) {

		            rotateElements(arr, 1);

		      }

		      public static void rotateElements(int[] arr, int rotationCount) {

		            if (arr.length == 0) {
		                  return;
		            }

		            for (int i = 0; i < rotationCount; i++) {
		                  int last = arr[arr.length - 1];
		                  for (int j = arr.length - 1; j > 0; j--) {

		                        arr[j] = arr[j - 1];

		                  }

		                  arr[0] = last;
		            }
		      }
		      
		      public static void reverseArray(int[] arr) {

		            for (int i = 0; i <= arr.length / 2; i++) {

		                  int temp = arr[i];

		                  arr[i] = arr[arr.length - 1 - i];

		                  arr[arr.length - 1 - i] = temp;

		            }

		      }

		      public static void main(String[] args) {

		            int myArray[] = { 45, 22, 18, 89, 82, 79, 15, 69, 100, 55, 48, 72, 16,

		                        98, 57, 75, 44, 32, 21, 14, 7, 16, 49, 58, 72 };

		            System.out.println("myArray : " + Arrays.toString(myArray));

		            System.out.println("Sum of whole array = " + sum(myArray));

		            System.out.println("Sum of elements 12-18 = " + sum(myArray, 12, 18));

		            System.out.println("Average of whole array = " + average(myArray));

		            System.out.println("Average of elements 12-18 = " + average(myArray, 12, 18));

		            System.out.println("Max of whole array = " + maxValue(myArray));

		            System.out.println("Max of elements 12-18 = " + maxValue(myArray, 12, 18));

		            System.out.println("Index of first Max of whole array = "  + indexOfFirstMaxValue(myArray));

		            System.out.println("Index of first Max of elements 12-18 = " + indexOfFirstMaxValue(myArray, 12, 18));

		            System.out.println("Count of elements below average of whole array = " + numberOfBelowAverageElements(myArray));

		            System.out.println("Count of elements below average of elements 12-18 = " + numberOfBelowAverageElements(myArray, 12, 18));

		            rotateElements(myArray);

		            System.out.println("Rotating once myArray = " + Arrays.toString(myArray));

		            rotateElements(myArray, 5);

		            System.out.println("Rotating 5 more times myArray = " + Arrays.toString(myArray));

		            reverseArray(myArray);

		            System.out.println("Reversing array myArray = " + Arrays.toString(myArray));

		      }

	}
