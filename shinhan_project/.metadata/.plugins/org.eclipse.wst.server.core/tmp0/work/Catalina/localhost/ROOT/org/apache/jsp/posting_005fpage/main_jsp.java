/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2020-09-19 07:48:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.posting_005fpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"is-preload\">\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.html", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- wrapper! -->\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Nav -->\r\n");
      out.write("\t<nav id=\"nav\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"../posting_page/main.jsp\" class=\"active\">Introduction</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"../posting_page/img_list.jsp\">CheckingPicture</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"../posting_page/mgt_main.jsp\">SelectingMain Picture</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- Main -->\r\n");
      out.write("\t\t<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Introduction -->\r\n");
      out.write("\t\t\t<section id=\"intro\" class=\"main special\">\r\n");
      out.write("\t\t\t\t<div class=\"spotlight\">\r\n");
      out.write("\t\t\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\t\t<header class=\"major\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Shinhan Campus Map</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"image center\"><img src=\"images/app_logo.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"\" /></span>\r\n");
      out.write("\t\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<section id=\"content\" class=\"main\">\r\n");
      out.write("\t\t\t\t<h2>개발 배경</h2>\r\n");
      out.write("\t\t\t\t<p>신입생들은 수업을 하는 강의실이나 도서관, 식당 등 교내 시설들의 정확히 파악하기가 어렵습니다. 또한\r\n");
      out.write("\t\t\t\t\t재학생들도 자신의 과에 관련된 부서나 자주 사용하는 편의시설을 제외하고는 다른 건물들의 위치나 상세정보를 몰라 헤메는\r\n");
      out.write("\t\t\t\t\t경우가 허다합나다. '신한캠퍼스맵'은 캠퍼스맵을 통해 위의 문제점들을 해결하고 학생과 교직원들에게 편의를 제공하고자\r\n");
      out.write("\t\t\t\t\t합니다.</p>\r\n");
      out.write("\t\t\t\t<p>학교 셔틀버스의 시간표를 홈페이지의 공지사항을 통해 다운받아 매번 찾아야 하는 번거러움이 잇습니다.\r\n");
      out.write("\t\t\t\t\t'신한캠퍼스맵'은 출발지와 목적지별로 셔틀버스 시간표를 분리하여 제시함으로써 더 쉽게 셔틀버스 정보를 접할 수 있도록\r\n");
      out.write("\t\t\t\t\t도움을 줍니다.</p>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<section id=\"content\" class=\"main\">\r\n");
      out.write("\t\t\t\t<h2>앱 기능</h2>\r\n");
      out.write("\t\t\t\t<h3>1. 캠퍼스맵</h3>\r\n");
      out.write("\t\t\t\t<p>캠퍼스 지도를 제공하고, 지도에서 강의실, 행정시설, 편의시설, 교수연구실, 학과사무실을 찾아 위치 및 정보를\r\n");
      out.write("\t\t\t\t\t확인할 수 있습니다. 또한 사용자가 건물 사진을 추가하여 다양한 사진들을 공유할 수 있습니다. 위와 같은 정보는 검색하여\r\n");
      out.write("\t\t\t\t\t찾을 수도 있고, 음성으로도 검색이 가능합니다. 그리고 현재 위치로부터 특정 건물까지의 길찾기 기능을 제공합니다.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h3>2. 셔틀버스</h3>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t정규 시간표를 아래와 같이 나누어 제공합니다. <br> <br>- 1~2캠 셔틀버스 <br>-\r\n");
      out.write("\t\t\t\t\t2캠 지행역 / 동두천중앙역 행 셔틀버스 <br>- 2캠 학교 / 행복기숙사 행 셔틀버스 <br>-\r\n");
      out.write("\t\t\t\t\t일산행 셔틀버스 <br>- 대화행 셔틀버스\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h3>3. 링크</h3>\r\n");
      out.write("\t\t\t\t<p>학교 생활을 하며 필요한 학교 관련 사이트 링크를 제공함으로써 원할 때 필요한 사이트에 쉽게 접근할 수 있도록\r\n");
      out.write("\t\t\t\t\t돕습니다.</p>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Scripts -->\r\n");
      out.write("\t<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/jquery.scrolly.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/browser.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
