package org.yugong.auth.dao.generate;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yugong.auth.entity.generate.Group;
import org.yugong.auth.entity.generate.GroupExample;

public interface GroupMapper {
    /**
     * 
     * countByExample
     * 
     * @param example
     * 
     * @return {@link long}
     */
    long countByExample(GroupExample example);

    /**
     * 
     * deleteByExample
     * 
     * @param example
     * 
     * @return {@link int}
     */
    int deleteByExample(GroupExample example);

    /**
     * 
     * deleteByPrimaryKey
     * 
     * @param id
     * 
     * @return {@link int}
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 
     * insert
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int insert(Group record);

    /**
     * 
     * insertSelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int insertSelective(Group record);

    /**
     * 
     * selectByExample
     * 
     * @param example
     * 
     * @return {@link java.util.List<org.yugong.auth.entity.generate.Group>}
     */
    List<Group> selectByExample(GroupExample example);

    /**
     * 
     * selectByPrimaryKey
     * 
     * @param id
     * 
     * @return {@link org.yugong.auth.entity.generate.Group}
     */
    Group selectByPrimaryKey(Integer id);

    /**
     * 
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExampleSelective(@Param("record") Group record, @Param("example") GroupExample example);

    /**
     * 
     * updateByExample
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExample(@Param("record") Group record, @Param("example") GroupExample example);

    /**
     * 
     * updateByPrimaryKeySelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKeySelective(Group record);

    /**
     * 
     * updateByPrimaryKey
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKey(Group record);
}