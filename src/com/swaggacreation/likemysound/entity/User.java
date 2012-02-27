package com.swaggacreation.likemysound.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="User")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	@NotEmpty
	private String pseudo;
	@Email
	@NotEmpty
	private String email;
	@NotEmpty
	private String password;
	private String description;
	private String favArtist;
	private String favStyle;
	/*
	@OneToMany(mappedBy="group")
	private Collection<Group> groups;
	@OneToMany(mappedBy="link")
	private Collection<Link> links;
	
	*/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getFavArtist() {
		return favArtist;
	}
	public void setFavArtist(String favArtist) {
		this.favArtist = favArtist;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFavStyle() {
		return favStyle;
	}
	public void setFavStyle(String favStyle) {
		this.favStyle = favStyle;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	/*
	public Collection<Group> getGroups() {
		return groups;
	}
	public void setGroups(Collection<Group> groups) {
		this.groups = groups;
	}
	public Collection<Link> getLinks() {
		return links;
	}
	public void setLinks(Collection<Link> links) {
		this.links = links;
	}
	*/
}
