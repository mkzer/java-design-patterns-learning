# ⚠️ Exercice – Exceptions : Division dangereuse

## 🎯 Objectif

Manipuler des **exceptions en Java** en utilisant `try/catch/finally`.

---

## 📜 Consigne

1. Crée une classe `DangerousDivision` avec une méthode `divide(int a, int b)` :
   - Si `b == 0`, une **exception est levée**.
   - Sinon, affiche le résultat de `a / b`.

2. Dans la classe `ExceptionExoTest` :
   - Appelle `divide(10, 2)` → doit afficher `5`
   - Appelle `divide(8, 0)` → doit capturer l’exception et afficher un message d’erreur
   - Utilise un bloc `finally` pour afficher "Fin de l'opération" dans tous les cas

---

## ✅ Résultat attendu

```bash
Résultat : 5
❗ Erreur : Division par zéro
Fin de l'opération
