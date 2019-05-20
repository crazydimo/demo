package com.cwc.service;

import com.cwc.model.TAE;

import java.util.List;

public interface TAEService {
    boolean addTAE(TAE tae);
    boolean delTAE(TAE tae);
    boolean updateTAE(TAE tae);
    List<TAE> queryTAEByEmpId(TAE tae);
    List<TAE> queryTAEByTraId(TAE tae);
}
