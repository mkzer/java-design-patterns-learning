# 🚗 Exercice de synthèse – Parc de véhicules intelligents

## 🎯 Objectif

Créer une application orientée objet complète pour gérer un **parc de véhicules intelligents**, avec des comportements dynamiques configurables à l’exécution.

---

## 🛠 Concepts à appliquer

- ✅ Interfaces
- ✅ Héritage
- ✅ Polymorphisme
- ✅ Pattern Strategy
- ✅ Exceptions personnalisées
- ✅ Couplage faible

---

## 📜 Contexte

Un gestionnaire de flotte veut simuler plusieurs véhicules. Chaque véhicule possède :

- un **nom** (identifiant)
- une **stratégie de déplacement** (modulable dynamiquement)
- une méthode `move()` qui dépend de sa stratégie

---

## 📚 Tâches à réaliser

### 1. `MoveStrategy` (interface)

Définit la méthode `void move()`

3 stratégies concrètes :

- `DriveStrategy` → `"Je roule sur la route 🚗"`
- `FlyStrategy` → `"Je vole dans le ciel ✈️"`
- `SailStrategy` → `"Je navigue sur l’eau 🚢"`

---

### 2. `Vehicule` (classe abstraite)

- Attributs :
  - `String nom`
  - `MoveStrategy strategy`
- Méthodes :
  - `move()` : utilise la stratégie
  - `setStrategy(MoveStrategy)`
  - `toString()` : retourne le nom et le type du véhicule

---

### 3. Classes concrètes héritées de `Vehicule`

- `Voiture`
- `Avion`
- `Bateau`

Chaque classe doit appeler le constructeur parent (`super(nom, strategy)`).

---

### 4. Exception personnalisée : `NomInvalideException`

- Levée dans le constructeur si `nom` est vide ou null
- Doit être capturée proprement dans le programme principal

---

### 5. `Parc` (classe de gestion de flotte)

- Attribut : `List<Vehicule> liste`
- Méthodes :
  - `ajouterVehicule(Vehicule v)`
  - `simulerTousLesMouvements()`

---

### 6. `ParcTest` (classe principale)

- Crée plusieurs véhicules avec différentes stratégies
- Change les stratégies dynamiquement
- Gère les exceptions (`try/catch`)
- Ajoute les véhicules dans le `Parc`
- Appelle `simulerTousLesMouvements()`

---

## ✅ Résultat attendu (exemple)

```bash
Avion A320 : Je vole dans le ciel ✈️
Bateau Corsica : Je navigue sur l’eau 🚢
Voiture Clio : Je roule sur la route 🚗

⚠️ Erreur : nom du véhicule vide
