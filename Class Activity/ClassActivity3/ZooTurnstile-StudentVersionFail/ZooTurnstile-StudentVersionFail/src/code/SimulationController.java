package code;

/**
 * The SimulationController coordinates the TurnStile,the CoinCollector,
 * and the arrival of people and their coin payments.
 * 
 *
 */
public class SimulationController {
	
	Turnstile turnStile;
	CoinCollector coinCollector;
	
	
	/**
	 * @param entrySequence Array of strings. "*" represents a coin deposit.  All other entries are 
	 * people's names (e.g. Sam, Lucy)
	 */
	public void enterZoo(String[] entrySequence)
	{
		for(int j = 0; j < entrySequence.length; j++){
			if(entrySequence[j].equals("*")){
				coinCollector.addCoin();
				turnStile.addTurn();
				if (turnStile.enterFromQueue()) 
					coinCollector.spendCoin();
			}
			else
			{
				turnStile.pushTurnStile(entrySequence[j]);
				coinCollector.spendCoin();
			}
		}		
	}
	
	/**
	 * @return String of people currently in the Queue (e.g. Sam,Lucy,Jill,)
	 */
	public String getListOfPeopleInQueue(){
		return turnStile.getWaitingPeople();		
	}
	
	/**
	 * Delegates task of counting waiting people to the turnStile
	 * @return int number of waiting people
	 */
	public int countPeopleInQueue(){
		return turnStile.countWaitingPeople();
	}
	
	public int countUnspentCoins(){
		return coinCollector.getUnspentCoinCount();
	}
	
	/**
	 *  Main launch point for the simulation.
	 */
	public SimulationController(){
		turnStile = new Turnstile();
		coinCollector = new CoinCollector();			
	}
	
	public void reset() {
		coinCollector.reset();
		turnStile.reset();
	}
	
	public void simulation()
	{
	
		String[] entryTest1 = {"*","*","*","Sam","Ben","*","Sue","Jill","*","Fred","Lucy","*","Gordon",};
		enterZoo(entryTest1);
		System.out.println("People still waiting to enter the zoo: " + getListOfPeopleInQueue());
		System.out.println("Unspent coins: " + countUnspentCoins());
	}
	
	
	
	
}
