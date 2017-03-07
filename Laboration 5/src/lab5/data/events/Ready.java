package lab5.data.events;

import lab5.data.Person;
import lab5.simulation.Event;

public class Ready implements Event {
	
	Person thisPerson;
	
	public Ready(Person p){
		
		thisPerson = p;
	}

	public int getTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Event nextEvent() {
		Event e = new Leave(thisPerson);
		thisPerson.setEvent(e);
		return e;
	}

}
