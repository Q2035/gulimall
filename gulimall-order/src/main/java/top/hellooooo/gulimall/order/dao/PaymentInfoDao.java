package top.hellooooo.gulimall.order.dao;

import top.hellooooo.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author liangzai
 * @email 2383862181@qq.com
 * @date 2020-12-26 14:24:44
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
