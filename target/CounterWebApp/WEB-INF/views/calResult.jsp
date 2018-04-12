<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>result</title>
<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-110074898-1"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-110074898-1');
</script>
<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<script>
  (adsbygoogle = window.adsbygoogle || []).push({
    google_ad_client: "ca-pub-6152867318018486",
    enable_page_level_ads: true
  });
</script>

</head>
<style  type="text/css">
.firstRow {
    display:flex;
    flex-direction:row;
}

.formDiv{
	width:700px;
}
.wechatApp{
	
}
.ad{
	
}
</style>
<body>
<div class="firstRow">
<div >
<div class="formDiv">
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
</div>
<div class="ad">
<a href="https://s.click.taobao.com/t?e=m%3D2%26s%3DT71%2Bv9ohAfIcQipKwQzePOeEDrYVVa64K7Vc7tFgwiHjf2vlNIV67ib7JhStDaHtLzKPa%2Ff2nu%2B4GH6HVdMx%2FWtWeZl7FJklBdWxfnj%2Brebw%2FEAwgoPDdMSBZxvVooRLv2y1yjuHRXzexejUGDlr%2Ft%2BLIjw8oQPvxg5p7bh%2BFbQ%3D&pvid=10_61.144.173.32_459_1521863701855" target="_blank">
<img src="../chi.jpg" height="200px" width="200px" alt="chi" />
<br>
蛋白质吃不够怎么办？点击购买MyProtein蛋白粉！
</a>
<br>
</div>
</div>
<div class="wechatApp">
<br>
我在微信小程序上也做了一个类似的应用欢迎使用
<br/>
名字叫 热量摄入计算器<br>
<img src="../lego.jpg"  />
</div>
</div>
</body>
</html>