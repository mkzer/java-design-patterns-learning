# 🏭 Pattern Factory – Implémentation Java

Ce dossier contient une **implémentation simple du design pattern Factory**, qui permet de **déléguer la création d’objets** à une classe spécifique (la "factory") plutôt que d’utiliser `new` directement.

---

## 📦 Fichiers présents

| Fichier              | Rôle                                                              |
|----------------------|-------------------------------------------------------------------|
| `Animal.java`        | Interface commune avec une méthode `makeSound()`                 |
| `Dog.java`           | Classe concrète implémentant `Animal`                            |
| `Cat.java`           | Classe concrète implémentant `Animal`                            |
| `AnimalFactory.java` | Classe contenant une méthode `getAnimal(String type)`            |
| `FactoryTest.java`   | Classe de test utilisant la factory pour instancier les objets   |

---

## 🎯 Objectif

- Centraliser la **logique de création d’objets**
- Permettre de créer des instances **sans connaître leur type exact**
- Rendre le code **plus extensible** (ajout facile de nouveaux types)

---

## 🔍 Questions que je me suis posées

- Pourquoi la factory retourne un objet de type `Animal` et pas `Dog` ou `Cat` ?
- À quoi sert `type.equalsIgnoreCase(...)` ?
- Pourquoi lever une exception si le type est inconnu ?
- Est-ce qu'on pourrait externaliser la création dans un autre fichier de config ?
- Est-ce que cette factory peut être utilisée en **polymorphisme** ?

---

## 💡 Points de compréhension

- `AnimalFactory.getAnimal("dog")` retourne un objet dont **le type concret est `Dog`**, mais manipulé comme un `Animal`
- Ce pattern **encapsule la logique de sélection** et de création, ce qui permet de ne pas dupliquer `new` partout
- Il est particulièrement utile dans les **jeux, UI, plugins, etc.**

---

## 🧪 Résultat attendu

```bash
Wouf !
Miaou !
Exception in thread "main" java.lang.IllegalArgumentException: Unknown animal type: fish
```

---

## 🚀 Compiler et exécuter

```bash
javac *.java
java FactoryTest
```

---

## 🧱 Remarques

> Le pattern Factory est un excellent exemple de **polymorphisme + encapsulation**  
> Il est souvent le **premier pattern orienté "flexibilité"** à découvrir.

