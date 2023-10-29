package UsersAuthentication;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
    @Column(unique = true)
    private String username;

    private String password;
    
    private String emailId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getEmail() {
		return emailId;
	}

	public User(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.emailId = email;
	}

	public void setEmail(String email) {
		this.emailId = email;
	}

    // Getters and setters

    // Constructors
}