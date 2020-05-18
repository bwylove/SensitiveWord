package com.sxbdjw.sensitive.filter;

import com.sxbdjw.sensitive.util.SensitiveWordUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

public class SensitiveWordsFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        Enumeration pNames = request.getParameterNames();
        while (pNames.hasMoreElements()) {
            String name = (String) pNames.nextElement();
            String value = request.getParameter(name);
            String str = SensitiveWordUtil.sensitiveHelper(value);
            request.setAttribute(name, str);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
