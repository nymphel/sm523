package tr.edu.metu.sm.dp.graduate;

import java.util.List;

import tr.edu.metu.sm.dp.graduate.domain.PaperInfo;

public class PaperMsWithThesis implements Paper {

	@Override
	public boolean isSuccessfulPaper() {
		System.out.println("PaperMsWithThesis->isSuccessfulPaper");
		return false;
	}

	@Override
	public List<PaperInfo> showPapers() {
		System.out.println("PaperMsWithThesis->showPapers");
		return null;
	}

}
