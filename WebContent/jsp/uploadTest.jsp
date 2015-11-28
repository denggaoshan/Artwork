<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>
<body>

  <span style="font-size:12px"><body>  
    <form action="UploadAction.action" method="post" enctype="multipart/form-data">
    　
       file: <input type="file" name="file"><br>
        
        <input type="submit" value="submit">
    </form>
    
  </body></span>  

</body>
</html>
