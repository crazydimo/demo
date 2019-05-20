package com.cwc.service;

import com.cwc.model.Position;

import java.util.List;

public interface PositionService {
    boolean addPosition(Position position);
    boolean delPosition(Position position);
    boolean updatePosition(Position position);
    List<Position> queryPositionByDepId(Position position);
    Position queryPosition();
}
