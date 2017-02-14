package com.csr.dto;

import java.sql.Timestamp;

public class NFSDX_Transaction {

	private int transaction_id;
	private NFSDX_Requesting_Organization requesting_organization;
	private NFSDX_Providing_Organization providing_organization;
	private Timestamp transaction_datetimestamp;
	private String transaction_status;
	private NFSDX_Ref_Transaction_Type ref_transaction_type;
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public NFSDX_Requesting_Organization getRequesting_organization() {
		return requesting_organization;
	}
	public void setRequesting_organization(NFSDX_Requesting_Organization requesting_organization) {
		this.requesting_organization = requesting_organization;
	}
	public NFSDX_Providing_Organization getProviding_organization() {
		return providing_organization;
	}
	public void setProviding_organization(NFSDX_Providing_Organization providing_organization) {
		this.providing_organization = providing_organization;
	}
	public Timestamp getTransaction_datetimestamp() {
		return transaction_datetimestamp;
	}
	public void setTransaction_datetimestamp(Timestamp transaction_datetimestamp) {
		this.transaction_datetimestamp = transaction_datetimestamp;
	}
	public String getTransaction_status() {
		return transaction_status;
	}
	public void setTransaction_status(String transaction_status) {
		this.transaction_status = transaction_status;
	}
	public NFSDX_Ref_Transaction_Type getRef_transaction_type() {
		return ref_transaction_type;
	}
	public void setRef_transaction_type(NFSDX_Ref_Transaction_Type ref_transaction_type) {
		this.ref_transaction_type = ref_transaction_type;
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
	private String created_by;
	private Timestamp created_on;
	private String last_updated_by;
	private Timestamp last_updated_on;

}
