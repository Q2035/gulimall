package top.hellooooo.gulimall.product.dao;

import top.hellooooo.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liangzai
 * @email 2383862181@qq.com
 * @date 2020-12-20 19:21:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
