import java.util.ArrayList;

public class Assignment9_2 {
	public static void main(String[] args) {
		// Declare an ArrayList of String
		ArrayList<String> DayList = new ArrayList<>();
		
		DayList.add("Sunday");
		DayList.add("Monday");
		DayList.add("Tuesday");
		DayList.add("Wednesday");
		DayList.add("Thursday");
		DayList.add("Friday");
		DayList.add("Tuesday");
		DayList.add("Wednesday");
		DayList.add("Saturday");
		DayList.add("Monday");

		// Create new ArrayList
		ArrayList<String> newDayList = new ArrayList<>();

		// Execute the for loop for every element of the ArrayList DayList -
		// Store the element in the variable name
		for (String name : DayList) {
			// if the name is not present in the newDayList ArryList then add
			// the value to it- Thus duplicate values are avoided.
			if (!newDayList.contains(name)) {
				newDayList.add(name);
			}
		}

		for (String name : newDayList) {
			System.out.println("Day Name - " + name);
		}
	}
}