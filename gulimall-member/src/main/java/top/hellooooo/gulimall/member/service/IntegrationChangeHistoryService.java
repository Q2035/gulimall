package top.hellooooo.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.hellooooo.common.utils.PageUtils;
import top.hellooooo.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author liangzai
 * @email 2383862181@qq.com
 * @date 2020-12-26 14:18:02
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

