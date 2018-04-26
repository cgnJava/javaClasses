class: center, middle, inverse
# Obsługa wyjątków
### Czyli jak, kiedy, czym i w kogo rzucać
#Testowanie
###Jak unikać "błenduf" w kodzie
---
## Wyjątki (ang. exception)
Exception – zdarzenie występujące podczas wykonywania programu, który zakłóca normalny przepływ instrukcji programu
- wyjątki w Javie są po prostu obiektami klasy dziedziczącej po java.lang.Exception
- istnieją 2 typy wyjątków
	- Checked Exceptions
	- Unchecked Exceptions - inaczej runtime exceptions
---
## Hierarchia wyjątków
<img src="../images/Java-Exception-Hierarchy.png"/>
---
## Rzucanie i łapanie wyjątków
```java
- throw new Exception();
- throw new RuntimeException("Coś się popsuło");
- throw new RuntimeException("Umarł w butach", cause);
// cause - obiekt typu Exception wskazujący przyczynę wyjątku
```
```java
try {
	fall();
	fall2();
	fall3(); // jeżeli fall2() rzuci wyjątkiem fall3() się nie wykona
} catch (Exception e) {
	System.out.println("get up");
	e.printStackTrace();
} finally {
	file.close();
}
```
---
## Obsługa wyjątków
#### Kilka wyjątków - kolejność jest istotna!

```java
try {

	doSomeCrazyStuff();
	doSomeMoreCrazyStuff(someParam);
	
} catch(FileNotFoundException e) {

	System.err.println("Nie znaleziono pliku");
	e.printStackTrace();
	
} catch(IOException e) {

	System.err.println("Inny wyjątek we/wy");
	e.printStackTrace();
	
} catch(Exception e) {

	System.err.println("ChGW co się stało...");
	e.printStackTrace();
	
}
```
---
## Obsługa wyjątków
#### Kilka  wyjatków w jednym catch (od Javy 7)

```java
try {

	doSomeCrazyStuff();
	doSomeMoreCrazyStuff(someParam);
	
} catch(IllegalArgumentException | FileNotFoundException e) {

	System.err.println("Ooops... poszło nie tak...");
	e.printStackTrace();
}
```
---

## Wyjątki (ang. exception)

- Checked Exceptions
	- dziedziczą po java.lang.Exception
	- muszą być łapane albo propagowane dalej
	- służą do wskazywania sytuacji, z których transakcja może nadal działać
	- bardzo rzadko pisze się własne Checked Exceptions
- Runtime Exceptions aka Unchecked Exceptions
	- dziedziczą po java.lang.RuntimeException
	- zaprojektowane, aby być wyjątkami przerywającymi transakcję
	- zwykle wskazuje niewłaściwe użycie metody lub błędy w logice kodu
- Błędy
	- dziedziczą po klasie java.lang.Error
	- rzucane przez wirtualną maszynę Javy
	- aplikacja nie powinna ich obsługiwać
	- nie pisze się własnych błędów
---
### Popularne wyjątki - Checked Exceptions
- FileNotFoundException - gdy próbujemy czytać plik, który nie istnieje
- IOException - rzucany w przypadku błedu w odczycie lub zapisie do pliku
---
### Popularne błędy - Errors
- StackOverflowError - kiedy wpadniemy w wieczną pętlę
- NoClassDefFoundError - klasa była dostępna przy kompilacji ale nie jest dostępna w runtime
- AssertionError - np. rzucany w JUnit kiedy wartość nie jest zgodna z oczekiwaną
---
### Popularne wyjątki - runtimowe rzucane przez JVM
- ArithmeticException - dzielenie przez 0
```java
		int a = 7/0;
```
- ArrayIndexOutOfBoundsException - indeks tablicy spoza zakresu
```java
		int[] a = int[2];
		System.out.println(a[2]);
```
- ClassCastException - kiedy rzutujemy obiekt do klasy niekompatybilnej
```java
		Cat cat = new Cat();
		Dog dog = (Dog) cat;
```
- NullPointerException - wywołujemy metodę lub pobieramy atrybut obiektu nullowego
```java
		Bird bird = null;
		bird.fly();
```
- NumberFormatException - np. Integer.parseInt("abc")

---

### Popularne wyjątki - rzucane przez programistę
- IllegalArgumentException - rzucane przez programistę, aby wskazać, że metoda została wywołana z niepoprawnym lub niewłaściwym argumentem
- IllegalStateException - aplikacja znalazła się w niepoprawnym stanie, np. rzucamy ten wyjątek w bloku catch kiedy coś nie powinno się wydarzyć

---
## Tworzenie własnych klas wyjątków
99% własnych wyjątków dziedziczy po RuntimeException i ma dokładnie taką strukturę:

```java
public class StudentDatabaseException extends Exception {

    public StudentDatabaseException() {
    }

    public StudentDatabaseException(String message) {
        super(message);
    }

    public StudentDatabaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentDatabaseException(Throwable cause) {
        super(cause);
    }
}
```
---
## Obsługa wyjątków
#### Obowiązkowa obsługa wyjątków

```java
public void main() {
	try {
	
		Student s = znajdzStudenta(176);	// OK, wyjątek przechwytywany
		
	} catch(StudentDatabaseException e) {
		e.printStackTrace():
	}
}
```

```java
public void main() throws StudentDatabaseException {

	Student s = znajdzStudenta(176);        // OK, wyjątek rzucany wyżej
	
}
```
---
## Bad, bad developer!!!
#### Zjadanie stack trace lub całego wyjątku

.pull-left[
```java
try {
	...
} catch(SomeException e) {
	log.error("Łojojoj!");
}
```

.zle[ŹLE!!!]

&nbsp;

```java
} catch(SomeException e) {
	log.error("Łojojoj ale dobrze!", e);
	//throw new RuntimeException(e);
}
```

.dobrze[DOBRZE]
]
.pull-right[
<img src="../images/yougonnafinishthat.jpg" width="90%" style="float:right">
]

---
### Rodzaje/poziomy tesowania kodu
- Testy jednostkowe - zorientowane na przetesowanie pojedynczej metody
- Testy integracyjne – zorientowane na przetestowanie interakcji pomiędzy komonentami, warstwami, etc.
- Testy funkcjonalne - weryfikują czy funkcjonalność jest zgodna ze specyfikacją
- Testy regresyjne - sprawdzamy czy wcześniej opracowane i przetestowane funkcjonalności działaja po zmianach w innych funkcjonalnościach
- Testy wydajnościowe - sprawdzają jak aplikacja zachowuję się pod dużym obciążeniem
---
###Definicje

- Unit Test – bada zachowanie pojedynczej metody
- Test Case - jest zbiorem warunków, na podstawie których tester ustali, czy wymaganie lub przypadek użycia został spełniony
- Test Suite - zbiór przypadków testowych
- Code coverage - procentowe pokrycie kodu przez testy
- Mocking - symulowanie działania rzeczywistych obiektów

---
###JUnit 3
- każda klasa z metodami testowymi musi rozszerzać klasę TestCase
- każda metoda testowa musi zaczynać się od słowa test****
- setUp() and tearDown() methods
- nie trzeba importować metod z klasy org.junit.Assert

---
###JUnit 4/5
- klasy z testami nie muszą rozszerzać klasy TestCase
- asercje trzeba importować: import static org.junit.Assert.*
- metody nie muszą zaczynać się od słowa test***, ale muszą mieć adnotację @Test
- adnotacje @Before - oznaczamy w ten sposób metodę która ma się odpalić przed każdym testem
- adnotacje @BeforeClass - oznaczamy w ten sposób metodę która ma się odpalić raz przed wszystkimi testami w klasie - metoda musi być statyczna
- adnotacja @Ignore - dodawana do metody lub klasy testującej - pozwala na tymczasowe wyłączenie testu
- w Eclipse można odpalić wszystkie testy w aplikacji lub w pakiecie - klikamy prawym przyciskiem na src/test/java lub na pakiecie -> Run As -> JUnit test

---
## Zadanie domowe

<a href="http://aksitha.com/Data%20Base/Oracle%20Database/Oracle%20Certifi%20ed%20Associate%20Java%20SE%208%20Programmer%20I%20Study%20%20Guide.pdf"><img src="../images/scjp.jpg" style="float: right"/></a>

Napisać testy w klasie **CalculatorTest**.

przeczytać następne rozdziały książki (link w obrazku):
1. Java Building Blocks
2. Operators and Statements
3. Core Java APIs
4. Methods and Encapsulation
5. Class Design
6. Exceptions
