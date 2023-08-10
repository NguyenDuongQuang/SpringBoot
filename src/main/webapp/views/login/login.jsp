   <div class="bg-login">
    <div class="login-form">
        <h3>Đăng nhập</h3>

        <form action="/login" method="POST" style="margin-top: 30px;">
            <div class="mt-3">
                <label for="username" class="mb-1">Tên tài khoản</label>
                <input name="username" type="text" class="form-control" value="${account.username}"/>
            </div>
            <div class="mt-4">
                <label for="password" class="mb-1">Mật khẩu</label>
                <input name="password" type="password" class="form-control" value="${account.password}"/>
            </div>
            <div class="mt-3">
                <span id="error" style="color:red">${message}</span>
            </div>
            <div style="margin-top: 35px;">
                <button type="submit" class="btn btn-primary" style="width: 100%;">Đăng nhập</button>
            </div>
        </form>
        <p class="text-center mt-4"><a href="#/">Đăng ký tài khoản</a></p>
    </div>
</div>