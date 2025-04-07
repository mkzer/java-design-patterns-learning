# 🧬 Exercice – Héritage : Les animaux parlent

## 🎯 Objectif

Mettre en pratique l’**héritage** entre classes et l’utilisation de `super`.

---

## 📜 Consigne

1. Crée une classe `Animal` avec :
   - un attribut `String nom`
   - un constructeur `Animal(String nom)`
   - une méthode `parle()` qui affiche `"Je suis un animal nommé <nom>"`

2. Crée deux classes qui héritent de `Animal` :
   - `Chien` qui redéfinit `parle()` pour dire `"Wouf ! Je m'appelle <nom>"`
   - `Chat` qui redéfinit `parle()` pour dire `"Miaou ! Je m'appelle <nom>"`

3. Dans `HeritageTest` :
   - Crée un `Animal`, un `Chien` et un `Chat`
   - Appelle leur méthode `parle()`

---

## ✅ Résultat attendu

```bash
Je suis un animal nommé Bob
Wouf ! Je m'appelle Rex
Miaou ! Je m'appelle Minette
