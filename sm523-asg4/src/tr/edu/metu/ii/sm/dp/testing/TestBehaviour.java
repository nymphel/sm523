package tr.edu.metu.ii.sm.dp.testing;

//Abstract Template
public abstract class TestBehaviour {
	
	public void runTest() {
		setupScene();
		test();
		cleanup();
	}


	protected abstract void setupScene();

	protected abstract void test();

	protected abstract void cleanup();

}
