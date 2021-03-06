package tr.edu.metu.ii.sm.dp.testing;

import java.util.Stack;

//Concrete Template
public class StackTestBehaviour extends TestBehaviour {

	private String element = "Z";
	Stack<String> stack;

	@Override
	public void setupScene() {
		stack = new Stack<>();
		stack.push(element);
		System.out.println(element + " is pushed to stack");

	}

	@Override
	public void test() {
		String result = stack.pop();
		System.out.println(element + " is popped from stack");
		assert (result.equals(element));

	}

	@Override
	public void cleanup() {
		// No need to cleanup
	}

}
