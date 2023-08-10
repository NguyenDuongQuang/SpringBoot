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
<header><h2 style="text-align: center;">Thêm Hóa Đơn</h2></header>
<main>
    <form action="admin/hoadon/store" method="post" class="container">
        <div class="mb-3">
            <label class="form-label">Mã</label>
            <input type="text" class="form-control" name="Ma">
        </div>
        <div class="mb-3">
            <label class="form-label">Ngày Tạo</label>
            <input type="text" class="form-control" name="NgayTao">
        </div>
        <div class="mb-3">
            <label class="form-label">Ngày Thanh Toán</label>
            <input type="text" class="form-control" name="NgayThanhToan">
        </div>
        <div class="mb-3">
            <label class="form-label">Ngày Ship</label>
            <input type="text" class="form-control" name="NgayShip">
        </div>
        <div class="mb-3">
            <label class="form-label">Ngày Nhận</label>
            <input type="text" class="form-control" name="NgayNhan">
        </div>
        <div class="mb-3">
            <label class="form-label">Tình Trạng</label>
            <input type="text" class="form-control" name="TinhTrang">
        </div>
        <div class="mb-3">
            <label class="form-label">Tên Người Nhận</label>
            <input type="text" class="form-control" name="TenNguoiNhan">
        </div>
        <div class="mb-3">
            <label class="form-label">Địa Chỉ</label>
            <input type="text" class="form-control" name="DiaChi">
        </div>
        <div class="mb-3">
            <label class="form-label">Số Điện Thoại</label>
            <input type="text" class="form-control" name="Sdt">
        </div>
        <div class="mb-3">
            <br>
            <label class="form-label"> Mã Nhân Viên </label>
            <select name="MaNhanVien">
                <c:forEach items="${listNV }" var="nv">
                    <option value="${nv.id}">${nv.ma}</option>
                </c:forEach>
            </select>
            <br>
        </div>
        <div class="mb-3">
            <br>
            <label class="form-label">Mã Khách Hàng</label>
            <select name="MaKhachHang">
                <c:forEach items="${listKH}" var="kh">
                    <option value="${kh.id}">${kh.ma}</option>
                </c:forEach>
            </select>
            <br>
        </div>

        <button class="btn btn-success" type="submit">Add</button>
    </form>
</main>
<footer><p style="text-align: center;">Thành Trượt JAVA4</p></footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>