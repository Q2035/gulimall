package top.hellooooo.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.hellooooo.common.utils.PageUtils;
import top.hellooooo.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author liangzai
 * @email 2383862181@qq.com
 * @date 2020-12-26 13:52:13
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

