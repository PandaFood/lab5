package lab5.data;

import java.util.Random;

import lab5.simulation.Event;
import lab5.data.events.*;

public class Person {

	private Event event;
	private Random random = new Random();
	private final int BASEHAIRVARIATION = 10;
	private final int BASEHAIRTIME = 15;
	private final int HAPPYPERCENT = 70;
	private int hairTime;
	private boolean ishappy;
	private static long totalID;
	private long id;
	
	
	public Person(){
		event = new Enter(this);
		hairTime = BASEHAIRTIME - BASEHAIRVARIATION / 2 + random.nextInt(BASEHAIRVARIATION);
		ishappy = true;
		id = totalID + 1;
		
	}
	
	public void Done(){
		// CHECKS IF THEYRE HAPPY
		if(random.nextInt(100) <= HAPPYPERCENT)
			event =  new Leave(this);
		else{
		//IF THEYRE NOT SET THE FLAG TO FALSE
			ishappy = false;
			event = new Enter(this);
		}
			
	}
	
	public int getCutTime(){
		return hairTime;
	}
	
	public void Ready(){
		event = new Ready(this);
	}
	
	public boolean isReady(){
		if(event.getClass() == Ready.class)
			return true;
		else
			return false;
	}
	
	public boolean isDone(){
		if(event.getClass() == Leave.class)
			return true;
		else
			return false;
		
	}
	
	public long getID(){
		return id;
	}
	
	public boolean isHappy(){
		if(ishappy){
			return true;
		}
		else
			return false;
	}
	
	public void setEvent(Event e){
		event = e;
	}
	
	public Event getEvent(){
		return event;
	}
	
	
	
	
	
}
