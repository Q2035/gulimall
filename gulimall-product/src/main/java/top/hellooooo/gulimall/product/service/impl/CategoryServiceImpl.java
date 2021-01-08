package top.hellooooo.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.hellooooo.common.utils.PageUtils;
import top.hellooooo.common.utils.Query;

import top.hellooooo.gulimall.product.dao.CategoryDao;
import top.hellooooo.gulimall.product.entity.CategoryEntity;
import top.hellooooo.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 将结果保存为父子层级
        List<CategoryEntity> collect = entities.stream()
                .filter(entity -> entity.getParentCid() == 0)
                .map(parentEntity -> {
                    parentEntity.setChild(getChild(parentEntity, entities));
                    return parentEntity;
                })
                .sorted((entityBef, entityAft) -> (entityBef.getSort() == null ? 0 : entityBef.getSort()) - (entityAft.getSort() == null ? 0 : entityAft.getSort()))
                .collect(Collectors.toList());
        return collect;
    }

    // 递归查找子菜单
    List<CategoryEntity> getChild(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> collect = all.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == root.getCatId())
                .map(categoryEntity -> {
                    categoryEntity.setChild(getChild(categoryEntity, all));
                    return categoryEntity;
                })
                .sorted((entityBef, entityAft) -> (entityBef.getSort() == null ? 0 : entityBef.getSort()) - (entityAft.getSort() == null ? 0 : entityAft.getSort()))
                .collect(Collectors.toList());
        return collect;
    }

}