package com.wenlincheng.pika.common.core.base.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 带编码的实体
 *
 * @author Pikaman
 * @version 1.0.0
 * @date 2021/1/1 10:10 上午
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class CodeModel<T extends CodeModel<?>> extends IdModel<T> {

    /**
     * 编码
     */
    private String code;
}
