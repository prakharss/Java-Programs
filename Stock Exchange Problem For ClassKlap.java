/*
Stock Exchange
--------------

Implement an order matching system for a stock exchange.

Traders place Buy or Sell orders for a stock indicating the quantity and price.

These orders get entered into the exchange’s order-book and remain there until they are matched or until the trading day ends.

The exchange follows a FirstInFirstOut Price-Time order-matching rule, which states that: “The first order in the order-book at a price level is the first order matched. All orders at the same price level are filled according to time priority”.

The exchange works like a market, lower selling prices and higher buying prices get priority.

A trade is executed when a buy price is higher than a sell price. The trade is recorded at the price of the sell order regardless of the price of the buy order.

Write a program that accepts orders from standard input and writes to standard output the trades that were executed in the format below:
*/

/*
The following input (format:<order-id> <time> <stock> <buy/sell> <qty> <price>):
8
#1 09:45 XAM sell 100 240.10
#2 09:45 XAM sell 90 237.45
#3 09:47 XAM buy 80 238.10
#5 09:48 XAM sell 220 241.50
#6 09:49 XAM buy 50 238.50
#7 09:52 TCS buy 10 1001.10
#8 10:01 XAM sell 20 240.10
#9 10:02 XAM buy 150 242.70

Should produce the following output to the console: (format:<sell-order-id> <qty> <sell-price> <buy-order-id>):
#2 80 237.45 #3
#2 10 237.45 #6
#1 100 240.10 #9
#8 20 240.10 #9
#5 30 241.50 #9
*/

import java.util.*; 

class StockExchange implements Comparable<StockExchange> {
	private String id;
	private String time;
	private String name;
	private String type;
	private int quantity;
	private int actualTradeQuantity;
	private float price;
	
	static Integer convertStringToMinutes(String time)
	{
		int m0=time.charAt(4);
		int m1=time.charAt(3);
		int h0=time.charAt(1);
		int h1=time.charAt(0);
		
		return (10*h1 + h0)*60 + (10*m1 + m0);	
	}
	
	@Override
	public int compareTo(StockExchange stock) {
		String time1, time2;
		time1=this.time; time2=stock.time;
		
		Integer minutes1, minutes2;
		minutes1=convertStringToMinutes(time1);
		minutes2=convertStringToMinutes(time2);
		
		return minutes1.compareTo(minutes2);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getActualTradeQuantity() {
		return actualTradeQuantity;
	}

	public void setActualTradeQuantity(int actualTradeQuantity) {
		this.actualTradeQuantity = actualTradeQuantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}

public class Solution 
{	
	private static void utilSolution(List<StockExchange> stockList)
	{
		int i,j;
		int n=stockList.size();
		
		//Sorting on the basis of time (first coming stock will come at top) - see compareTo method inside StockExchange class
		Collections.sort(stockList);
		
		//Comparator to sort on the basis of Price of a stock because trade is executed when a buy price is higher than a sell price.
		//Sorting on line number 178
		Comparator<StockExchange> comp=new Comparator<StockExchange>() {
			@Override
			public int compare(StockExchange stock1, StockExchange stock2) {
				if(stock1.getPrice()>stock2.getPrice())
					return 1;
				else if(stock1.getPrice()<stock2.getPrice())
					return -1;
				
				Integer minutes1, minutes2;
				minutes1=StockExchange.convertStringToMinutes(stock1.getTime());
				minutes2=StockExchange.convertStringToMinutes(stock2.getTime());
				
				return minutes1.compareTo(minutes2);	
			}
		};
		
		StockExchange stockBuy, stockSell;
		List<StockExchange> stockTempForSellList=new ArrayList<StockExchange>();
		for(i=0;i<n;i++)
		{
			stockBuy=stockList.get(i);
			if(stockBuy.getType().compareTo("buy")==0)
			{
				stockTempForSellList.clear();
				for(j=0;j<i;j++)
				{
					stockSell=stockList.get(j);
					//checking the condition for a trade to happen
					if(stockSell.getType().compareTo("sell")==0 && stockBuy.getPrice()>stockSell.getPrice() && stockBuy.getName().compareTo(stockSell.getName())==0)
					{
						stockTempForSellList.add(stockSell);
					}
				}
				
				Collections.sort(stockTempForSellList, comp);
				for(j=0;j<stockTempForSellList.size();j++)
				{
					stockSell=stockTempForSellList.get(j);
					
					int stockSellQuantity=stockSell.getQuantity();
					int stockBuyQuantity=stockBuy.getQuantity();
					int minimumOfSellAndBuyStockQuantity=Math.min(stockSellQuantity, stockBuyQuantity);
					
					stockSell.setActualTradeQuantity(minimumOfSellAndBuyStockQuantity);
					stockSell.setQuantity(stockSellQuantity-minimumOfSellAndBuyStockQuantity);
					stockBuy.setQuantity(stockBuyQuantity-minimumOfSellAndBuyStockQuantity);
					
					if(stockSell.getActualTradeQuantity()>0)
					{
						System.out.print(stockSell.getId()+" "+stockSell.getActualTradeQuantity());
						System.out.printf(" %.2f ",stockSell.getPrice());
						System.out.println(stockBuy.getId());
					}
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		
		StockExchange stock;
		List<StockExchange> stockList=new ArrayList<StockExchange>();
		for(i=0;i<n;i++)
		{
			stock=new StockExchange();
			stock.setId(sc.next()); 
			stock.setTime(sc.next()); 
			stock.setName(sc.next()); 
			stock.setType(sc.next());
			stock.setQuantity(sc.nextInt()); 
			stock.setPrice(sc.nextFloat());
			
			stockList.add(stock);
		}
		
		utilSolution(stockList);
		sc.close();
	}
} 

/*
Input
8
#1 09:45 XAM sell 100 240.10
#2 09:45 XAM sell 90 237.45
#3 09:47 XAM buy 80 238.10
#5 09:48 XAM sell 220 241.50
#6 09:49 XAM buy 50 238.50
#7 09:52 TCS buy 10 1001.10
#8 10:01 XAM sell 20 240.10
#9 10:02 XAM buy 150 242.70

Output
#2 80 237.45 #3
#2 10 237.45 #6
#1 100 240.10 #9
#8 20 240.10 #9
#5 30 241.50 #9
*/
