package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
	    // TODO Implement insertion sort
		  
		  for(int i=1; i < unsortedArray.length; i++){
			  int x = unsortedArray[i];
			  int j = i;
			  while((j > 0) && unsortedArray[j-1] > x){
				  unsortedArray[j] = unsortedArray[j-1];
				  j = j - 1;
			  }
			  unsortedArray[j] = x;
		  }

	    return unsortedArray;
	  }
  
	  private static int[] swap(int array[], int pos1, int pos2){
		  int temp = array[pos1];
		  array[pos1] = array[pos2];
		  array[pos2] = temp;
		  return array;
	  }
}
