package top.hellooooo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.hellooooo.common.utils.PageUtils;
import top.hellooooo.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author liangzai
 * @email 2383862181@qq.com
 * @date 2020-12-20 19:21:07
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

