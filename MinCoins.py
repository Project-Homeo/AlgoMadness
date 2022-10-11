sum1 = int(input("Enter the Sum:"))
total_coin=0
coins=[5,2,1]
for coin in coins:
    if(sum1>coin):
        print("Coin:",coin)
        print("No of coin",coin,"required:",sum1//coin)
        total_coin = total_coin + (sum1//coin)
        sum1 = sum1%coin
        print("Sum left:",sum1)
        
print("Total no. of coins required: ",total_coin)