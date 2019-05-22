package com.cwc.service.impl;

import com.cwc.dao.TAEDao;
import com.cwc.model.TAE;
import com.cwc.service.TAEService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TAEServiceImpl implements TAEService {
    @Resource
    private TAEDao taeDao;
    public boolean addTAE(TAE tae) {
        if (tae==null){
            return false;
        }
        return taeDao.addTAE(tae);
    }

    public boolean delTAE(TAE tae) {
        if (tae==null){
            return false;
        }
        return taeDao.delTAE(tae);
    }

    public boolean updateTAE(TAE tae) {
        if (tae==null){
            return false;
        }
        return taeDao.updateTAE(tae);
    }

    public List<TAE> queryTAEByEmpId(TAE tae) {
        return taeDao.queryTAEByEmpId(tae);
    }

    public List<TAE> queryTAEByTraId(TAE tae) {
        return taeDao.queryTAEByTraId(tae);
    }
}
