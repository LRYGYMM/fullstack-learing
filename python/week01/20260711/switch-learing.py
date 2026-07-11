day= int(input("今天星期几"))
match day:
    case 1:
        print("今天是星期一")
    case 2:
        print("今天是星期二")
    case 3:
        print("今天是星期三")
    case 4:
        print("今天是星期四")
    case 5:
        print("今天是星期五")
    case 6:
        print("今天是星期六")
    case 7:
        print("今天是星期日")
    case _:
        print("输入错误")
