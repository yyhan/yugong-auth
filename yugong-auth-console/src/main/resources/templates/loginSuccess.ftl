<#compress >
<#-- 必须引入layout宏定义文件 -->
    <#import "_common/layout_default.ftl" as layout >

<#-- 定义title -->
    <#assign title="登录成功" in layout />

<#-- 定义pageHeader变量 -->
<#--    <#assign pageHead in layout>-->
<#--        <style type="text/css"></style>-->
<#--    </#assign>-->

<#-- 定义pageBody变量 -->
    <#assign pageBody in layout>
        <div class="row" style="margin-top: 100px;">
            <div class="col-md-offset-4 col-md-4">
                <div class="box box-info">
                    <div class="box-header with-border">
                        <h3 class="box-title">愚公权限管理系统</h3>
                    </div>
                    <div class="box-body">
                        <div class="alert alert-success">
                            <i class="icon fa fa-2x"></i> 登录成功
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </#assign>

<#-- 定义pageScript变量 -->
    <#assign pageScript in layout>
        <script type="text/javascript">
            setTimeout(function () {
                window.location.href = "${LOGIN_SUCCESS_REDIRECT_URL}";
            }, 500);
        </script>
    </#assign>

<#-- 使用layout中定义的html宏 -->
    <@layout.html/>
</#compress>



