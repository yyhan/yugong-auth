package org.yugong.auth.dao.generate;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yugong.auth.entity.generate.User;
import org.yugong.auth.entity.generate.UserExample;

public interface UserMapper {
    /**
     * 
     * countByExample
     * 
     * @param example
     * 
     * @return {@link long}
     */
    long countByExample(UserExample example);

    /**
     * 
     * deleteByExample
     * 
     * @param example
     * 
     * @return {@link int}
     */
    int deleteByExample(UserExample example);

    /**
     * 
     * deleteByPrimaryKey
     * 
     * @param userId
     * 
     * @return {@link int}
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * 
     * insert
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int insert(User record);

    /**
     * 
     * insertSelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int insertSelective(User record);

    /**
     * 
     * selectByExample
     * 
     * @param example
     * 
     * @return {@link java.util.List<org.yugong.auth.entity.generate.User>}
     */
    List<User> selectByExample(UserExample example);

    /**
     * 
     * selectByPrimaryKey
     * 
     * @param userId
     * 
     * @return {@link org.yugong.auth.entity.generate.User}
     */
    User selectByPrimaryKey(Integer userId);

    /**
     * 
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 
     * updateByExample
     * 
     * @param record
     * @param example
     * 
     * @return {@link int}
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 
     * updateByPrimaryKeySelective
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 
     * updateByPrimaryKey
     * 
     * @param record
     * 
     * @return {@link int}
     */
    int updateByPrimaryKey(User record);
}