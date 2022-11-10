package homeWorkDay12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MininumGap {
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<Integer>(Arrays.asList(7,1,3,4,1,7));
		int result = minimumGap(array);
		System.out.println("the mininum gap: " + result);
	}

	public static int minimumGap(List<Integer> arr) {
		int size = Collections.max(arr);
		List<Integer> pairs = new ArrayList<Integer>(Arrays.asList(new Integer[size+1]));

		
		int currIndex = 0;
		int prevIndex = 0;
		int minGap = -1;

		for (int i = 0; i < arr.size(); i++) {
			if (pairs.contains(arr.get(i))) {
				currIndex = i;
				prevIndex = pairs.get(arr.get(i));
				minGap = (currIndex-prevIndex) ;
			}
			pairs.set(arr.get(i), i);
		}
		return minGap ;
	}
}
