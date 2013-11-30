package tr.edu.metu.sm.dp.graduate;

import java.util.List;

import tr.edu.metu.sm.dp.graduate.domain.PaperInfo;

public class PaperMsWithoutThesis implements Paper {

	@Override
	public boolean isSuccessfulPaper() {
		System.out.println("PaperMsWithoutThesis->isSuccessfulPaper");
		return false;
	}

	@Override
	public List<PaperInfo> showPapers() {
		System.out.println("PaperMsWithoutThesis->showPapers");
		return null;
	}

}
