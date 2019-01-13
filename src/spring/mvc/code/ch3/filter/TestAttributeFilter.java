package spring.mvc.code.ch3.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * javax.servlet.*
 * lib import
 * apache-tomcat-8.5.33\lib\servlet-api.jar
 */
@WebFilter(value="/main")
public class TestAttributeFilter implements Filter {

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
            throws IOException, ServletException {

        System.out.println("進入AuthFilter過濾器的doFilter方法");
        // 將ServletRequest 對象強轉成 HttpServletRequest對象
        HttpServletRequest request = (HttpServletRequest)arg0;
        // 在 request 作用範圍域中設置一個school屬性
        request.setAttribute("school", "RHZ");
        // 在session作用範圍域中設置一個author屬性
        request.getSession().setAttribute("author", "Enoxs");
        // 如果還有過濾器執行過濾器，否則進入請求處理方法
        chain.doFilter(request, arg1);

    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub

    }
}
