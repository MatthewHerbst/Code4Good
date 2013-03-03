import java.sql.Date;

/*
 * Represents a site object
 */
public class Site {
	private int SiteID;
	private float Position;
	private String SiteType;
	private String Status;
	private Date DiscoveryDate;
	private Date UpdateDate;
	private int CampBadge;
	private int TentCount;
	private int PetCount;
	private String AdditionalInfo;
	private String Comments;
	
	
	public String toJSON() {
		String json = "{";
		
		json += "\"SiteID\" :" + "\"" + SiteID + "\""  + ",";
		json += "\"PositionLong\" :" + "\"" + Position + "\""  + ",";
		json += "\"SiteType\" :" + "\"" + SiteType + "\""  + ",";
		json += "\"Status\" :" + "\"" + Status + "\""  + ",";			
		json += "\"DiscoveryDate\" :" + "\"" + DiscoveryDate.toString() + "\""  + ",";
		json += "\"UpdateDate\" :" + "\"" + UpdateDate.toString() + "\""  + ",";
		json += "\"CampBadge\" :" + "\"" + CampBadge + "\""  + ",";
		json += "\"TentCount\" :" + "\"" + TentCount + "\""  + ",";
		json += "\"PetCount\" :" + "\"" + PetCount + "\"" + ",";
		json += "\"AdditionalInfo\" :" + "\"" + AdditionalInfo + "\"" + ",";
		json += "\"Comments\" :" + "\"" + Comments + "\"";// + ",";
		
		json += "}";
		return json;
	}
}