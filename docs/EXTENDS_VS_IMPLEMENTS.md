# 🔠 extends vs implements – Mémo Java

Java distingue deux façons d’hériter :

- `extends` → pour hériter d’une **classe**
- `implements` → pour implémenter une **interface**

---

## 🧬 extends – Héritage de classe

> Utilisé pour hériter d'une **classe existante** (abstraite ou non)

```java
public class Animal {
    public void breathe() {
        System.out.println("Je respire !");
    }
}

public class Chien extends Animal {
    public void bark() {
        System.out.println("Wouf !");
    }
}
```

➡️ `Chien` hérite de tout ce que `Animal` contient (attributs + méthodes).

---

## 🔗 implements – Implémentation d’interface

> Utilisé pour dire qu'une classe **s'engage à suivre un contrat** défini par une interface.

```java
public interface Flyable {
    void fly();
}

public class Drone implements Flyable {
    public void fly() {
        System.out.println("Je vole !");
    }
}
```

➡️ `Drone` doit obligatoirement fournir une méthode `fly()`.

---

## 📌 Différences clés

| Élément                      | `extends`                           | `implements`                       |
|-----------------------------|-------------------------------------|------------------------------------|
| Type concerné               | Classe (abstraite ou normale)       | Interface                          |
| Nombre autorisé             | ❌ Une seule classe                 | ✅ Plusieurs interfaces             |
| Héritage de comportement    | ✅ Oui (code réutilisé)             | ❌ Non (juste un contrat)          |
| Héritage multiple possible ?| ❌ Non                              | ✅ Oui                             |

---

## 💡 Combinaison possible

```java
public class SuperDrone extends Drone implements Flyable, Trackable {
    // Drone = une classe, Flyable/Trackable = interfaces
}
```

➡️ Tu peux faire un mix `extends` + `implements`

---

## 🧠 À retenir

- `extends` = **hériter d’un comportement existant**
- `implements` = **promettre un comportement, mais l’écrire soi-même**
