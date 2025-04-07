# 🏗️ Exercice – Constructeurs : Famille en héritage

## 🎯 Objectif

Comprendre le fonctionnement des **constructeurs avec héritage** et l’appel de `super()`.

---

## 📜 Consigne

1. Crée une classe `Personne` avec :
   - Un attribut `String nom`
   - Un constructeur `Personne(String nom)` qui affiche : `"Création de Personne : <nom>"`

2. Crée une classe `Etudiant` qui hérite de `Personne`, avec :
   - Un attribut `int niveau`
   - Un constructeur `Etudiant(String nom, int niveau)` qui :
     - Appelle le constructeur de `Personne`
     - Affiche `"Niveau : <niveau>"`

3. Dans `ConstructeurTest` :
   - Crée un objet `Etudiant` et observe l’ordre d’appel des constructeurs.

---

## ✅ Résultat attendu

```bash
Création de Personne : Anis
Niveau : 2
