# ⚠️ Gestion des Exceptions en Java

Ce dossier présente des **exemples pratiques d'utilisation de `try/catch/finally`** pour illustrer la gestion des erreurs en Java.

---

## 📦 Fichiers présents

| Fichier              | Rôle                                                             |
|----------------------|------------------------------------------------------------------|
| `ExceptionDemo.java` | Déclenche une division par zéro, gérée par un bloc `try/catch`  |
| `FinallyDemo.java`   | Montre qu’un bloc `finally` est toujours exécuté                |

---

## 🎯 Objectif

- Comprendre comment Java gère les erreurs à l’exécution
- Utiliser les blocs `try`, `catch`, `finally` de manière appropriée
- Connaître quelques **exceptions courantes** (ex: `ArithmeticException`, `NullPointerException`, etc.)

---

## 💭 Questions que je me suis posées

- Que se passe-t-il si je ne gère pas une exception ?
- Le bloc `finally` est-il toujours exécuté, même en cas d’erreur fatale ?
- Est-ce qu’on peut avoir plusieurs `catch` ?
- Peut-on créer ses propres exceptions ?

---

## 💡 Points de compréhension

- Une **exception non gérée** provoque un arrêt brutal du programme
- Le bloc `finally` est **toujours exécuté**, même si une exception est levée
- Java possède un système d’exceptions **hiérarchique** basé sur `Throwable`
- Il existe deux grands types :
  - **Checked exceptions** (ex: `IOException`, `SQLException`)
  - **Unchecked exceptions** (ex: `ArithmeticException`, `NullPointerException`)

---

## ✅ Exemple de sortie attendue

```bash
📌 Début du try
❗ Exception attrapée : / by zero
✅ Bloc finally exécuté
```

---

## 🚀 Compiler et exécuter

```bash
javac ExceptionDemo.java
java ExceptionDemo

javac FinallyDemo.java
java FinallyDemo
```

---

## 🧠 À retenir

- Toujours entourer le **code à risque** d'un bloc `try/catch`
- Penser à `finally` pour les **libérations de ressources** (ex: fichiers, connexions)
- Lire les messages d'erreur pour comprendre l'origine de l'exception

