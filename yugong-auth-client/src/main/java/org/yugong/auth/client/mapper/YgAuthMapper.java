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
            "FROM sec_user U " +
            "WHERE U.user_account = #{userAccount} AND U.app_id = ${appId} ")
    InternalUser getUserByUserAccount(@Param("appId") Integer appId, @Param("userAccount") String userAccount);

    @Select("SELECT authority_id, app_id, authority_name, authority_code, authority_content, authority_type, authority_group, authority_desc, authority_icon, authorization_type " +
            "FROM sec_authority A " +
            "WHERE A.app_id = ${appId} AND A.authority_code=#{authorityCode}")
    YgAuthority getAuthorityByCode(@Param("appId") Integer appId, @Param("authorityCode") String authorityCode);

    @Select("SELECT COUNT(1) " +
            "FROM sec_user U " +
            "LEFT JOIN sec_user_authority UA ON UA.user_id = U.user_id " +
            "WHERE U.user_id = ${userId} AND U.app_id = ${appId} AND UA.authority_id = ${authorityId}")
    boolean existUserAuthority(@Param("userId") Integer userId, @Param("appId") Integer appId, @Param("authorityId") Integer authorityId);

    @Select("SELECT COUNT(1) " +
            "FROM sec_user U " +
            "LEFT JOIN sec_user_authority UA ON UA.user_id = U.user_id " +
            "LEFT JOIN sec_authority A ON A.authority_id = UA.authority_id " +
            "WHERE U.user_id = ${userId} AND U.app_id = ${appId} AND A.authority_code = #{authorityCode}")
    boolean existUserAuthorityCode(@Param("userId") Integer userId, @Param("appId") Integer appId, @Param("authorityCode") String authorityCode);

    @Select("SELECT COUNT(1) " +
            "FROM sec_user U " +
            "LEFT JOIN sec_user_group UG ON UG.user_id = U.user_id " +
            "LEFT JOIN sec_group_authority GA ON GA.group_id = UG.group_id " +
            "WHERE U.user_id = ${userId} AND U.app_id = ${appId} AND GA.authority_id = ${authorityId}")
    boolean existGroupAuthority(@Param("userId") Integer userId, @Param("appId") Integer appId, @Param("authorityId") Integer authorityId);

    @Select("SELECT COUNT(1) " +
            "FROM sec_user U " +
            "LEFT JOIN sec_user_role UR ON UR.user_id = U.user_id " +
            "LEFT JOIN sec_role_authority RA ON UR.role_id = RA.role_id " +
            "WHERE U.user_id = ${userId} AND U.app_id = ${appId} AND RA.authority_id = ${authorityId}")
    boolean existRoleAuthority(@Param("userId") Integer userId, @Param("appId") Integer appId, @Param("authorityId") Integer authorityId);

    @Select("SELECT COUNT(1) " +
            "FROM sec_user U " +
            "LEFT JOIN sec_user_role UR ON UR.user_id = U.user_id " +
            "LEFT JOIN sec_role R ON R.role_id = UR.role_id " +
            "WHERE U.user_id = ${userId} AND U.app_id = ${appId} AND R.role_code = #{roleCode}")
    boolean existUserRole(@Param("userId") Integer userId, @Param("appId") Integer appId, @Param("roleCode") String roleCode);
}
