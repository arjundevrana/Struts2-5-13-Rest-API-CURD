<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rest API Demo</title>
</head>
<body>
<p> Welcome on strute2.5.13 Rest API Demo ........</p>
<p>
<H4> Find All items.</H4> 
<H5>  1.Request URL :-http://Your_server_ip:http_port/Struts2-5-13-Rest/data/order.json</H5>
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
<H4> Find item by id.</H4>
<h5>2.Request URL :- http://Your_server_ip:http_port/Struts2-5-13-Rest/data/order/1.json </h5>
 Method:- GET
 Responce:- {
    "itemId": "1",
    "itemName": "Mobile",
    "itemAmount": 33
}
<h4>Insert new Item </h4>
<h5>. Request URL:-http://Your_server_ip:http_port/Struts2-5-13-Rest/data/order.json</h5>
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
<h4>Update item by item id </h4>
<h5>4. Request URL:- http://Your_server_ip:http_port/Struts2-5-13-Rest/data/order/1.json</h5>
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
<h4>Delete item by id </h4>
<h6>5. Request Url:- http://Your_server_ip:http_port/Struts2-5-13-Rest/data/order/2.json </h6>
	Method DELETE 
	Responce
	{
    "itemId": "2",
    "itemName": "Care",
    "itemAmount": 44
}</p>
</body>
</html>