package com.library;
import java.sql.*;
import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/library_db";
        String username = "root";
        String password = "bunnyhoney123@";    

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            while (true) {

                System.out.println("\n===== LIBRARY MENU =====");
                System.out.println("1. Add Book");
                System.out.println("2. Issue Book");
                System.out.println("3. Return Book");
                System.out.println("4. Search Book");
                System.out.println("5. Display Available Books");
                System.out.println("6. Display Issued Books");
                System.out.println("7. Exit");

                System.out.print("Enter Choice : ");
                int choice = sc.nextInt();

                switch (choice) {

               

                case 1:

                    System.out.print("Book Id : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Book Name : ");
                    String name = sc.nextLine();

                    System.out.print("Author Id : ");
                    int authorId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Category : ");
                    String category = sc.nextLine();

                    System.out.print("Price : ");
                    double price = sc.nextDouble();

                    System.out.print("Quantity : ");
                    int qty = sc.nextInt();

                    PreparedStatement ps = con.prepareStatement(
                            "INSERT INTO Book VALUES(?,?,?,?,?,?)");

                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setInt(3, authorId);
                    ps.setString(4, category);
                    ps.setDouble(5, price);
                    ps.setInt(6, qty);

                    int rows = ps.executeUpdate();

                    System.out.println(rows + " Book Added");

                    break;

               

                case 2:

                    System.out.print("Issue Id : ");
                    int issueId = sc.nextInt();

                    System.out.print("Book Id : ");
                    int bookId = sc.nextInt();

                    System.out.print("Student Id : ");
                    int studentId = sc.nextInt();

                    PreparedStatement ps1 = con.prepareStatement(
                            "INSERT INTO Book_Issue VALUES(?,?,?,?,?,?)");

                    ps1.setInt(1, issueId);
                    ps1.setInt(2, bookId);
                    ps1.setInt(3, studentId);
                    ps1.setDate(4, new Date(System.currentTimeMillis()));
                    ps1.setDate(5, null);
                    ps1.setString(6, "Issued");

                    ps1.executeUpdate();

                    PreparedStatement ps2 = con.prepareStatement(
                            "UPDATE Book SET available_quantity=available_quantity-1 WHERE book_id=?");

                    ps2.setInt(1, bookId);

                    ps2.executeUpdate();

                    System.out.println("Book Issued Successfully");

                    break;

              
                case 3:

                    System.out.print("Issue Id : ");
                    int issue = sc.nextInt();

                    System.out.print("Book Id : ");
                    int bId = sc.nextInt();

                    PreparedStatement ps3 = con.prepareStatement(
                            "UPDATE Book_Issue SET status='Returned', return_date=? WHERE issue_id=?");

                    ps3.setDate(1, new Date(System.currentTimeMillis()));
                    ps3.setInt(2, issue);

                    ps3.executeUpdate();

                    PreparedStatement ps4 = con.prepareStatement(
                            "UPDATE Book SET available_quantity=available_quantity+1 WHERE book_id=?");

                    ps4.setInt(1, bId);

                    ps4.executeUpdate();

                    System.out.println("Book Returned Successfully");

                    break;

               

                case 4:

                    System.out.print("Enter Book Id : ");
                    int search = sc.nextInt();

                    PreparedStatement ps5 = con.prepareStatement(
                            "SELECT * FROM Book WHERE book_id=?");

                    ps5.setInt(1, search);

                    ResultSet rs = ps5.executeQuery();

                    while (rs.next()) {

                        System.out.println("Book Id : " + rs.getInt(1));
                        System.out.println("Book Name : " + rs.getString(2));
                        System.out.println("Author Id : " + rs.getInt(3));
                        System.out.println("Category : " + rs.getString(4));
                        System.out.println("Price : " + rs.getDouble(5));
                        System.out.println("Quantity : " + rs.getInt(6));

                    }

                    break;

              

                case 5:

                    Statement st = con.createStatement();

                    ResultSet rs1 = st.executeQuery(
                            "SELECT * FROM Book WHERE available_quantity>0");

                    while (rs1.next()) {

                        System.out.println(
                                rs1.getInt(1) + " "
                                        + rs1.getString(2) + " "
                                        + rs1.getString(4) + " "
                                        + rs1.getInt(6));

                    }

                    break;

               

                case 6:

                    Statement st1 = con.createStatement();

                    ResultSet rs2 = st1.executeQuery(
                            "SELECT * FROM Book_Issue WHERE status='Issued'");

                    while (rs2.next()) {

                        System.out.println(
                                rs2.getInt(1) + " "
                                        + rs2.getInt(2) + " "
                                        + rs2.getInt(3) + " "
                                        + rs2.getDate(4));

                    }

                    break;

                case 7:

                    con.close();
                    sc.close();

                    
                    return;

                default:

                    System.out.println("Invalid Choice");

                }

            }

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}