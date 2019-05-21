package com.cwc.service;

import com.cwc.model.Training;

import java.util.List;

public interface TrainingService {
    boolean addTraining(Training training);
    boolean delTraining(Training training);
    boolean updateTraining(Training training);
    List<Training> queryTraining();

}
