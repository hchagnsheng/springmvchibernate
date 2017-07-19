package com.hcs.entity;
// Generated 2017-7-18 1:03:45 by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AcctRole implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Set<AcctAuthority> acctAuthorities = new HashSet<AcctAuthority>(0);

	public AcctRole() {
	}

	public AcctRole(String name) {
		this.name = name;
	}

	@Id
	@Column(name = "id",unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnoreProperties(value={"acctUsers", "acctRoles"})
	@ManyToMany(fetch = FetchType.LAZY)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	@JoinTable(name = "acct_role_authority", catalog = "work", joinColumns = { @JoinColumn(name = "acthority_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "role_id", nullable = false, updatable = false) })
	public Set<AcctAuthority> getAcctAuthorities() {
		return acctAuthorities;
	}

	public void setAcctAuthorities(Set<AcctAuthority> acctAuthorities) {
		this.acctAuthorities = acctAuthorities;
	}

	
}
