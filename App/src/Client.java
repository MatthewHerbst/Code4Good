import java.sql.Date;
//import java.util.ArrayList;

/*
 * Represents a client object
 */
public class Client {
	private int ClientID;
	private int SiteID;
	private String FirstName;
	private String LastName;
	private String Gender;
	//private int[] photo; //TODO: This should be an image object
	private Date Birthday;
	//private int Age;
	private boolean IsBirthdayAccurate;
	private String Attitude;
	private String HealthStatus;
	private String HousingAttitude;
	private int HousingStage;
	private String AdditionalInformation;
	private String Comments; //TODO: Ideally make this a list of comments with tags by who left them
	private boolean RequiresUrgentAttention;
	
	public int getClientID() {
		return ClientID;
	}

	public void setClientID(int clientID) {
		ClientID = clientID;
	}

	public int getSiteID() {
		return SiteID;
	}

	public void setSiteID(int siteID) {
		SiteID = siteID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Date getBirthday() {
		return Birthday;
	}

	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}

	public boolean isIsBirthdayAccurate() {
		return IsBirthdayAccurate;
	}

	public void setIsBirthdayAccurate(boolean isBirthdayAccurate) {
		IsBirthdayAccurate = isBirthdayAccurate;
	}

	public String getAttitude() {
		return Attitude;
	}

	public void setAttitude(String attitude) {
		Attitude = attitude;
	}

	public String getHealthStatus() {
		return HealthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		HealthStatus = healthStatus;
	}

	public String getHousingAttitude() {
		return HousingAttitude;
	}

	public void setHousingAttitude(String housingAttitude) {
		HousingAttitude = housingAttitude;
	}

	public int getHousingStage() {
		return HousingStage;
	}

	public void setHousingStage(int housingStage) {
		HousingStage = housingStage;
	}

	public String getAdditionalInformation() {
		return AdditionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		AdditionalInformation = additionalInformation;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public boolean isRequiresUrgentAttention() {
		return RequiresUrgentAttention;
	}

	public void setRequiresUrgentAttention(boolean requiresUrgentAttention) {
		RequiresUrgentAttention = requiresUrgentAttention;
	}	
	
	public String toJSON() {
		String json = "{";
		
		json += "\"ClientID\" :" + "\"" + ClientID + "\"" + ",";
		json += "\"SiteID\" :" + "\"" + SiteID + "\"" + ",";
		json += "\"FirstName\" :" + "\"" + FirstName + "\"" + ",";
		json += "\"LastName\" :" + "\"" + LastName + "\"" + ",";
		json += "\"Gender\" :" + "\"" + Gender + "\"" + ",";
		//json += "\"photo\" :" + "\"" + photo.toString() + "\"" + ",";
		json += "\"Birthday\" :" + "\"" + Birthday.toString() + "\"" + ",";
		//json += "\"Age\" :" + "\"" + Age + "\"" + ",";
		if(IsBirthdayAccurate){
			json += "\"IsBirthdayAccurate\" :" + "\"" + "yes" + "\"" + ",";
		} else {
			json += "\"isBirthdayAccurate\" :" + "\"" + "no" + "\"" + ",";
		}
		json += "\"Attitude\" :" + "\"" + Attitude + "\"" + ",";
		json += "\"HealthStatus\" :" + "\"" + HealthStatus + "\"" + ",";
		json += "\"HousingAttitude\" :" + "\"" + HousingAttitude + "\"" + ",";		
		json += "\"HousingStage\" :" + "\"" + HousingStage + "\"" + ",";
		json += "\"AdditionalInformation\" :" + "\"" + AdditionalInformation + "\"" + ",";
		json += "\"Comments\" :" + "\"" + Comments + "\"" + ",";
		if(RequiresUrgentAttention) {
			json += "\"RequiresUrgentAttention\" :" + "\"" + "yes" + "\"";// + ",";
		} else {
			json += "\"RequiresUrgentAttention\" :" + "\"" + "no" + "\"";// + ",";
		}
		
		json += "}";
		return json;
	}
}