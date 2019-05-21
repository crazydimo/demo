package com.cwc.dao;

import com.cwc.model.Training;

import java.util.List;

public interface TrainingDao {
    boolean addTraining(Training training);
    boolean delTraining(Training training);
    boolean updateTraining(Training training);
    List<Training> queryTraining();
}
