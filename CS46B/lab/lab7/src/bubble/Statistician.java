package bubble;

import java.util.*;
//java -ea Statistician ;

public class Statistician 
{
	private final static int N_REPETITIONS = 1000;
	
	
	//returns a array of random integers with values between -maxValue and maxValue
	private static int[] buildRandom(int length, int maxValue)
	{
		int[] array = new int[length];
		for (int i=0; i<length; i++)
			array[i] = (int)(Math.random()*(maxValue + 1));
		return array;
	}
	
	private static boolean isSorted(int[] a) {
		for(int i=0;i<a.length - 	1;i++) {
			if(a[i]>a[i+1]) {return false;}
		}
		return true;
	}

	private static void printMinAverageMax(String label, ArrayList<Long> counts)
	{
		long min = Collections.min(counts);
		long max = Collections.max(counts);
		long total = 0;
		for (long count : counts)
			total += count;

		double average = (double) total / counts.size();
		System.out.println(label + " - min: " + min + ", average: " + average + ", max: " + max);
	}
	
	private static void getStats(int arrayLength)
	{
		ArrayList<Long> visitCounts = new ArrayList<>();
		ArrayList<Long> swapCounts = new ArrayList<>();
		
		for (int i=0; i<N_REPETITIONS; i++)
		{
			int[] array = buildRandom(arrayLength, arrayLength*100);
			BubbleSorter sorter = new BubbleSorter(array);
			sorter.sort();	
			assert isSorted(sorter.getArray());
			visitCounts.add(sorter.getNVisits());
			swapCounts.add(sorter.getNSwaps());
		}

		printMinAverageMax("Visits", visitCounts);
		printMinAverageMax("Swaps", swapCounts);
	}

	
	public static void main(String[] args)
	{
		int[] tiny = {1, 24, 5, 10};
		int[] alreadySorted = {1, 2, 3, 4};
		int[] backward = {4, 3, 2, 1};
		System.out.println("Tiny");
		BubbleSorter tinySorted = new BubbleSorter(tiny);
		tinySorted.sort();
		System.out.println(tinySorted);
		
		System.out.println("Already Sorted");
		BubbleSorter alreadySortedSorter = new BubbleSorter(alreadySorted);
		alreadySortedSorter.sort();
		System.out.println(alreadySortedSorter);
		
		System.out.println("Backward");
		BubbleSorter backwardSorted = new BubbleSorter(backward);
		backwardSorted.sort();
		System.out.println(backwardSorted);

        System.out.println("1000:");
        getStats(1000);
        
		System.out.println("3000:");
		getStats(3000);
		
	}
}
