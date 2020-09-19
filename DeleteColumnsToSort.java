import java.util.*;

public class DeleteColumnsToSort {
	public List<Integer> minDeletionSize(String[] a) {
		// create array list for columns
		List<Integer> col = new ArrayList<Integer>();
		// setting variables
		int i;

		// loop goes through each string in the list
		for (i = 0; i < a.length - 1; i++) {
			// tests to see if they have different lengths,
			// if so, add -1 to the list
			if (a[i].length() < a[i + 1].length()) {
				col.add(-1);
			}
		}

		// loop goes through characters in columns
		for (i = 0; i < a[0].length(); i++) {
			// loop goes through the columns of the array
			for (int j = 0; j < a.length - 1; j++) {
				// if length of string in col is equal to length
				// of string in the column next to it
				// then add it to the list that needs to be deleted
				// and break from loop
				if (a[j].length() == a[j + 1].length()){
					if (a[j].charAt(i) > a[j + 1].charAt(i)) {
						col.add(i);
						break;
					}
				}
			}
		}
		// returns the array list col
		return col;
	}

	public static void main(String[] args) {
		// creating object
		DeleteColumnsToSort c = new DeleteColumnsToSort();

		// creating array of string
		String [] w = {"cba","daf","ghi"};
		// prints array
        System.out.println(Arrays.toString(w));
        //prints columns to be deleted
        System.out.println("Columns to delete: " + c.minDeletionSize(w));
		System.out.println();

        // same process above, just different instances
        String[] x = {"a","b"};
        System.out.println(Arrays.toString(x));
        System.out.println("Columns to delete: " + c.minDeletionSize(x));
        System.out.println();

        String[] y = {"zyx","wvu","tsr"};
        System.out.println(Arrays.toString(y));
        System.out.println("Columns to delete: " + c.minDeletionSize(y));
        System.out.println();

        String[] z = {"Captain","Marvel","saved", "the", "Avengers"};
        System.out.println(Arrays.toString(z));
        System.out.println("Columns to delete: " + c.minDeletionSize(z));
        System.out.println();
	}
}