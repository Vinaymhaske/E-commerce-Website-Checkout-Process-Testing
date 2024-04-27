 

import unittest
from selenium import webdriver

class AddToCartTest(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome()
        self.driver.get("https://example.com")  # Replace with the URL of your e-commerce website

    def test_add_to_cart(self):
        # Test case for adding items to the cart
        # Steps:
        # 1. Navigate to the product page.
        # 2. Click on the "Add to Cart" button.
        # 3. Verify that the item is added to the cart.
        product_page_button = self.driver.find_element_by_css_selector("#add-to-cart-button")
        product_page_button.click()
        cart_icon = self.driver.find_element_by_css_selector(".cart-icon")
        self.assertTrue(cart_icon.is_displayed(), "Item not added to cart")

    def tearDown(self):
        self.driver.quit()

if __name__ == "__main__":
    unittest.main()
