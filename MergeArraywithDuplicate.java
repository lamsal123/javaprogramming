package ArrayPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArraywithDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 4, 5, 6 };
		int[] mergedarray = new int[array1.length + array2.length];
		int pos = 0;
		for (int i = 0; i < array1.length; i++) {
			mergedarray[pos++] = array1[i];

		}
		int count = array1.length;
		for (int j = 0; j < array2.length; j++) {
			mergedarray[count] = array2[j];
			count++;

		}
		System.out.println(Arrays.toString(mergedarray));

		int[] arrayfilter = new int[mergedarray.length];
		int index = 0;

		for (int i = 0; i < mergedarray.length; i++) {
			boolean duplicate = true;
			for (int j = i + 1; j < mergedarray.length; j++) {
				if (mergedarray[i] != mergedarray[j]) {
					duplicate = false;

				} else {
					duplicate = true;
					break;
				}

			}
			if (i == mergedarray.length - 1) {
				duplicate = false;
			}

			if (duplicate == false) {
				arrayfilter[index++] = mergedarray[i];

			}

		}
		for (int j = 0; j < mergedarray.length; j++) {
			System.out.println(arrayfilter[j]);
		}
	}

}
