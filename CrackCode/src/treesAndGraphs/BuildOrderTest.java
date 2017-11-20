package treesAndGraphs;

public class BuildOrderTest {

	public static void main(String[] args) {
		char[] projects = {'a', 'b', 'd'};
		char[] dependencies = {'d', 'a', 'a', 'b'};
		BuildOrder buildOrder = new BuildOrder();
		System.out.println(buildOrder.getBuildOrder(projects, dependencies));
	}

}
