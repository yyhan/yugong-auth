package org.yugong.auth.dao.generate;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yugong.auth.entity.generate.Role;
import org.yugong.auth.entity.generate.RoleExample;

public interface RoleMapper {
    /**
     * 
     * countByExample
     * 
     * @param example
     * 
     * @return {@link long}
     */
    long countByExample(RoleExample example);

    /**
     * 
     * deleteByExample
     * 
     * @param example
     * 
     * @return {@link int}
     */
    int deleteByExample(RoleExample example);

    /**
     * 
     * deleteByPrimaryKey
     * 
     * @param roleId
     * 
     * @return {@link int}
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * 
     * insert
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int insert(Role record);

    /**
     * 
     * insertSelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int insertSelective(Role record);

    /**
     * 
     * selectByExample
     * 
     * @param example
     * 
     * @return {@link java.util.List<org.yugong.auth.entity.generate.Role>}
     */
    List<Role> selectByExample(RoleExample example);

    /**
     * 
     * selectByPrimaryKey
     * 
     * @param roleId
     * 
     * @return {@link org.yugong.auth.entity.generate.Role}
     */
    Role selectByPrimaryKey(Integer roleId);

    /**
     * 
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * 
     * updateByExample
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * 
     * updateByPrimaryKeySelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * 
     * updateByPrimaryKey
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKey(Role record);
}