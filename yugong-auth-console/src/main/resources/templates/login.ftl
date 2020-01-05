<#compress >
<#-- 必须引入layout宏定义文件 -->
    <#import "_common/layout_default.ftl" as layout >

<#-- 定义title -->
    <#assign title="登录" in layout />

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
                    <form class="form-horizontal" action="/login.htm" method="post">
                        <div class="box-body">
                            <div class="form-group">
                                <label for="account" class="col-md-2 control-label">账号</label>
                                <div class="col-md-8">
                                    <input type="text" class="form-control" id="account" name="account">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="password" class="col-md-2 control-label">密码</label>
                                <div class="col-md-8">
                                    <input type="password" class="form-control" id="password" name="password">
                                </div>
                            </div>
                            <#if SPRING_SECURITY_LAST_EXCEPTION??>
                                <div class="form-group">
                                    <div class="col-md-12">
                                        <div class="alert alert-warning alert-dismissible">
                                            <i class="icon fa fa-warning"></i> ${SPRING_SECURITY_LAST_EXCEPTION.message!}
                                        </div>
                                    </div>
                                </div>
                            </#if>
                        </div>
                        <div class="box-footer">
                            <div class="col-md-offset-2 col-md-8">
                                <button type="submit" class="btn btn-info btn-block">登录</button>
                            </div>
                        </div>
                    </form>
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



