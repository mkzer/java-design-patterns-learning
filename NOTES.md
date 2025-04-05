# 📝 NOTES.md – Suivi & Structure du Projet

Ce fichier contient les notes techniques, les explications de structure, les commandes utilisées et les futures étapes du projet.  
Il remplace l’ancien `GIT_MEMO.md` et documente l’organisation réelle du dépôt.

---

## 🚀 Outils & Badges

[![Git](https://img.shields.io/badge/Git-%23f05033.svg?style=for-the-badge&logo=git&logoColor=white)](https://git-scm.com/)  
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/mkzer/java-design-patterns-learning)  
[![VS Code](https://img.shields.io/badge/VS%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)](https://code.visualstudio.com/)

---

## 📦 Structure du projet

Le projet suit une organisation professionnelle Java avec `src/com/mkzer/...` pour tout le code source.

```
java-design-patterns-learning/
├── src/
│   └── com/
│       └── mkzer/
│           ├── singleton/
│           └── exceptions/
├── singleton/       ← README & notes spécifiques
├── exceptions/      ← Anciennes démos Java
├── .vscode/         ← settings.json avec sourcePaths
├── README.md        ← Présentation générale
├── NOTES.md         ← Ce fichier (anciennement GIT_MEMO.md)
```

---

## 💻 Visualisation de l’arborescence

### 📜 Commande magique :

```bash
tree /F > arbo.txt
notepad arbo.txt
```

> 💬 Quand tu veux juste **montrer à ton mentor à quel point ton projet est carré** :  
> **Moi :** `tree /F`  
> **VS Code :** *respect intensifies*

```
                    ┌───────────────┐
                    │  tree /F 🚀   │
                    └──────┬────────┘
                           │
            "Voici toute mon arbo, chef 🫡"
```

---

## ⚙️ VS Code – configuration

Le fichier `.vscode/settings.json` contient :

```json
{
  "java.project.sourcePaths": ["src"]
}
```

➡️ Cela permet à VS Code de reconnaître automatiquement les packages Java comme `com.mkzer.singleton`.

---

## 💻 Compilation & exécution

### 🔧 Compilation :

```bash
javac src/com/mkzer/**/*.java
```

### 🚀 Exécution d’un fichier Java :

```bash
java -cp src com.mkzer.singleton.test
```

---

## 🌱 Git – commandes utilisées

| Commande                     | Utilité                                       |
|------------------------------|-----------------------------------------------|
| `git init`                   | Initialiser le dépôt                         |
| `git add .`                  | Ajouter tous les fichiers                    |
| `git commit -m "..."`        | Enregistrer les modifications                |
| `git remote add origin URL`  | Lier le dépôt local à GitHub                 |
| `git push -u origin main`    | Premier push sur la branche `main`          |
| `git status`                 | Voir les fichiers modifiés / suivis         |
| `git log`                    | Voir l’historique des commits               |

---

## ✨ Améliorations prévues

- [ ] Ajouter les autres design patterns à étudier :
  - Observer
  - Strategy
  - Decorator
- [ ] Ajouter un `README.md` dans chaque dossier de pattern
- [ ] Documenter toutes les structures d’arborescence vues pendant le projet :
  - Arborescence simple (fichiers à la racine)
  - Arborescence intermédiaire (`singleton/`, `factory/`, etc.)
  - Arborescence professionnelle (`src/com/mkzer/...`)
- [ ] Ajouter un rappel sur l’usage du fichier `.vscode/settings.json`
- [ ] Clarifier les différentes méthodes de compilation utilisées
- [ ] Préparer un mémo simple sur l’utilité des branches Git

---

## 🌿 À quoi sert une branche Git ?

> Une **branche** te permet de **travailler sur une version indépendante** de ton code.  
> Tu peux coder, tester ou modifier sans impacter la branche principale (`main`).

### ✅ Pourquoi c’est utile (même seul) :

- Tu veux tester un nouveau design pattern (`features/observer`)
- Tu veux corriger un bug sans casser le projet principal (`fix/bug-thread`)
- Tu veux refaire un fichier sans le publier tout de suite (`doc/readme-clean`)

### 🧑‍🤝‍🧑 Pourquoi c’est indispensable en équipe :

Chaque personne travaille sur **sa branche**, puis on fusionne (merge) une fois que tout est prêt.  
➡️ Ça évite les conflits et permet de collaborer efficacement.

---

## 🔧 Commandes de base pour les branches

```bash
# Créer et basculer sur une branche
git checkout -b features/observer

# Travailler et commit
git add .
git commit -m "Ajout du pattern Observer"
git push -u origin features/observer

# Revenir sur la branche principale
git checkout main

# Fusionner la branche dans main
git merge features/observer
```

---

## 🌳 Mème bonus spécial Git branch

```
        ┌──────────────┐
        │    main      │
        └────┬─────────┘
             │
             │
         ┌───▼─────────────┐
         │ features/observer│ ← moi qui expérimente tranquillement
         └──────────────────┘
```

> "Tu veux casser ton code sans casser ton code ? Branche-toi tranquille 😎"
