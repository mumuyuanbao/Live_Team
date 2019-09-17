package com.live.liveteam.service.impl;


import com.live.liveteam.entity.GoodsMadeUp;
import com.live.liveteam.entity.GoodsMadeUpExample;
import com.live.liveteam.mapper.GoodsMadeUpMapper;
import com.live.liveteam.service.GoodsMadeUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：木木豹
 * 时间2019-09-16 19:26
 * 描述：
 */
@Service
public class GoodsMadeUpServiceImpl implements GoodsMadeUpService {

    @Autowired
     private  GoodsMadeUpMapper goodsMadeUpMapper;
    /**
     * 查找配方list
     * @param gId
     * @return
     */
    @Override
    public List<GoodsMadeUp> selectByGId(Long gId) {

        GoodsMadeUpExample goodsMadeUpExample = new GoodsMadeUpExample();
        GoodsMadeUpExample.Criteria criteria = goodsMadeUpExample.createCriteria();
        criteria.andGIdEqualTo(gId);
        List<GoodsMadeUp> goodsMadeUpList = goodsMadeUpMapper.selectByExample(goodsMadeUpExample);
        return goodsMadeUpList;
    }
}
