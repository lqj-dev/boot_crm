package edu.njpi.crm.service;

import edu.njpi.crm.model.BaseDict;

import java.util.List;

public interface BaseDictService {
    public List<BaseDict> findBaseListByTypeCode(String typecode);
}
