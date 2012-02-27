package com.swaggacreation.likemysound.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name="Mark")
public class Mark implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long markId;
	private Date date;
	@NotEmpty
	private TinyIntTypeDescriptor markLink;
	@ManyToOne
	@JoinColumn(name="link_fk")
	@NotNull
	private Link link;
	@ManyToOne
	@JoinColumn(name="user_fk")
	@NotNull
	private User user;
	public long getMarkId() {
		return markId;
	}
	public void setMarkId(long markId) {
		this.markId = markId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public TinyIntTypeDescriptor getMarkLink() {
		return markLink;
	}
	public void setMarkLink(TinyIntTypeDescriptor markLink) {
		this.markLink = markLink;
	}
	public Link getLink() {
		return link;
	}
	public void setLink(Link link) {
		this.link = link;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
