package top.hellooooo.gulimall.order.dao;

import top.hellooooo.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liangzai
 * @email 2383862181@qq.com
 * @date 2020-12-26 14:24:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
