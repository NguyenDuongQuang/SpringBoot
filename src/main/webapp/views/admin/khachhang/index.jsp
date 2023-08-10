<%--
  Created by IntelliJ IDEA.
  User:ytth
  Date: 5/25/2023
  Time: 12:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>



<html>
<head>
    <title> Title</title>
    <link rel="stylesheet"
          href="/css/bootstrap.min.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
          crossorigin="anonymous">
</head>
<body  >
<div class="container" >
    <h4 style="text-align: center">Danh Sách Khach Hang</h4>
    <form>
        <table class="table"   method="post" action="admin/khachhang/create">
            <thead>
            <tr>
                <td>Mã</td>
                <td>Tên</td>
                <td>Tên Đệm</td>
                <td>Họ</td>
                <td>Ngày Sinh</td>
                <td>SĐT</td>
                <td>Địa Chỉ</td>
                <td>Thành Phố</td>
                <td>Quốc Gia</td>
                <td>Mật khẩu</td>
                <td></td>
                <td></td>
            </tr>
            <tbody>
            <c:forEach items="${danhSachKH}" var="kh">
                <tr style="background-color: white">
                    <td>${kh.ma}</td>
                    <td>${kh.ten}</td>
                    <td>${kh.tenDem}</td>
                    <td>${kh.ho}</td>
                    <td>${kh.ngaySinh}</td>
                    <td>${kh.sdt}</td>
                    <td>${kh.diaChi}</td>
                    <td>${kh.thanhPho}</td>
                    <td>${kh.quocGia}</td>
                    <td>${kh.matKhau}</td>


                <%--                        <a href="/cuahang/delete?ma=${ch.ma}" class="btn btn-info" name="delete">Delete</a>--%>
                <td>
<%--                    <button class="btn btn-primary" name="delete">Delete</button>--%>

                     <a href="/admin/khachhang/delete/${kh.id}" class="btn btn-info">Delete</a>
                    <a href="/admin/khachhang/edit/${ kh.id }" class="btn btn-info">Edit</a>
             <a href="/admin/khachhang/detail/${kh.id}" class="btn btn-info">Delail</a>
                </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
<%--        <nav aria-label="Page navigation example">--%>
<%--            <ul class="pagination">--%>
<%--                <c:forEach begin="0" end="${ data.totalPages -1}" varStatus="loop">--%>
<%--                    <li class="page-item">--%>
<%--                        <a class="page-link" href="/admin/khachhang/index?page=${loop.begin + loop.count - 1}">--%>
<%--                                ${loop.begin + loop.count }--%>
<%--                        </a>--%>
<%--                    </li>--%>
<%--                </c:forEach>--%>
<%--            </ul>--%>
<%--        </nav>--%>
    </form>

    <%--    </c:if>--%>
</div>
<button class="btn btn-primary"> <a href="/admin/khachhang/create" style="text-decoration: none; color: white">Them moi</a> </button>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>
