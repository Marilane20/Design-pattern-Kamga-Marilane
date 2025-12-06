# 🧩 Patrons de Conception en Java
Projet académique – Implémentation des Design Patterns

Ce dépôt contient mes implémentations personnelles des principaux **patrons de conception (Design Patterns)** en Java dans le cadre du cours INF471 – *Principes et pratique des réseaux de communication* (Partie Java / génie logiciel).

Chaque patron est organisé dans un package dédié, avec :
- Une **implémentation claire et documentée**
- Un **Main** associé permettant de tester rapidement
- Une **structure propre** pour faciliter le suivi du code par l’enseignant

---

## 📁 Structure du projet

src/
└── com.marilane.patrons/
├── singleton/
│ ├── Singleton.java
│ └── SingletonMain.java
│
├── factory/
│ ├── factorymethod/
│ │ ├── ...
│ │ └── FactoryMethodMain.java
│ │
│ └── abstractfactory/
│ ├── ...
│ └── AbstractFactoryMain.java
│
└── ... (autres patterns à venir)



---

## 🎯 Objectifs du projet

- Comprendre la logique derrière chaque design pattern
- Apprendre à organiser un projet Java de manière propre et modulaire
- Être capable d'expliquer clairement :
    - Le problème que le pattern résout
    - Comment fonctionne son implémentation
    - Quand et pourquoi l'utiliser
- Montrer la progression du travail à l’enseignant via Git

---

## ▶️ Comment exécuter les tests pour chaque pattern

1. Ouvrir le projet dans IntelliJ ou VS Code.
2. Naviguer dans le dossier du pattern voulu  
   Exemple : `src/com/marilane/patrons/singleton`
3. Exécuter le fichier `Client.java` (clic droit → Run).
4. Observer le résultat dans la console.

Chaque patron possède son propre **fichier Main** pour un test indépendant.

---

## 🧪 Exemple de lancement

```bash
# Depuis un IDE
Run → Client.java

# Depuis le terminal (si compilé)
java com.marilane.patrons.patronsDeConstruction.singletonCours.Singleton.client

