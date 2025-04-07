# 🎶 Exercice – Polymorphisme & Héritage : Concert animalier

## 🎯 Objectif

Combiner l’héritage avec le polymorphisme pour créer un **groupe d’objets qui réagissent différemment à une même méthode**.

---

## 📜 Consigne

1. Crée une classe abstraite `Animal` avec :
   - un attribut `nom`
   - une méthode abstraite `faireDuBruit()`

2. Implémente plusieurs classes qui héritent de `Animal` :
   - `Chien` → "Wouf !"
   - `Chat` → "Miaou !"
   - `Vache` → "Meuh !"

3. Dans `ConcertTest` :
   - Crée une liste d’`Animal` (même type abstrait)
   - Ajoute un `Chien`, un `Chat` et une `Vache`
   - Parcours la liste et appelle `faireDuBruit()` pour chaque animal

---

## ✅ Résultat attendu

```bash
Rex fait : Wouf !
Minette fait : Miaou !
Marguerite fait : Meuh !
