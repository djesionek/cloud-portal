package de.papke.cloud.portal.model;

import java.util.List;

import de.papke.cloud.portal.pojo.User;

public class ApplicationModel {
	
    private String applicationTitle;
    private User user;
	private List<String> cloudProviderList;

	public String getApplicationTitle() {
		return applicationTitle;
	}
	
	public void setApplicationTitle(String applicationTitle) {
		this.applicationTitle = applicationTitle;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<String> getCloudProviderList() {
		return cloudProviderList;
	}
	
	public void setCloudProviderList(List<String> cloudProviderList) {
		this.cloudProviderList = cloudProviderList;
	}	
}
