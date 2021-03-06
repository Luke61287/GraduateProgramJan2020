package com.mastek.hrapp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="JPA_TABLE_PER_CLASS_CHEQUE_PAYMENT") // define the table for each derived class.
// @DiscriminatorValue("CHEQUE") // value to be stored in Payment type for ChequePayment objects.
public class ChequePayment extends Payment {

	int chequeNumber;
	String bankName;
	
	public int getChequeNumber() {
		return chequeNumber;
	}
	
	public void setChequeNumber(int chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "ChequePayment [chequeNumber=" + chequeNumber + ", bankName=" + bankName + ", paymentno=" + paymentno
				+ ", amount=" + amount + "]";
	}
	
}