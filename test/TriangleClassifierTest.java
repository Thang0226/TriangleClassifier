import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

	@Test
	@DisplayName("Triangle sides: 2-2-2")
	public void testTriangleClassifierS2S2S2() {
		// arrange
		TriangleClassifier classifier = new TriangleClassifier();
		int side1 = 2;
		int side2 = 2;
		int side3 = 2;
		String expected = "tam giác đều";
		// action
		String result = classifier.classify(side1, side2, side3);
		// assert
		assertEquals(expected, result);
	}
}