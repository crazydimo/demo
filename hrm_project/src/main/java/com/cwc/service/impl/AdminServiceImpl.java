package com.cwc.service.impl;

import com.cwc.dao.AdminDao;
import com.cwc.model.Admin;
import com.cwc.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;

    public Admin login(Admin admin) {
        if (admin==null){
            return null;
        }
        return adminDao.queryAdminByNameAndPass(admin);
    }
}
