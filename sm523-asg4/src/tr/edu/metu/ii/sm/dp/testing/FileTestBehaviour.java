package tr.edu.metu.ii.sm.dp.testing;

public class FileTestBehaviour extends TestBehaviour {

	MyFile file;

	@Override
	public void setupScene() {
		file = new MyFile("deneme.txt");

	}

	@Override
	public void test() {
		int num = file.addLine("line1\n");
		assert (num == 6);

	}

	@Override
	public void cleanup() {
		file.deleteSelf();

	}

	class MyFile {

		public MyFile(String filename) {
			System.out.println("file name is:" + filename);
		}

		public int addLine(String line) {
			System.out.println("line is added: " + line);
			if (line != null) {
				return line.length();
			}
			return 0;
		}

		public void deleteSelf() {
			System.out.println("file is deleted!");

		}

	}

}
