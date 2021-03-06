package com.nene.chicken.Service;

import com.nene.chicken.Model.RawPosition;
import com.nene.chicken.Model.TransPosition;

import java.util.List;

/**
 * Created by ParkHaeSung on 2017-09-16.
 */

public interface DistanceService {
    /**
     * 좌표로 검색하여 8km이내인지 알아야함
     * */
    boolean canWalkingDistance(double startLat, double startLog, double destLat, double destLog);

    List<TransPosition> getPathList(TransPosition startPosition,TransPosition endPosition);


}
