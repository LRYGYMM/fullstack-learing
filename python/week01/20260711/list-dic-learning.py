# lst = [10,20,30,"python",True]
# print(lst[0])
# print(lst[1:3])
# print(lst[-1])
# print(lst[::2])
# print(lst[::-1])
# lst[0]=100
# print(lst)
# del lst[0]
# print(lst)
num = []
for i in range(10):
    user_number = int(input("请输入一个数字："))
    num.append(user_number)
print(num)
num.sort()
print(num)
print(num[0])
print(num[-1])
print(sum(num)/len(num))



