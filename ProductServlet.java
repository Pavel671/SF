package ru.geekbrains.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/product_servlet")
public class ProductServlet implements Servlet {

    private static final Logger logger = LoggerFactory.getLogger(ProductServlet.class);
    private transient ServletConfig config;


    @Override
    public void init(ServletConfig config) {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        logger.info("New request");
        res.getWriter().println(" <p>Product 1<p>"+"<p>Product 2<p>"+"<p>Product 3<p>"+"<p>Product 4<p>"+"<p>Product 5<p>"+"<p>Product 6<p>"+"<p>Product 7<p>"+"<p>Product 8<p>"+"<p>Product 9<p>"+"<p>Product 10<p>");
    }


    @Override
    public String getServletInfo() {
        return "ProductServlet";
    }

    @Override
    public void destroy() {
        logger.info("Servlet {} destroyed", getServletInfo());
    }
}
