package com.cwc.dao;

import com.cwc.model.Recruit;

import java.util.List;

public interface RecruitDao {
    boolean addRecruit(Recruit recruit);
    boolean deleteRecruit(Recruit recruit);
    boolean updateRecruit(Recruit recruit);
    Recruit queryRecruitById(Recruit recruit);
    List<Recruit> queryRecruit();
}
