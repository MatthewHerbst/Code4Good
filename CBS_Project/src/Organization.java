/*
 * Represents an Organization object
 */
public class Organization {
	private int ID;
	private String Name;
	private String Type;
	private String ContactInformation;
	private String Position;
	
	public String toJSON() {
		String json = "{";
		
		json += "\"ID\" :" + "\"" + ID + "\"" + ",";
		json += "\"Name\" :" + "\"" + Name + "\""  + ",";
		json += "\"Type\" :" + "\"" + Type + "\""  + ",";
		json += "\"ContactInformation\" :" + "\"" + ContactInformation + "\"" + ",";
		json += "\"Position\" :" + "\"" + Position + "\"";// + ",";
		
		json += "}";
		return json;
	}
}