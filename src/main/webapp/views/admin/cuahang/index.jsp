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
    <title> Khách Hàng</title>
    <link rel="stylesheet"
          href="/css/bootstrap.min.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
          crossorigin="anonymous">
</head>
<body action="admin/cuahang/create " method="POST">
<div class="container" >
    <h4 style="text-align: center">Danh Sách Cửa Hàng</h4>
<%--    <c:if test="${ f:length(listDataCH) == 0}">--%>
<%--        <h3 class="alert alert-warning">Khong co du lieu</h3>--%>
<%--    </c:if>--%>
<%--    <c:if test="${ f:length(listDataCH) != 0}">--%>
        <table class="table " >
            <thead>
            <td>Mã</td>
            <td>Tên</td>
            <td>Địa Chỉ</td>
            <td>Thành phố</td>
            <td>Quốc gia</td>
            <td></td>
            <td></td>
            </thead>
            <tbody>
            <c:forEach items="${data.content}" var="ch">
                <tr style="background-color: white">
                    <td>${ch.ma}</td>
                    <td>${ch.ten}</td>
                    <td>${ch.diaChi}</td>
                    <td>${ch.thanhPho}</td>
                    <td>${ch.quocGia}</td>
                    <td>

<%--                        <button class="btn btn-primary" name="delete">Delete</button>--%>
                        <a href="/admin/cuahang/delete/${ch.id}" class="btn btn-info" >Delete</a>
                         <a href="/admin/cuahang/detail/${ch.id}" class="btn btn-info" >Detail</a>
<%--                        <button class="btn btn-primary" name="edit">Edit</button>--%>
                        <a href="/admin/cuahang/edit/${ch.id}" class="btn btn-info">Edit</a>
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
    <button class="btn btn-primary"> <a href="/admin/cuahang/create" style="text-decoration: none; color: white">Them moi</a> </button>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>
