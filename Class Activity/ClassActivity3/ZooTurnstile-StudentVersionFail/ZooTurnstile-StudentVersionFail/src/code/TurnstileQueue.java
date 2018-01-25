package code;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Manages the queue of people's names waiting to enter.
 * If a person enters immediately without queueing they are not entered here.
 *
 *
 */
public class TurnstileQueue {
	Queue<String> turnQueue;

	public TurnstileQueue(){
		turnQueue = new LinkedList<String>();
	}

	public boolean hasPeople(){
		if(! turnQueue.isEmpty())
			return true;
		else
			return false;
	}
	
	public int getCount(){
		return turnQueue.size();
	}
	
	/**
	 * Builds a list of people in the queue
	 * @return String that lists people on the list. Formatted "Mary,Tom,Frank"
	 * Hint: Search for "java iterate through a queue"
	 * Hint2: Consider using a StringBuilder to build your list
	 */
	public String getWaitingPeopleNames()
	{
		return "No idea who is on the list";
	}

	public void enterQueue(String personName){
		turnQueue.add(personName);
	}

	public String leaveQueue(){
		String name;
		try {
			name = turnQueue.remove();
		} catch (NoSuchElementException e){
			name = "";
		}
		
		return name;
	}
}
