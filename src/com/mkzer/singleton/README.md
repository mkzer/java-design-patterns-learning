# 🧩 Pattern Singleton – Implémentation Java

Ce dossier contient une **implémentation complète du design pattern Singleton**, utilisé pour garantir qu'une **seule instance d'une classe** est créée pendant l'exécution d’un programme.

---

## 📦 Fichiers présents

| Fichier               | Rôle                                                                |
|------------------------|---------------------------------------------------------------------|
| `Logger.java`          | Classe Singleton (instanciation "eager") avec méthode `log()`      |
| `test.java`            | Test simple : log + vérification que `l1 == l2` retourne `true`     |
| `TestThreadedLog.java` | Test avancé : multithread pour vérifier la sécurité de l’accès     |

---

## 🎯 Objectif

- Créer un logger **centralisé**, accessible partout
- Ajouter un **compteur de logs**
- Afficher la date avec `LocalDateTime`
- Assurer la **sécurité thread-safe** avec `synchronized`

---

## 🔍 Questions que je me suis posées

- Pourquoi `instance` est `static` et `final` ?
- Est-ce que `log()` doit être `static` ou non ?
- Comment tester que c’est bien le **même objet** ?
- Pourquoi `Logger()` est `private` ?
- Que se passe-t-il en **multithread** si on n’utilise pas `synchronized` ?

---

## 💡 Points de compréhension

- `private static final Logger instance = new Logger();`  
  ➜ instanciation **unique** au chargement de la classe

- `public static Logger getInstance()`  
  ➜ méthode d'accès globale à l’instance

- `public synchronized void log(...)`  
  ➜ protège l'incrément du compteur en cas de threads multiples

---

## ✅ Exemple de sortie

```bash
[LOG 1 - 2025-04-05T22:40:22.901] Hello
[LOG 2 - 2025-04-05T22:40:23.010] World
true
[LOG 3 - ...] Thread 1
[LOG 4 - ...] Thread 2
[LOG 5 - ...] Thread 3
```

---

## 🚀 Compiler et exécuter

Test simple :

```bash
javac Logger.java test.java
java test
```

Test multithread :

```bash
javac Logger.java TestThreadedLog.java
java TestThreadedLog
```
