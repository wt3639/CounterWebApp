<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="info" >
男性
<input type="radio" id="sexMale" checked="checked" name="Sex" value="male" />
女性
<input type="radio" name="Sex" id="sexFemale" value="female" />
</br>
身高：
<input type="text" id="height" name="height" required />
cm
</br>
体重：
<input type="text" id="weight" name="weight" required />
kg
</br>
年龄：
<input type="text" id="age" name="age" required />
year
</br>
运动系数：
<select name="sportIndex" id="sportIndex">
<option value="1.2">1.2······静坐/无运动</option>
<option value="1.375">1.375····1~2次/周</option>
<option value="1.55">1.55·····1~2次/周</option>
<option value="1.725">1.725····1~2次/周</option>
<option value="1.9">1.9······专业运动员/劳力工作者</option>
</select>
</br>
有氧消耗：
<input type="text" id="aerobic" name="aerobic" required />
kcal
</br>
增肌
<input type="radio" id="goalMuscle" checked="checked" name="Goal" value="muscle" />
减脂
<input type="radio" id="goalFat" name="Goal" value="fat" />
</br>
能量过剩/赤字
<input type="text" id="energy" name="energy" required/>
kcal
</br>
<input onClick="CAL()" type=button value=计算 name=Submit>
</form>
<>
<script type="text/javascript">
function CAL() {
    var sexMale = document.getElementById("sexMale");
    var height = document.getElementById("height");
    var weight = document.getElementById("weight");
    var age = document.getElementById("age");
    var sportIndex = document.getElementById("sportIndex");
    var aerobic = document.getElementById("aerobic");
    var goalMuscle =  document.getElementById("goalMuscle");
    var energy = document.getElementById("energy");
if(sex.checked){
 document.write("ok");
    var basic = 90 + 4.8* eval(height.value) + 13.4* eval(weight.value) - 5.7* eval(age.value);
    document.write("ok");}
}
else 
    
 
    document.write(ae.value);
    
}
    
   

</script>


</body>
</html>