# 🏗️ Constructeurs en Java – Fiche mémo

Un **constructeur** est une méthode spéciale appelée automatiquement lors de la création d’un objet avec `new`.

---

## 🔹 Constructeur par défaut

> Si tu n’écris aucun constructeur, Java en fournit un automatiquement :

```java
public class Animal {
    // Pas de constructeur défini → Java fournit automatiquement :
    // public Animal() {}
}
```

---

## 🔹 Constructeur personnalisé

> Si tu écris un constructeur, Java **n’ajoute plus** le constructeur vide par défaut.

```java
public class Animal {
    public Animal(String nom) {
        System.out.println("Animal nommé " + nom);
    }
}
```

---

## ⚠️ Attention

```java
Animal a = new Animal(); // ❌ Erreur si tu as défini un constructeur avec paramètres
```

➡️ Si tu veux les deux (avec et sans paramètres), tu dois les écrire tous les deux.

---

## 🧱 Chaîne d’appel des constructeurs

Quand une classe hérite, le constructeur appelle automatiquement le **constructeur parent** via `super()` :

```java
public class Animal {
    public Animal() {
        System.out.println("Animal créé");
    }
}

public class Chien extends Animal {
    public Chien() {
        super(); // Appelé automatiquement
        System.out.println("Chien créé");
    }
}
```

---

## 🧠 Et si je n'appelle pas `super()` ?

> Java l'ajoute automatiquement **en première ligne** du constructeur (sauf si tu appelles `super(...)` ou `this(...)` toi-même)

---

## ✅ Règle à retenir

| Situation                     | Que fait Java ?                               |
|------------------------------|-----------------------------------------------|
| Aucun constructeur écrit     | Crée `public Classe() {}` par défaut          |
| Un constructeur est écrit    | Java ne crée **plus** de constructeur vide    |
| Classe enfant                | Appelle `super()` automatiquement             |
