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

	@Test
	@DisplayName("Triangle sides: 2-2-3")
	public void testTriangleClassifierS2S2S3() {
		// arrange
		TriangleClassifier classifier = new TriangleClassifier();
		int side1 = 2;
		int side2 = 2;
		int side3 = 3;
		String expected = "tam giác cân";
		// action
		String result = classifier.classify(side1, side2, side3);
		// assert
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Triangle sides: 3-4-5")
	public void testTriangleClassifierS3S4S5() {
		// arrange
		TriangleClassifier classifier = new TriangleClassifier();
		int side1 = 3;
		int side2 = 4;
		int side3 = 5;
		String expected = "tam giác thường";
		// action
		String result = classifier.classify(side1, side2, side3);
		// assert
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Triangle sides: 8-2-3")
	public void testTriangleClassifierS8S2S3() {
		// arrange
		TriangleClassifier classifier = new TriangleClassifier();
		int side1 = 8;
		int side2 = 2;
		int side3 = 3;
		String expected = "không phải tam giác";
		// action
		String result = classifier.classify(side1, side2, side3);
		// assert
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Triangle sides: (-1)-2-1")
	public void testTriangleClassifierSminus1S2S1() {
		// arrange
		TriangleClassifier classifier = new TriangleClassifier();
		int side1 = -1;
		int side2 = 2;
		int side3 = 1;
		String expected = "không phải tam giác";
		// action
		String result = classifier.classify(side1, side2, side3);
		// assert
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Triangle sides: 0-1-1")
	public void testTriangleClassifierS0S1S1() {
		// arrange
		TriangleClassifier classifier = new TriangleClassifier();
		int side1 = 0;
		int side2 = 1;
		int side3 = 1;
		String expected = "không phải tam giác";
		// action
		String result = classifier.classify(side1, side2, side3);
		// assert
		assertEquals(expected, result);
	}
}