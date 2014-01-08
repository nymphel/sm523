package tr.edu.metu.ii.sm.dp.testing;

public class Client {

	public static void main(String[] args) {

		TestBehaviour testBehaviour = new StackTestBehaviour();
		testBehaviour.runTest();

		System.out.println("::::::::::::::::");
		
		TestBehaviour fileBehaviour = new FileTestBehaviour();
		fileBehaviour.runTest();

	}
}
