def modulo(uang):
    sheet1 = 10000
    sheet2 = 5000
    sheet3 = 1000

    one = int(uang / sheet1)
    two = int(int((uang - (sheet1 * one))) / sheet2)
    three = int(int(uang - ((sheet1 * one) + (sheet2 * two))) / sheet3)

    return '<' + str(one) + ', ' + str(two) + ', ' + str(three) + '>';

input = int(input('>>> '))

print(modulo(input))
