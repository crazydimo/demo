package com.cwc.service.impl;

import com.cwc.dao.RAPDao;
import com.cwc.model.RAP;
import com.cwc.service.RAPService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RAPServiceImpl implements RAPService {
    @Resource
    private RAPDao rapDao;
    public boolean addRAP(RAP rap) {
        if (rap==null){
            return false;
        }
        return rapDao.addRAP(rap);
    }

    public boolean delRAP(RAP rap) {
        if (rap==null){
            return false;
        }
        return rapDao.delRAP(rap);
    }

    public boolean updateRAP(RAP rap) {
        if (rap==null){
            return false;
        }
        return rapDao.updateRAP(rap);
}

    public RAP queryRAP() {
        return rapDao.queryRAP();
    }
}
