<#-- 宏：html -->
<#-- title：页面标题（浏览器标题） -->
<#-- pageHead：html附加head内容，一般用于设置额外的css代码 -->
<#-- pageHeader：页面标题（在页面上显示的标题） -->
<#-- pageBody：页面内容 -->
<#-- pageScript：页面附加脚本，一般用于设置额外的js代码 -->
<#macro html >
    <!DOCTYPE html>
    <html lang="cn">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>${title!"YuGong-Admin"}</title>
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <link rel="stylesheet" href="/static/plugin/bootstrap-3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="/static/plugin/font-awesome/css/font-awesome.min.css">
        <!-- AdminLTE 样式文件 -->
        <link rel="stylesheet" href="/static/adminlte/dist/css/AdminLTE.min.css">
        <!-- AdminLTE 主题样式文件 -->
        <link rel="stylesheet" href="/static/adminlte/dist/css/skins/skin-blue-light.min.css">
        ${pageHead!}
    </head>
    <body class="hold-transition skin-blue-light sidebar-mini">
    <div class="wrapper">
        <header class="main-header">

            <a href="/admin/index.htm" class="logo">
                <span class="logo-mini">YG</span>
                <span class="logo-lg">YG-Auth</span>
            </a>

            <nav class="navbar navbar-static-top">
                <div class="navbar-custom-menu">
                    <ul class="nav navbar-nav">
                        <#if SPRING_SECURITY_CONTEXT??>
                            <li>
                                <a href="javascript:void(0);">
                                    <i class="fa fa-user"></i> ${SPRING_SECURITY_CONTEXT.authentication.principal.displayName}
                                </a>
                            </li>
                            <li>
                                <a href="/logout.htm">
                                    <i class="fa fa-sign-out"></i> 退出
                                </a>
                            </li>
                        <#else>
                            <li>
                                <a href="/login.htm">
                                    <i class="fa fa-sign-in"></i> 请登录
                                </a>
                            </li>
                        </#if>
                    </ul>
                </div>
            </nav>
        </header>
        <aside class="main-sidebar">
            <section class="sidebar">
                <ul class="sidebar-menu" data-widget="tree">
                    <li>
                        <a href="/admin/index.htm"><i class="fa fa-home"></i> <span> 首页</span></a>
                    </li>
                    <#if SPRING_SECURITY_CONTEXT??>
                        <li><a href="/admin/user/manager.htm"><i class="fa fa-balance-scale"></i> 用户管理</a></li>
                    </#if>
<#--                    <li class="treeview">-->
<#--                        <a href="javascript:void(0);"><i class="fa fa-bug"></i> <span> 流程管理</span>-->
<#--                            <span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>-->
<#--                        </a>-->
<#--                        <ul class="treeview-menu">-->
<#--                            <li><a href="/admin/activiti/newModel.htm"><i class="fa fa-circle-o"></i> 添加模型</a></li>-->
<#--                            <li><a href="/admin/activiti/modelManager.htm"><i class="fa fa-circle-o"></i> 模型管理</a></li>-->
<#--                            <li><a href="/admin/activiti/deploymentManager.htm"><i class="fa fa-circle-o"></i> 部署管理</a>-->
<#--                            </li>-->
<#--                        </ul>-->
<#--                    </li>-->
                </ul>
            </section>
        </aside>

        <section class="content-wrapper">
            <#--        <section class="content-header">-->
            <#--            <div>-->
            <#--                <ol class="breadcrumb" style="margin-bottom: 0;">-->
            <#--                    <li><a href="/admin/index.htm"><i class="fa fa-dashboard"></i> <span> 首页</span></a></li>-->
            <#--                    <li class="active">${title!"admin"}</li>-->
            <#--                </ol>-->
            <#--            </div>-->
            <#--        </section>-->

            <section class="content">
                <div class="row">
                    <div class="col-md-12">
                        <#if pageBody??>
                            ${pageBody}
                        <#else>
                            <div class="alert alert-warning">这是一个空页面</div>
                        </#if>
                    </div>
                </div>
            </section>
        </section>

        <footer class="main-footer">
            <div class="pull-right hidden-xs">
                <b>版本</b> 1.0.0
            </div>
            <strong>版权所有 &copy; 2019 <a href="javascript:void(0);">YuGong</a>.</strong>
        </footer>

    </div>
    </body>
    <script src="/static/plugin/jquery-1.12.4.min.js"></script>
    <script src="/static/plugin/bootstrap-3.3.7/js/bootstrap.min.js"></script>
    <script src="/static/adminlte/dist/js/adminlte.min.js"></script>
    <script src="/static/plugin/jquery.form.js"></script>
    <script src="/static/plugin/jquery.blockUI.js"></script>
    <script type="text/javascript">
        $(document).ajaxComplete(function (event, xhr, options) {
            // 重定向处理
            if (xhr.status === 302) {
                var redirectUrl = xhr.getResponseHeader("Location");
                if (redirectUrl != null) {
                    window.location = redirectUrl
                }
            } else if (xhr.status === 200) {
                var responseJson = JSON.parse(xhr.responseText);
                // 未登录错误码和重复登录，统一处理
                if (responseJson.code === 401) {
                    var loginUrl = xhr.getResponseHeader("loginUrl");
                    if (loginUrl != null) {
                        window.location = loginUrl
                    }
                }
            }
        });
        $currMenuItem = $('.sidebar-menu').find("a[href='" + location.pathname + "']");
        if ($currMenuItem.parent().parent().hasClass("treeview-menu")) {
            $currMenuItem.parent().parent().show();
            $currMenuItem.parent().parent().parent().addClass("menu-open active");
        }
        $currMenuItem.parent().addClass("active");

    </script>
    ${pageScript!}
    </html>
</#macro>