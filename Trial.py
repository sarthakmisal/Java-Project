# year=2000
# if(type(year)==int):
#     if(year<=9999 and year>=1000):
#         if(year%4==0):
#             print("Leap year")
#         else:
#             print("Not a Leap Year")
#     else:
#         print("Invalid Year")
# else:
#     print("Wrong Input")

a=0
b=1
c=0
print(0,"\t",1,"\t")
for i in range(0,100):
    c+=b
    print(c,end="\t")
    a=b
    b=c
    # b=a
    # a+=1