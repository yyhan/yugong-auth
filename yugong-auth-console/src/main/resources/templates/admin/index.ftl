<#compress >
<#-- 必须引入layout宏定义文件 -->
    <#import "../_common/layout_admin.ftl" as layout >

<#-- 定义title -->
    <#assign title="首页" in layout />

<#-- 定义pageHeader变量 -->
<#--<#assign pageHeader in layout>-->
<#--<header class="page-header">-->
<#--<h1>Welcome</h1>-->
<#--</header>-->
<#--</#assign>-->

<#-- 定义pageBody变量 -->
    <#assign pageBody in layout>
        <div class="row" style="margin-top: 50px;">
            <div class="col-md-offset-3 col-md-6">
                <div class="box box-widget">
                    <div class="box-body">
                        <#if SPRING_SECURITY_CONTEXT??>
                            <div class="alert alert-info">您好， ${SPRING_SECURITY_CONTEXT.authentication.principal.displayName}</div>
                        <#else>
                            <div class="alert alert-warning">
                                <a href="/login.htm"> 请登录 </a>
                            </div>
                        </#if>
                    </div>
                </div>
            </div>
        </div>
    </#assign>

<#-- 定义pageScript变量 -->
    <#assign pageScript in layout>

    </#assign>

<#-- 使用layout中定义的html宏 -->
    <@layout.html/>
</#compress>



