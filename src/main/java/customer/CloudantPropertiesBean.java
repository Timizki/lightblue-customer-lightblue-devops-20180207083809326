package customer; 
import org.springframework.boot.context.properties.ConfigurationProperties;  
import org.springframework.stereotype.Component; 

 @Component 
 @ConfigurationProperties(prefix="spring.cloudant")
 public class CloudantPropertiesBean {
 	
 	private String username;
 	private String password;
 	private String host;
 	private String protocol;
 	private int port;
 	private String database;
 	
 	public void setUsername(String username) {
 		this.username = username;
 	}
 	
 	public void setPassword(String password) {
 		this.password = password;
 	}
 	
 	public void setHost(String h) {
 		this.host = h;
 	}
 	
 	public void setProtocol(String p) {
 		this.protocol = p;
 	}
 	
 	public void setPort(int p) {
 		this.port = p;
 	}
 	
 	public String getDatabase() {
 		return this.database;
 	}
 	
 	public void setDatabase(String db){
 		this.database = db;
 	}
 	public String getUsername() {
 		return this.username;
 	}
 	public String getPassword(){
 		return this.password;
 	}
 	public String getHost() {
 		return this.host;
 	}
 	public String getProtocol(){
 		return this.protocol;
 	}
 	public int getPort(){
 		return this.port;
 		}
 }