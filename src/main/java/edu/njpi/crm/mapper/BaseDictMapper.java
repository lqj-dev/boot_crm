package edu.njpi.crm.mapper;

import edu.njpi.crm.model.BaseDict;

import java.util.List;

public interface BaseDictMapper {
    public List<BaseDict> selectBaseDictByTypeCode(String typeCode);
}
