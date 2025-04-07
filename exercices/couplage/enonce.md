# 🔌 Exercice – Couplage : Contrôle de lumière

## 🎯 Objectif

Comprendre l’impact du **couplage fort vs faible** et comment améliorer la modularité avec des interfaces.

---

## 📜 Consigne

1. Crée une interface `Device` avec une méthode `turnOn()`.
2. Implémente deux appareils :
   - `Lamp` → affiche `"La lampe s'allume 💡"`
   - `TV` → affiche `"La télévision s'allume 📺"`

3. Crée une classe `Switch` couplée faiblement à `Device`, avec :
   - Un constructeur `Switch(Device device)`
   - Une méthode `activate()` qui appelle `turnOn()`

4. Dans `CouplageTest` :
   - Crée un switch pour allumer une `Lamp`
   - Crée un switch pour allumer une `TV`

---

## ✅ Résultat attendu

```bash
La lampe s'allume 💡
La télévision s'allume 📺
