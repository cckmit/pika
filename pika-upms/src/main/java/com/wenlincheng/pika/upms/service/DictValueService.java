package com.wenlincheng.pika.upms.service;

import com.wenlincheng.pika.upms.entity.po.DictValue;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wenlincheng.pika.upms.entity.vo.dict.DictValueVO;

import java.util.List;

/**
 * <p>
 * 数据字典值 服务类
 * </p>
 *
 * @author Pikaman
 * @since 2021-04-18
 */
public interface DictValueService extends IService<DictValue> {

    /**
     * 根据字典类型id查询字典值列表
     *
     * @param dictTypeId 字典类型id
     * @return List<DictValueVO>
     */
    List<DictValueVO> getByDictTypeId(Long dictTypeId);
}
