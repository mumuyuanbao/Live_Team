package com.live.liveteam.service;

import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.vo.GoodsTypeNameVO;

import java.util.List;

/**
 * 作者：张钰磊
 * 时间2019/9/8 15:17
 * 描述
 */
public interface GoodsTypeService {


 ResultVO<List<GoodsTypeNameVO>> queryTypeList();

 ResultVO<List<GoodsTypeNameVO>> querySecondTypeList(long id);

}
