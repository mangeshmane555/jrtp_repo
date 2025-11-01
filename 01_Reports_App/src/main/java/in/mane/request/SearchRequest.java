package in.mane.request;

//SearchForm Binding/DTO class
public class SearchRequest {

	private String planName;	
	private String planStatuses;	
	private String gender;
	private String startDate;	
	private String endDate;
	//
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatuses() {
		return planStatuses;
	}
	public void setPlanStatuses(String planStatuses) {
		this.planStatuses = planStatuses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
	
	
	
}
