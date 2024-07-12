package Logic;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import Dto.AboutUs;
import Dto.Best_place_To_Vist_in_Bhopal;
import Dto.Book_Car_For_Day;
import Dto.Favourites_car;
import Dto.Features;
import Dto.HelpAndSupport;
import Dto.My_Account;
import Dto.Pay;
import Dto.Place_For_Indore;
import Dto.Popular_place;
import Dto.Rent_A_Car;

public class Logic {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Scanner scanner = new Scanner(System.in);
		Rent_A_Car rentACar1 = new Rent_A_Car();
		Pay pay = new Pay();
		HelpAndSupport support1 = new HelpAndSupport();

		boolean exit = false;

		String name = scanner.nextLine();
		String password = scanner.nextLine();

		My_Account myAccount = (My_Account) session
				.createQuery("FROM My_Account WHERE name = :name AND password = :password").setParameter("name", name)
				.setParameter("password", password);

		if (myAccount != null) {
			while (!exit) {
				System.out.println("Welcome back" + name + " to ZOOM CAR.COM");

				System.out.println("0. This car is still current ");
				System.out.println("1. Rent a car for a day");
				System.out.println("2. Rent a car for a month");
				System.out.println("3. View your favorite cars");
				System.out.println("4. Get help and support");
				System.out.println("5. About Zoom Car");
				System.out.println("6. View popular places");
				System.out.println("7. Rent_A_Car");
				System.out.println("9. Your Profile");
				System.out.println("8. Exit");

				int choice = scanner.nextInt();

				switch (choice) {
				case 0:
					System.out.println(name);
// Query to fetch all Rent_A_Car records
					List<Rent_A_Car> rentACarList = session.createQuery("FROM Rent_A_Car").list();

					for (Rent_A_Car rentACar : rentACarList) {
						// Access and print data for each Rent_A_Car record
						System.out.println("Car Name: " + rentACar.getCarname());
						System.out.println("Car Model: " + rentACar.getCarmodal());
						System.out.println("Pickup Address: " + rentACar.getPickupAddress());
						System.out.println("Car Number: " + rentACar.getCarNumber());
						System.out.println("PAN Number: " + rentACar.getPanNumber());
						System.out.println("Account Number: " + rentACar.getAccountNumber());
						System.out.println("Account Holder Name: " + rentACar.getMyAccount().getName());
						System.out.println("---------------------------------------");
					}

					session.close();
					factory.close();

					break;
				case 1:
// Logic for renting a car for a day SAVE............
					System.out.println(name);
					System.out.println("1. Rent a car for a day");
					Book_Car_For_Day bc1 = new Book_Car_For_Day();

					System.out.println("Enter Id: ");
					bc1.setBookcarfordayId(scanner.nextInt());

					System.out.println("Enter Date: ");
					bc1.setDate(scanner.nextLine());

					System.out.println("Enter Current Location(where you are) : ");
					bc1.setLocation(scanner.nextLine());

					System.out.println("Enter Time: ");
					bc1.setTime(scanner.nextLine());

					System.out.println(
							"Thank you for Using this Website Have a great day! \n You can Wait it is coming...");

					break;
				case 2:
// Logic for renting a car for a month
					System.out.println(name);
					System.out.println("1. Rent a car for a day");
					Book_Car_For_Day bc2 = new Book_Car_For_Day();

					System.out.println("Enter Id: ");
					bc2.setBookcarfordayId(scanner.nextInt());

					System.out.println("Enter Mounth(with Date): ");
					bc2.setDate(scanner.nextLine());

					System.out.println("Enter Current Location(where you are) : ");
					bc2.setLocation(scanner.nextLine());

					System.out.println("Enter Time: ");
					bc2.setTime(scanner.nextLine());

//Logic for Paymant
					System.out.println("You will have to pay for Car renting Press 1 ");

					System.out.println("Enter PayId: ");
					pay.setPayId(scanner.nextInt());

					System.out.println("Use NetBanking Yes or No: ");
					pay.setNetBanking(scanner.nextLine());

					/* only this Use */ System.out.println("Use Mobile Number 9926475124 and pay 500/- Day : ");
					pay.setMobile(scanner.nextLine());

					System.out.println("Use CreditATMcard ");
					pay.setCreditAtmcard(scanner.nextLine());

					System.out.println(
							"Thank you for Using this Website Have a great day! \n You can Wait it is coming...");
					System.out.println("Do you want What Features in tha Car Press 1 ");
					int input11 = scanner.nextInt();
					if (input11 == 1) {
//Get Features
						Query query = session.createQuery("FROM Features");
						List<Features> featuresList = query.list();

						// Loop through the results and print the data
						for (Features feature : featuresList) {
							System.out.println("Feature ID: " + feature.getFeatureId());
							System.out.println("Feature Name: " + feature.getFeatureName());

						}
					}
					if (input11 != 1) {
						System.out.println("Sorry...  Invalid choice! Please enter a valid option");
					}
					System.out.println("Thank you for Using this Website Have a great day!");
					break;
				case 3:
// Logic for viewing favorite cars
					System.out.println(name);
					Favourites_car favouriteCar1 = new Favourites_car();
					System.out.println("Do you want to view (Press 1), or save (Press 2) a favorite car?");
					int input = scanner.nextInt();
					if (input == 1) {
						System.out.println("Your favorite Cars....");
						if (favouriteCar1.isEmpty()) {
							System.out.println("SORRY NO RESULTS FOUND....");
						} else {
							for (int i = 0; i <= favouriteCar1.length(); i++) {
								System.out.println(favouriteCar1.getFavouritescarName());
								// System.out.println(favouriteCar1.getFavouritescarName());
							}
						}
						if (input == 2) {
							System.out.println("Enter your Favorite Car....");
							favouriteCar1.setFavouritescarName(scanner.nextLine() + "Save on Data..");
						} else {
							System.out.println("Invalid choice! Please enter a valid option.");
							System.out.println();
						}
					}
					System.out.println("Thank you for Using this Website Have a great day!");
					break;

				case 4:
// Logic for getting help and support
					System.out.println(name);
					System.out.println(
							"Help and Support: For any queries, please contact support@zoomcar.com And other Contact number 9923450461.");
					support1.setQuestion(scanner.nextLine());
					System.out.println("Thank you for Using this Website Have a great day!");
					break;
				case 5:
// Logic for About Zoom Car
					System.out.println(name);
					AboutUs aboutUs = new AboutUs();
					System.out.println(aboutUs);
					System.out.println(
							"Zoomcar is the leading marketplace for car sharing in emerging markets,with over 20,000 cars on its technology-driven "
									+ "platform across India, Indonesia, and Egypt. Zoomcar empowers host entrepreneurs to safely and easily share their cars to earn"
									+ " additional passive income. Guests in the Zoomcar community enjoy a diverse, affordable selection of cars to unlock memorable driving "
									+ "experiences with friends and family. Founded in 2013 and headquartered in Bengaluru, India, Zoomcar employs over 250 people and operates in over"
									+ " 45 cities across India, Indonesia, and Egypt. Uri Levine, the co-founder of mobility unicorns Waze and Moovit, currently serves as Zoomcar's Chairman of the Board.");

					System.out.println("Thank you for Using this Website Have a great day!");
					break;
				case 6:
// Logic for viewing popular places
					System.out.println(name);
					System.out.println("Enter Location:");
					String location = scanner.nextLine();
					switch (location) {
					case "Bhopal":

						Query query = session.createQuery("FROM Popular_place");
						List<Popular_place> popularPlacesList = query.list();

						// Loop through the results and print the data
						for (Popular_place popularPlace : popularPlacesList) {
							System.out.println("Popular Place ID: " + popularPlace.getPopular_placeId());

							// Fetch and print associated Best_place_To_Vist_in_Bhopal
							Set<Best_place_To_Vist_in_Bhopal> bestPlaces = popularPlace.getBestPlacesToVisit();
							if (bestPlaces != null && !bestPlaces.isEmpty()) {
								System.out.println("Best Places to Visit in Bhopal:");
								for (Best_place_To_Vist_in_Bhopal bestPlace : bestPlaces) {
									System.out
											.println("    Location: " + bestPlace.getBestplaceToVistinBhopalLocation());
								}
							} else {
								System.out.println("No associated best places to visit.");
							}
							System.out.println("---------------------------------------");
						}
						break;
					case "Indore":

						List<Popular_place> popularPlaces = session.createQuery("FROM Popular_place").list();

						for (Popular_place place : popularPlaces) {
							System.out.println("Popular Place ID: " + place.getPopular_placeId());
							Set<Place_For_Indore> places = place.getPlacesForIndore();
							for (Place_For_Indore p : places) {
								System.out.println("Place For Education About: " + p.getPlaceForEducationAbout());
							}
							System.out.println("---------------------------------------");
						}

						break;
					case "Delhi":
						System.out.println("");
						break;
					default:
						System.out.println("Invalid location selected.");
						break;
					}
					System.out.println("Thank you for Using this Website Have a great day!");
					break;
				case 7:
// Logic for viewing popular places
					System.out.println(name);
					System.out.println("Enter Id: ");
					rentACar1.setRentacarId(scanner.nextInt());

					System.out.println("Enter Car Name: ");
					rentACar1.setCarname(scanner.nextLine());

					System.out.println("Enter Car Modal: ");
					rentACar1.setCarmodal(scanner.nextLine());

					System.out.println("Enter Pickup Address: ");
					rentACar1.setPickupAddress(scanner.nextLine());

					System.out.println("Enter Car Number: ");
					rentACar1.setCarNumber(scanner.nextInt());

					System.out.println("Enter Pan Number: ");
					rentACar1.setPanNumber(scanner.nextInt());

					System.out.println("Enter Account Number: ");
					rentACar1.setAccountNumber(scanner.nextInt());

					System.out.println("Thank you for Using this Website Have a great day! ");
					break;

				case 9:
// Your Profile
					System.out.println(name);
					Query query = session.createQuery("FROM My_Account");
					List<My_Account> myAccountList = query.list();

					// Loop through the results and print the data
					for (My_Account myAccount1 : myAccountList) {
						System.out.println("Account ID: " + myAccount1.getMyaccountId());
						System.out.println("Name: " + myAccount1.getName());
						System.out.println("Email: " + myAccount1.getEmail());
						System.out.println("Mobile Number: " + myAccount1.getMobileNumber());
						System.out.println("Gender: " + myAccount1.getGender());
						System.out.println("Current City: " + myAccount1.getCurrentCity());
						System.out.println("License Number: " + myAccount1.getLicenseNumber());
						System.out.println("Password: " + myAccount1.getPassword());
					}
					System.out.println("Thank you for Using this Website Have a great day!");
					break;

				case 8:
					System.out.println("Thank you for using Zoom Car. Have a great day!");
					exit = true;
					break;
				default:
					System.out.println("Invalid choice! Please enter a valid option.");
					break;
				}
			}
		} else {
			System.out.println("Invalid username or password. Please try again.");
		}

		session.close();

	}
}
