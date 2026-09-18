# JavaEE实验二

JavaEE（Servlet / JSP）实验项目，基于 Eclipse 动态 Web 工程，主要练习 Servlet 表单处理与请求参数接收。

## 内容

- `RegisterServlet`：注册页面处理，接收用户名、密码、性别、邮箱、手机、班级等信息，
  校验非空与两次密码是否一致，并把注册结果回显到页面（`/register.do`）
- `SimpleTestServlet`：在线测验评分，接收单选、多选、填空答案并计算得分（`/simpletest.do`）
- `src/main/webapp/input.html`：注册页面（HTML 表单）
- `src/main/webapp/test.html`：测验页面（HTML 表单）

## 运行环境

- JDK 11
- Apache Tomcat 8.5
- Eclipse（Dynamic Web Project）

## 部署方式

1. 在 Eclipse 中导入本工程（Import → Existing Projects into Workspace）
2. 配置 Tomcat 8.5 运行时
3. 部署到 Tomcat 并启动
4. 访问 `http://localhost:8080/chap02-24030109/input.html` 测试注册，
   访问 `http://localhost:8080/chap02-24030109/test.html` 测试测验
