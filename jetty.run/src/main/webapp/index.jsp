<jsp:useBean id="hello" class="jetty.run.bean.HelloBean" scope="session"/>
<html>
<body>
<h2><%=hello.getGreeting() %> Jetty Run World!</h2>
</body>
</html>
