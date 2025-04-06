# 🧩 Pattern Factory – Implémentation Java

Ce dossier contient une **implémentation simple et claire du design pattern Factory** en Java, permettant de créer des objets sans utiliser `new` directement dans le code appelant.

---

## 🧠 Objectif

Mettre en œuvre une **fabrique d’objets** (Factory) pour créer dynamiquement différentes classes qui implémentent une même interface `Animal` :
- Éviter la répétition de `new Dog()` ou `new Cat()` dans le code client
- Rendre le code plus flexible et évolutif
- Centraliser la logique de création dans une classe dédiée : `AnimalFactory`

---

## 📄 Fichiers présents

| Fichier                | Rôle                                                                 |
|------------------------|----------------------------------------------------------------------|
| `Animal.java`          | Interface commune à tous les animaux (`speak()`)                     |
| `Dog.java`             | Implémentation concrète de `Animal` – aboiement                     |
| `Cat.java`             | Implémentation concrète de `Animal` – miaulement                    |
| `AnimalFactory.java`   | Classe statique responsable de créer le bon objet en fonction du type |
| `FactoryTest.java`     | Classe de test : crée des objets via la factory et les fait parler   |
| `README.md`            | Ce fichier de documentation                                           |

---

## ✅ Résultat attendu (exemple)

```
Le chien aboie : Wouf !
Le chat miaule : Miaou !
```

---

## ❓ Points de compréhension abordés

### 🔹 Pourquoi utiliser une factory ?
Pour **centraliser la création des objets** et ne pas disséminer des `new` dans tout le code. Cela rend le code plus **modulable** et **ouvert à l’extension** (par exemple, ajouter un `Tigre` ou `Cheval`).

### 🔹 Que se passe-t-il si le type n’est pas reconnu ?
La factory déclenche une **`IllegalArgumentException`** avec un message clair pour éviter des `null` ou des comportements inattendus.

### 🔹 Quelle est la différence entre `Factory` et `Singleton` ?
- `Singleton` : garantit **une seule instance**
- `Factory` : gère la **création de plusieurs types d’objets**, en masquant leur instanciation

---

## 🚀 Pour exécuter le test

```bash
javac *.java
java com.mkzer.factory.FactoryTest
```

(si tu es dans `src/com/mkzer/factory/`, sinon adapte le chemin)

---

## 👨‍💻 Auteur

Mohamed Anis Makhezer  
[LinkedIn – anis-makhezer](https://www.linkedin.com/in/anis-makhezer-046649309/)  
Projet personnel d’apprentissage – 2025
