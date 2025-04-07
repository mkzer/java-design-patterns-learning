# 🧠 Exercice – Strategy : Je me déplace différemment

## 🎯 Objectif

Appliquer le pattern Strategy pour permettre à un personnage de **changer dynamiquement sa manière de se déplacer**.

---

## 📜 Consigne

1. Crée une interface `MoveStrategy` avec une méthode `move()`.
2. Implémente plusieurs stratégies :
   - `WalkStrategy` → "Je marche."
   - `FlyStrategy` → "Je vole."
   - `SwimStrategy` → "Je nage."
3. Crée une classe `Personnage` :
   - Avec un attribut `MoveStrategy`
   - Méthode `move()` → délègue à la stratégie
   - Méthode `setStrategy(MoveStrategy)` → permet de changer dynamiquement

4. Dans `StrategyExoTest`, crée un personnage et fais-le :
   - Marcher
   - Voler
   - Nager

---

## ✅ Résultat attendu

```bash
Je marche.
Je vole.
Je nage.
