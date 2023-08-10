<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Them moi cua hang</title>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
          crossorigin="anonymous">
</head>

<body>
<div class="container col-6">
    <h1>Add</h1>
    <%--@elvariable id="data" type="java"--%>
    <sf:form action="admin/khachhang/store" method="post"
             modelAttribute="data">
    <div>
        <label>Mã</label>
        <div>
            <sf:input path="ma"/>
            <sf:errors path="ma"/>
        </div>
    </div>
    <div>
        <label>Tên</label>
        <div>
            <sf:input path="ten"/>
            <sf:errors path="ten"/>
        </div>
    </div>
    <div>
        <label>Tên Đệm</label>
        <div>
            <sf:input path="tenDem"/>
            <sf:errors path="tenDem"/>
        </div>
    </div>
    <div>
        <label>Họ</label>
        <div>
            <sf:input path="Ho"/>
            <sf:errors path="Ho"/>
        </div>
    </div>
    <div>
        <label>Ngày Sinh</label>
        <div>
            <sf:input path="NgaySinh"/>
            <sf:errors path="NgaySinh"/>
        </div>
    </div>
    <div>
        <label>SDT</label>
        <div>
            <sf:input path="Sdt"/>
            <sf:errors path="Sdt"/>
        </div>
    </div>
    <div>
        <label>Địa chỉ</label>
        <div>
            <sf:input path="DiaChi"/>
            <sf:errors path="DiaChi"/>
        </div>
    </div>
    <div>
        <label>Thành phố</label>
        <div>
            <sf:input path="thanhPho"/>
            <sf:errors path="thanhPho"/>
        </div>
    </div>
    <div>
        <label>Quốc gia</label>
        <div>
            <sf:input path="quocGia"/>
            <sf:errors path="quocGia"/>
        </div>
    </div>
    <div>
        <button>Thêm mới</button>
    </div>
</div>
</sf:form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>