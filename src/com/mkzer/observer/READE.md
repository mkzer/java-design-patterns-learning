# 👀 Pattern Observer – Implémentation Java

Ce dossier propose une implémentation simple du **design pattern Observer**, utilisé pour établir un **lien de notification automatique** entre un sujet (observable) et un ou plusieurs observateurs.

---

## 📦 Fichiers présents

| Fichier              | Rôle                                                              |
|----------------------|-------------------------------------------------------------------|
| `Subject.java`       | Interface définissant les méthodes `add/remove/notify`           |
| `Observer.java`      | Interface avec `update()` → à implémenter par les observateurs   |
| `WeatherStation.java`| Classe concrète qui émet les notifications                       |
| `PhoneDisplay.java`  | Observateur qui affiche la température reçue                     |
| `ObserverTest.java`  | Classe de test qui crée des objets et relie sujet ↔ observateurs |

---

## 🎯 Objectif

- Permettre à un **objet (Subject)** d’informer automatiquement d'autres objets (Observers) d’un **changement d’état**
- Créer une architecture **faiblement couplée**
- Simuler une **station météo** qui notifie ses "afficheurs" (displays)

---

## 💭 Questions que je me suis posées

- Quelle différence entre `extends` et `implements` dans ce contexte ?
- Pourquoi utiliser une **interface Observer** au lieu de coder directement dans `PhoneDisplay` ?
- Est-ce qu’un même observer peut observer plusieurs sujets ?
- Est-ce que les observers sont automatiquement retirés s’ils disparaissent ?
- Que se passe-t-il si un observer plante pendant la boucle `notifyObservers()` ?

---

## 💡 Points de compréhension

- La classe `WeatherStation` **stocke ses observers dans une liste**
- Lors de `setTemperature(...)`, elle **notifie tous les observers** via leur méthode `update(...)`
- Chaque observer **implémente un comportement spécifique** à la réception d’un changement
- Ce pattern respecte le **principe d’ouverture/fermeture (OCP)** : on peut ajouter de nouveaux observers sans modifier `WeatherStation`

---

## ✅ Exemple de sortie

```bash
Température reçue : 20°C
Température reçue : 25°C
Température reçue : 30°C
```

---

## 🚀 Compiler et exécuter

```bash
javac *.java
java ObserverTest
```

---

## 🧠 À retenir

- `implements Observer` signifie qu'une classe **s'engage à réagir** à une notification
- `implements Subject` permet à une classe d’être **observable**
- C’est un pattern très utilisé dans :
  - Interfaces graphiques (JavaFX, Swing, React)
  - Jeux vidéos (santé, score, UI)
  - Réseaux sociaux, systèmes de messagerie (abonnés)

