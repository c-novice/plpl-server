package plpl.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plpl.common.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lzq
 */
@Mapper
public interface UserMapper extends BaseMapper<UserInfo> {
}