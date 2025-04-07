# 🧩 INTERFACES EN JAVA – Mémo rapide

Ce fichier résume les points essentiels pour bien comprendre et utiliser les **interfaces** en Java.

---

## 🧠 Qu'est-ce qu'une interface ?

Une **interface** est un **contrat** que toute classe doit respecter si elle l'implémente.  
Elle définit **ce qu'un objet sait faire**, pas ce qu’il est.

---

## ✅ Exemple simple

```java
public interface Flyable {
    void fly();
}
```

```java
public class Drone implements Flyable {
    public void fly() {
        System.out.println("Je vole !");
    }
}
```

---

## 💡 Pourquoi utiliser une interface ?

| Cas d’usage                                   | Interface utile ? |
|-----------------------------------------------|-------------------|
| Définir un comportement comme "voler" ou "rouler" | ✅ Oui            |
| Pouvoir hériter de **plusieurs capacités**     | ✅ Oui            |
| Structurer des composants réutilisables        | ✅ Oui            |
| Partager du code (attributs ou méthodes)       | ❌ Non (classe abstraite) |

---

## 🧬 Interface vs Classe Abstraite

| Critère                       | Interface                         | Classe Abstraite                      |
|------------------------------|------------------------------------|----------------------------------------|
| Peut être instanciée ?       | ❌ Non                             | ❌ Non                                  |
| Peut contenir du code ?      | ✅ (via `default` ou `static`)     | ✅ Oui (méthodes complètes autorisées)  |
| Attributs autorisés ?        | ❌ sauf `public static final`     | ✅ Attributs normaux possibles          |
| Héritage multiple possible ? | ✅ Oui                             | ❌ Non                                  |
| Objectif principal           | Définir un contrat                 | Créer une base commune                 |

---

## ❗ Est-ce obligatoire d’implémenter toutes les méthodes ?

✅ Oui, sauf si ta classe est aussi `abstract`.

```java
public class Oiseau implements Flyable {
    // ❌ Si fly() non implémenté ici → Erreur de compilation
}
```

```java
public abstract class Oiseau implements Flyable {
    // ✅ OK : on laisse une sous-classe concrète l'implémenter plus tard
}
```

---

## 🧠 Exemple multi-comportements (héritage multiple via interfaces)

```java
public interface Flyable {
    void fly();
}

public interface Rollable {
    void roll();
}

public class Drone implements Flyable, Rollable {
    public void fly() {
        System.out.println("Je vole !");
    }

    public void roll() {
        System.out.println("Je roule !");
    }
}
```

---

## 📌 Résumé à retenir

- 🔹 Une interface représente un **comportement** ou une **capacité**
- 🔹 Une classe peut implémenter **autant d’interfaces que nécessaire**
- 🔹 Une interface ne contient **pas d’état** (pas de `private String x;`)
- 🔹 Si tu veux partager du **code** → utilise une **classe abstraite**

---

## 👨‍💻 Auteur

Mohamed Anis Makhezer  
Projet personnel d’apprentissage – 2025
