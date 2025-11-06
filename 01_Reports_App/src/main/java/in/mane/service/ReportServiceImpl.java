package in.mane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mane.entity.CitizenPlan;
import in.mane.repo.CitizenPlanRepository;
import in.mane.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService {

	// Inject repository to service class
	@Autowired
	private CitizenPlanRepository planRepo;
	
	@Override
	public List<String> getPlanNames() {
		List<String> planNames = planRepo.getPlanNames();
		return planNames;
	}

	@Override
	public List<String> getPlanStatuses() {
		return planRepo.getPlanStatuses();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
