package arraysAndStrings;

public class OneAwayTest {

	public static void main(String[] args) {
		String one = "Pale";
		String two = "peae";
		OneAway oneAway = new OneAway();
//		System.out.println("Is "+one+" one edit Away from "+two+"?: "+oneAway.isOneEditAway(two, one));
//		one = "abacus";
//		two = "abacu";
//		System.out.println("Is "+one+" one edit Away from "+two+"?: "+oneAway.isOneEditAway(two, one));
//		one = "attire";
//		two = "atire";
//		System.out.println("Is "+one+" one edit Away from "+two+"?: "+oneAway.isOneEditAway(two, one));
//		one = "rush";
//		two = "hush";
//		System.out.println("Is "+one+" one edit Away from "+two+"?: "+oneAway.isOneEditAway(two, one));
//		one = "slush";
//		two = "hush";
//		System.out.println("Is "+one+" one edit Away from "+two+"?: "+oneAway.isOneEditAway(two, one));
//		one = "rush";
//		two = "srush";
//		System.out.println("Is "+one+" one edit Away from "+two+"?: "+oneAway.isOneEditAway(two, one));
//		one = "HusH";
//		two = "hush";
		one = "abacus";
		two = "abacud";
		System.out.println("Is "+one+" one edit Away from "+two+"?: "+oneAway.isOneReplaceAway(two, one));
		one = "attire";
		two = "pttire";
		System.out.println("Is "+one+" one edit Away from "+two+"?: "+oneAway.isOneReplaceAway(two, one));
		one = "rush";
		two = "hush";
		System.out.println("Is "+one+" one edit Away from "+two+"?: "+oneAway.isOneReplaceAway(two, one));
		one = "slush";
		two = "hush";
		System.out.println("Is "+one+" one edit Away from "+two+"?: "+oneAway.isOneReplaceAway(two, one));
		one = "rush";
		two = "rusH";
		System.out.println("Is "+one+" one edit Away from "+two+"?: "+oneAway.isOneReplaceAway(two, one));
		one = "HusH";
		two = "hush";
		System.out.println("Is "+one+" one edit Away from "+two+"?: "+oneAway.isOneReplaceAway(two, one));
	}

}
