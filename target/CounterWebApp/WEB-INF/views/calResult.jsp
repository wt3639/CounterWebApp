<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>result</title>
</head>

<body>
您的基础代谢率为:
<c:out value="${basic}"></c:out>
kcal
</br>
总消耗量为：
<c:out value="${total}"></c:out>
kcal
</br>
建议摄入：</br>
能量：
<c:out value="${need}"></c:out>
kcal</br>
蛋白质：
<c:out value="${prot}"></c:out>
g</br>
脂肪：
<c:out value="${fat}"></c:out>
g</br>
碳水：
<c:out value="${cab}"></c:out>
g
</br>

<button onclick=window.history.back(-1); >返回</button>
<br>
我在微信小程序上也做了一个类似的应用欢迎使用
<br/>
名字叫 热量摄入计算器
<img src="../../resources/lego.jpg"  />
</body>
</html>