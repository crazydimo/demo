package com.cwc.service;

import com.cwc.model.RAR;

import java.util.List;

public interface RARService {
    boolean addRAR(RAR rar);
    boolean delRAR(RAR rar);
    boolean updateRAR(RAR rar);
    RAR queryRARById(RAR rar);
    List<RAR> queryRARByResId(RAR rar);
    List<RAR> queryRARByState();
    List<RAR> queryRAR();
}
