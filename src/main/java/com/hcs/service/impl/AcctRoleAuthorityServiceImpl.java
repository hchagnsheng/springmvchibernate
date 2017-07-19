package com.hcs.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hcs.base.service.impl.BaseServiceImpl;
import com.hcs.entity.AcctRoleAuthority;
import com.hcs.service.AcctRoleAuthorityService;

@Service
@Transactional
public class AcctRoleAuthorityServiceImpl extends BaseServiceImpl<AcctRoleAuthority>  implements AcctRoleAuthorityService{

}
