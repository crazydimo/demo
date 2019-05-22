package com.cwc.service;

import com.cwc.model.RAP;

public interface RAPService {
    boolean addRAP(RAP rap);
    boolean delRAP(RAP rap);
    boolean updateRAP(RAP rap);
    RAP queryRAP();
}
