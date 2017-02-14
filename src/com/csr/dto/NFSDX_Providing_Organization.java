package com.csr.dto;

import java.sql.Timestamp;

public class NFSDX_Providing_Organization {

	private int providing_organization_id;
	private String providing_organization_name;
	private String providing_org_description;
	private String created_by;
	private Timestamp created_on;
	private String last_updated_by;
	private Timestamp last_updated_on;
	public int getProviding_organization_id() {
		return providing_organization_id;
	}
	public void setProviding_organization_id(int providing_organization_id) {
		this.providing_organization_id = providing_organization_id;
	}
	public String getProviding_organization_name() {
		return providing_organization_name;
	}
	public void setProviding_organization_name(String providing_organization_name) {
		this.providing_organization_name = providing_organization_name;
	}
	public String getProviding_org_description() {
		return providing_org_description;
	}
	public void setProviding_org_description(String providing_org_description) {
		this.providing_org_description = providing_org_description;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Timestamp getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}
	public String getLast_updated_by() {
		return last_updated_by;
	}
	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}
	public Timestamp getLast_updated_on() {
		return last_updated_on;
	}
	public void setLast_updated_on(Timestamp last_updated_on) {
		this.last_updated_on = last_updated_on;
	}
}
