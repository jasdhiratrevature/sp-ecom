1. Initial Commit - Branch main
	Product Service RestAPI created

2. Order Service - Branch orderService
	Order Service RestAPI created
	
3. Inventory Service - Branch inventoryService
	Inventory Service RestAPI created
	
4. Feign Client - Branch feignClient
	FeignClient is a Web service client
	we will create a client in the order service which will call the inventory service
	create the client interface in the client package and update the service class in 
	order service to call the inventory service and test.
	Add the feign dependency
	don't forget to enable the FeignClient @EnableFeignClients in main of order-service
	Test your application order-service using post main	