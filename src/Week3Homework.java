
public class Week3Homework {

	public static void main(String[] args) {
		
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 14};
		
		//Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		//(i.e. do not use ages[7] in your code)
		int result = ages[ages.length-1] - ages[0];
		
		//Print the result to the console.
		System.out.println(result); //This printed 90, as 93 - 3 is 90.
		
		//Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		//I went back to the array and added 14. The above code line now prints out 11, as 14 - 3 is 11.
		
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double averageAge = 0;
		for(int age : ages) {
			averageAge += age;
		}
		averageAge = averageAge / ages.length;
		System.out.println("Average age of the ages[] is: " + averageAge);
		
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		double averageNameLength = 0;
		for(String name : names) {
			averageNameLength += name.length();
		}
		averageNameLength = averageNameLength / names.length;
		System.out.println("The average length of the names in the names[] is: " + averageNameLength);
		
		//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, 
		//and print the result to the console.
		String combinedWords = "";
		for(int i = 0; i < names.length; i++) {
			combinedWords += names[i] + " ";
		}
		System.out.println(combinedWords);
		
		//How do you access the last element of any array?
		//arrayName[arrayName.length-1]; will always refer to the last element in an array.
		
		//How do you access the first element of any array?
		//arrayName[0]; will always refer to the first element in an array, because arrays start at 0.
		
		//Create a new array of int called nameLengths. 
		//Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int nameLengths[] = new int[6];
		for(int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		//	System.out.println(nameLengths[i]);  //this was just to check my work
		}
		
		
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
		//Print the result to the console.
		int sumOfNameLengths = 0;
		for(int name : nameLengths) {
			sumOfNameLengths += name;
		}
		System.out.println("The sum of the name lengths is: " + sumOfNameLengths);
		
		//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		//(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		System.out.println(wordTimes("Hello", 3));
		
		//Write a method that takes two Strings, firstName and lastName, and returns a full name 
		//(the full name should be the first and the last name as a String separated by a space).
		System.out.println(fullName("Andrew", "Farmer"));
		
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		int[] bigNumbers = {50, 85};
		System.out.println(oneHundred(bigNumbers));
		
		//Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] averageDouble = {150, 160, 179};
		System.out.println(averageThis(averageDouble));
		
		//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
		//greater than the average of the elements in the second array.
		double[] averageDouble2 = {137, 160, 179};
		System.out.println(isFirstBigger(averageDouble, averageDouble2));
		
		//Write a method called willBuyDrink that takes a boolean isHotOutside, 
		//and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println("Will you buy a drink? " + willBuyDrink(true, 20.0));
		
		//Create a method of your own that solves a problem. In comments, write what the method does and 
		//why you created it
		System.out.println(letterAverage(names));
		//I wrote this for niche scenario as to when that would be relevant.
		//Maybe it's good for Scrabble or something, I don't know.
		
	}
	
	//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	//(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	public static String wordTimes (String word, int n) {
		String holder = "";
		for(int i = 0; i < n; i++)
			holder += word;
		return holder;
	}
	
	//Write a method that takes two Strings, firstName and lastName, and returns a full name 
	//(the full name should be the first and the last name as a String separated by a space).
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean oneHundred(int[] array) {
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			total += array[i];
			if(total > 100)
				return true;
		}
		return false;
	}
	
	//Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double averageThis(double[] array) {
		double total = 0;
		for(double number : array) {
			total += number;
		}
		return total / array.length;
	}
	
	//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
	//greater than the average of the elements in the second array.
	public static boolean isFirstBigger(double[] a, double[] b) {
		if(averageThis(a) > averageThis(b))
			return true;
		return false;
	}
	
	//Write a method called willBuyDrink that takes a boolean isHotOutside, 
	//and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if(isHotOutside == true && moneyInPocket > 10.50)
			return true;
		return false;
	}
	
	//Create a method of your own that solves a problem. In comments, write what the method does and 
	//why you created it
	public static double letterAverage(String[] array) {
		double x = 0;
		for(String word : array) {
			x+= word.length();
		}
		return x / array.length; //This code takes an array of Strings and returns the average number of letters per word.
									//I wrote this for niche scenario as to when that would be relevant.
										//Maybe it's good for Scrabble or something, I don't know.
	}

}
