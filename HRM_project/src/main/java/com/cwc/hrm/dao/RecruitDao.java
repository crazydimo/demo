package com.cwc.hrm.dao;

import com.cwc.hrm.model.Recruit;

public interface RecruitDao {
    boolean addRecruit(Recruit recruit);
    boolean deleteRecruit(Recruit recruit);
    boolean updateRecruit(Recruit recruit);
    Recruit queryRecruit();
}
