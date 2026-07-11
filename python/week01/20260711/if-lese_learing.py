#
# #定义正确的账号和密码
# correct_username = "admin"
# correct_password = "123456"
#
# #接受用户输入账号和密码
# username = input("请输入你的账号：")
# passwd = input("请输入你的密码")
# #
# if username == correct_username and passwd == correct_password:
#     print("登录成功")
# else:
#     print("登录失败")
#
#
a = int(input("请输入三角形的第一条边："))
b = int(input("请输入三角形的第二条边："))
c = int(input("请输入三角形的第三条边："))

# 判断能否构成三角形
if a + b > c and a + c > b and b + c > a:
    #是否直角
    is_right = (a**2 + b**2 == c**2) or (a**2 + c**2 == b**2) or (b**2 + c**2 == a**2)
    #是否等腰
    is_iso = (a == b or a == c or b == c)
    #等边
    is_equ = (a == b == c)

    if is_equ:
        print("这是一个等边三角形")
    elif is_right and is_iso:
        print("这是一个直角等腰三角形")
    elif is_iso:
        print("这是一个等腰三角形")
    elif is_right:
        print("这是一个普通直角三角形")
    else:
        print("这是一个普通三角形")
else:
    print("这不是一个三角形")