1. Initial Commit - Branch main 8081
	Product Service RestAPI created

2. Order Service - Branch orderService 8082
	Order Service RestAPI created
	
3. Inventory Service - Branch inventoryService 8083
	Inventory Service RestAPI created
	
4. Feign Client - Branch feignClient
	FeignClient is a Web service client
	we will create a client in the order service which will call the inventory service
	create the client interface in the client package and update the service class in 
	order service to call the inventory service and test.
	Add the feign dependency
	don't forget to enable the FeignClient @EnableFeignClients in main of order-service
	Test your application order-service using post main	
	
5. Spring Gateway API branch apiGateway 9000
	Create a new project which will act as a get way to our applications and define the routes

6. Spring Discover with eureka : branch - namingServer  8761
	Create a new spring boot application and add eureka server dependency,
	also add @EnableEurekaServer on the main method of the application
	Add Eureka client dependency to all the application except naming-server and
	add eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka in app.prop for all applications
	in the order-service modify the @FeignClient to use the name from the eureka server
