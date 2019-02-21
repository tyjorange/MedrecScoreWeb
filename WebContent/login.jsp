<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>统计信息</title>
    <link rel="stylesheet" href="plugins/layui2/css/layui.css" media="all"/>
    <style type="text/css">
        .layui-form {
            margin-left: 10px;
            margin-right: 10px;
        }

        .layui-form-item {
            margin-top: 15px;
            margin-bottom: 15px;
            margin-left: 10px;
            clear: both;
        }

        .layui-table-body {
        }
    </style>
</head>
<body>
<!-- 搜索栏开始 -->
<form class="layui-form layui-form-pane">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">ID</label>
            <div class="layui-input-block">
                <input type="text" name="id" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">医院</label>
            <div class="layui-input-block">
                 <select id="hcode" name="code" lay-filter="code"  autocomplete="off" class="layui-input" lay-search="">
            	</select>
            </div>
        </div>
	    <div class="layui-inline">
            <button class="layui-btn layui-btn-primary" type="reset"><i class="layui-icon layui-icon-close"></i>重新输入</button>
	        <button class="layui-btn" lay-submit lay-filter="find"><i class="layui-icon layui-icon-search"></i>查询</button>
	    </div>
    </div>
    <table class="layui-hide" id="tb_elem" lay-filter="tb_filter"></table>
</form>
<!-- 搜索栏结束 -->
<script type="text/javascript" src="plugins/layui2/layui.js"></script>
<script>
    layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element', 'form'], function () {
        var laydate = layui.laydate //日期
            , laypage = layui.laypage //分页
            , layer = layui.layer //弹层
            , table = layui.table //表格
            , carousel = layui.carousel //轮播
            , upload = layui.upload //上传
            , element = layui.element //元素操作
            , form = layui.form // 表单
            , $ = layui.$; //jq
        // 获取医院
        $.ajax({
            url: "search_hospital.do",
            type: 'GET',
            dataType: "json",
            contentType: 'application/json',
            success: function (resp) {
                if (resp.code === 0) {
                    var hcode = $("#hcode");
                    hcode.html("<option value='' selected>请选择或输入查询</option>");
                    for (var i = 0; i < resp.data.length; i++) {
                    	hcode.append("<option value='" + resp.data[i].code + "'>(" + resp.data[i].code + ")" + resp.data[i].name + "</option>");
                    }
                    form.render();
                } else {
                    parent.layer.msg(resp.msg);
                }
            }
        });
        //执行一个 table 实例
        table.render({
            id: 'tb_instance'
            , elem: '#tb_elem'//页面容器
            , height: 'full'
            , url: 'search_medrec.do' //数据接口
            , page: true //开启分页
            , limits: [10, 50, 100, 1000]
            , loading: true // 加载动画
            , done: function (res, curr, count) {
                $(".layui-table-body").find("td").each(function () {
                    if ($(this).attr("data-field") > 0) {
                        $(this).css("display", "none");
                    }
                })
            }
            , cols: [[ //表头
                {field: 'id', title: '#', type: 'numbers', sort: false, fixed: 'left', width: '10', rowspan: '3'}
                , {field: 'id', title: 'ID', sort: false, width: '100', rowspan: '3'}
                , {field: 'code', title: 'Code', sort: true, width: '100', rowspan: '3'}
                , {field: 'mrYear', title: 'Year', sort: false, width: '85', rowspan: '3'}
                , {field: 'score', title: 'Score', sort: false, width: '80', rowspan: '3'}
                , {align: 'center', title: '患者基本信息', colspan: '8'}
                , {align: 'center', title: '住院过程信息', colspan: '9'}
                , {align: 'center', title: '诊疗信息', colspan: '18'}
                , {align: 'center', title: '费用信息', colspan: '2'}
            ], [
                {align: 'center', title: 'A', colspan: '2'}
                , {align: 'center', title: 'B', colspan: '1'}
                , {align: 'center', title: 'C', colspan: '4'}
                , {align: 'center', title: 'D', colspan: '1'}
                , {align: 'center', title: 'A', colspan: '1'}
                , {align: 'center', title: 'B', colspan: '5'}
                , {align: 'center', title: 'C', colspan: '3'}
                , {align: 'center', title: 'A', colspan: '6'}
                , {align: 'center', title: 'B', colspan: '8'}
                , {align: 'center', title: 'C', colspan: '3'}
                , {align: 'center', title: 'D', colspan: '1'}
                , {align: 'center', title: 'A', colspan: '1'}
                , {align: 'center', title: 'D', colspan: '1'}
            ], [
                {field: 'aa1', title: 'aa1', sort: false}
                , {field: 'aa2', title: 'aa2', sort: false}
                , {field: 'ab1', title: 'ab1', sort: false}
                , {field: 'ac1', title: 'ac1', sort: false}
                , {field: 'ac2', title: 'ac2', sort: false}
                , {field: 'ac3', title: 'ac3', sort: false}
                , {field: 'ac4', title: 'ac4', sort: false}
                , {field: 'ad1', title: 'ad1', sort: false}
                , {field: 'ba1', title: 'ba1', sort: false}
                , {field: 'bb1', title: 'bb1', sort: false}
                , {field: 'bb2', title: 'bb2', sort: false}
                , {field: 'bb3', title: 'bb3', sort: false}
                , {field: 'bb4', title: 'bb4', sort: false}
                , {field: 'bb5', title: 'bb5', sort: false}
                , {field: 'bc1', title: 'bc1', sort: false}
                , {field: 'bc2', title: 'bc2', sort: false}
                , {field: 'bc3', title: 'bc3', sort: false}
                , {field: 'ca1', title: 'ca1', sort: false}
                , {field: 'ca2', title: 'ca2', sort: false}
                , {field: 'ca3', title: 'ca3', sort: false}
                , {field: 'ca4', title: 'ca4', sort: false}
                , {field: 'ca5', title: 'ca5', sort: false}
                , {field: 'ca6', title: 'ca6', sort: false}
                , {field: 'cb1', title: 'cb1', sort: false}
                , {field: 'cb2', title: 'cb2', sort: false}
                , {field: 'cb3', title: 'cb3', sort: false}
                , {field: 'cb4', title: 'cb4', sort: false}
                , {field: 'cb5', title: 'cb5', sort: false}
                , {field: 'cb6', title: 'cb6', sort: false}
                , {field: 'cb7', title: 'cb7', sort: false}
                , {field: 'cb8', title: 'cb8', sort: false}
                , {field: 'cc1', title: 'cc1', sort: false}
                , {field: 'cc2', title: 'cc2', sort: false}
                , {field: 'cc3', title: 'cc3', sort: false}
                , {field: 'cd1', title: 'cd1', sort: false}
                , {field: 'da1', title: 'da1', sort: false}
                , {field: 'dd1', title: 'dd1', sort: false}
            ]]
        });
        // 表格监听
        table.on('tool(tb_filter)', function (obj) { //注：tool是工具条事件名，tb_filter是table原始容器的属性 lay-filter="对应的值"
            var data_tr = obj.data //获得当前行数据
                , layEvent = obj.event; //获得 lay-event 对应的值
            if (layEvent === 'delItem') {
            } else if (layEvent === 'editItem') {
            } else if (layEvent === 'editZoom') {
            }
        });

        // 查询监听
        form.on('submit(find)', function (data) {
            find(data);
            return false;
        });

        // 查询
        function find(data) {
            table.reload('tb_instance', {
                where: data.field //查询条件
                , page: {
                    curr: 1 //重新从第 1 页开始
                }
            });
        }
    });
</script>
</body>
</html>