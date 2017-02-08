
public class SortingTest {

	public static void main(String[] args) 
	{
		int[] input = {6,5,2,1,8,7,4,3};
		SortingUtils.doInsertionSort(input);
		
		System.out.print("Sorted array: ");
		for(int i : input){
			System.out.print(i + " ");
		}
	}
}
