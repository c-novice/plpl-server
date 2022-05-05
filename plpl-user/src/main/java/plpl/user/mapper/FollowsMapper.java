package plpl.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plpl.common.model.FollowsInfo;
import org.mapstruct.Mapper;

/**
 * @author lzq
 */
@Mapper
public interface FollowsMapper extends BaseMapper<FollowsInfo> {
    /**
     * 分页条件查询
     *
     * @param page
     * @return
     */
    IPage<FollowsInfo> list(Page<?> page);
}
