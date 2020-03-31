package assignment4;

/**
 * @author: Andressa Machado - 040923007 CST8110 - Introduction to Computer
 *          Programming. Section: 302 Professor: Anissa Shaddy. Assignment #4 -
 *          Arrays. This program is a dynamic array of strings that grows as
 *          needed. This class contains the method main and all the necessary
 *          tests for the class StringArray. last updated April 18th, 2018.
 */

public class Assign4 {

	public static void main(String[] args) {

		/*----------------------------
		* Test 1: default constructor
		----------------------------*/
		StringArray test1 = new StringArray();
		boolean test1Successful = true;
		if (!test1.isEmpty()) {
			System.out.println("Test 1a: default object is not empty");
			test1Successful = false;
		}
		if (test1.size() != 0) {
			System.out.println("Test 1b: default object size is not zero");
			test1Successful = false;
		}
		if (test1.capacity() != 10) {
			System.out.println("Test 1c: default object capacity is not ten");
			test1Successful = false;
		}
		if (test1Successful) {
			System.out.println("Test 1: Pass");
		}

		/*----------------------------
		* Test 2: initial constructor
		----------------------------*/

		StringArray test2 = new StringArray(3);
		boolean test2Successful = true;
		if (!test2.isEmpty()) {
			System.out.println("Test 2a: default object is not empty");
			test2Successful = false;
		}
		if (test2.size() != 0) {
			System.out.println("Test 2b: default object size is not zero");
			test2Successful = false;
		}
		if (test2.capacity() != 3) {
			System.out.println("Test 2c: default object capacity is not three");
			test2Successful = false;
		}
		if (test2Successful) {
			System.out.println("Test 2: Pass");
		}

		/*----------------------------
		* Test 3: copy constructor
		----------------------------*/

		StringArray test3Base = new StringArray(17);
		StringArray test3Copy = new StringArray(test3Base);

		boolean test3Successful = true;
		if (!test3Copy.isEmpty()) {
			System.out.println("Test 3a: test3Copy is not empty as the test3Base is ");
			test3Successful = false;
		}
		if (test3Copy.size() != 0) {
			System.out.println("Test 3b: test3Copy size is not zero as test3Base's is");
			test3Successful = false;
		}
		if (test3Copy.capacity() != test3Base.capacity()) {
			System.out.println("Test 3c: test3Copy's capacity is different than test3Base's");
			test3Successful = false;
		}
		if (test3Successful) {
			System.out.println("Test 3: Pass");
		}

		/*----------------------------
		* Test 4: add(String s)
		----------------------------*/

		StringArray test4 = new StringArray();
		test4.add("Andressa");

		boolean test4Successful = true;

		if (test4.isEmpty()) {
			System.out.println("Test 4a: default object is empty");
			test4Successful = false;
		}
		if (test4.size() != 1) {
			System.out.println("Test 4b: default object size is not one");
			test4Successful = false;
		}

		test4 = new StringArray(1);
		test4.add("andressa");
		test4.add("Omar");

		if (test4.capacity() != 2) {
			System.out.println("Test 4c: default object capacity is not two");
			test4Successful = false;
		}

		if (test4Successful) {
			System.out.println("Test 4: Pass");
		}

		/*----------------------------
		* Test 5: add(int index, String s)
		----------------------------*/

		StringArray test5 = new StringArray();
		test5.add(7, "Andressa");

		boolean test5Successful = true;

		if (test5.isEmpty()) {
			System.out.println("Test 5a: default object is empty");
			test5Successful = false;
		}
		if (test5.size() != 1) {
			System.out.println("Test 5b: default object size is not one");
			test4Successful = false;
		}

		if (!test5.get(7).equalsIgnoreCase("Andressa")) {
			System.out.println("Test 5c: The object at position 7 is not \"Andressa\".");
			test4Successful = false;
		}

		if (test5Successful) {
			System.out.println("Test 5: Pass");
		}

		/*----------------------------
		* Test 6: clear()
		----------------------------*/

		StringArray test6 = new StringArray();
		test6.add("Andressa");
		test6.add("Omar");

		test6.clear();

		boolean test6Successful = true;

		if (!test6.isEmpty()) {
			System.out.println("Test 6a: default object is empty");
			test6Successful = false;
		}
		if (test6.size() != 0) {
			System.out.println("Test 6b: default object size is not zero");
			test6Successful = false;
		}
		if (test6.capacity() != 10) {
			System.out.println("Test 6c: default object capacity is not ten");
			test6Successful = false;
		}
		if (test6Successful) {
			System.out.println("Test 6: Pass");
		}

		/*----------------------------
		* Test 7: contains(String s) and indexOf(String s)
		----------------------------*/

		StringArray test7 = new StringArray();
		test7.add("Andressa");

		test7.contains("Andressa");
		boolean doesContain = test7.contains("Andressa");
		boolean doesNotContain = test7.contains("Omar");

		boolean test7Successful = true;

		if (!doesContain) {
			System.out.println("Test 7a: The string is in the list");
			test7Successful = false;
		}
		if (doesNotContain) {
			System.out.println("Test 7b: The string is not in the list");
			test7Successful = false;
		}
		if (test7.indexOf("Andressa") != 0) {
			System.out.println("Test 7c: is in default object capacity is not zero");
			test7Successful = false;
		}

		if (test7.indexOf("Omar") != -1) {
			System.out.println("Test 7c: \"Omar\" is not on the list");
			test7Successful = false;
		}
		if (test7Successful) {
			System.out.println("Test 7: Pass");
		}

		/*----------------------------
		* Test 8: remove(int index) and remove(String s)
		----------------------------*/

		StringArray test8 = new StringArray();
		test8.add("Andressa");

		String arrayRemoved = test8.remove(0);
		boolean test8Successful = true;

		if (!arrayRemoved.equals("Andressa")) {
			System.out.println("Test 8a: \"Andressa\" shoulg have been removed");
			test8Successful = false;
		}
		if (test8.remove(-1) != null) {
			System.out.println("Test 8b: remove index <= -1 should be null");
			test8Successful = false;
		}
		if (test8.remove(11) != null) {
			System.out.println("Test 8c: remove index > capacity should be null");
			test8Successful = false;
		}

		test8.add("Andressa");

		if (!test8.remove("Andressa")) {
			System.out.println("Test 8d: \"Andressa\" should have been removed");
			test8Successful = false;
		}
		if (test8.remove("Omar")) {
			System.out.println("Test 8e: \"Omar\" should not have been removed. It is not on the list.");
			test8Successful = false;
		}
		if (test8Successful) {
			System.out.println("Test 8: Pass");
		}

		/*----------------------------
		* Test 9: get(int index) and set(int index, String s)
		----------------------------*/

		StringArray test9 = new StringArray();
		test9.add("Andressa");

		String arrayRetrieved = test9.get(0);
		boolean test9Successful = true;

		if (!arrayRetrieved.equals("Andressa")) {
			System.out.println("Test 9a: The string is in the list");
			test9Successful = false;
		}
		if (test9.get(-1) != null) {
			System.out.println("Test 9b: get -1 should be null");
			test9Successful = false;
		}
		if (test9.get(11) != null) {
			System.out.println("Test 9c: get more than capacity should be null");
			test9Successful = false;
		}

		test9.set(0, "Andressa");
		test9.set(3, "Omar");

		if (!test9.get(0).equals("Andressa")) {
			System.out.println("Test 9d: String should be equal");
			test9Successful = false;
		}
		if (test9.get(4) != null) {
			System.out.println("Test 9e: string should be null");
			test9Successful = false;
		}
		if (test9Successful) {
			System.out.println("Test 9: Pass");
		}

		/*----------------------------
		* Test 10: ensureCapacity(int minCapacity)
		----------------------------*/

		StringArray test10 = new StringArray();

		test10.ensureCapacity(2);

		boolean test10Successful = true;

		if (test10.capacity() != 10) {
			System.out.println("Test 10a: capacity should not have changed");
			test10Successful = false;
		}

		test10.ensureCapacity(13);

		if (test10.capacity() != 13) {
			System.out.println("Test 10b: capacity should have chcanged");
			test10Successful = false;
		}
		if (test10Successful) {
			System.out.println("Test 10: Pass");
		}

	}

}