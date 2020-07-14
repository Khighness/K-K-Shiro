package cc.mrbird.febs.others.mapper;

import cc.mrbird.febs.others.entity.DataPermissionTest;
import cc.mrbird.febs.common.annotation.DataPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Author: KHighness
 * @Date: 2020-7
 * @Description:
 */

@DataPermission(methods = {"selectPage"})
public interface DataPermissionTestMapper extends BaseMapper<DataPermissionTest> {

}
