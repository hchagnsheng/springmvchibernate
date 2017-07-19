package com.hcs.service.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hcs.base.service.impl.BaseServiceImpl;
import com.hcs.entity.AcctUser;
import com.hcs.service.AcctUserService;

@Service
@Transactional
public class AcctUserServiceImpl extends BaseServiceImpl<AcctUser>  implements AcctUserService{

}
