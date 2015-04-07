package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] array) {
	  for(int i=0; i < array.length; i++){
      for(int j=0; j < array.length - 1 ; j++){
        if(array[j] > array[j+1]){
          array = swap(array, j, j+1);
        }
      }
    }

    return array;
	}
	
	 private static int[] swap(int array[], int pos1, int pos2){
	    int temp = array[pos1];
	    array[pos1] = array[pos2];
	    array[pos2] = temp;
	    return array;
	  }
}
