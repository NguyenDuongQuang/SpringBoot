<%--
  Created by IntelliJ IDEA.
  User: DELL 5570
  Date: 5/12/2023
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title> Hóa Đơn</title>
    <link rel="stylesheet"
          href="/css/bootstrap.min.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
          crossorigin="anonymous">
</head>
<body action="admin/hoadon/create " method="POST">
<div class="container" >
    <h4 style="text-align: center">Danh Sách Hóa Đơn</h4>
<%--    <c:if test="${ f:length(listDataCH) == 0}">--%>
<%--        <h3 class="alert alert-warning">Khong co du lieu</h3>--%>
<%--    </c:if>--%>
<%--    <c:if test="${ f:length(listDataCH) != 0}">--%>
        <table class="table " >
            <thead>
            <td>Mã</td>
            <td>Ngày Tạo</td>
            <td>Ngày Thanh Toán</td>
            <td>Ngày Ship</td>
            <td>Ngày Nhận</td>
            <td>Tên Người Nhận</td>
            <td>Mã Khách Hàng</td>
            <td>Mã Nhân Viên</td>
            <td>Địa Chỉ</td>
            <td>Số Điện Thoại</td>
            <td>Tình Trạng</td>
            <td>Chức Năng</td>

            </thead>
            <tbody>
            <c:forEach items="${data.content}" var="hd">
                <tr style="background-color: white">
                    <td>${hd.ma}</td>
                    <td>${hd.ngayTao}</td>
                    <td>${hd.ngayThanhToan}</td>
                    <td>${hd.ngayShip}</td>
                    <td>${hd.ngayNhan}</td>
                    <td>${hd.tenNguoiNhan}</td>
                    <td>${hd.khachHang.ma}</td>
                    <td>${hd.nhanVien.ma}</td>
                    <td>${hd.diaChi}</td>
                    <td>${hd.sdt}</td>
                    <td>${hd.tinhTrang}</td>
                    <td>
                        <a href="/admin/hoadon/detail/${hd.id}" class="btn btn-info">Detail</a>
<%--                        <button class="btn btn-primary" name="delete">Delete</button>--%>
                        <a href="/admin/hoadon/delete/${hd.id}" class="btn btn-info" >Delete</a>
<%--                        <button class="btn btn-primary" name="edit">Edit</button>--%>
                        <a href="/admin/hoadon/edit/${hd.id}" class="btn btn-info">Edit</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <c:forEach begin="0" end="${ data.totalPages -1}" varStatus="loop">
                <li class="page-item">
                    <a class="page-link" href="/admin/hoadon/index?page=${loop.begin + loop.count - 1}">
                            ${loop.begin + loop.count }
                    </a>
                </li>
            </c:forEach>
        </ul>
    </nav>
<%--    </c:if>--%>
    <button class="btn btn-primary"> <a href="/admin/hoadon/create" style="text-decoration: none; color: white">Them moi</a> </button>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>
