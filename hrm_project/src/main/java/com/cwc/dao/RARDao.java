package com.cwc.dao;

import com.cwc.model.RAR;

import java.util.List;

public interface RARDao {
    boolean addRAR(RAR rar);
    boolean delRAR(RAR rar);
    boolean updateRAR(RAR rar);
    List<RAR> queryRARByResId(RAR rar);
    List<RAR> queryRARByState(RAR rar);
    List<RAR> queryRAR();
}
