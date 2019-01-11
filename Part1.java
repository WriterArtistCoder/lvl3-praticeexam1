import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Part1 {

	public static void main(String args[]) {
		// #4
		HashMap<Integer, String> leagueStudents = new HashMap<Integer, String>();

		leagueStudents.put(1, "Rowan");
		leagueStudents.put(0, "Alex");
		leagueStudents.put(5, "Jeremiah");
		leagueStudents.put(2, "Noah");

		// #6
		ArrayList<String> toppings = new ArrayList<String>();

		toppings.add("bacon");
		toppings.add("bell peppers");
		toppings.add("Canadian bacon");
		/*
		 * toppings.add("cheese"); toppings.add("Turkey bacon");
		 * toppings.add("pepperoni"); toppings.add("Antarctic bacon");
		 */

		// #7: Recursion is when a function calls itself.

		// #9: The following code will output 1, then 2, then 3.
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i <= 2; i++) {
			System.out.println(nums[i]);
		}

		// #10
		Stack<String> locations = new Stack<String>();
		locations.add("San Marcos");
		locations.add("Margonsfield, California");
		locations.add("Oceanside");

		// #12
		/*
		 * Robot[] robots = new Robot[]; for (Robot r : robots) { for (int i = 0; i < 3;
		 * i++) { r.move(50); r.turn(60); } }
		 */
		
		// #14
		double[] cream = new double[] {0.0, 1.1, 2.2, 3.3};
		
		// #15
		// - Bubble Sort
		// - Heap Sort
		// - Quick Sort
		// - Merge Sort
		// - Insertion Sort I HAD TO LOOK THIS UP
		// - Selection Sort I HAD TO LOOK THIS UP
		
		// #16: An example of a subclass is:
		// public class Cheetah extends Animal {
		// Cheetah is the subclass and Animal is the superclass.
		
		// #18
		/**
		 * Searching Algorithm | Data Prerequisites
		 * Linear Algorithm | none
		 * Binary Algorithm | must be sorted
		 * Interpolation    | must be sorted, evenly spaced HAD TO LOOK THIS UP
		 * Exponential      | must be sorted HAD TO LOOK THIS UP
		 */
		
		// #19
		int[] nums2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int i = 0; i < nums2.length; i+=2) {
			if (i < nums2.length-1) {
				int x = nums2[i+1];
				nums2[i+1] = nums2[i];
				nums2[i] = x;
			}
		}
		
		for (int i = 0; i < nums2.length; i++) {
			System.out.println(nums2[i]);
		}
		
		/**
		 * #20
		 * DIFFERENCES BETWEEN ABSTRACT CLASSES AND INTERFACES:
		 * Interfaces only have abstract methods. LOOKED THIS ONE UP
		 * Instead of being extended must be implemented.
		 * SIMILARITIES IN ABSTRACT CLASSES AND INTERFACES:
		 * Both can hold abstract methods.
		 * Both cannot have instances.
		 */
	}

	// #13
	public static int[] sortInts(int[] nums) {
		boolean unsorted = true;
		while (unsorted) {
			for (int i = 0; i < nums.length; i++) {
				if (i > 0) {
					if (nums[i] < nums[i - 1]) {
						int x = nums[i - 1];
						nums[i - 1] = nums[i];
						nums[i] = x;
					}
				}
			}
			
			unsorted = false;
			for (int i = 0; i < nums.length; i++) {
				if (i > 0) {
					if (nums[i] < nums[i - 1]) {
						unsorted = true;
						break;
					}
				}
			}
		}
		
		return nums;
	}

	// #5
	public static boolean contains(char[] list, char c) {
		for (char c1 : list) {
			if (c1 == c) {
				return true;
			}
		}

		return false;
	}

}
