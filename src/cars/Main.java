package cars;

import java.awt.List;

public class Main {

	static void  changeRul(List<Car> list){
		for (Car car : list) {
			if(ìàøèíà.getKolir()== Color.RED){
				if(ìàøèíà.getRozmir()==Rozmir.BIG){
					ìàøèíà.changeRozmir(Rozmir.LITTLE);
				}else if(ìàøèíà.getRozmir()==Rozmir.LITTLE){
					ìàøèíà.changeRozmir(Rozmir.BIG);
				}else{
					ìàøèíà.changeRozmir(Rozmir.BIG);
				}
			}
		}
		System.out.println(list);
	}
		static void  buttons(List<Ìàøèíà> list){
		for (Ìàøèíà ìàøèíà : list) {
			if (ìàøèíà.isBatton() == true){
				ìàøèíà.setDiametr(ìàøèíà.getDiametr()*2);
			}
		}
		System.out.println(list);
	}
		
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 100, Rezina.SUMMER,Color.RED, "gruzova");
		Ìàøèíà ìàøèíà6 = new Ìàøèíà ("Ìàøèíà6 ", Rozmir.LITTLE,true, 45, Rezina.WINTER,Color.GREEN, "cabriolet");
		Ìàøèíà ìàøèíà7 = new Ìàøèíà ("Ìàøèíà7 ", Rozmir.NORMAL,false, 30, Rezina.SUMMER,Color.WHITE, "gruzova");
		List<Ìàøèíà> list = new ArrayList<>();
		list.add(ìàøèíà1);
		list.add(ìàøèíà2);
		list.add(ìàøèíà3);
		list.add(ìàøèíà4);
		list.add(ìàøèíà5);
		list.add(ìàøèíà6);
		list.add(ìàøèíà7);
		
		Set<Ìàøèíà> cars = new LinkedHashSet<>();
		cars.add(ìàøèíà1);
		cars.add(ìàøèíà2);
		cars.add(ìàøèíà3);
		cars.add(ìàøèíà4);
		cars.add(ìàøèíà5);
		cars.add(ìàøèíà6);
		cars.add(ìàøèíà7);
		
		
		maximumRadius(list);
		
		
		//findDiameter(list, sc);						//Çíàéòè ìàøèíè, ÿê³ ìàþòü ââåäåíèé ä³àìåòð êîë³ñ.
		//findDiameterAndColor(list, sc);				//Çíàéòè ìàøèíè, ÿê³ ìàþòü ââåäåíèé ä³àìåòð êîë³ñ òà êîë³ð êóçîâà.
		//changeRul(list);								//Çàì³íèòè â óñ³õ ìàøèíàõ, ÿê³ ìàþòü ÷åðâîíèé êîë³ð êóçîâà, êåðìî íà ³íøå.
		//buttons(list);								//Çá³ëüøèòè ä³àìåòð êîë³ñ âäâ³÷³, ÿêùî êåðìî ìàº êíîïî÷êè.
		//changeCar(list, sc);							//Çàì³íèòè óñ³ ìàøèíè, ÿê³ ìàþòü êîëåñà ä³àìåòðîì ìåíø³ çà ââåäåíå çíà÷åííÿ, íà ³íø³ ìàøèíè.
		//kuzov(list, sc);								//Çíàéòè ìàøèíè, ÿê³ âèêîðèñòîâóþòü ââåäåíèé òèï êóçîâà.
		//color(list, sc);								//Âèäàëèòè ç ë³ñòà óñ³ ìàøèíè, ÿê³ ìàþòü ââåäåíèé êîë³ð êóçîâà.
		//diapazon(list, sc);							//Çàì³íèòè óñ³ì ìàøèíàì, ä³àìåòð êîë³ñ ÿêèõ ëåæèòü ó ââåäåíîìó ä³àïàçîí³ øèíè íà çèìîâ³.
		//diapazonAndWhell(list, sc);					//Âèäàëèòè óñ³ ìàøèíè, ÿê³ ìàþòü ââåäåíèé òèï êóçîâà òà ââåäåíèé ä³àïàçîí ä³àìåòðà êåðìà.
		//typeOfCuzov(list, sc);						//Çàïàì'ÿòàòè ³íäåêñè ìàøèí, ÿê³ ìàþòü ââåäåíèé òèï êóçîâà.
		//typeOfCuzovAndDiapazonDiametr(cars, sc);		//Ìàøèíàì, ÿê³ ìàþòü âêàçàíèé êîë³ð êóçîâà òà âêàçàíèé ä³àìåòð êîëåñà, çì³íèòè òèï øèí íà âêàçàíèé.
		//diapazonRemoved(cars, sc);					//Âèäàëèòè ìàøèíè, ä³àìåòð êîëåñ ÿêèõ ïîïàäàº ó âêàçàíèé ä³àïàçîí.
		//TypeTireAndDiapazon(cars, sc);				//Çíàéòè ìàøèíè, ÿê³ ìàþòü âêàçàíèé òèï øèí òà ä³àìåòð êîë³ñ ÿêèõ ïîïàäàº ó âêàçàíèé ä³àïàçîí.
	}
	private static void maximumRadius(List<Ìàøèíà> list) {
		LogicCar.maximumRadius(list);
		
	}
	static void typeOfCuzov(List<Ìàøèíà> list, Scanner sc){  
		System.out.println("Ââåäiòü òèï êóçîâà");
		String cuzov =sc.next();
		LogicCar.typeOfCuzov(list, cuzov);
	}
	static void  findDiameter(List<Ìàøèíà> list, Scanner sc){ 
		System.out.println("Ââåäiòü äiàìåòð êîëåñà");
		int diam =sc.nextInt();
		LogicCar.findDiameter(list, diam);
			}
	static void  findDiameterAndColor(List<Ìàøèíà> list, Scanner sc){
		System.out.println("Ââåäiòü äiàìåòð êîëåñà");
		int diam =sc.nextInt();
		System.out.println("Ââåäiòü êîëið");
		String color = sc.next();
		LogicCar.findDiameterAndColor(list, diam, color);
	}
	static void  changeCar(List<Ìàøèíà> list, Scanner sc){
		System.out.println("Ââåäiòü äiàìåòð êîëåñà");
		int diam = sc.nextInt();
		LogicCar.changeCar(list, diam);
	}
	static void  kuzov(List<Ìàøèíà> list, Scanner sc){
		System.out.println("Ââåäiòü òèï êóçîâà");
		String cuz =sc.next();
		LogicCar.kuzov(list, cuz);
	}
	static void  color(List<Ìàøèíà> list, Scanner sc){
		System.out.println("Ââåäiòü òèï êîëið êóçîâà ìàøèí ÿêi òðåáà âèäàëåòè");
		String color =sc.next();
		LogicCar.color(list, color);
	}
	static void  diapazon(List<Ìàøèíà> list, Scanner sc){
		System.out.println("Ââåäiòü ìàêñèìàëüíèé äiàìåòð êîëåñà");
		int max=sc.nextInt();
		System.out.println("Ââåäiòü ìiíiìàëüíèé äiàìåòð êîëåñà");
		int min=sc.nextInt();
		LogicCar.diapazon(list, max, min);
	}
	static void  diapazonAndWhell(List<Ìàøèíà> list, Scanner sc){
		System.out.println("Ââåäiòü ìàêñèìàëüíèé äiàìåòð êîëåñà");
		int max=sc.nextInt();
		System.out.println("Ââåäiòü ìiíiìàëüíèé äiàìåòð êîëåñà");
		int min=sc.nextInt();
		System.out.println("Ââåäiòü òèï êóçîâà");
		String cuz =sc.next();
		LogicCar.diapazonAndWhell(list, max, min, cuz);
	}
	static void typeOfCuzovAndDiapazonDiametr(Set <Ìàøèíà> cars, Scanner sc){
		System.out.println("Ââåäiòü ìàêñèìàëüíèé äiàìåòð êîëåñà");
		int max=sc.nextInt();
		System.out.println("Ââåäiòü ìiíiìàëüíèé äiàìåòð êîëåñà");
		int min=sc.nextInt();
		System.out.println("Ââåäiòü êîë³ð êóçîâà");
		String color =sc.next();
		LogicCar.typeOfCuzovAndDiapazonDiametr(cars, max, min, color);
	}
	static void diapazonRemoved(Set <Ìàøèíà> cars, Scanner sc){
		System.out.println("Ââåäiòü ìàêñèìàëüíèé äiàìåòð êîëåñà");
		int max=sc.nextInt();
		System.out.println("Ââåäiòü ìiíiìàëüíèé äiàìåòð êîëåñà");
		int min=sc.nextInt();
		LogicCar.diapazonRemoved(cars, max, min);
	}
	static void TypeTireAndDiapazon(Set <Ìàøèíà> cars, Scanner sc){
		System.out.println("Ââåäiòü ìàêñèìàëüíèé äiàìåòð êîëåñà");
		int max=sc.nextInt();
		System.out.println("Ââåäiòü ìiíiìàëüíèé äiàìåòð êîëåñà");
		int min=sc.nextInt();
		System.out.println("Ââåäiòü òèï øèí");
		String type =sc.next();
		LogicCar.TypeTireAndDiapazon(cars, max, min, type);
	}
}
