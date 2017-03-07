package lab5.data.events;

import lab5.data.Person;
import lab5.simulation.Event;

public class Enter extends Event {

	Person thisPerson;

	public Enter(Person p){
		thisPerson = p;
		notifyObservers();
	}
}
