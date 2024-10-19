package accessspecifier;

public class EnumSwitch {
	//an enum is a type that have a fixed set of constant values
	enum Day{
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY
	}

	public static void main(String[] args) {
		Day today=Day.MONDAY;
		switch(today) {
		case SUNDAY:
			System.out.println("Today is sunday");
			break;
		case MONDAY:
			System.out.println("Today is monday");
		    break;
		case TUESDAY:
			System.out.println("Today is tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Today is wednesday");
			break;
		case THURSDAY:
			System.out.println("Today is thursday");
			break;
		case FRIDAY:
			System.out.println("Today is friday");
			break;
		case SATURDAY:
			System.out.println("Today is saturday");
			break;
		}
		System.out.println("***********");
		//loop through the enum values
		for(Day day : Day.values()) {
			System.out.println("======="+day);
		}
		//for(Color c:Color.values()) {
			//System.out.println(Color.BLACK);
		}

}
