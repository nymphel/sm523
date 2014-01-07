package behavioral.strategy;

import java.io.File;
import java.util.List;

//Strategy Interface
public interface CompressionStrategy {
	public void compressFiles(List<File> files);
}