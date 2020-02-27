package com.mastek.hrapp.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="JPA_TABLE_PER_CLASS_PAYMENT") // define the table for each derived class.
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
// @DiscriminatorColumn(discriminatorType=DiscriminatorType.STRING, name="PAYMENT_TYPE")// identify the discriminator column.
// @DiscriminatorValue("CASH") // value to be stored in Payment type for CardPayment objects.

	public class Payment {
		int paymentno;
		double amount;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getPaymentno() {
		return paymentno;
	}
	
	public void setPaymentno(int paymentno) {
		this.paymentno = paymentno;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Payment [paymentno=" + paymentno + ", amount=" + amount + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + paymentno;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (paymentno != other.paymentno)
			return false;
		return true;
	}

}