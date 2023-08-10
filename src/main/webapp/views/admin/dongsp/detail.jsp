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
<header><h2 style="text-align: center;">Detail Cửa Hàng</h2></header>
<main>
    <div class="container">
        <div class="mb-3">
            <label class="form-label">Mã  :  </label>
            <span>${dongSP.ma}</span>
        </div>
        <div class="mb-3">
            <label class="form-label">Tên  :  </label>
            <span>${dongSP.ten}</span>
        </div>

        <a href="#" class="btn btn-info">Thêm Vào Giò Hàng</a>

    </div>
</main>
<footer><p style="text-align: center;">Thành Trượt JAVA4</p></footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>