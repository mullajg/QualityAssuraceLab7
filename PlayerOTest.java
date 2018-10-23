import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerOTest {

	@Test
	public void test() {
		TicTacToe game = new TicTacToe();
		game.ChangePlayer();
		char playerO = game.player;
		assertEquals('o', playerO);
	}

}
