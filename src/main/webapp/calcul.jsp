<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calorie Calculator</title>
</head>
<body>
<form name="info" action="/CounterWebApp/calory/submit" method="get" >
男性
<input type="radio" id="sexMale" checked="checked" name="sex" value="male" />
女性
<input type="radio" name="sex" id="sexFemale" value="female" />
</br>
身高
<input type="text" id="height" name="height" onkeypress="return event.keyCode>=48&&event.keyCode<=57" ng-pattern="/[^a-zA-Z]/" style="ime-mode:Disabled" required />
cm
</br>
体重
<input type="text" id="weight" name="weight" onkeypress="return event.keyCode>=48&&event.keyCode<=57" ng-pattern="/[^a-zA-Z]/" style="ime-mode:Disabled" required />
kg
</br>
年龄
<input type="text" id="age" name="age" onkeypress="return event.keyCode>=48&&event.keyCode<=57" ng-pattern="/[^a-zA-Z]/" style="ime-mode:Disabled" required />
year
</br>
运动系数
<select name="sportindex" id="sportindex">
<option value="1.2">1.2······静坐/无运动</option>
<option value="1.375">1.375····1~2次运动/周</option>
<option value="1.55">1.55·····3~5次运动/周</option>
<option value="1.725">1.725····6~7次运动/周</option>
<option value="1.9">1.9······专业运动员/劳力工作者</option>
</select>
(无法确切计算消耗的运动，不包括有确切消耗的有氧运动)
</br>
有氧消耗
<input type="text" id="aerobic" name="aerobic" onkeypress="return event.keyCode>=48&&event.keyCode<=57" ng-pattern="/[^a-zA-Z]/" style="ime-mode:Disabled" required />
kcal (除广泛运动及无氧运动外的，一天确切消耗的有氧运动消耗，如 跑步、游泳)
</br>
增肌
<input type="radio" id="goalMuscle" checked="checked" name="goals" value="muscle" />
减脂
<input type="radio" id="goalFat" name="goals" value="fat" />
</br>
能量过剩/赤字
<input type="text" id="energy" name="energy" onkeypress="return event.keyCode>=48&&event.keyCode<=57" ng-pattern="/[^a-zA-Z]/" style="ime-mode:Disabled" required/>
kcal
</br>
(建议值： 能量过剩：200~500kcal 能量赤字:500~1000kcal)
</br>
<input type="submit" value="提交"/>
</form>
<br>
我在微信小程序上也做了一个类似的应用欢迎使用
<br/>
名字叫 热量摄入计算器<br>
<img src="lego.jpg" alt="logo"  />
</body>
</html>