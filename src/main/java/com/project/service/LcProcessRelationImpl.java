package com.project.service;

import org.springframework.stereotype.Service;

@Service
public class LcProcessRelationImpl implements LcProcessRelationInterface {
	
	
	@Override
	public String sendResult(String username, String crushname) {
		
		
		int remainder=((username+crushname).length() -1)%6;
		
		if (remainder==0)
			return LcProcessRelationConstants.F_CHAR;
		else if(remainder==1)
			return LcProcessRelationConstants.L_CHAR;
		else if(remainder==2)
			return LcProcessRelationConstants.A_CHAR;
		else if(remainder==3)
			return LcProcessRelationConstants.M_CHAR;
		else if(remainder==4)
			return LcProcessRelationConstants.E_CHAR;
		else
			return LcProcessRelationConstants.S_CHAR;
		
	}

}
