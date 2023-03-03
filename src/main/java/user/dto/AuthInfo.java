package user.dto;


public class AuthInfo {
	private String userId;
	private String userPassword;
	
	public AuthInfo() {
		
	}

	public AuthInfo(String userId, String userPassword) {
		this.userId = userId;
		this.userPassword = userPassword;
	}
	
	public String getUserId() {
		return userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

}
