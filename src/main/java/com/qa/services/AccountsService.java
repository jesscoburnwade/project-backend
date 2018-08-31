package com.qa.services;

public interface AccountsService {
	
	String getAllAccounts();
	
	String createAccount(String newAccount);
	
	String updateAccount(Long id, String accountToUpdate);
	
	String deleteAccount(Long id);

}
