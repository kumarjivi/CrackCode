package arraysAndStrings;

public class StringRotationTest {

	public static void main(String[] args) {
		StringRotation stringRotation = new StringRotation();
		String s1 = "This";
		String s2 = "isTh";
		System.out.println(stringRotation.isRotation(s1,s2));
		System.out.println(stringRotation.isRotation(s1,null));
		System.out.println(stringRotation.isRotation(null,s2));
	}

}
