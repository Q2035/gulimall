package top.hellooooo.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.hellooooo.common.utils.PageUtils;
import top.hellooooo.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author liangzai
 * @email 2383862181@qq.com
 * @date 2020-12-26 14:18:02
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

