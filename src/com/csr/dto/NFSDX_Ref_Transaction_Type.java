package com.csr.dto;

import java.sql.Timestamp;

public class NFSDX_Ref_Transaction_Type {

	private int ref_transaction_type_id;
	private String transaction_type_code;
	private String transaction_type_description;
	private String created_by;
	private Timestamp created_on;
	public int getRef_transaction_type_id() {
		return ref_transaction_type_id;
	}
	public void setRef_transaction_type_id(int ref_transaction_type_id) {
		this.ref_transaction_type_id = ref_transaction_type_id;
	}
	public String getTransaction_type_code() {
		return transaction_type_code;
	}
	public void setTransaction_type_code(String transaction_type_code) {
		this.transaction_type_code = transaction_type_code;
	}
	public String getTransaction_type_description() {
		return transaction_type_description;
	}
	public void setTransaction_type_description(String transaction_type_description) {
		this.transaction_type_description = transaction_type_description;
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
	private String last_updated_by;
	private Timestamp last_updated_on;
}
