
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Thêm Màu Sắc</title>
    <link rel="stylesheet"
          href="/ASM_war_exploded/css/bootstrap.min.css"/>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
<div class="col-8 offset-2">
    <h4 style="text-align: center">Thêm ChuC Vu</h4>
    <sf:form method="post" action="${ action }" modelAttribute="data">
        <div class="row mt-4">
            <div class="col-4">
                <label>Ma</label>
                <sf:input type="text" class="form-control" path="Ma"/>
                <sf:errors path="Ma"/>
            </div>

            <div class="row-4">
                <div class="col-4">
                    <label>Ten</label>
                    <sf:input type="text" path="Ten" class="form-control" />
                    <sf:errors path="Ten" />
                </div>
            </div>
        </div>


        <div class="row mt-6">
            <div class="col-6">
                <button class="btn btn-primary" name="add">Xác Nhận</button>
            </div>
            <div class="col-6"></div>
        </div>
    </sf:form>
</div>


</body>
</html>
