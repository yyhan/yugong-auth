<#compress >
<#-- 必须引入layout宏定义文件 -->
    <#import "../../_common/layout_admin.ftl" as layout >

<#-- 定义title -->
    <#assign title="用户管理"/>
    <#assign title="${title}" in layout />

<#-- 定义 pageHead 变量 -->
    <#assign pageHead in layout>
        <link href="/static/plugin/datatables-1.10.20/plugin/DataTables-1.10.20/css/dataTables.bootstrap.min.css"
              rel="stylesheet"/>
        <link href="/static/plugin/datatables-1.10.20/plugin/FixedHeader-3.1.6/css/fixedHeader.bootstrap.min.css"
              rel="stylesheet"/>
        <link href="/static/plugin/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet"/>
        <style>
            td .alert {
                padding: 5px;
                margin-bottom: 10px;
            }
        </style>
    </#assign>

<#-- 定义pageBody变量 -->
    <#assign pageBody in layout>
        <div class="box box-widget">
            <div class="box-header with-border">
                <h3 class="box-title">${title}</h3>
            </div>
            <div class="box-body">
                <div class="row">
                    <div class="col-md-12">
                        <form class="form-horizontal" onsubmit="return false;">
                            <div class="form-group form-group-sm">
                                <label class="col-sm-1 control-label" for="userAccount">用户账号</label>
                                <div class="col-sm-2">
                                    <input class="form-control" type="text" id="userAccount">
                                </div>
                                <label class="col-sm-1 control-label" for="userName">用户名</label>
                                <div class="col-sm-2">
                                    <input class="form-control" type="text" id="userName">
                                </div>
                            </div>
                            <div class="form-group form-group-sm">
                                <div class="col-sm-offset-1 col-sm-1">
                                    <button id="queryBtn" class="btn btn-primary btn-sm btn-block"><i
                                                class="fa fa-search"></i> 查询
                                    </button>
                                </div>
                            </div>
                        </form>
                        <table id="dtTable" class="table table-striped table-hover table-condensed table-bordered">
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </#assign>

<#-- 定义pageScript变量 -->
    <#assign pageScript in layout>
        <script src="/static/plugin/datatables-1.10.20/datatables.min.js"></script>
        <script src="/static/plugin/datatables-1.10.20/plugin/DataTables-1.10.20/js/dataTables.bootstrap.min.js"></script>
        <script src="/static/plugin/datatables-1.10.20/plugin/FixedHeader-3.1.6/js/fixedHeader.bootstrap.min.js"></script>
        <script src="/static/plugin/moment-2.24.0.min.js"></script>
        <script src="/static/plugin/bootstrap-daterangepicker/daterangepicker.js"></script>
        <script src="/static/plugin/jquery.blockUI.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function () {

                let dtTableDom = jQuery("#dtTable");
                let dtTable = dtTableDom.DataTable({
                    serverSide: true, // 开启服务端处理
                    stateSave: false, // 关闭状态保存
                    dom: '<"row" <"col-md-3" l>><"row" <"col-md-12" t>><"row" <"col-md-3" i><"col-md-6" p>>',
                    pageLength: 25, // 每页容量
                    lengthMenu: [ 10, 25, 50, 100, "All" ],
                    ordering: false, // 是否开启排序，默认true
                    deferLoading: 0,
                    fixedHeader: true,
                    ajax: function (params, callback, obj) {
                        let request = {
                            draw: params.draw,
                            length: params.length,
                            start: params.start,
                            userAccount: $("#userAccount").val(),
                            userName: $("#userName").val()
                        };

                        $.blockUI({message: '加载中...'});
                        $.post("/ajax/admin/user/pageList.htm", request, function (res, status, xhr) {
                            if (res.success) {
                                callback(res);
                            } else {
                                callback({
                                    data: [],
                                    draw: params.draw,
                                    recordsFiltered: 0,
                                    recordsTotal: 0
                                });
                                alert(res.message);
                            }
                        }, 'json');
                    },
                    rowId: 'caseNo',
                    columnDefs: [{
                        targets: ["_all"],
                        defaultContent: ""
                    }],
                    columns: [
                        {data: "userId", title: "用户Id", width: "5em"},
                        {data: "userAccount", title: "用户账号", width: "20em"},
                        {data: "userName", title: "用户名称", width: "10em"},
                        {data: "createTime", title: "创建时间", width: "10em"},
                        {
                            title: "操作", width: "10em", render: function (data, type, row, meta) {
                                let html = '';
                                html += '<a class="btn btn-primary btn-xs" href="/police/case/caseDetail.htm?caseId=' + row.caseId + '" target="_blank">详情</a>';
                                return html;
                            }
                        }
                    ],
                    language: {
                        emptyTable: "暂无数据...",
                        info: "_START_ 到 _END_, 总共 _TOTAL_ 条记录",
                        infoEmpty: "0 到 0 总共 0 条记录",
                        infoFiltered: "(总共 _MAX_ 条记录)",
                        infoPostFix: "",
                        thousands: ".",
                        lengthMenu: "_MENU_  条 / 每页",
                        loadingRecords: "正在加载中...",
                        processing: "正在加载中...",
                        search: "搜索",
                        zeroRecords: "未找到任何相关记录.",
                        paginate: {
                            first: "首页",
                            previous: "上一页",
                            next: "下一页",
                            last: "最后一页"
                        }
                    },
                    initComplete: function (settings, json) {
                        // 表格初始化完成时回调
                    },
                    drawCallback: function (settings) {
                        $.unblockUI();
                    },
                    rowCallback: function (row, data) {
                    }
                });

                $("#queryBtn").on("click", function () {
                    dtTable.draw();
                });
                dtTable.draw();
            });

        </script>

    </#assign>

<#-- 使用layout中定义的html宏 -->
    <@layout.html/>
</#compress>



