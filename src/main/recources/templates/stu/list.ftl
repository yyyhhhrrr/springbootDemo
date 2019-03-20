<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
欢迎${username}登录

<#if (age<18)>
    <#elseif (age >30)> 大叔
    <#else> 帅哥
</#if>

<br>
学生列表
<br>
<table border="1">
    <tr>
        <td>ID</td>
        <td>名字</td>
        <td>年龄</td>
        <#list studentList?sort_by("id")?reverse as stu>
            <tr>
                <td>${stu.id}</td>
                <td>${stu.name}</td>
                <td>${stu.age}</td>
            </tr>
        </#list>
    </tr>
</table>
</body>
</html>