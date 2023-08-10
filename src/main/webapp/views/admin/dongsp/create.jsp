
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Thêm Màu Sắc</title>
    <link rel="stylesheet"
          href="/ASM_war_exploded/css/bootstrap.min.css"/>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="col-8 offset-2">
    <h4 style="text-align: center">Thêm Đóng SP</h4>
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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>

</body>
</html>
