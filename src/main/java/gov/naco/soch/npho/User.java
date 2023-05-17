package  gov.naco.soch.npho;
import java.util.Base64;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String username;
    private String password;
    
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private transient String newPassword;
    
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setPasswordEncoded(String password) {
        this.password = Base64.getEncoder().encodeToString(password.getBytes());
    }

    public void setPasswordDecoded(String password) {
        this.password = new String(Base64.getDecoder().decode(password));
    }

    public void setNewPasswordEncoded(String newPassword) {
        this.newPassword = Base64.getEncoder().encodeToString(newPassword.getBytes());
    }

    public void setNewPasswordDecoded(String newPassword) {
        this.newPassword = new String(Base64.getDecoder().decode(newPassword));
    }
    
}

