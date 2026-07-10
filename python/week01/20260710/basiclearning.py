# #输出helloworld 字符串类型
# print("hello world")
# # 字面量的写法
# print(100)#整数类型
# print(3.14)#浮点数类型
# print(True)#布尔类型
# print(False)#布尔类型
# print(None)
# print(True+1)#布尔类型本质也是整数类型
# print(False+1)
# print("------------------------")
# # 变量的学习
# # 变量是空间，用来存储数据的 可以存储任何类型的数据
# a = 100
# print(a)
# b = 200
# print("a+b的值是",a+b)
# print("a+2b的值是",a+b+b)
# # 一次性定义多个变量
# c,d = 1,2
# # 交换
# temp = a
# a = b
# b = temp
# print("a的值是",a)
# print("b的值是",b)
# """
# 常见的数据类型有：
# 1. 整数类型 int
# 2. 浮点数类型 float
# 3. 布尔类型 bool
# 4. None 类型 NoneType
# type() 函数用于返回对象的类型
# isinstance() 函数用于判断对象是否是指定类型，返回布尔值。
#
# """
# print(type(3.14))
# print(type(100))
# print(type(True))
# print(type(None))
# print(type("hello world"))
# print(isinstance(c, float))
#常见的转义字符
# 具体的是\n 表示换行，\t 表示制表符，\\ 表示反斜杠，\" 表示双引号，\' 表示单引号
print("hello\nworld")#换行
print("hello\tworld")#制表符
print("hello\\world")#反斜杠
print("hello\"world")#双引号
print("hello\'world")#单引号
print("hello\\world")#反斜杠
a = """
这是我的python之旅，欢迎大家来看！！
一个代码小白的开始之旅
"""
print(a)





