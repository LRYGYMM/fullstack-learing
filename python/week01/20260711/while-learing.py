# a = 0
# b=0
# while a < 1000:
#     if a % 2 == 0:
#         b += a
#     a += 1
# print(b)
# msg="hello world"
# for i in msg:
#     print(i)


# for i in range(1,10):
#     for j in range(1,i+1):
#         print(f"{j}*{i}={i*j}",end="\t")
#     print()

# while True:
#     username = input("请输入你的用户名")
#     passwd = input("请输入你的密码")
#     if username == "" or passwd =="" :
#         print("用户和密码不能为空 请重新输入")
#         continue
#     elif username == "admin" and passwd =="1234" :
#         print("欢迎进入python")
#         break
#     elif username == "xiaomin" and passwd == "1111":
#         print("欢迎进入python")
#         break
#     else:
#         print("用户密码错误，请重新输入")

# import random as rd
# random_number = rd.randint(1,100)
# i=0
# while True:
#     user_num = int(input("请输入你的猜测数字："))
#     if user_num > random_number:
#         print("你猜的数字太大了")
#         i+=1
#         continue
#     elif user_num < random_number:
#         print("你猜的数字太小了")
#         i+=1
#         continue
#     else:
#         print("恭喜你猜对了")
#         print(f"你猜了{i}次")
#         break
# sum=0
# for i in range(1,1001):
#     if i % 5 == 0:
#         sum+=i
# print(sum)
string = 'akiwksjakdiklowiqaamnvbamvaxnsjdsjkaaxkjd'
a_num=0
k_num=0
for i in string:
    if i == 'a':
        a_num+=1
    elif i == 'k':
        k_num+=1
print(f"a的个数为{a_num},k的个数为{k_num}")

