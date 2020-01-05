package org.yugong.auth.dao.generate;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yugong.auth.entity.generate.UserGroup;
import org.yugong.auth.entity.generate.UserGroupExample;

public interface UserGroupMapper {
    /**
     * 
     * countByExample
     * 
     * @param example
     * 
     * @return {@link long}
     */
    long countByExample(UserGroupExample example);

    /**
     * 
     * deleteByExample
     * 
     * @param example
     * 
     * @return {@link int}
     */
    int deleteByExample(UserGroupExample example);

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
    int insert(UserGroup record);

    /**
     * 
     * insertSelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int insertSelective(UserGroup record);

    /**
     * 
     * selectByExample
     * 
     * @param example
     * 
     * @return {@link java.util.List<org.yugong.auth.entity.generate.UserGroup>}
     */
    List<UserGroup> selectByExample(UserGroupExample example);

    /**
     * 
     * selectByPrimaryKey
     * 
     * @param id
     * 
     * @return {@link org.yugong.auth.entity.generate.UserGroup}
     */
    UserGroup selectByPrimaryKey(Integer id);

    /**
     * 
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExampleSelective(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    /**
     * 
     * updateByExample
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExample(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    /**
     * 
     * updateByPrimaryKeySelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKeySelective(UserGroup record);

    /**
     * 
     * updateByPrimaryKey
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKey(UserGroup record);
}