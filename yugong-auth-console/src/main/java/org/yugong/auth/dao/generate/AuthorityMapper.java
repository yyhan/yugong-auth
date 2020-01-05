package org.yugong.auth.dao.generate;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yugong.auth.entity.generate.Authority;
import org.yugong.auth.entity.generate.AuthorityExample;

public interface AuthorityMapper {
    /**
     * 
     * countByExample
     * 
     * @param example
     * 
     * @return {@link long}
     */
    long countByExample(AuthorityExample example);

    /**
     * 
     * deleteByExample
     * 
     * @param example
     * 
     * @return {@link int}
     */
    int deleteByExample(AuthorityExample example);

    /**
     * 
     * deleteByPrimaryKey
     * 
     * @param authorityId
     * 
     * @return {@link int}
     */
    int deleteByPrimaryKey(Integer authorityId);

    /**
     * 
     * insert
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int insert(Authority record);

    /**
     * 
     * insertSelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int insertSelective(Authority record);

    /**
     * 
     * selectByExample
     * 
     * @param example
     * 
     * @return {@link java.util.List<org.yugong.auth.entity.generate.Authority>}
     */
    List<Authority> selectByExample(AuthorityExample example);

    /**
     * 
     * selectByPrimaryKey
     * 
     * @param authorityId
     * 
     * @return {@link org.yugong.auth.entity.generate.Authority}
     */
    Authority selectByPrimaryKey(Integer authorityId);

    /**
     * 
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExampleSelective(@Param("record") Authority record, @Param("example") AuthorityExample example);

    /**
     * 
     * updateByExample
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExample(@Param("record") Authority record, @Param("example") AuthorityExample example);

    /**
     * 
     * updateByPrimaryKeySelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKeySelective(Authority record);

    /**
     * 
     * updateByPrimaryKey
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKey(Authority record);
}