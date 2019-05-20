package com.cwc.dao;

import com.cwc.model.TAE;

import java.util.List;

public interface TAEDao {
    boolean addTAE(TAE tae);
    boolean delTAE(TAE tae);
    boolean updateTAE(TAE tae);
    List<TAE> queryTAEByEmpId(TAE tae);
    List<TAE> queryTAEByTraId(TAE tae);
}
