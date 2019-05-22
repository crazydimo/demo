package com.cwc.dao;

import com.cwc.model.RAP;

public interface RAPDao {
    boolean addRAP(RAP rap);
    boolean delRAP(RAP rap);
    boolean updateRAP(RAP rap);
    RAP queryRAP();
}
