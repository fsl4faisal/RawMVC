package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editContact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Edit Contact</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>Edit Contact</h1>\r\n");
      out.write("\t<form action=\"contact\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"edit\"> <input type=\"hidden\"\r\n");
      out.write("\t\t\tname=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contact.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li>Name:<input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contact.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\r\n");
      out.write("\t\t\t<li>Street:<input type=\"text\" name=\"street\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address.street}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\r\n");
      out.write("\t\t\t<li>City:<input type=\"text\" name=\"city\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\r\n");
      out.write("\t\t\t<li>State:<input type=\"text\" name=\"state\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\r\n");
      out.write("\t\t\t<li>Zip:<input type=\"text\" name=\"zip\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address.zip}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"edit\" name=\"edit\">\r\n");
      out.write("\t<a href=\"contacts\">Back to Contacts</a>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<form action=\"contact\" method=\"post\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contact.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t<input type=\"submit\" value=\"delete\" name=\"delete\">\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
