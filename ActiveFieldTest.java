import static org.junit.Assert.*;

import org.junit.Test;

public class ActiveFieldTest {

	@Test
	public void test() {
		TicTacToe game = new TicTacToe();
		int activeFields = game.board.length;
		assertEquals(9, activeFields);
	}

}
