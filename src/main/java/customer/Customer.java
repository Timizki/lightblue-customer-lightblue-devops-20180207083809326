package customer;

public class Customer {
	private String _id;
	private String _rev;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String imageUrl;
	
	public String getCustomerId(){
		return this._id;
	} 
	public String getRev(){
		return this._rev;
	}

	public String getUsername() {
		return this.username;
	}
	public String getPassword(){
		return this.password;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getEmail(){
		return this.email;
	}
	public String getImageUrl(){
		return this.imageUrl;
	} public void setCustomerId(String id){
		this._id = id;
	}
	
	public void setRev(String r){
		this._rev=r ;
	}
	public void setUsername(String u){
		this.username = u;
	}
	public void setPassword(String p){
		this.password = p;
	}
	public void setFirstName(String n){
		this.firstName = n;
	}
	public void setLastName(String l){
		this.lastName = l;
	}
	public void setEmail(String e){
		this.email=e;
	}
	public void setImageUrl(String i){
		this.imageUrl = i;
	}
}