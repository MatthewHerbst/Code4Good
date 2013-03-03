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