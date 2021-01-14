package com.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.CreditCard;
import com.dao.CreditCardRepository;



@Service
public class CreditCardBO {
	@Autowired
	CreditCardRepository creditCardRepo; 
	
	public List<CreditCard> getCreditCards(){
		return creditCardRepo.findAll(); 		
	}
	
	public CreditCard getCreditCardById(Integer id) {
		if(creditCardRepo.existsById(id)){
			return creditCardRepo.getOne(id);
		}else
			return null; 
	}
	
	public CreditCard addCreditCard(CreditCard cc) {
		return creditCardRepo.save(cc); 
	}
	
	public void deleteCreditCardById(int ccId) {
		creditCardRepo.deleteById(ccId);
	}
	
	
}
