while True:
    try:
        num = input()
        num = int(num)
        fec = 1
        if num != 0 and num != 1:
            for i in range(1, num+1):
                fec *= i
        su = 0
        for i in range(len(str(fec))):
            su = int(fec % 10)
            fec = fec // 10
            if su != 0:
                break
        print('{:>5} -> {}'.format(num, su))
    except:
        break