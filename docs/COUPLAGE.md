# 🔌 Couplage en Java – Fiche mémo

Le **couplage** désigne à quel point une classe dépend d'une autre dans un programme.  
On cherche toujours à **réduire le couplage** pour avoir un code plus souple, modulaire et maintenable.

---

## 💣 Couplage fort

> Une classe est **fortement couplée** si elle dépend de l’implémentation concrète d’une autre classe.

### Exemple :

```java
public class WeatherStation {
    private PhoneDisplay display = new PhoneDisplay(); // ❌ dépendance directe

    public void changeWeather(String weather) {
        display.update(weather); // Appelle direct d'une classe spécifique
    }
}
```

🛑 Si `PhoneDisplay` change → tu dois modifier `WeatherStation`.

---

## 🧠 Couplage faible

> Une classe **faiblement couplée** travaille avec une **interface** ou un type abstrait.

### Exemple avec Observer :

```java
public class WeatherStation {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(String weather) {
        for (Observer o : observers) {
            o.update(weather);
        }
    }
}
```

✅ `WeatherStation` ne connaît que le **contrat `Observer`**, pas l’implémentation concrète.

---

## 🎯 Avantages du couplage faible

- Code réutilisable
- Plus facile à tester
- Moins de dépendances entre modules
- Facile à faire évoluer

---

## 📌 Résumé

| Type de couplage  | Dépendance         | Flexibilité |
|-------------------|--------------------|-------------|
| ❌ Fort            | Sur une classe concrète | Faible      |
| ✅ Faible          | Sur une interface       | Élevée      |

---

## 👨‍💻 Appliqué dans ce projet

Le pattern **Observer** est un exemple typique de **découplage** :
- `WeatherStation` envoie l’info sans connaître les destinataires.
- `PhoneDisplay`, `WebDisplay`, etc. peuvent réagir librement.

---

## 🏷 Liens liés

- Voir aussi : [INTERFACES.md](./INTERFACES.md)
