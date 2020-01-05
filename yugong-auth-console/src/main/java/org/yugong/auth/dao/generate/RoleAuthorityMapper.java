package org.yugong.auth.dao.generate;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yugong.auth.entity.generate.RoleAuthority;
import org.yugong.auth.entity.generate.RoleAuthorityExample;

public interface RoleAuthorityMapper {
    /**
     * 
     * countByExample
     * 
     * @param example
     * 
     * @return {@link long}
     */
    long countByExample(RoleAuthorityExample example);

    /**
     * 
     * deleteByExample
     * 
     * @param example
     * 
     * @return {@link int}
     */
    int deleteByExample(RoleAuthorityExample example);

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
    int insert(RoleAuthority record);

    /**
     * 
     * insertSelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int insertSelective(RoleAuthority record);

    /**
     * 
     * selectByExample
     * 
     * @param example
     * 
     * @return {@link java.util.List<org.yugong.auth.entity.generate.RoleAuthority>}
     */
    List<RoleAuthority> selectByExample(RoleAuthorityExample example);

    /**
     * 
     * selectByPrimaryKey
     * 
     * @param id
     * 
     * @return {@link org.yugong.auth.entity.generate.RoleAuthority}
     */
    RoleAuthority selectByPrimaryKey(Integer id);

    /**
     * 
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExampleSelective(@Param("record") RoleAuthority record, @Param("example") RoleAuthorityExample example);

    /**
     * 
     * updateByExample
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExample(@Param("record") RoleAuthority record, @Param("example") RoleAuthorityExample example);

    /**
     * 
     * updateByPrimaryKeySelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKeySelective(RoleAuthority record);

    /**
     * 
     * updateByPrimaryKey
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKey(RoleAuthority record);
}