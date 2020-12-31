package edu.njpi.crm.service.impl;

import edu.njpi.crm.mapper.BaseDictMapper;
import edu.njpi.crm.model.BaseDict;
import edu.njpi.crm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname BaseDictService
 * @Description TODO
 * @Date 2020/12/23 2:28 下午
 * @Created by lqj(1724226325@qq.com)
 */
@Service
public class BaseDictServiceImpl implements BaseDictService {
    @Autowired
    private BaseDictMapper baseDictMapper;
    @Override
    public List<BaseDict> findBaseListByTypeCode(String typeCode) {
        return baseDictMapper.selectBaseDictByTypeCode(typeCode);
    }
}
