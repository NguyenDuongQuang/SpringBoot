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
<header><h2 style="text-align: center;">Detail Nhân Viên</h2></header>
<main>
    <div class="container">
        <div class="mb-3">
            <label class="form-label">Mã  :</label>
            <span>${nv.ma}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Tên  :</label>
            <span>${nv.ten}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Tên đệm  : </label>
            <span>${nv.tenDem}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Họ : </label>
            <span>${nv.ho}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Giới tính  : </label>
            <span>${nv.gioiTinh}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Ngày sinh  :</label>
            <span>${nv.ngaySinh}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Địa Chỉ :</label>
            <span>${nv.diaChi}</span>
        </div>

        <div class="mb-3">
            <label class="form-label">SĐT  : </label>
            <span>${nv.sdt}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Mật khẩu  : </label>
            <span>${nv.matKhau}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Tên cửa hàng :</label>
            <span>${nv.cuaHang.ten}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Tên chức vụ :</label>
            <span>${nv.chucVu.ten}</span>
        </div>


    </div>
</main>
<footer><p style="text-align: center;">Thành Trượt JAVA4</p></footer>
</body>
</html>