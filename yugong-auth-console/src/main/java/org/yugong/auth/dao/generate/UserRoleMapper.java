package org.yugong.auth.dao.generate;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yugong.auth.entity.generate.UserRole;
import org.yugong.auth.entity.generate.UserRoleExample;

public interface UserRoleMapper {
    /**
     * 
     * countByExample
     * 
     * @param example
     * 
     * @return {@link long}
     */
    long countByExample(UserRoleExample example);

    /**
     * 
     * deleteByExample
     * 
     * @param example
     * 
     * @return {@link int}
     */
    int deleteByExample(UserRoleExample example);

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
    int insert(UserRole record);

    /**
     * 
     * insertSelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int insertSelective(UserRole record);

    /**
     * 
     * selectByExample
     * 
     * @param example
     * 
     * @return {@link java.util.List<org.yugong.auth.entity.generate.UserRole>}
     */
    List<UserRole> selectByExample(UserRoleExample example);

    /**
     * 
     * selectByPrimaryKey
     * 
     * @param id
     * 
     * @return {@link org.yugong.auth.entity.generate.UserRole}
     */
    UserRole selectByPrimaryKey(Integer id);

    /**
     * 
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * 
     * updateByExample
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * 
     * updateByPrimaryKeySelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * 
     * updateByPrimaryKey
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKey(UserRole record);
}