package com.hcs.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hcs.base.service.impl.BaseServiceImpl;
import com.hcs.entity.AcctRole;
import com.hcs.service.AcctRoleService;

@Service
@Transactional
public class AcctRoleServiceImpl extends BaseServiceImpl<AcctRole>  implements AcctRoleService{

}
