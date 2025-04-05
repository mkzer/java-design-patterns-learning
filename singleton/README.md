# 🧩 Pattern Singleton – Implémentation Java

Ce dossier contient une **implémentation complète du design pattern Singleton** en Java, accompagnée de deux classes de test :
- Une version classique (`test.java`)
- Une version multithreadée (`TestThreadedLog.java`) pour tester la robustesse du Singleton en environnement concurrent.

---

## 🧠 Objectif

Mettre en œuvre un **Logger** qui respecte le pattern Singleton :
- Une seule instance de `Logger`
- Un compteur de logs
- Un horodatage avec `LocalDateTime`
- Sécurisé pour l’usage multithread grâce à `synchronized`

---

## 📄 Fichiers présents

| Fichier                   | Rôle                                                                 |
|---------------------------|----------------------------------------------------------------------|
| `Logger.java`             | Implémentation du Singleton (version eager), avec `log()` thread-safe |
| `test.java`               | Test basique : vérifie l’unicité de l’instance et le comptage        |
| `TestThreadedLog.java`    | Test avancé : exécute plusieurs threads pour valider la sécurité     |
| `README.md`               | Ce fichier de documentation                                           |

---

## ✅ Résultat attendu (exemple)

```
[LOG 1 - 2025-04-05T22:40:22.901] Hello
[LOG 2 - 2025-04-05T22:40:23.010] World
true
[LOG 3 - 2025-04-05T22:40:23.100] Message from T1
[LOG 4 - 2025-04-05T22:40:23.101] Message from T3
[LOG 5 - 2025-04-05T22:40:23.102] Message from T2
```

---

## ❓ Points de compréhension abordés

### 🔹 Pourquoi `log()` ne doit pas être `static` ?
Parce que dans un Singleton, on souhaite **forcer l’accès via `getInstance()`**, et éviter l’appel direct à une méthode statique.

### 🔹 À quoi sert `synchronized` dans `log()` ?
À **protéger l’accès concurrent** au compteur `count` pour éviter des incohérences si plusieurs threads écrivent en même temps.

### 🔹 Quelle est la différence entre `Logger.getInstance().log()` et `Logger.log()` ?
- `Logger.getInstance().log()` : pattern Singleton respecté
- `Logger.log()` : méthode statique → contourne le principe du Singleton (même si fonctionnellement correct)

---

## 🚀 Pour exécuter les tests

### Test classique :
```bash
javac Logger.java test.java
java test
```

### Test multithreadé :
```bash
javac Logger.java TestThreadedLog.java
java TestThreadedLog
```

---

## 👨‍💻 Auteur

Mohamed Anis Makhezer  
[LinkedIn – anis-makhezer](https://www.linkedin.com/in/anis-makhezer-046649309/)  
Projet personnel d’apprentissage – 2025
