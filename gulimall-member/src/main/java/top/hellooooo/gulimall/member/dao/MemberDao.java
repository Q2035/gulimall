package top.hellooooo.gulimall.member.dao;

import top.hellooooo.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liangzai
 * @email 2383862181@qq.com
 * @date 2020-12-26 14:18:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
