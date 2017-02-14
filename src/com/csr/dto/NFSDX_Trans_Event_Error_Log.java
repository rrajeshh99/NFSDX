package com.csr.dto;

public class NFSDX_Trans_Event_Error_Log {

	private int transaction_event_error_log_id;
	private NFSDX_Transaction transaction;
	private NFSDX_Ref_Trans_Event_Error ref_trans_event_error;
	private String transaction_event_message;
	public int getTransaction_event_error_log_id() {
		return transaction_event_error_log_id;
	}
	public void setTransaction_event_error_log_id(int transaction_event_error_log_id) {
		this.transaction_event_error_log_id = transaction_event_error_log_id;
	}
	public NFSDX_Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(NFSDX_Transaction transaction) {
		this.transaction = transaction;
	}
	public NFSDX_Ref_Trans_Event_Error getRef_trans_event_error() {
		return ref_trans_event_error;
	}
	public void setRef_trans_event_error(NFSDX_Ref_Trans_Event_Error ref_trans_event_error) {
		this.ref_trans_event_error = ref_trans_event_error;
	}
	public String getTransaction_event_message() {
		return transaction_event_message;
	}
	public void setTransaction_event_message(String transaction_event_message) {
		this.transaction_event_message = transaction_event_message;
	}
	
}
