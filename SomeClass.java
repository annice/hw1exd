public class SomeClass {
private ArrayList<String> events = new ArrayList<String>();
	public void thoughtForTheDay() {
	
			System.out.println("On the other hand, you have different fingers");
	}
		public void upcomingEvents() {
			System.out.println("Upcoming Events:");
			System.out.println("Dinner at Katie's on Friday");
	}
	public void createEvents() {
		events.add("We're going to a movie on Saturday");
		events.add("Study session on Sunday - Jim's house");
	}
	public void upcomingEvents() {
		System.out.println("Upcoming Events");
		for (String event : events)
			System.out.println(event);
	}


	public static void main(String[] args) {
		SomeClass sm = new SomeClass();
		sm.thoughtForTheDay();
		sc.createEvents();
		sm.upcomingEvents();
		
	}
}
