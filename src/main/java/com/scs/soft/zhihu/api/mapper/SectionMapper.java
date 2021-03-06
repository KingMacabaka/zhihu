package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SectionMapper {
    /**
     * 根据专题id查询标签列表
     * @return
     */
    @Select(" SELECT * FROM t_section WHERE special_id= #{specialId} ")
    List<Section> getSectionBySpecialId(String specialId);
}
