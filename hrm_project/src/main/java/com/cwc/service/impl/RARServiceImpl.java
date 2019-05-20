package com.cwc.service.impl;

import com.cwc.dao.RARDao;
import com.cwc.model.RAR;
import com.cwc.service.RARService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RARServiceImpl implements RARService {
    @Resource
    private RARDao rarDao;

    public boolean addRAR(RAR rar) {
        if (rar == null){
            return false;
        }
        return rarDao.addRAR(rar);
    }

    public boolean delRAR(RAR rar) {
        if (rar == null){
            return false;
        }
        return rarDao.delRAR(rar);
    }

    public boolean updateRAR(RAR rar) {
        if (rar == null){
            return false;
        }
        return rarDao.updateRAR(rar);
    }

    public RAR queryRARById(RAR rar) {
        if (rar == null){
            return null;
        }
        return rarDao.queryRARById(rar);
    }

    public List<RAR> queryRARByResId(RAR rar) {
        if (rar == null){
            return null;
        }
        return rarDao.queryRARByResId(rar);
    }

    public List<RAR> queryRARByState() {
        RAR rar = new RAR();
        rar.setRar_state(1);
        return rarDao.queryRARByState(rar);
    }

    public List<RAR> queryRAR() {
        return rarDao.queryRAR();
    }
}
