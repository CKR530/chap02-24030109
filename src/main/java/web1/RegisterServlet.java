package web1;// 此处改成你实际的包名

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "registerServlet", urlPatterns = { "/register.do" })
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		// 接收注册页面提交的 7 项信息
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		String sex = request.getParameter("sex");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String clazz = request.getParameter("clazz");

		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>注册结果</title>");
		out.println("</head><body>");

		boolean empty = username == null || username.trim().equals("")
				|| password == null || password.trim().equals("");

		if (empty) {
			out.println("<h3>注册失败：用户名和密码不能为空！</h3>");
		} else if (password2 != null && !password.equals(password2)) {
			out.println("<h3>注册失败：两次输入的密码不一致！</h3>");
		} else {
			out.println("<h3>恭喜注册成功！</h3>");
			out.println("<p>用户名：" + username + "</p>");
			out.println("<p>性&nbsp;&nbsp;&nbsp;&nbsp;别：" + sex + "</p>");
			out.println("<p>电子邮箱：" + email + "</p>");
			out.println("<p>手机号码：" + phone + "</p>");
			out.println("<p>所在班级：" + clazz + "</p>");
		}

		out.println("</body></html>");
	}
}