# Restaurant API

This is a simple REST API for a restaurant service.
It provides endpoints to calculate bills for orders and to retrieve food items from the menu.

## 

### 1. Calculate Bill
   - Method: POST
   - Path: /calculate/bill
   - Request Body: `curl --/order/calculate/bill' \
     --header 'Content-Type: application/json' \
     --data '{
     "items": [
     {
     "name":"Pizza",
     "category":"food",
     "price":100,
     "quantity":2
    }
    ],
    "isFirstOrder":true
    }'`
   - Description: Calculates the bill for the provided order. Applies discounts based on whether it's the customer's first order or not.

### 2. Get Food Items by Category
   - Method: GET
   - Path: /get/menu/{category}
   - Path Variable: category (String)
   - Description: Retrieves a list of food items from the menu for the specified category.

#### * Usage

* Clone the repository.
* Build and run the application.
* Access the API endpoints using a REST client such as Postman.
