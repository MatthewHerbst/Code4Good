package com.example.cbs_project;
/*
 * Represents a volunteer object
 */
public class Volunteer {
	private int VolunteerID;
	private String FirstName;
	private String LastName;
	private int OrganizationID;
	private String ContactInformation;

	public String toJSON() {
		String json = "{";
		
		json += "\"VolunteerID\" :" + "\"" + VolunteerID + "\"" + ",";
		json += "\"FirstName\" :" + "\"" + FirstName + "\"" + ",";
		json += "\"LastName\" :" + "\"" + LastName + "\"" + ",";
		json += "\"OrganizationID\" :" + "\"" + OrganizationID + "\"" + ",";
		json += "\"ContactInformation\" :" + "\"" + ContactInformation + "\"";// + ",";
		
		json += "}";
		return json;
	}
}
