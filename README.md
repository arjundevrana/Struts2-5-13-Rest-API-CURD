# Struts2-5-13-Rest-API-CURD




 Find All items.
 1.Request URL :-http://Your_server_ip:http_port/Struts2-5-13-Rest/data/order.json
 Method:- GET
 Responce:- [
    {
        "itemId": "1",
        "itemName": "Mobile",
        "itemAmount": 33
    },
    {
        "itemId": "2",
        "itemName": "Care",
        "itemAmount": 44
    },
    {
        "itemId": "3",
        "itemName": "Pen",
        "itemAmount": 33
    },
    {
        "itemId": "4",
        "itemName": "Laptop",
        "itemAmount": 44
    },
    {
        "itemId": "5",
        "itemName": "Book",
        "itemAmount": 66
    }
]
Find item by id.
2.Request URL :- http://Your_server_ip:http_port/Struts2-5-13-Rest/data/order/1.json 
 Method:- GET
 Responce:- {
    "itemId": "1",
    "itemName": "Mobile",
    "itemAmount": 33
}
Insert new Item 
3. Request URL:-http://Your_server_ip:http_port/Struts2-5-13-Rest/data/order.json
	Method:- POST
	Request parameeter 
	{
    "itemName": "Tea",
    "itemAmount": 33
	}
Responce 
	{
    "itemId": "7",
    "itemName": "Tea",
    "itemAmount": 33
}
Update item by item id 
4. Request URL:- http://Your_server_ip:http_port/Struts2-5-13-Rest/data/order/1.json
	Method PUT
	Request Parameeter
	{
    "itemName": "Watch",
    "itemAmount": 320
	}
   Responce data 
   {
    "itemId": "1",
    "itemName": "Watch",
    "itemAmount": 320
	}
Delete item by id 
5. Request Url:- http://Your_server_ip:http_port/Struts2-5-13-Rest/data/order/2.json 
	Method DELETE 
	Responce
	{
    "itemId": "2",
    "itemName": "Care",
    "itemAmount": 44
}