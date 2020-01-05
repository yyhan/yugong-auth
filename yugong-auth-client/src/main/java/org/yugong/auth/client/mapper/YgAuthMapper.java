package org.yugong.auth.client.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.yugong.auth.client.entity.InternalUser;
import org.yugong.auth.client.entity.YgAuthority;
import org.yugong.auth.client.entity.YgUser;

/**
 * @author 小天
 * @date 2020/1/5 1:19
 */
public interface YgAuthMapper {

    @Select("SELECT user_id AS userId, app_id AS appId, user_account AS userAccount, password AS password, user_name AS displayName " +
            "FROM sec_user " +
            "WHERE user_account = #{userAccount}")
    InternalUser getUserByUserAccount(@Param("userAccount") String userAccount);

    @Select("SELECT authority_id, app_id, authority_name, authority_code, authority_content, authority_type, authority_group, authority_desc, authority_icon, authorization_type " +
            "FROM sec_authority " +
            "WHERE authority_code=#{authorityCode}")
    YgAuthority getAuthorityByCode(@Param("authorityCode") String authorityCode);

    @Select("SELECT COUNT(1) " +
            "FROM sec_user_authority UA " +
            "WHERE UA.user_id = ${userId} AND UA.authority_id = ${authorityId}")
    boolean existUserAuthority(@Param("userId") Integer userId, @Param("authorityId") Integer authorityId);

    @Select("SELECT COUNT(1) " +
            "FROM sec_user_group UG " +
            "LEFT JOIN sec_group_authority GA ON UG.group_id = GA.group_id " +
            "WHERE UR.user_id = ${userId} AND RA.authority_id = ${authorityId}")
    boolean existGroupAuthority(@Param("userId") Integer userId, @Param("authorityId") Integer authorityId);

    @Select("SELECT COUNT(1) " +
            "FROM sec_user_role UR " +
            "LEFT JOIN sec_role_authority RA ON UR.role_id = RA.role_id " +
            "WHERE UR.user_id = ${userId} AND RA.authority_id = ${authorityId}")
    boolean existRoleAuthority(@Param("userId") Integer userId, @Param("authorityId") Integer authorityId);
}
