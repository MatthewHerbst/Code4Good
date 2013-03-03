import java.sql.Date;
import java.util.ArrayList;

/*
 * Represents a client object
 */
public class Client {
	private int id;
	private int siteID;
	private String name;
	private String gender;
	private int[] photo; //TODO: This should be an image object
	private Date birthday;
	private boolean birthdayCorrect;
	private ArrayList<String> comments;
	private String attitude;
	private int housingStage;
	private boolean needsAttention;
}
