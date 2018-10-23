import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerXTest {

	@Test
	public void test() {
		TicTacToe game = new TicTacToe();
		char playerX = game.player;
		assertEquals('x', playerX);
	}

}
