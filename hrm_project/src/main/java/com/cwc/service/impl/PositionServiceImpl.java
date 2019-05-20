package com.cwc.service.impl;

import com.cwc.dao.PositionDao;
import com.cwc.model.Position;
import com.cwc.service.PositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Resource
    private PositionDao positionDao;

    public boolean addPosition(Position position) {
        if (position==null){
            return false;
        }
        return positionDao.addPosition(position);
    }

    public boolean delPosition(Position position) {
        if (position==null){
            return false;
        }
        return positionDao.delPosition(position);
    }

    public boolean updatePosition(Position position) {
        if (position==null){
            return false;
        }
        return positionDao.updatePosition(position);
    }

    public List<Position> queryPositionByDepId(Position position) {
        if (position == null){
            return null;
        }
        return positionDao.queryPositionByDepId(position);
    }

    public Position queryPosition() {
        return positionDao.queryPosition();
    }
}
