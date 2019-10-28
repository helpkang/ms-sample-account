package com.koreanair.common_adapter.pid.connector;

import com.koreanair.common_adapter.pid.vo.PidInputVo;

public interface PidConnector {

    public Object call(PidInputVo vo) throws Exception;
}
