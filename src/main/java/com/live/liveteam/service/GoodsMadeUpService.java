package com.live.liveteam.service;

import com.live.liveteam.entity.GoodsMadeUp;

import java.util.List;

public interface GoodsMadeUpService {
    List<GoodsMadeUp> selectByGId(Long gId);
}
