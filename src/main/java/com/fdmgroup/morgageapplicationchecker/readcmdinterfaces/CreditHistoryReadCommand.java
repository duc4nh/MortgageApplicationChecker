package com.fdmgroup.morgageapplicationchecker.readcmdinterfaces;

import com.fdmgroup.morgageapplicationchecker.entities.CreditHistory;

public interface CreditHistoryReadCommand {

	public CreditHistory getCreditHistoryByClientId(int clientId);
}
