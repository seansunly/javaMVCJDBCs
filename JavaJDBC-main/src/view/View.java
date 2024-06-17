package view;

import controller.CustomerController;
import controller.OrderController;
import controller.ProductController;
import exception.ExceptionHandling;

import java.util.Scanner;

public class View {
    private static final CustomerController customerController = new CustomerController();
    private static final OrderController orderController = new OrderController();
    private static final ProductController productController = new ProductController();

    public static void menu() throws ExceptionHandling {
        while (true) {
            System.out.println("=== Food Delivery Application ===");
            System.out.println("1. Customers");
            System.out.println("2. Orders");
            System.out.println("3. Products");
            System.out.println("4. Exit");
            System.out.println("=".repeat(30));
            System.out.print("Enter your choice: ");
            int choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    customerMenu();
                    break;
                case 2:
                    orderMenu();
                    break;
                case 3:
                    productMenu();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void customerMenu() throws ExceptionHandling {
        while (true) {
            System.out.println("=== Customer Menu ===");
            System.out.println("1. Display All Customers");
            System.out.println("2. Add New Customer");
            System.out.println("3. Update Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Back to Main Menu");
            System.out.println("=".repeat(25));
            System.out.print("Enter your choice: ");
            int choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    customerController.queryAllCustomers().forEach(System.out::println);
                    break;
                case 2:
                    customerController.addNewCustomer();
                    break;
                case 3:
                    customerController.updateCustomer();
                    break;
                case 4:
                    customerController.deleteCustomer();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void orderMenu() throws ExceptionHandling {
        while (true) {
            System.out.println("=== Order Menu ===");
            System.out.println("1. Display All Orders");
            System.out.println("2. Add New Order");
            System.out.println("3. Update Order");
            System.out.println("4. Delete Order");
            System.out.println("5. Back to Main Menu");
            System.out.println("=".repeat(25));
            System.out.print("Enter your choice: ");
            int choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    orderController.queryAllOrders().forEach(System.out::println);
                    break;
                case 2:
                    orderController.addNewOrder();
                    break;
                case 3:
                    orderController.updateOrder();
                    break;
                case 4:
                    orderController.deleteOrder();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void productMenu() throws ExceptionHandling {
        while (true) {
            System.out.println("=== Product Menu ===");
            System.out.println("1. Display All Products");
            System.out.println("2. Add New Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Back to Main Menu");
            System.out.println("=".repeat(25));
            System.out.print("Enter your choice: ");
            int choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    productController.queryAllProducts().forEach(System.out::println);
                    break;
                case 2:
                    productController.addNewProduct();
                    break;
                case 3:
                    productController.updateProduct();
                    break;
                case 4:
                    productController.deleteProduct();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}