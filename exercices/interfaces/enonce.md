# 🧩 Exercice – Interface : Je suis capable de...

## 🎯 Objectif

Créer une hiérarchie d’objets ayant des **capacités différentes** (voler, rouler, nager), en utilisant des **interfaces** pour exprimer ces comportements.

---

## 📜 Consigne

1. Crée les interfaces suivantes :
   - `Flyable` avec la méthode `fly()`
   - `Swimmable` avec la méthode `swim()`
   - `Drivable` avec la méthode `drive()`

2. Crée des classes concrètes qui **implémentent une ou plusieurs** de ces interfaces :
   - `Car` → `Drivable`
   - `Boat` → `Swimmable`
   - `Plane` → `Flyable` + `Drivable`
   - `Duck` → `Swimmable` + `Flyable`

3. Crée une classe `InterfaceTest` avec un `main()` qui instancie chaque objet et appelle les capacités disponibles.

---

## ✅ Résultat attendu (exemple de sortie)

```bash
Car: Je conduis sur la route.
Boat: Je navigue sur l'eau.
Plane: Je vole dans le ciel.
Plane: Je conduis sur la piste.
Duck: Je nage dans la mare.
Duck: Je vole sur l'étang.
