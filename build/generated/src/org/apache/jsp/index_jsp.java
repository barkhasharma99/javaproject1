package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">demo</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"index.jsp\">Home </a>\n");
      out.write("            </li>\n");
      out.write("             <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">About</a>\n");
      out.write("            </li>\n");
      out.write("             <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">Contact</a>\n");
      out.write("            </li>\n");
      out.write("             <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">Services</a>\n");
      out.write("            </li>\n");
      out.write("             <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"login.jsp\">Login</a>\n");
      out.write("            </li>\n");
      out.write("             <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"registration.jsp\">Registration</a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("            <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        <!--crousel-->\n");
      out.write("        <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img class=\"d-block w-100\" style=\"height: 400px\" src=\"https://media.istockphoto.com/photos/mountain-landscape-picture-id517188688\" alt=\"First slide\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-100\" style=\"height: 400px\" src=\"https://cdn.pixabay.com/photo/2015/12/01/20/28/road-1072821_960_720.jpg\" alt=\"Second slide\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-100\" style=\"height: 400px\" src=\"https://cdn.pixabay.com/photo/2017/02/08/17/24/fantasy-2049567_960_720.jpg\" alt=\"Third slide\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <!--CARD-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"text-center\">The Session</h1>\n");
      out.write("            <div class=\"card-deck\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"https://images.unsplash.com/photo-1512820790803-83ca734da794?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1198&q=80\" alt=\"Card image cap\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                        <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-success btn-lg\">Buy</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger btn-lg\">Add to Cart</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"https://images.unsplash.com/photo-1585521551675-e6e4e4d441f5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80\" alt=\"Card image cap\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                        <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-footer\">\n");
      out.write("                      <button type=\"button\" class=\"btn btn-success btn-lg\">Buy</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger btn-lg\">Add to Cart</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <img class=\"card-img-top\" src=\"https://images.unsplash.com/photo-1601572600391-8e8939310a20?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80\" alt=\"Card image cap\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Card title</h5>\n");
      out.write("                        <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-success btn-lg\">Buy</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger btn-lg\">Add to Cart</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
