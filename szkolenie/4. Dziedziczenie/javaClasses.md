#  Agenda
- Modyfikatory dostępu
- Immutable Objects
- Enkapsulacja
- Dziedziczenie
- Polimorfizm

---
## Modyfikatory dostępu (ang. access modifiers)
* public
* protected
* default
* private

```java
public class Cat {

    private String privateName;
    protected String name;
    public String publicName;

    void play() {
        System.out.println("Jestem kotek " + name + " i się bawię.");
    }
}
```

---
#Immutable Objects

Immutable object jest to niezmienny obiekt, czyli taki, którego stan nie może zostać zmieniony cały okres życia obiektu. Czyli po prostu tworzymy nasz obiekt wraz ze wszystkimi wymaganymi atrybutami i żadnego z nich nie możemy zmienić.

Przykład: **java.lang.String** - nie ma żadnej metody typu set***()

* Są łatwiejsze w użyciu i testowaniu
* Można je bezpiecznie używać w Setach lub jako klucz w Mapach
* Mogą być łatwo cachowane
* Immutable object mogą być bezpiecznie używane w programowaniu wielowątkowym. Stan tych obiektów nie może ulec zmianie, więc mamy pewność, że każdy wątek widzi aktualny stan obiektu.

---
# Enkapsulacja 1/2
* polega na ukrywaniu pewnych danych składowych lub metod obiektów danej klasy tak, aby były one dostępne tylko metodom wewnętrznym danej klasy

```java
public static void main(String[] args) {
	Cat2 cat = new Cat2();
	cat.name = "Alik"; // dozwolone, ale złe
	cat.setName("Alik"); //lepsze
}
```

```java
public class Cat3 {
    private String name;
    private String color;

	public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setColor(String color) { this.color = color; }
	public String getColor() { return color; }
}
```
**Ctrl + 1 -> create getter and setter for X** albo **Source -> generate getters and setters**

---
# Enkapsulacja 2/2
* używaj prywatnych atrybutów klasy (względnie protected)
* używaj publicznych metod aby pobrać lub ustawić wartość zmiennej danej klasy
* Dla tych metod używaj konwencji JavaBeans: setSomeProperty i getSomeProperty.

---

### Dziedziczenie i kompozycja - relacje Is-A, Has-A

Dziedziczenie oraz kompozycja służy zmniejszeniu ilości kodu.

```java
public class Animal { }

public class Horse extends Animal { //Is-A - Koń jest zwierzęciem

	private Halter myHalter; //Has-A - Koń ma uprząż
}
```

---

#Polimorfizm

Są to mechanizmy pozwalające programiście używać wartości, zmiennych i podprogramów na kilka różnych sposobów. Inaczej mówiąc jest to możliwość wyabstrahowania wyrażeń od konkretnych typów.

- List<String> list = new ArrayList<>();
- Eagle eagle = new Eagle();
- Bird bird = new Eagle();
- Animal animal = new Eagle();
- CanFly canFly = new Eagle();

---
### Zadanie domowe

<a href="http://aksitha.com/Data%20Base/Oracle%20Database/Oracle%20Certifi%20ed%20Associate%20Java%20SE%208%20Programmer%20I%20Study%20%20Guide.pdf"><img src="../images/scjp.jpg" style="float: right"/></a>

przeczytać pierwsze 3 rozdziały książki (link w obrazku):
1. Java Building Blocks
2. Operators and Statements
3. Core Java APIs
