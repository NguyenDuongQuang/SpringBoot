    <%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Danh Sách Nhân Viên</title>
    <link rel="stylesheet"
          href="/css/bootstrap.min.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
          crossorigin="anonymous">
</head>
<body>
<body>
<div class="container">
    <h2 style="text-align: center">Nhân Viên</h2>

    <table  class="table">
        <thead>
        <tr>
            <th>MÃ</th>
            <th>Tên</th>
            <th>Tên đệm</th>
            <th>Họ</th>
            <th>Giới tính</th>
            <th>Ngày Sinh</th>
            <th>Địa chỉ</th>
            <th>SĐT</th>
            <th>Mật khẩu</th>
            <th>Cửa hàng</th>
            <th>Chức vụ</th>
            <th>Chức Năng</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${DanhSachNV.content}" var="nv">
            <tr>
                <td>${ nv.ma }</td>
                <td>${ nv.ten }</td>
                <td>${ nv.tenDem }</td>
                <td>${ nv.ho }</td>
                <td>${ nv.gioiTinh }</td>
                <td>${ nv.ngaySinh }</td>
                <td>${ nv.diaChi }</td>
                <td>${ nv.sdt }</td>
                <td>${ nv.matKhau }</td>
                <td>${ nv.cuaHang.ten }</td>
                <td>${ nv.chucVu.ten }</td>
                <td>
                    <a href="/admin/nhanvien/delete/${ nv.id }" class="btn btn-info">Delete</a>
                </td>
                <td>
                    <a href="/admin/nhanvien/edit/${ nv.id }" class="btn btn-info">Edit</a>
                </td>
                <td>
                    <a href="/admin/nhanvien/detail/${ nv.id }" class="btn btn-info">Detail</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <c:forEach begin="0" end="${ DanhSachNV.totalPages -1}" varStatus="loop">
                <li class="page-item">
                    <a class="page-link" href="/admin/nhanvien/index?page=${loop.begin + loop.count - 1}">
                            ${loop.begin + loop.count }
                    </a>
                </li>
            </c:forEach>
        </ul>
    </nav>
</div>
</body>
    </table>
</div>
<div>
    <a href="create" class="btn btn-info">Thêm mới </a>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
<footer><p style="text-align: center;">Thành Trượt JAVA4</p></footer>
</body>
</html>