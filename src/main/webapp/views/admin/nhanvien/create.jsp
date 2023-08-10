<%@ page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Thêm mới</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
<div class="container">
    <h2 style="text-align: center;">Thêm Nhân Viên </h2>
    <sf:form method="post" action="${ action }"
             modelAttribute="data">
        <div class="col-xs-4">
            <label>Mã</label>
            <div >
                <sf:input path="ma"  class="form-control" id="ex3"/>
                <sf:errors path="ma"/>
            </div>
        </div>

        <div  class="col-xs-4">
            <label>Tên</label>
            <div>
                <sf:input path="ten" class="form-control" id="ex3"/>
                <sf:errors path="ten"/>
            </div>
        </div>
        <div  class="col-xs-4">
            <label>Tên đệm</label>
            <div>
                <sf:input path="tenDem" class="form-control" id="ex3"/>
                <sf:errors path="tenDem"/>
            </div>
        </div>
        <div  class="col-xs-4">
            <label>Họ</label>
            <div>
                <sf:input path="ho" class="form-control" id="ex3"/>
                <sf:errors path="ho"/>
            </div>
        </div>
        <div  class="col-xs-4">
            <label>Giới tính</label>
            <div>
                <sf:radiobutton path="gioiTinh" value="Nam" label="Nam" checked="true"/>
                <sf:radiobutton path="gioiTinh" value="Nữ" label="Nữ"/>
            </div>
        </div>
        <div  class="col-xs-4">
            <label>Ngày sinh</label>
            <div>
                <sf:input path="ngaySinh" type="Date" class="form-control" id="ex3"/>
                <sf:errors path="ngaySinh"/>
            </div>
        </div>
        <div  class="col-xs-4">
            <label>Địa chỉ</label>
            <div>
                <sf:input path="diaChi" class="form-control" id="ex3"/>
                <sf:errors path="diaChi"/>
            </div>
        </div>
        <div  class="col-xs-4">
            <label>SĐT</label>
            <div>
                <sf:input path="sdt" class="form-control" id="ex3"/>
                <sf:errors path="sdt"/>
            </div>
        </div>
        <div  class="col-xs-4">
            <label>Mật khẩu</label>
            <div>
                <sf:input path="matKhau" class="form-control" id="ex3"/>
                <sf:errors path="matKhau"/>
            </div>
        </div>
        <div  class="col-xs-4"  class="form-select" aria-label="Default select example">
            <label>Tên cửa hàng:</label><br>
            <sf:select path="danhSachCH"  class="form-select" aria-label="Default select example">
                <c:forEach items="${ danhSachCH }" var="ch">
                    <sf:option value="${ ch.id }">${ ch.ten }</sf:option>
                </c:forEach>
            </sf:select>
        </div>
        <div  class="col-xs-4"  class="form-select" aria-label="Default select example">
            <label>Tên chức vụ:</label><br>
            <sf:select path="danhSachCV"  class="form-select" aria-label="Default select example">
                <c:forEach items="${ danhSachCV }" var="nsx">
                    <sf:option value="${ nsx.id }">${ nsx.ten }</sf:option>
                </c:forEach>
            </sf:select>
        </div>
        <div>
            <button class="btn btn-info">SAVE</button>

        </div>
    </sf:form>
</div>
<footer><p style="text-align: center;">Thành Trượt JAVA4</p></footer>
</body>
</html>