package com.cwc.service;

import com.cwc.model.Training;

public interface TrainingService {
    boolean addTraining(Training training);
    boolean delTraining(Training training);
    boolean updateTraining(Training training);
    Training queryTraining();
}
