@PRODUCTS
Feature:Products

  Background: the user opens the browser
    Given  the user TestingUser opens the browser
    When enter the userName: "admin" and the password: "serenity" and then click button Sign Up
    #Then the Dashboard page will be displayed

  @PRODUCTS-HP
  Scenario: User successfully creates a new product
    When fill the form wit the following information
      | ProductName | Units |
      | Test2       | 12    |
    And filter the products by ID
    Then the product "Test2" must be displayed

  @PRODUCTS-FE
  Scenario: User fails to create a new product
    When tries to create a product with no info
    Then the site will display the following alert:  "Please validate empty or invalid inputs"
