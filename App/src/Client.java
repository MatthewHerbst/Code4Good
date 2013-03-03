import java.sql.Date;
//import java.util.ArrayList;

/*
 * Represents a client object
 */
public class Client {
	private int id;
	private int siteId;
	private String name;
	private String gender;
	//private int[] photo; //TODO: This should be an image object
	private Date birthday;
	private boolean birthdayCorrect;
	private String comments; //TODO: Ideally make this a list of comments with tags by who left them
	private String attitude;
	private int housingStage;
	private boolean needsAttention;
	
	public String toJSON() {
		String json = "{";
		
		json += "\"id\" :" + "\"" + id + "\"" + ",";
		json += "\"siteId\" :" + "\"" + siteId + "\"" + ",";
		json += "\"name\" :" + "\"" + name + "\"" + ",";
		json += "\"gender\" :" + "\"" + gender + "\"" + ",";
		//json += "\"photo\" :" + "\"" + photo.toString() + "\"" + ",";
		json += "\"birthday\" :" + "\"" + birthday.toString() + "\"" + ",";
		if(birthdayCorrect){
			json += "\"birthdayCorrect\" :" + "\"" + "yes" + "\"" + ",";
		} else {
			json += "\"birthdayCorrect\" :" + "\"" + "no" + "\"" + ",";
		}
		json += "\"comments\" :" + "\"" + comments + "\"" + ",";
		json += "\"attitude\" :" + "\"" + attitude + "\"" + ",";
		json += "\"housingStage\" :" + "\"" + housingStage + "\"" + ",";
		if(needsAttention) {
			json += "\"needsAttention\" :" + "\"" + "yes" + "\"";// + ",";
		} else {
			json += "\"needsAttention\" :" + "\"" + "no" + "\"";// + ",";
		}
		
		json += "}";
		return json;
	}
}
