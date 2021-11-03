package TestNG01_23_09;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	/*
	 Zadatak 1)
Koristeci anotacije odstampati ovo:
**********************
 Dobrodosli na ITBootcamp
 **********************
 Ime i prezime
 Ime i prezime 1
 Redovan polaznik
Ime i prezime
 Ime i prezime 2
 Redovan polaznik
Ime i prezime
 Ime i prezime 3
 Redovan polaznik
Ime i prezime
 Ime i prezime 4
 Redovan polaznik
Ime i prezime
 Ime i prezime 5
 Redovan polaznik
***************
 Cestitamo
 ***************
 
 
 
 
 
 @BeforeClass
@BeforeMethod
@Test
@AfterMethod
@AfterClass

 
 *Napomena: Prvo dodati imena ljudi iz grupe zatim dodeliti prioritete da imena idu abecednim redom
	 */

	@ BeforeClass
		public void dobrodoslica () {
		System.out.println("**********************");
		System.out.println("Dobrodosli na IT Bootcamp");
		System.out.println("**********************");
	}
	
	@BeforeMethod
		public void imeIPrezimePreTest() {
		System.out.println("Ime i prezime");
	}
	
	@AfterMethod
	public void redovanPolaznikPostTest() {
		System.out.println("Redovan polaznik");
	}
	
	@Test (priority=30)
	public void imeIprezimePolaznikaTest1() {
		System.out.println("Milica Pantic");
	}
	
	@Test (priority=10)
	public void imeIprezimePolaznikaTest211() {
		System.out.println("Nemanja Velickovic");
	}
	
	@Test (priority=50)
	public void imeIprezimePolaznikaTest3() {
		System.out.println("Ivana Strijelic");
	}
	
	@Test (priority=40)
	public void imeIprezimePolaznikaTest4() {
		System.out.println("Lana Stamenkovic");
	}
	
	@Test (priority=20)
	public void imeIprezimePolaznikaTest2() {
		System.out.println("Dunja Vlalukin");
	}
	
	@AfterClass
	public void cestitkePostClass() {
		System.out.println("******************");
		System.out.println("Cestitamo!");
		System.out.println("******************");
		
	}
	
}
