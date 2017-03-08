package lab5.data.events;

import lab5.data.Person;
import lab5.simulation.Event;

public class Enter implements Event {

	Person thisPerson;

	public Enter(Person p){
		thisPerson = p;
	}

	
	public int getTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public Event nextEvent() {
		Event e = new Ready(thisPerson);
		thisPerson.setEvent(e);
		return e;
	}
	
	public Person getPerson(){
		
		return thisPerson;
	}
}
