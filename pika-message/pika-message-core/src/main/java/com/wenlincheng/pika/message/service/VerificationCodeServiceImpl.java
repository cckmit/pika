package com.wenlincheng.pika.message.service;

import com.wenlincheng.pika.message.entity.po.VerificationCode;
import com.wenlincheng.pika.message.mapper.VerificationCodeMapper;
import com.wenlincheng.pika.message.api.VerificationCodeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 验证码 服务实现类
 * </p>
 *
 * @author Pikaman
 * @since 2021-01-24
 */
@Service
public class VerificationCodeServiceImpl extends ServiceImpl<VerificationCodeMapper, VerificationCode> implements VerificationCodeService {

}
