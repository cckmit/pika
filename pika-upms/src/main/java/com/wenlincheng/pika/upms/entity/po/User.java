package com.wenlincheng.pika.upms.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Pikaman
 * @date 2021/1/1 10:10 上午
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 用户姓名
     */
    @TableField("name")
    private String name;

    /**
     * 手机号
     */
    @TableField("mobile")
    private String mobile;

    /**
     * 头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 性别 0 未知 1 男 2 女
     */
    @TableField("gender")
    private Integer gender;

    /**
     * 城市
     */
    @TableField("city")
    private String city;

    /**
     * 签名
     */
    @TableField("signature")
    private String signature;

    /**
     * 简介
     */
    @TableField("description")
    private String description;

    /**
     * 类型 1 普通用户 2 管理员 3 官方号 4 马甲号
     */
    @TableField("type")
    private Integer type;

    /**
     * 是否有效用户 0 否 1 是
     */
    @TableField("enabled")
    private Integer enabled;

    /**
     * 账号是否未过期 0 否 1 是
     */
    @TableField("account_non_expired")
    private Integer accountNonExpired;

    /**
     * 密码是否未过期 0 否 1 是
     */
    @TableField("credentials_non_expired")
    private Integer credentialsNonExpired;

    /**
     * 是否未锁定 0 否 1 是
     */
    @TableField("account_non_locked")
    private Integer accountNonLocked;

    /**
     * 是否激活 0 否 1 是
     */
    @TableField("status")
    private Integer status;

    /**
     * 是否已删除 0 否 1 是
     */
    @TableField("is_deleted")
    private Integer isDeleted;

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


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
