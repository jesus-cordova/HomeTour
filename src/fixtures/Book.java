package fixtures;

public class Book  {
	
	public String title;
	public String description;
	public String code;
	
	
	public Book( String title, String description, String code) {
		this.title = title;
		this.description = description;
		this.code = code;
	}

	
	@Override
	public String toString() {
		return "\nTitle:"+title + "\nDescription:" + description + " " + code  +".\n" ;
	}
}
