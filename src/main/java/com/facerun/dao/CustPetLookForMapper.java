package com.facerun.dao;

import com.facerun.bean.PetLookfor;

import java.util.List;
import java.util.Map;

/**
 * 寻犬相关接口
 */
public interface CustPetLookForMapper {

    /**
     * @return
     */
    List<PetLookfor> getLookForList(Map params);

}
