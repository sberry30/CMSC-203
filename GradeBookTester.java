import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
GradeBook sc;//create object
	@BeforeEach
	void setUp() throws Exception {
		sc = new GradeBook(5);
		sc.addScore(98.9);
		sc.addScore(93.2);
	}

	@AfterEach
	void tearDown() throws Exception {
		sc = null;
	}

	@Test
	public void testAddScore() {
	assertEquals(2.0, sc.getScoreSize());
	assertTrue(sc.toString().equals("98.9 93.2 "));
	}

	@Test
	public void testSum() {
		assertEquals(192.10000000000002, sc.sum());
	}

	@Test
	public void testMinimum() {
		assertEquals(93.2, sc.minimum());
	}

	@Test
	public void testFinalScore() {
		assertEquals(98.90000000000002, sc.finalScore());
	}


}
