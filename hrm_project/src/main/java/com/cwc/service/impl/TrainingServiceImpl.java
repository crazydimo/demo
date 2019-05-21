package com.cwc.service.impl;

import com.cwc.dao.TrainingDao;
import com.cwc.model.Training;
import com.cwc.service.TrainingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {
    @Resource
    private TrainingDao trainingDao;
    public boolean addTraining(Training training) {
        if (training==null){
            return false;
        }
        return trainingDao.addTraining(training);
    }

    public boolean delTraining(Training training) {
        if (training==null){
            return false;
        }
        return trainingDao.delTraining(training);
    }

    public boolean updateTraining(Training training) {
        if (training==null){
            return false;
        }
        return trainingDao.updateTraining(training);
    }

    public List<Training> queryTraining() {
        return trainingDao.queryTraining();
    }
}
