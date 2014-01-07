package behavioral.template;

public class Client {

	public static void main(String[] args) {

		CSVDataParser csvDataParser = new CSVDataParser();
		csvDataParser.parseDataAndGenerateOutput();

		DatabaseDataParser databaseDataParser = new DatabaseDataParser();
		databaseDataParser.parseDataAndGenerateOutput();

	}
}
