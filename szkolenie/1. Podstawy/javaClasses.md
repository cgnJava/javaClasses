class: center, middle, inverse
#  Cognitran uczy Javy

---
#  Agenda
- O firmie, o mnie, o pracy programisty
- Java - wersje, popularność, zastosowanie
- Pierwszy program - instrukcje warunkowe, typy, pętle

---
##Zalety i wady Javy
- Zalety
		- Darmowość - sama Java, IDE oraz cała masa bibiotek jest dostępna zupełnie za darmo.
		- Przenośność - możesz uruchomić program na każdym systemie i sprzęcie,
		  na którym zainstalowano wirtualną maszynę Javy.
		- Duże wsparcie ze strony twórców środowisk programowania - dzięki środowiskom IDE,
		  takim jak Eclipse czy IntelliJ, programy możesz tworzyć jeszcze szybciej i jeszcze
		  wydajniej używając profesjonalnych narzędzi, które ułatwią tworzenie dużych aplikacji
		  oraz panowanie nad tworzeniem oraz utrzymywaniem kodu.
		- duża liczba rozszerzeń, bibliotek, frameworków
		- szybkość tworzenia aplikacji - pisze się w języku naturalnym (angielskim).
		- duża ilość publikacji - ksiązki, szkolenia, tutoriale, fora.
		- ogromna społecznośc programistów
		- Garbage collector - proces działający w tle automatycznie usuwa
		  nieużywane obiekty z pamięci.
- Wady
		- Przeważnie programy uruchamiane pod maszyną wirtualną działają wolniej
		  niż programy napisane w języku niższego poziomu np. w C/C++
		  (szczególnie czasochłonne jest uruchamianie aplikacji).
		- Użytkownik potrzebuje zainstalowanej maszyny wirtualnej javy (JVM), aby móc uruchomić program.
		- niepełna kompatybilność wstecz

---
## Java
#### Potrzebne narzędzia

- Java
	- Java Development Kit - JDK
	- Java Runtime Environment - JRE
	
	http://www.oracle.com/technetwork/java/javase/downloads/

<br/>

- Środowisko IDE
	- Eclipse, http://www.eclipse.org
	- Netbeans, http://www.netbeans.org
	- IntelliJ IDEA, https://www.jetbrains.com/idea/
---

## Java
#### Typy danych i zmienne

- Typowanie statyczne, ścisła kontrola typów

- Typy proste (*primitives*)
	- `int`, `long`, `short`, `byte`
	- `float`, `double`
	- `boolean`
	- `char`

- Typy obiektowe
	- `String`
	- `Object`, `ArrayList`, `Student`, `HelloWorld`, ...
	- `Integer`, `Double`, `Boolean`, `Float`, ...
	
- Typ wyliczeniowy - `enum`

- Wszystkie obiekty dziedziczą po klasie java.lang.Object

---

# Pierwszy program
``` java
package com.cognitran.classes.lesson1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello world");
    }
}
```

- Pakiet (folder) `com.cognitran.classes.lesson1`
- Klasa (plik) `HelloWorld`
- Metoda `main(String[] args)`

Konwencje nazewnicze - CamelCase

---
# Komputer liczy

``` java
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = a + b;

        System.out.println("a + b = " + c);

        c = a * b;
        System.out.println("a * b = " + c);
    }
```

---
# Instrukcje warunkowe 1/3
instrukcja `if`
```java
    public static void main(String[] args) {
        double x = Math.random() * 5;

        System.out.println("x = " + x);

        if (x > 3) {
            System.out.println("x > 3");
        }

    }
```

---
# Instrukcje warunkowe 2/3
instrukcja `if / else`
```java
    public static void main(String[] args) {
        double x = Math.random() * 5;

        System.out.println("x = " + x);

        if (x > 3) {
            System.out.println("x > 3");
        }

        if (x > 4) {
            System.out.println("x > 4");
        } else {
            System.out.println("x nie > 4");
        }
    }
```

---
# Instrukcje warunkowe 3/3
instrukcja `if / if else / if`
```java
    public static void main(String[] args) {
        double x = Math.random() * 5;

        System.out.println("x = " + x);

        if (x > 3) {
            System.out.println("x > 3");
        } else if (x > 2) {
            System.out.println("x > 2");
        } else {
            System.out.println("x nie > 2");
        }
    }
```

---
## Ternary operator

```java
	public static String booleanAsYesNo(boolean bool)
    {
        return bool ? "yes" : "no";
    }
```

---
# Return
``` java
    public static void main(String[] args) {
        double x = Math.random() * 5;

        System.out.println("x = " + x);

        System.out.println("Test na 3");
        if (x > 3) {
            System.out.println("x > 3");
            return;
        }

        System.out.println("Test na 2");
        if (x > 2) {
            System.out.println("x > 2");
            return;
        }

        System.out.println("Test na 1");
        if (x > 1) {
            System.out.println("x > 1");
            return;
        }
    }
```

---
# String 1/3
* inicjalizacja
``` java
String s = "Leszek"
```
* sprawdzanie czy string zaczyna się od tekstu
```java
s.startsWith("Lesz"); //true
s.startsWith("L"); //true
s.startsWith("l"); //false
```
* sprawdzanie czy string zawiera tekst
``` java
s.contains("sz"); //true
s.contains("SZ"); //false
s.contains("d"); //false
```

---
#String 2/3
``` java
String s = "Leszek"
```
* zmiana tekstu na małe litely
``` java
"LeSzEk".toLowerCase(); //"leszek"
```
* pobieranie części tekstu
``` java
s.substring(2); //"szek"
s.substring(2, 4); //"sz"
```
* porównywanie tekstu
``` java
s.equals("Leszek"); //true
s.equals("leszek"); //false
s.equalsIgnoreCase("leszek"); //true
```

---
#String - łączenie 3/3

Istnieje kilka sposobów łączenia łańcuchów znakowych:

	1. "Ala " + " ma " + 9 + " kotów";
	2. "Ala ".concat(" ma").concat(" kota");
	3. StringBuffer
	4. StringBuilder - new StringBuilder("Ala ").append(" ma").append(9).append(" kotów");

---
# Operatory logiczne
* `&&` - and `||` - or `!` - not
* `&` `|`

``` java
    public static void main(String[] args) {
        String n = "aBr";

        if (n.contains("a") && n.contains("b")) {
            System.out.println("Zawiera a i b");
        }
        if (n.contains("a") || n.contains("A")) {
            System.out.println("Zawiera a lub A");
        }
        if (n.contains("a") || n.contains("A")
                && n.contains("b") || n.contains("B")) {
            System.out.println("Zawiera a lub A i b lub B");
        }
        if ((n.contains("a") || n.contains("A"))
                && (n.contains("b") || n.contains("B"))) {
            System.out.println("Zawiera a lub A i b lub B (2 wersja)");
        }
        if ((n.contains("a") || n.contains("A")) && (n.contains("b")
                || n.contains("B")) && !n.contains("r")) {
            System.out.println("Zawiera a lub A i b lub B i nieprawda, że r");
        }
    }
```

---
# Metody 1/2
``` java
public class MethodExample {

    static void calculate(int a, int b) {
        int c = a + b;
        System.out.println("argument a: " + a);
        System.out.println("argument b: " + b);
        System.out.println("obliczono: " + c);
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        calculate(x, y);
        calculate(12, 35);
    }
}
```

---
# Metody 2/2
  Metody zwracają wynik.
  Wynik działa metody można zignorować.
``` java
public class Method2Example {
    static int calculate(int a, int b) {
        int c = a + b;
        System.out.println("\nargument a: " + a);
        System.out.println("argument b: " + b);
        System.out.println("obliczono: " + c);
        return c;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = calculate(x, y);
        System.out.println("Wynik metody: " + z);
        System.out.println("Wynik metody: " + calculate(12, 35));
        calculate(1, 2);
        calculate(1, calculate(2, 3));
        calculate(calculate(1, 2) + calculate(3, 4), calculate(2, 3));
    }
}

```

---
# Kalkulator
``` java

public class CalculatorExample {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(multiple(2, 2));
        System.out.println(substract(10, 2));
        System.out.println(divide(4, 2));
        System.out.println(calculate(4, 2, "+"));
        System.out.println(calculate(4, 2, "plus"));
        calculate(4, 2, "print +");
        calculate(4, 2, "print -");
        System.out.println(add(1, 2, 3));
    }
}
```

```
3
4
8
2
6
6
4 + 2 = 6
4 - 2 = 2
6
```
