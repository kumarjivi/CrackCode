package arraysAndStrings;

public class IsUniqueTest {

	public static void main(String[] args) {
		IsUnique isUnique = new IsUnique();
		System.out.println("abcdef: "+isUnique.hasAllUniqueCharsOne("abcdef"));
		System.out.println("abccef: "+isUnique.hasAllUniqueCharsOne("abccef"));
		System.out.println("abcd244: "+isUnique.hasAllUniqueCharsOne("abcd244"));
		System.out.println("ab268def: "+isUnique.hasAllUniqueCharsOne("ab268def"));
		
		
		System.out.println("abcdef: "+isUnique.hasAllUniqueCharsTwo("abcdef"));
		System.out.println("abccef: "+isUnique.hasAllUniqueCharsTwo("abccef"));
		System.out.println("abcd244: "+isUnique.hasAllUniqueCharsTwo("abcd244"));
		System.out.println("ab268def: "+isUnique.hasAllUniqueCharsTwo("ab268def"));
		
		System.out.println("abcdef: "+isUnique.hasAllUniqueCharsThree("abcdef"));
		System.out.println("abccef: "+isUnique.hasAllUniqueCharsThree("abccef"));
		System.out.println("abcd244: "+isUnique.hasAllUniqueCharsThree("abcd244"));
		System.out.println("ab268def: "+isUnique.hasAllUniqueCharsThree("ab268def"));
	}

}
