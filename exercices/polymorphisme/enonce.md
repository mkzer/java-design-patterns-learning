# 🧬 Exercice – Polymorphisme : Un zoo polymorphe

## 🎯 Objectif

Utiliser le **polymorphisme** pour manipuler des objets concrets via une **interface commune**.

---

## 📜 Consigne

1. Crée une interface `Animal` avec une méthode `makeSound()`.
2. Implémente 3 classes concrètes :
   - `Lion` → affiche "Roar!"
   - `Elephant` → affiche "Pawoo!"
   - `Snake` → affiche "Hiss!"
3. Crée une classe `ZooTest` qui contient une `List<Animal>` :
   - Ajoute des animaux de différents types dans la liste
   - Parcours la liste et appelle `makeSound()` pour chaque animal

---

## ✅ Résultat attendu

```bash
Roar!
Pawoo!
Hiss!
Roar!
