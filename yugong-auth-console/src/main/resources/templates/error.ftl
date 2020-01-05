<#compress >
<#-- 必须引入layout宏定义文件 -->
    <#import "_common/layout_admin.ftl" as layout >

<#-- 定义title -->
    <#assign title=" ${status!}" in layout />

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
                        <h3 class="text-danger">请求失败 - ${status!}</h3>
                        <#if status == 403>
                            <p class="text-danger">
                                无权访问该页面： ${Request["javax.servlet.error.request_uri"]}
                            </p>
                        <#elseif status == 404>
                            <p class="text-danger">
                                该页面不存在： ${Request["javax.servlet.error.request_uri"]}
                            </p>
                        <#else>
                            <p>
                                status: ${status!} <br>
                                error: ${error!} <br>
                                message: ${message!} <br>
                                path: ${path!} <br>
                                timestamp: ${timestamp?datetime} <br>
                            </p>
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
