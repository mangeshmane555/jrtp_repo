package in.mane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.mane.request.SearchRequest;
import in.mane.service.ReportService;
import in.mane.service.ReportServiceImpl;

@Controller
public class ReportController {

	// Inject service to controller
	@Autowired
	private ReportService service;

	// To load the form initially
	@GetMapping("/")
	public String indexPage(Model model) {

		SearchRequest searchObj = new SearchRequest();
		model.addAttribute("search", searchObj);

		List<String> planNames = service.getPlanNames();
		model.addAttribute("plan_names", planNames);

		List<String> planStatuses = service.getPlanStatuses();
		model.addAttribute("plan_statuses", planStatuses);

		return "index";
	}
}
