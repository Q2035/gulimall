package top.hellooooo.gulimall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import top.hellooooo.common.utils.R;

/**
 * @Author Q
 * @Date 29/12/2020 20:13
 * @Description
 */
@FeignClient("gulimall-coupon") // 注册中心中服务列表的服务名
public interface CouponFeignService {
    // 对应的优惠券服务的接口
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
