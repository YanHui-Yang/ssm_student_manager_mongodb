/**
 * 为学生选课的课程打分
 *
 * @param URL 请求的地址和请求参数
 * @param sN 学生学号
 * @author Fcant
 * @date 上午 8:34 2019-08-12/0012
 */
function stuScore(URL, sN) {
    var score = document.getElementById(sN+"score").value;
    if (score == null || score == '') {
        alert("请输入有效的成绩！");
    } else {
        $.ajax({
            type: "post",
            url: URL+score,
            //dataType:"json",
            //contentType : "application/json;charset=UTF-8",
            success: function (result) {
                if (result.code == 100) {
                    alert(result.msg);
                } else {
                    alert(result.msg);
                }
            }
        });
    }

}

/**
 * 添加用户信息
 *
 * @param bP 请求地址
 * @param URL 请求路径
 * @param param 必要参数
 * @author Fcant
 * @date 下午 19:05 2019-08-11/0011
 */
function addUser(bP, URL, param) {
    var number = document.getElementById("number").value;
    var name = document.getElementById("name").value;
    var tel = document.getElementById("tel").value;
    var email = document.getElementById("email").value;
    var college = document.getElementById("college").value;
    var rId = $("select").val();
    if (number == null || number == '') {
        alert("学号不能为空！")
    } else {
        if (isEmailAvailable(email)) {
            if (isPoneAvailable(tel)) {
                $.ajax({
                    type: "post",
                    url: bP + URL,
                    data: {
                        "number": number,
                        "name": name,
                        "tel": tel,
                        "email": email,
                        "college": college,
                        "rId": rId
                    },
                    //dataType:"json",
                    //contentType : "application/json;charset=UTF-8",
                    success: function (result) {
                        if (result.code == 100) {
                            alert(result.msg);
                            if (confirm("是否要继续添加新的用户")) {
                                // 添加新用户进入添加页面
                                sendRequest(bP + 'page/add', '')
                            } else {
                                // 不添加新用户进入管理页面
                                sendRequest(bP + 'user/access', param);
                            }
                        } else {
                            alert(result.msg);
                        }
                    }
                })
            } else {
                alert("手机号格式错误，请输入正确的手机号！")
            }
        } else {
            alert("邮箱格式错误，请输入正确的邮箱！");
        }
    }

}

/**
 * 发送请求的函数
 *
 * @param URL 请求的URL
 * @param param 请求必要的参数
 * @author Fcant
 * @date 下午 17:41 2019-08-10/0010
 */
function sendRequest(URL, param) {
    location.href = URL + '?' + param;
}

/**
 * 学生选课
 *
 * @param bP 请求的项目路径
 * @param sN 学生学号
 * @param cN 课程号
 * @param cName 课程名
 * @author Fcscanf
 * @date 下午 13:02 2019-08-10/0010
 */
function addCourse(bP, sN, cN, cName) {
    if (confirm("确认选择【" + cName + "】这门课程吗？")) {
        $.ajax({
            type: "post",
            url: bP + "course/add",
            data: {
                "stuNum": sN,
                "courseNum": cN
            },
            //dataType:"json",
            //contentType : "application/json;charset=UTF-8",
            success: function (result) {
                if (result == 200) {
                    alert(result.msg);
                    pageQuery(bP + 'user/sc', 1, 'user.number=' + sN);
                } else {
                    alert(result.msg)
                }
            }
        })
    }
}

/**
 * 学生退课
 *
 * @param bP 项目路径
 * @param URL 访问那个请求
 * @param pN 当前第几页
 * @param sNum 学生名
 * @param cNum 课程号
 * @param cName 课程名
 * @author Fcscanf
 * @date 下午 13:04 2019-08-10/0010
 */
function delCourse(bP, URL, pN, sNum, cNum, cName) {
    if (confirm("确认删除【" + cName + "】这门课程吗？")) {
        $.ajax({
            type: "post",
            url: bP + "/course/del",
            data: {
                "stuNum": sNum,
                "courseNum": cNum
            },
            //dataType:"json",
            //contentType : "application/json;charset=UTF-8",
            success: function (result) {
                if (result > 0) {
                    pageQuery(bP + 'user/sc', pN, 'user.number=' + sNum)
                }
            }
        })
    }
}

/**
 * 设置分页的默认大小
 *
 * @return size
 * @author Fcscanf
 * @date 下午 13:11 2019-08-10/0010
 */
function defaultSize() {
    var size = document.getElementById("size").value;
    if (size == "" || size.length == 0) {
        size = 5;
        return size;
    } else {
        return size;
    }
}

/**
 * 查询学生选择的课程
 *
 * @param URL 访问那个请求
 * @param pN 当前第几页
 * @param param 请求必要的参数
 * @author Fcant
 * @date 下午 13:12 2019-08-10/0010
 */
function pageQuery(URL, pN, param) {
    var size = defaultSize();
    location.href = URL + "?pageNumber=" + pN + "&size=" + size + "&" + param;
}

/**
 * 上一页
 *
 * @param URL 访问那个请求
 * @param pN 当前第几页
 * @param param 请求必要的参数
 * @author Fcant
 * @date 下午 13:14 2019-08-10/0010
 */
function pageQueryPro(URL, pN, param) {
    if (pN != 1) {
        pN = pN - 1
    }
    var size = defaultSize();
    location.href = URL + "?pageNumber=" + pN + "&size=" + size + "&" + param;
}

/**
 * 下一页
 *
 * @param URL 访问那个请求
 * @param pN 当前第几页
 * @param param 该请求所需的必要参数
 * @author Fcant
 * @date 下午 13:14 2019-08-10/0010
 */
function pageQueryNext(URL, pN, pTN, param) {
    var size = defaultSize();
    if (pN == pTN) {
        pN = pTN
    } else {
        pN = pN + 1;
    }
    location.href = URL + "?pageNumber=" + pN + "&size=" + size + "&" + param;
}

//验证邮箱格式
function isEmailAvailable(emailInput) {
    var reg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
    if (!reg.test(emailInput)) {
        return false;
    } else {
        return true;
    }
}

// 检验手机号
function isPoneAvailable(poneInput) {
    var reg = /^[1][3,4,5,7,8][0-9]{9}$/;
    if (!reg.test(poneInput)) {
        return false;
    } else {
        return true;
    }
}