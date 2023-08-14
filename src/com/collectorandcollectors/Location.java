package com.collectorandcollectors;

public class Location {
	private String locationName;
    private String state;
	public String getLocationName() {
		return locationName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public Location(String locationName, String state) {
		super();
		this.locationName = locationName;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Location [locationName=" + locationName + ", state=" + state + "]";
	}

}
