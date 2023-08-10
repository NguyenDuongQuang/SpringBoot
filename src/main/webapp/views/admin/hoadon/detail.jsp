<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<header><h2 style="text-align: center;">Detail Hóa Đơn</h2></header>
<div class="container">
    <div class="mb-3">
        <label class="form-label">Mã : </label>
        <span>${hoaDon.ma}</span>
    </div>
    <div class="mb-3">
        <label class="form-label">Ngày Tạo : </label>
        <span>${hoaDon.ngayTao}</span>
    </div>
    <div class="mb-3">
        <label class="form-label">Ngày Thanh Toán : </label>
        <span>${hoaDon.ngayThanhToan}</span>
    </div>
    <div class="mb-3">
        <label class="form-label">Ngày Ship : </label>
        <span>${hoaDon.ngayShip}</span>
    </div>
    <div class="mb-3">
        <label class="form-label">Ngày Nhận : </label>
        <span>${hoaDon.ngayNhan}</span>

        <div class="mb-3">
            <label class="form-label">Tên Người Nhận :</label>
            <span>${hoaDon.tenNguoiNhan}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Địa Chỉ :  </label>
            <span>${hoaDon.diaChi}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Số Điện Thoại : </label>
            <span>${hoaDon.sdt}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Mã Khách Hàng : </label>
            <span>${hoaDon.khachHang.ma}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Mã Nhân Viên :</label>
            <span>${hoaDon.nhanVien.ma}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Tình Trạng :</label>
            <span>${hoaDon.tinhTrang}</span>
        </div>
    </div>

    <footer><p style="text-align: center;">Thành Trượt JAVA4</p></footer>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>