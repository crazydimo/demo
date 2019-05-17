package com.cwc.dao;

import com.cwc.model.Admin;

public interface AdminDao {
    Admin queryAdminByNameAndPass(Admin admin);
}
