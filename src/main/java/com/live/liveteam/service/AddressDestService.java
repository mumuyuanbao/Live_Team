package com.live.liveteam.service;

import com.live.liveteam.common.result.ResultVO;
import com.live.liveteam.entity.Address;
import com.live.liveteam.entity.AddressDest;
import com.live.liveteam.vo.AddressDestVO;

import java.util.List;

/**
 * 作者：张钰磊
 * 时间2019/9/11 21:36
 * 描述地址管理
 */
public interface AddressDestService {
    ResultVO<List<AddressDestVO>> selectAddressDest(String open_id);

    ResultVO alterAddressDefault(Long id);

    ResultVO insertAddressDest(AddressDest addressDest);

    ResultVO alterAddressDest(AddressDest addressDest);

    ResultVO deleteAddressDest(AddressDest addressDest);
}
