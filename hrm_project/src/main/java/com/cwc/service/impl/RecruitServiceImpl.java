package com.cwc.service.impl;

import com.cwc.dao.RecruitDao;
import com.cwc.model.Recruit;
import com.cwc.service.RecruitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecruitServiceImpl implements RecruitService {
    @Resource
    private RecruitDao recruitDao;
    public boolean addRecruit(Recruit recruit) {
        if (recruit==null){
            return false;
        }
        return recruitDao.addRecruit(recruit);
    }

    public boolean deleteRecruit(Recruit recruit) {
        if (recruit==null){
            return false;
        }
        return recruitDao.deleteRecruit(recruit);
    }

    public boolean updateRecruit(Recruit recruit) {
        if (recruit==null){
            return false;
        }
        return recruitDao.updateRecruit(recruit);
    }

    public Recruit queryRecruitById(Recruit recruit) {
        if (recruit==null){
            return null;
        }
        return recruitDao.queryRecruitById(recruit);
    }

    public List<Recruit> queryRecruit() {
        return recruitDao.queryRecruit();
    }
}
