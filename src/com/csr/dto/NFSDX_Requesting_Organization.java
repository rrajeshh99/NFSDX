package com.csr.dto;

import java.sql.Timestamp;

public class NFSDX_Requesting_Organization {

	private int requesting_organization_id;
	private String requesting_organization_name;
	private String requesting_org_description;
	private String created_by;
	private Timestamp created_on;
	private String last_updated_by;
	private Timestamp last_updated_on;
	
	public int getRequesting_organization_id() {
		return requesting_organization_id;
	}
	public void setRequesting_organization_id(int requesting_organization_id) {
		this.requesting_organization_id = requesting_organization_id;
	}
	public String getRequesting_organization_name() {
		return requesting_organization_name;
	}
	public void setRequesting_organization_name(String requesting_organization_name) {
		this.requesting_organization_name = requesting_organization_name;
	}
	public String getRequesting_org_description() {
		return requesting_org_description;
	}
	public void setRequesting_org_description(String requesting_org_description) {
		this.requesting_org_description = requesting_org_description;
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
