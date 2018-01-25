package tc;
import code.CoinCollector;
import static org.junit.Assert.*;

import org.junit.Test;

public class CoinCollectorTest {

	@Test
	public void testAddCoin(){
		CoinCollector coinCollector = new CoinCollector();
		coinCollector.addCoin();
		coinCollector.addCoin();
		assertTrue(coinCollector.getUnspentCoinCount()==2);
	}
	
	@Test
	public void testSpendCoin(){
		CoinCollector coinCollector = new CoinCollector();
		coinCollector.addCoin();
		coinCollector.addCoin();
		coinCollector.spendCoin();
		assertTrue(coinCollector.getUnspentCoinCount()==1);
	}
	
	@Test
	public void testOverSpendCoin(){
		CoinCollector coinCollector = new CoinCollector();
		coinCollector.addCoin();
		coinCollector.addCoin();
		coinCollector.spendCoin();
		coinCollector.spendCoin();
		coinCollector.spendCoin();
		assertTrue(coinCollector.getUnspentCoinCount()==0);
	}
}
