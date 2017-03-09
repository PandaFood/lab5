package lab5.data;

import lab5.simulation.Event;
import lab5.simulation.Simulator;
import lab5.data.Queue;
import lab5.data.events.Enter;
import lab5.data.events.Leave;
import lab5.data.events.Ready;
import lab5.data.Person;


public class Hairsalon {
	Simulator sim;
	Queue queue;
	Person p, p1, p2;
	Enter currentEvent;
	
	private final int CLOSINGTIME = 1000;
	private final int RESPAWNTIME = 10;
	private int time;
	private final int WORKCHAIRS = 3;
	private Person[] chairs;
	
	public Hairsalon(){
		queue = new Queue();
		sim = new Simulator();
		chairs = new Person[WORKCHAIRS];
		
		p = new Person();
		p1 = new Person();
		p2 = new Person();
		time = 0;
	}
	
	public void start(){
		
		while(!sim.returnQueue().getList().isEmpty()){
			//Close if the time is exceeded
			if(time >= CLOSINGTIME)
				sim.setDone();
			
			//Get the first event
				
			Event e = sim.getEvent();
			if(e.getClass() == Enter.class){
				
				//Sätt en person i en arbetsstol
				putInChair((Enter)e);	
				sim.addEvent(e.nextEvent());
				
				
			}
			else if(e.getClass() == Ready.class){
				
				
				//Klippa hår
				//TYP
				
				
				
			}
			else if(e.getClass() == Leave.class)
					e = (Leave)e;
			else
				//IF this happens, something has gone wrong
				return;
			
				
					
			
			
			// TODO Gå vidare i eventkön
			
			
			// TODO Lägg till statistik
				
			
			
		}
		
	}
	
	
	
	
	
	
	private void putInChair(Enter e) {
		for(int i = 0; i < chairs.length; i++){
			if(chairs[i] == null){
				chairs[i] = e.getPerson();
				return;
			}
		}
		if(queue.addPerson(e.getPerson())){}
		else if(!e.getPerson().isHappy()){
			// Takes a walk through adding the event to the bottom of the event queue.
			sim.addEvent(e);
			
		}
	}

	public void addPersonToQueue(Person person){
		sim.addEvent(person.getEvent());
		
	}
	
	public void getFirstEvent(){
		currentEvent = (Enter)sim.getEvent();
		
	}
	
	
	
	
	
}
