# 🎯 Java Design Patterns – Apprentissage progressif

Ce dépôt regroupe des implémentations simples et commentées de plusieurs **design patterns en Java**, dans le but de renforcer ma compréhension de la **programmation orientée objet (OOP)**, de la **gestion de projet avec Git**, et des **bonnes pratiques de conception logicielle**.

---

## 🧠 Objectifs

- Comprendre les design patterns les plus courants
- Les implémenter en Java avec des exemples concrets
- Documenter chaque pattern dans un dossier dédié (`singleton`, `factory`, etc.)
- Migrer vers une structure professionnelle avec `src/com/mkzer/...`
- Utiliser Git et VS Code pour suivre l'évolution de l’apprentissage

---

## 🗂️ Structure du projet

```plaintext
java-design-patterns-learning/
├── src/
│   └── com/
│       └── mkzer/
│           ├── singleton/
│           └── exceptions/
├── singleton/        ← Dossiers de documentation (README, notes)
├── exceptions/       ← Ancienne version + doc
├── .vscode/          ← Config VS Code (sourcePath = "src")
├── GIT_MEMO.md       ← Rappel des commandes Git utilisées
├── README.md         ← Ce fichier
```

✅ Tous les fichiers `.java` sont désormais sous `src/com/mkzer/...`  
📦 Chaque fichier commence par un `package com.mkzer.<dossier>;` cohérent

---

## ✅ Patterns étudiés

| Pattern     | Statut     | Description courte                                |
|-------------|------------|---------------------------------------------------|
| Singleton   | ✅ Fait     | Une seule instance partagée dans toute l’appli   |
| Factory     | ✅ Fait     | Crée des objets sans exposer `new`               |
| Observer    | ⏳ En cours | Notifie des objets lors d’un changement d’état   |
| Strategy    | 🔜 À venir  | Change dynamiquement l’algorithme utilisé        |
| Decorator   | 🔜 À venir  | Ajoute dynamiquement des fonctionnalités         |

---

## 💻 Environnement utilisé

- Java 17+
- VS Code avec extension Java
- Git (via terminal ou intégré VS Code)
- Java Language Server (`settings.json` configuré)

---

## 🔍 Compilation & exécution

### Compiler tout :
```bash
javac src/com/mkzer/**/*.java
```

### Exécuter un fichier :
```bash
java -cp src com.mkzer.singleton.test
```

---

## 🧪 Astuces VS Code

- Le fichier `.vscode/settings.json` permet à VS Code de reconnaître `src/` comme dossier source Java.
- Utilise `Java: Clean Java Language Server` si les packages ne sont pas reconnus.
- L’extension **Better Outline** permet de naviguer rapidement dans les classes et méthodes.

---

## 👨‍💻 Auteur

Mohamed Anis Makhezer  
[LinkedIn – anis-makhezer](https://www.linkedin.com/in/anis-makhezer-046649309/)  
Projet personnel d’apprentissage – 2025

---

## 📜 Licence

Ce dépôt est partagé à titre éducatif, sous licence MIT.
