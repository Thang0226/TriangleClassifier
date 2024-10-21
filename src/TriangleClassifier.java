public class TriangleClassifier {
	public String classify(int side1, int side2, int side3) {
		if (side1 == side2 && side2 == side3) {
			return "tam giác đều";
		}
		if (side1 == side2) {
			return "tam giác cân";
		}
		if ((side1 - side2) > side3) {
			return "không phải tam giác";
		}
		return "tam giác thường";
	}
}
