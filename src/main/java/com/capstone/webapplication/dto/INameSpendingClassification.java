package com.capstone.webapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public interface INameSpendingClassification {
	
	
	Integer getCreditCardId();
	String getCustomerName();
	String getTotalSpending();
	String getCustomerClassification();
	
	


}
