package rolo;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the urro database table.
 * 
 */
@Entity
@Table(schema = "ROLO")
@NamedQuery(name="Urro.findAll", query="SELECT u FROM Urro u")
public class Urro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UrroId id;
	@ManyToOne(fetch=FetchType.EAGER)
	private Role role;
	@ManyToOne(fetch=FetchType.EAGER)
	private User user;
	//------- mine -----------
	public Integer getVersion() {
		return 1;
	}
	public String toString(){
        return id==null?"0":String.valueOf(id);
	}
    //--------------------------

	public Urro() {
	}

	public UrroId getId() {
		return this.id;
	}

	public void setId(UrroId id) {
		this.id = id;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}