package com.cwc.dao;

import com.cwc.model.Training;

public interface TrainingDao {
    boolean addTraining(Training training);
    boolean delTraining(Training training);
    boolean updateTraining(Training training);
    Training queryTraining();
}
