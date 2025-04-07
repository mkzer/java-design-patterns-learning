# 🧬 Héritage en Java – Fiche mémo

L’héritage permet à une classe de **réutiliser** les attributs et les méthodes d’une autre.

---

## 🔹 Syntaxe de base

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

➡️ `Chien` hérite de `breathe()` sans avoir besoin de la redéfinir.

---

## 🧠 Chaîne d'héritage en Java

Toutes les classes héritent **indirectement de `java.lang.Object`**, même si tu ne le précises pas.

```java
Object ← Animal ← Chien
```

---

## 📌 `super()` et `this()`

| Mot-clé     | Sert à...                                   |
|-------------|----------------------------------------------|
| `super()`   | Appeler le constructeur de la classe mère    |
| `super.meth()` | Appeler une méthode héritée               |
| `this()`    | Appeler un autre constructeur dans la même classe |

---

## ⚠️ Règles de Java

- Une classe ne peut hériter que **d'une seule classe** (`extends`)
- Tu peux **surcharger** ou **redéfinir** une méthode héritée
- Si tu redéfinis, utilise `@Override`

---

## 🔁 Exemple avec super

```java
public class Animal {
    public Animal(String type) {
        System.out.println("Type : " + type);
    }
}

public class Chat extends Animal {
    public Chat() {
        super("Félin"); // Appelle le constructeur de Animal
    }
}
```

---

## ✅ Résumé

- L’héritage sert à **factoriser** le code
- Tous les objets héritent de `Object`
- On hérite avec `extends`, on peut ajouter des comportements spécifiques

---
