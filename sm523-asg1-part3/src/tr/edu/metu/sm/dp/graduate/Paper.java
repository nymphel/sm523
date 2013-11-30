package tr.edu.metu.sm.dp.graduate;

import java.util.List;

import tr.edu.metu.sm.dp.graduate.domain.PaperInfo;

public interface Paper {
	
	public boolean isSuccessfulPaper();
	public List<PaperInfo> showPapers();

}
