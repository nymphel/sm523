package tr.edu.metu.sm.dp.graduate;

import java.util.List;

import tr.edu.metu.sm.dp.graduate.domain.PaperInfo;

public class PaperPhd implements Paper {

	@Override
	public boolean isSuccessfulPaper() {
		System.out.println("PaperPhd->isSuccessfulPaper");
		return false;
	}

	@Override
	public List<PaperInfo> showPapers() {
		System.out.println("PaperPhd->showPapers");
		return null;
	}

}
