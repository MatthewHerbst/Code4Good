import java.util.ArrayList;

/*
 * Represents an Organization object
 */
public class Organization {
	private int id;
	private ArrayList<Integer> volunteerIds;
	private String name;
	private String info;
	private String geolocation;
	private String type;
	
	public String toJSON() {
		String json = "{";
		
		json += "\"id\" :" + "\"" + id + "\"" + ",";
		json += "\"volunteerIds\" : [";
		for(int i = 0; i < volunteerIds.size(); i++) {
			if(i == volunteerIds.size()-1) {
				json += "{" + "\"id\" :" + "\"" + volunteerIds.get(i) + "\"" + "},";
			} else {
				json += "{" + "\"id\" :" + "\"" + volunteerIds.get(i) + "\"" + "}";
			}
		}
		json += "]";
		json += "\"name\" :" + "\"" + name + "\""  + ",";
		json += "\"info\" :" + "\"" + info + "\""  + ",";
		json += "\"geolocation\" :" + "\"" + geolocation + "\"" + ",";
		json += "\"type\" :" + "\"" + type + "\"" + ",";
		
		json += "}";
		return json;
	}
}