#  Agenda
- Test-driven development (TDD)
- Systemy kontroli wersji
- Tablice
- Lista (java.util.List)
- Zbiór (java.util.Set)
- Mapy (java.util.Map)
---
# Test-driven development (TDD)

Cykl red – green – refactor:

1. Najpierw programista pisze automatyczny test sprawdzający dodawaną funkcjonalność. Test w tym momencie nie powinien się udać.
2. Później następuje implementacja funkcjonalności. W tym momencie wcześniej napisany test powinien się udać.
3. W ostatnim kroku programista dokonuje refaktoryzacji napisanego kodu, żeby spełniał on oczekiwane standardy.

---
###Systemy kontroli wersji (ang.Version control software) 1/2

Przeznaczony do pracy grupowej nad kodem programów lub innych projektów realizowanych w branży IT.
1. Przechowuje historię zmian nazw katalogów i plików
2. Zmiany są transakcjami atomowymi
3. wersjonowanie plików binarnych np. obrazków
4. automatyczne łączenie zmian + wsparcie przy rozwiązywaniu konfliktów

Przykłady:

CVS - Concurrent Versions System

SVN - Subversion

GIT - rozproszony system kontroli wersji

---
###Systemy kontroli wersji (ang.Version control software) 2/2

	Operacje:

		Check out
		Commit
		Update
		Show log
		Revert
		
---
## Metoda gumowej kaczuszki

	https://www.youtube.com/watch?v=QUZ688YSWfE
	https://www.youtube.com/watch?v=gLAb03HC__c

---
# Tablice

	1. String[] var = new String[5];
	2. String[] var = new String[] {"Ala", "ma", "kota"};
	3. String[] var = {"Ala", "ma", "kota"};

do wspomagania operacji na tablicach isnieją statyczne metody w klasie Arrays:
	1. Arrays.sort(a); - sortuje elementy w tablicy
	2. Arrays.fill(a); - wypełnia całą tablicę podaną wartością
	3. Arrays.copyOf(a); Arrays.copyOfRange(a); - tworzy kopię całej tablicy lub jej fragmentu

---
# Listy - java.util.List 1/2;
	
	1. add() – dodaje element do listy,
	2. addAll() - jako parametr przyjmuje inną kolekcję i dodaje wszystkie
	   elementy z tej kolekcji do listy
	3. contains() - jako parametr przyjmuje element listy i zwraca flagę
	   typu boolean informującą czy dany element już istnieje
	4. isEmpty() - bezargumentowa metoda zwracająca flagę informującą
	   czy lista jest pusta
	5. size() - bezargumentowa metoda zwracająca liczbę elementów w liście
	6. indexOf() - metoda jako parametr przyjmuje element listy
	   i zwraca indeks pierwszego wystąpienia
	7. lastIndexOf() - metoda jako parametr przyjmuje element listy
	   i zwraca indeks ostatniego wystąpienia

---
# Listy - java.util.List 2/2;
	1. programista nie musi się przejmować rozmiarem listy,
	   jest ona automatycznie powiększana wraz z dodawaniem nowych elementów.
	2. Itnieją 2 podstawowe implementacje interfejsu List - ArrayList oraz LinkedList.

---
# Zbiór - java.util.Set;

	1. kolekcja, która służy do przechowywania unikalnych elementów
	2. nie jest istotna kolejność dodawanych elementów
	3. najważniejszą implementacją interfejsu Set jest klasa java.util.HashSet
---
# Mapa - java.util.Map;

	1. pozwala przechować odwzorowanie zbioru kluczy na listę wartości
	2. klucze muszą być unikalne
	3. może nie być istotna kolejność dodawanych elementów
	4. najczęsciej wykorzystywaną implementacją mapy jest:
       java.util.HashMap, java.util.LinkedHashMap, java.util.TreeMap
	

	