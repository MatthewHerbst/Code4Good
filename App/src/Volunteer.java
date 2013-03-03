/*
 * Represents a volunteer object
 */
public class Volunteer {
	private int id;
	private String name;
	private int orgId;
	private String info;

	public String toJSON() {
		String json = "{";
		
		json += "\"id\" :" + "\"" + id + "\"" + ",";
		json += "\"name\" :" + "\"" + name + "\"" + ",";
		json += "\"orgId\" :" + "\"" + orgId + "\"" + ",";
		json += "\"info\" :" + "\"" + info + "\"";// + ",";
		
		json += "}";
		return json;
	}
}
