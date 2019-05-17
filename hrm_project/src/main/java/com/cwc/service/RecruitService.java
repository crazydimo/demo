package com.cwc.service;

import com.cwc.model.Recruit;

import java.util.List;

public interface RecruitService {
    boolean addRecruit(Recruit recruit);
    boolean deleteRecruit(Recruit recruit);
    boolean updateRecruit(Recruit recruit);
    List<Recruit> queryRecruit();
}
