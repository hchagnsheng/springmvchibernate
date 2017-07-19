package com.hcs.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hcs.base.service.impl.BaseServiceImpl;
import com.hcs.entity.AcctUserRole;
import com.hcs.service.AcctUserRoleService;

@Service
@Transactional
public class AcctUserRoleServiceImpl extends BaseServiceImpl<AcctUserRole>  implements AcctUserRoleService{

}
