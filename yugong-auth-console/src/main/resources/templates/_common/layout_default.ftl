<#-- 宏：html -->
<#-- title：页面标题（浏览器标题） -->
<#-- pageHead：html附加head内容，一般用于设置额外的css代码 -->
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
    <link rel="stylesheet" href="/static/adminlte/dist/css/skins/skin-purple.min.css">
    ${pageHead!}
</head>
<body class="hold-transition skin-purple sidebar-mini">
<#if pageBody??>
    ${pageBody}
<#else>
<div class="row">
    <div class="col-md-12">
        <div class="alert alert-warning">这是一个空页面</div>
    </div>
</div>
</#if>
</body>
<script src="/static/plugin/jquery-1.12.4.min.js"></script>
<script src="/static/plugin/bootstrap-3.3.7/js/bootstrap.min.js"></script>
<script src="/static/adminlte/dist/js/adminlte.min.js"></script>
    ${pageScript!}
</html>
</#macro>