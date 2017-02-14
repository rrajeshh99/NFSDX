package com.csr.dto;

import java.sql.Timestamp;

public class NFSDX_Ref_Trans_Event_Error {

	private int ref_transaction_event_error_id ;
	private String  transaction_event_error_code ;
	private String  transaction_event_error_desc ;
	private String created_by;
	private Timestamp created_on;
	private String last_updated_by;
	private Timestamp last_updated_on;
	public int getRef_transaction_event_error_id() {
		return ref_transaction_event_error_id;
	}
	public void setRef_transaction_event_error_id(int ref_transaction_event_error_id) {
		this.ref_transaction_event_error_id = ref_transaction_event_error_id;
	}
	public String getTransaction_event_error_code() {
		return transaction_event_error_code;
	}
	public void setTransaction_event_error_code(String transaction_event_error_code) {
		this.transaction_event_error_code = transaction_event_error_code;
	}
	public String getTransaction_event_error_desc() {
		return transaction_event_error_desc;
	}
	public void setTransaction_event_error_desc(String transaction_event_error_desc) {
		this.transaction_event_error_desc = transaction_event_error_desc;
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
