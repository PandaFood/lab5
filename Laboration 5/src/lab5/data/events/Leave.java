package lab5.data.events;

import lab5.data.Person;
import lab5.simulation.Event;

public class Leave implements Event{
	
	Person thisPerson;
	
	public Leave(Person p){
		thisPerson = p;
	}

	@Override
	public int getTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Event nextEvent() {
		return null;
	}

}
