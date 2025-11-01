package in.mane.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.mane.entity.CitizenPlan;
import in.mane.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatuses();

	// Form data binding object
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();
}
