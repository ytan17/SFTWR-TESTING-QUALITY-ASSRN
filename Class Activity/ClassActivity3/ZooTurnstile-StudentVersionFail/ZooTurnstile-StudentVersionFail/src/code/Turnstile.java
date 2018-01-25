package code;

public class Turnstile {
	int availableTurns;
	TurnstileQueue turnstileQueue;
	
	public Turnstile(){
		availableTurns = 0;
		turnstileQueue = new TurnstileQueue();
	}
	
	public void reset(){
		while(turnstileQueue.hasPeople())
			turnstileQueue.leaveQueue();
		availableTurns=0;
	}
	
	public void addTurn(){
		availableTurns++;
	}
	
	public int countTurns() {
		return availableTurns;
	}
	
	public boolean enterFromQueue(){
		if(turnstileQueue.hasPeople()) {
			pushTurnStile(turnstileQueue.leaveQueue());
			return true;
		}
		else
			return false;
	}

	public String getWaitingPeople(){
		return turnstileQueue.getWaitingPeopleNames();
	}
	
	public int countWaitingPeople(){
		return turnstileQueue.getCount();
	}
	
	public boolean pushTurnStile(String personName){
		if(availableTurns>0) {
			availableTurns--;
			System.out.println(personName + " is entering the zoo.");
			return true;
		} 
		else {
			turnstileQueue.enterQueue(personName);
			return false;
		}			
	}
}
