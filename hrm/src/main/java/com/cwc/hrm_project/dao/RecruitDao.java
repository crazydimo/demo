package com.cwc.hrm_project.dao;

import com.cwc.hrm_project.model.Recruit;

public interface RecruitDao {
    boolean addRecruit(Recruit recruit);
    boolean deleteRecruit(Recruit recruit);
    boolean updateRecruit(Recruit recruit);
    Recruit queryRecruit();
}
