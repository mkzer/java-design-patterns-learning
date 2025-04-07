# 🧩 Pattern Observer – Implémentation Java

Ce dossier contient une **implémentation claire du design pattern Observer**. Il permet à une classe (`WeatherStation`) de notifier automatiquement plusieurs objets abonnés (`PhoneDisplay`) lorsqu’un événement se produit (ici : changement de météo).

---

## 🧠 Objectif

- Implémenter le pattern Observer avec des interfaces `Observer` et `Subject`
- Simuler un système d’abonnement à la météo
- Découpler totalement le sujet observé et les observateurs
- Comprendre le mécanisme de **notification automatique**

---

## 📄 Fichiers présents

| Fichier               | Rôle                                                             |
|-----------------------|------------------------------------------------------------------|
| `Observer.java`       | Interface définissant `update()` à implémenter                  |
| `Subject.java`        | Interface pour enregistrer/désenregistrer/notifier les observers |
| `WeatherStation.java` | Classe principale – notifie les observateurs                    |
| `PhoneDisplay.java`   | Classe observatrice – réagit via `update()`                     |
| `ObserverTest.java`   | Classe de test – simule un changement de météo                  |
| `README.md`           | Ce fichier de documentation                                      |

---

## ✅ Résultat attendu

```
Téléphone 1 a reçu la météo : ☀️ Ensoleillé
Téléphone 2 a reçu la météo : ☀️ Ensoleillé
Téléphone 1 a reçu la météo : 🌧️ Pluie
Téléphone 2 a reçu la météo : 🌧️ Pluie
```

---

## ❓ Questions abordées

### 🔹 Pourquoi utiliser des interfaces comme `Observer` et `Subject` ?
Pour **éviter le couplage fort** entre les objets. `WeatherStation` ne connaît **pas** `PhoneDisplay`, il sait juste qu’il a une liste d’`Observer`.

### 🔹 Est-ce obligatoire d’avoir ces interfaces ?
Non. Mais **elles permettent un code propre, réutilisable, et évolutif**. Sinon, chaque modification d’observateur oblige à modifier la station météo.

### 🔹 Que veut dire `for (Observer o : observers)` ?
C’est une **boucle for-each** qui passe dans chaque observer de la liste et appelle `update(weather)` dessus.

---

## 🚀 Pour exécuter

Depuis la racine :

```bash
javac src/com/mkzer/observer/*.java
java -cp src com.mkzer.observer.ObserverTest
```

---

## 👨‍💻 Auteur

Mohamed Anis Makhezer  
[LinkedIn – anis-makhezer](https://www.linkedin.com/in/anis-makhezer-046649309/)  
Projet personnel d’apprentissage – 2025
