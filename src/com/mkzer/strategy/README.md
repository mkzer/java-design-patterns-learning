# 🌀 Polymorphisme en Java – Fiche mémo

Le **polymorphisme** est la capacité à **manipuler des objets de types différents à travers un type commun** (souvent une interface ou une classe mère).

---

## 🧠 Exemple simple

```java
public interface Animal {
    void makeSound();
}

public class Chien implements Animal {
    public void makeSound() {
        System.out.println("Wouf !");
    }
}

public class Chat implements Animal {
    public void makeSound() {
        System.out.println("Miaou !");
    }
}
```

---

## 📦 Utilisation polymorphe

```java
Animal a1 = new Chien();
Animal a2 = new Chat();

a1.makeSound(); // Wouf !
a2.makeSound(); // Miaou !
```

➡️ Même si `a1` et `a2` sont de type `Animal`, leur **implémentation spécifique** est utilisée à l’exécution.

---

## 🧬 Deux types de polymorphisme

| Type                          | Exemple                                 |
|-------------------------------|------------------------------------------|
| ✅ Polymorphisme d’interface   | Utiliser une interface comme `Observer` |
| ✅ Polymorphisme d’héritage    | Utiliser une classe mère comme `Animal` |

---

## 🔁 Boucle for-each polymorphe

```java
List<Animal> animaux = List.of(new Chien(), new Chat());

for (Animal a : animaux) {
    a.makeSound(); // Comportement adapté à chaque classe
}
```

➡️ Le polymorphisme permet d’**exécuter le bon comportement** selon l’**objet réel**, même si on le manipule via un type abstrait.

---

## ❓ Pourquoi c’est utile ?

- ✅ Favorise la **flexibilité**
- ✅ Permet de **factoriser le code**
- ✅ Compatible avec les **design patterns** (ex : `Observer`, `Strategy`, etc.)
- ✅ Remplace les `if`/`switch` par des comportements polymorphes

---

## 🧠 Résumé

- Tu peux **stocker et utiliser plusieurs types concrets** sous une même **référence abstraite**
- C’est **la base de tous les comportements dynamiques** en Java
- Combine parfaitement avec les **interfaces**, les **classes abstraites**, et les **collections**
