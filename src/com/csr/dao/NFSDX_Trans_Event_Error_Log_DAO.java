package com.csr.dao;

import java.sql.Clob;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;

import org.hibernate.Session;

import com.csr.common.HibernateUtil;
import com.csr.dto.NFSDX_Providing_Organization;
import com.csr.dto.NFSDX_Ref_Trans_Event_Error;
import com.csr.dto.NFSDX_Ref_Transaction_Type;
import com.csr.dto.NFSDX_Requesting_Organization;
import com.csr.dto.NFSDX_Trans_Event_Error_Log;
import com.csr.dto.NFSDX_Transaction;
import com.mysql.fabric.xmlrpc.base.Data;


public class NFSDX_Trans_Event_Error_Log_DAO {

	public void saveNFSDX_Trans_Event_Error_Log(){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        NFSDX_Transaction transaction = getTransaction();
        NFSDX_Requesting_Organization requesting_organization = (NFSDX_Requesting_Organization)session.get(NFSDX_Requesting_Organization.class, 123);
        NFSDX_Providing_Organization providing_organization = (NFSDX_Providing_Organization)session.get(NFSDX_Providing_Organization.class, 1);
        NFSDX_Ref_Transaction_Type ref_transaction_type =(NFSDX_Ref_Transaction_Type)session.get(NFSDX_Ref_Transaction_Type.class, 123);
        transaction.setProviding_organization(providing_organization);
        transaction.setRequesting_organization(requesting_organization);
        transaction.setRef_transaction_type(ref_transaction_type);
        
        NFSDX_Ref_Trans_Event_Error transactionEventError = (NFSDX_Ref_Trans_Event_Error)session.get(NFSDX_Ref_Trans_Event_Error.class,123);
        NFSDX_Trans_Event_Error_Log transEventErrorLog = new NFSDX_Trans_Event_Error_Log(); 
        transEventErrorLog.setRef_trans_event_error(transactionEventError);
        transEventErrorLog.setTransaction(transaction);
        transEventErrorLog.setTransaction_event_message("MSG");
        
        session.save(transaction);
        session.save(transEventErrorLog);
        
        session.getTransaction().commit();
	}
	
	public NFSDX_Transaction getTransaction(){
		NFSDX_Transaction transaction = new NFSDX_Transaction();
		transaction.setCreated_by("user");
		transaction.setTransaction_status("OPEN");
		return transaction;
		
	}
	public NFSDX_Ref_Transaction_Type getTransactionType(){
		NFSDX_Ref_Transaction_Type type = new NFSDX_Ref_Transaction_Type();
		type.setTransaction_type_code("2020");
		type.setTransaction_type_description("2020_DESC");
		type.setCreated_by("user");
		return type;
	}
	
	public static void main(String args[]){
		NFSDX_Trans_Event_Error_Log_DAO dao = new NFSDX_Trans_Event_Error_Log_DAO();
		dao.saveNFSDX_Trans_Event_Error_Log();
//		dao.saveRequestXML();
				}
	
	

	
	
}
