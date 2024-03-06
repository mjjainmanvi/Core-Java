package com.jdbc.AbcdBank;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class App

{
	static void openNewAccount() {
		Connection con = null;
		Scanner s = null;
		PreparedStatement stmt = null;
		try {
			con = DBConnection.getConnection();
			s = new Scanner(System.in);

			System.out.print("Enter account No:");
			int accountNo = s.nextInt();
			System.out.print("Enter name:");
			String name = s.next();
			System.out.print("Enter address:");
			String address = s.next();
			System.out.print("Enter balance:");
			int balance = s.nextInt();
//			LocalDate date = LocalDate.now();
			System.out.print("Enter age:");
			int age = s.nextInt();

			stmt = con.prepareStatement("insert into account values(?,?,?,?,?,?)");// create statement

			stmt.setInt(1, accountNo);
			stmt.setString(2, name);
			stmt.setString(3, address);
			stmt.setInt(4, balance);
			stmt.setDate(5, java.sql.Date.valueOf(LocalDate.now()));
			stmt.setInt(6, age);
			int status = stmt.executeUpdate();
			if (status > 0) {
				System.out.println("Record inserted successfully");
			} else {
				System.out.println("Record couldn't be inserted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			DBConnection.closeConnection(con);// closing connection
		}
	}

	static void modifyDetails(int accountNo) {
		Connection con = null;
		Scanner s = null;
		PreparedStatement stmt = null;
		try {
			s = new Scanner(System.in);

			System.out.print("Enter new name:");
			String name = s.next();
			System.out.print("Enter new address:");
			String address = s.next();
			System.out.print("Enter new age:");
			int age = s.nextInt();

			con = DBConnection.getConnection();
			stmt = con.prepareStatement("UPDATE account SET name=?, address=?, age=? WHERE accountNo=?");
			stmt.setString(1, name);
			stmt.setString(2, address);
			stmt.setInt(3, age); // Assuming age is an integer
			stmt.setInt(4, accountNo);
			int status = stmt.executeUpdate();
			if (status > 0) {
				System.out.println("Details updated successfully");
			} else {
				System.out.println("Details couldn't be updated");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(con);// closing connection
		}
		return;
	}

	static void updateBalance(int amount, int accountNo) throws BalanceException {

		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBConnection.getConnection();
			stmt = con.prepareStatement("select balance from account where accountNo=?");// create statement
			stmt.setInt(1, accountNo);
			ResultSet rs = null;
			rs = stmt.executeQuery();
			while (rs.next()) {
//				System.out.println(rs.getDate(1) );
				int balance = rs.getInt("balance");
				if (balance + amount < 100) {
					throw (new BalanceException("Account balance cannot be too low."));
				} else {
					balance += amount;
					System.out.println("Balance after transaction:" + balance);
					stmt = con.prepareStatement("update account set balance=? where accountNo = ?");// create statement

					stmt.setInt(1, balance);
					stmt.setInt(2, accountNo);
					int status = stmt.executeUpdate();
					if (status > 0) {
						System.out.println("Balance updated successfully");
					} else {
						System.out.println("Balance couldn't be updated");
					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(con);
		}
	}

	static void showDetails(int accountNo) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBConnection.getConnection();
			stmt = con.prepareStatement("select * from account where accountNo=?");// create statement
			stmt.setInt(1, accountNo);
			ResultSet rs = null;
			rs = stmt.executeQuery();
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getInt(4)
						+ " " + rs.getDate(5) + " " + rs.getInt(6));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(con);// closing connection
		}
	}

	static void closeAccount(int accountNo) throws InavlidTimeException {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBConnection.getConnection();
			stmt = con.prepareStatement("select openingDate from account where accountNo=?");// create statement
			stmt.setInt(1, accountNo);
			ResultSet rs = null;
			rs = stmt.executeQuery();
			while (rs.next()) {
//				System.out.println(rs.getDate(1) );
				LocalDate openingDate = rs.getDate("openingDate").toLocalDate();

//               current date
				LocalDate currentDate = LocalDate.now();

				// difference in days
				long differenceDays = java.time.temporal.ChronoUnit.DAYS.between(openingDate, currentDate);
//                System.out.println(differenceDays);
				if (differenceDays < 60) {
					throw new InavlidTimeException("You are not allowed to delete account within 60 days .");
				} else {
					stmt = con.prepareStatement("delete from account where accountNo = ?");
					stmt.setInt(1, accountNo);
					int status = stmt.executeUpdate();
					if (status > 0) {
						System.out.println("Record deleted successfully");
					} else {
						System.out.println("Record couldn't be deleted");
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(con);// closing connection
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\nABCD Bank Menu:");
			System.out.println("1. Open New Account");
			System.out.println("2. Modify Personal Details");
			System.out.println("3. Display Account Info");
			System.out.println("4. Deposit");
			System.out.println("5. Withdraw");
			System.out.println("6. Close Account");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				openNewAccount();
				break;
			case 2:
				System.out.println("Enter account no:");
				int accNo = sc.nextInt();
				modifyDetails(accNo);
				break;
			case 3:
				System.out.println("Enter account no:");
				int accountNo = sc.nextInt();
				showDetails(accountNo);
				break;
			case 4:
				System.out.println("Enter account no:");
				int accountNoo = sc.nextInt();
				System.out.println("Enter amount to be deposited:");
				int amount = sc.nextInt();
				try {
					updateBalance(amount, accountNoo);
				} catch (BalanceException ex) {
					System.out.println("Caught in catch of BalanceException");
					ex.printStackTrace();
				}
				break;
			case 5:
				System.out.println("Enter account no:");
				int accountN = sc.nextInt();
				System.out.println("Enter amount to withdraw:");
				int amount1 = sc.nextInt();
				try {
					updateBalance(-amount1, accountN);
				} catch (BalanceException ex) {
					System.out.println("Caught in catch of BalanceException");
					ex.printStackTrace();
				}

				break;
			case 6:
				System.out.println("Enter account no:");
				int acc = sc.nextInt();
				try {
					closeAccount(acc);
				} catch (InavlidTimeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 7:
				System.out.println("Byeeeee");
				return;
			default:
				System.out.println("Invalid choice");
			}
		}

	}

}
