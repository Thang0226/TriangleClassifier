public class TriangleClassifier {
	public String classify(int side1, int side2, int side3) {
		if (side1 == side2 && side2 == side3) {
			return "tam giác đều";
		}
		throw new UnsupportedOperationException();
	}
}