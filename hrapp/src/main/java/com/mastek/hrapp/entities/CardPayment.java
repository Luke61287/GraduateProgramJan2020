package com.mastek.hrapp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="JPA_TABLE_PER_CLASS_CARD_PAYMENT") // define the table for each derived class.
// @DiscriminatorValue("CARD") // value to be stored in Payment type for CardPayment objects.
public class CardPayment extends Payment{
	
	long cardNumber;
	String cardService;
	
	public long getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getCardService() {
		return cardService;
	}
	
	public void setCardService(String cardService) {
		this.cardService = cardService;
	}
	
	@Override
	public String toString() {
		return "CardPayment [cardNumber=" + cardNumber + ", cardService=" + cardService + "]";
	}
	
}