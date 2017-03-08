package lab5.data;

import lab5.simulation.Simulator;
import lab5.data.Queue;
import lab5.data.events.Enter;
import lab5.data.Person;


public class Hairsalon {
	Simulator sim;
	Queue queue;
	Person p, p1, p2;
	Enter currentEvent;
	
	private final int CLOSINGTIME = 1000;
	private final int RESPAWNTIME = 10;
	private int time;
	
	public Hairsalon(){
		queue = new Queue();
		sim = new Simulator();
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
						
			
			
			
			
		}
		
	}
	
	
	
	
	
	
	public void addPersonToQueue(Person person){
		sim.addEvent(person.getEvent());
		
	}
	
	public void getFirstEvent(){
		currentEvent = (Enter)sim.getEvent();
		
	}
	
	
	
	
	
}
