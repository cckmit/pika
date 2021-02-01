package com.wenlincheng.pika.message.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 验证码
 * </p>
 *
 * @author Pikaman
 * @since 2021-01-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("verification_code")
public class VerificationCode extends Model<VerificationCode> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("id")
    private Long id;

    /**
     * 手机号/邮箱验证码
     */
    @TableField("code")
    private String code;

    /**
     * 手机号/邮箱
     */
    @TableField("source")
    private String source;

    /**
     * 类型: 短信/邮箱
     */
    @TableField("source_type")
    private String sourceType;

    /**
     * 验证码类型
     */
    @TableField("verify_type")
    private String verifyType;

    /**
     * 验证码是否使用
     */
    @TableField("is_used")
    private Integer isUsed;

    /**
     * 外部订单号
     */
    @TableField("out_id")
    private String outId;

    /**
     * 外部业务id
     */
    @TableField("biz_id")
    private String bizId;

    /**
     * 过期时间
     */
    @TableField("expire_time")
    private Date expireTime;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;

    /**
     * 创建人
     */
    @TableField("create_user_id")
    private Long createUserId;

    /**
     * 更新人
     */
    @TableField("update_user_id")
    private Long updateUserId;

    /**
     * 逻辑删除
     */
    @TableField("is_deleted")
    private Long isDeleted;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
