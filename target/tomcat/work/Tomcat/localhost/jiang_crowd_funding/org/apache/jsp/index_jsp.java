/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-09-19 13:24:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/head.jsp", Long.valueOf(1537363410123L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/default/easyui.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/icon.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/head.css\"/>\r\n");
      out.write("\t<!-- 需要先导入jquery的文件，再导入easyUI文件 -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"easyui/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<ul id=\"headul\">\r\n");
      out.write("\t\t<li><a class=\"active\" href=\"#home\">首页</a></li>\r\n");
      out.write("\t\t<li><a  href=\"#\">用户</a></li>\r\n");
      out.write("\t\t<li><a href=\"#\">账户充值</a></li>\r\n");
      out.write("\t\t<li><a href=\"#\">注销</a></li>\r\n");
      out.write("\t\t<li><a href=\"#help\">帮助</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>首页</title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/default/easyui.css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/icon.css\"/>\r\n");
      out.write("\t\t<!-- 需要先导入jquery的文件，再导入easyUI文件 -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"easyui/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\"  href=\"css/base.css\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t $(function(){\r\n");
      out.write("\t\t\t\t\t$(\"#home-layout\").layout({\r\n");
      out.write("\t\t\t\t\t\tfit:true\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#home-west\").tree({\r\n");
      out.write("\t\t\t\t\t\turl:\"home_tree.json\",\r\n");
      out.write("\t\t\t\t\t\tmethod:\"get\",\r\n");
      out.write("\t\t\t\t\t\tlines:true,\r\n");
      out.write("\t\t\t\t\t\tanimate:true,\r\n");
      out.write("\t\t\t\t\t\tonClick:function(node){\r\n");
      out.write("\t\t\t\t\t\t\tif(node.attributes && node.attributes.url)\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t//打开内容区的tab，代码在其后\r\n");
      out.write("\t\t\t\t\t\t\t\taddTab({\r\n");
      out.write("\t\t\t\t\t\t\t\t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/\" + node.attributes.url,\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle: node.text\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t/*\r\n");
      out.write("\t\t\t\t\t* 初始化内容区的tabs\r\n");
      out.write("\t\t\t\t\t*/\r\n");
      out.write("\t\t\t\t\t$(\"#home-tabs\").tabs({\r\n");
      out.write("\t\t\t\t\t\tfit : true,\r\n");
      out.write("\t\t\t\t\t\t//tab页是否有边框\r\n");
      out.write("\t\t\t\t\t\tborder : false\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t});\t\r\n");
      out.write("\t\t\t /*\r\n");
      out.write("\t\t\t\t * 在内容区添加一个tab\r\n");
      out.write("\t\t\t\t */\r\n");
      out.write("\t\t\t\tfunction addTab(params) {\r\n");
      out.write("\t\t\t\t\tvar t = $(\"#home-tabs\");\r\n");
      out.write("\t\t\t\t\tvar url = params.url;\r\n");
      out.write("\t\t\t\t\tvar opts = {\r\n");
      out.write("\t\t\t\t\t\ttitle : params.title,\r\n");
      out.write("\t\t\t\t\t\tclosable : true,\r\n");
      out.write("\t\t\t\t\t\thref : url,\r\n");
      out.write("\t\t\t\t\t\tfit : true,\r\n");
      out.write("\t\t\t\t\t\tborder : false\r\n");
      out.write("\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\t//如果被选中的节点对应的tab已经存在，则选中该tab并刷新内容\r\n");
      out.write("\t\t\t\t\t//否则打开一个新的tab\r\n");
      out.write("\t\t\t\t\tif (t.tabs(\"exists\", opts.title)) {\r\n");
      out.write("\t\t\t\t\t\tvar tab = t.tabs(\"select\", opts.title).tabs(\"getSelected\");\r\n");
      out.write("\t\t\t\t\t\tt.tabs(\"update\", {\r\n");
      out.write("\t\t\t\t\t\t\ttab : tab,\r\n");
      out.write("\t\t\t\t\t\t\toptions : opts\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tt.tabs(\"add\", opts);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"margin:20px 0;\"></div>\r\n");
      out.write("\t<div id=\"home-layout\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 页面西部 -->\r\n");
      out.write("\t\t<div id=\"home-west\" data-options=\"region:'west',split:true\" style=\"width: 200px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 页面北部 -->\r\n");
      out.write("\t\t<div data-options=\"region:'center'\">\r\n");
      out.write("\t\t\t<div id=\"home-tabs\">\r\n");
      out.write("\t\t\t\t<div title=\"首页\">\r\n");
      out.write("\t\t\t\t\t<h2 style=\"text-align: center\">欢迎登录</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
