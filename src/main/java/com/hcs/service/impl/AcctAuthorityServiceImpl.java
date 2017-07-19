package com.hcs.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hcs.base.service.impl.BaseServiceImpl;
import com.hcs.entity.AcctAuthority;
import com.hcs.service.AcctAuthorityService;

@Service
@Transactional
public class AcctAuthorityServiceImpl extends BaseServiceImpl<AcctAuthority>  implements AcctAuthorityService{

	
}
