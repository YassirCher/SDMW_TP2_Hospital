## Résumé exécutif

Ce projet a consisté à développer un système de gestion hospitalière permettant d’administrer les informations de patients, médecins et rendez‑vous de façon centralisée. L’application, réalisée en Java avec Maven, suit une architecture MVC (Modèle–Vue–Contrôleur) et utilise Spring Boot pour faciliter le déploiement. Les fonctionnalités clés comprennent :

* Gestion des **dossiers patients** (création, mise à jour, consultation, suppression)
* Administration des **profils médecins**
* Planification et suivi des **rendez‑vous**
* Interface web responsive basée sur Thymeleaf
* Persistance avec une base de données relationnelle (H2/MySQL) via Spring Data JPA

Les résultats obtenus démontrent la robustesse de l’architecture et la facilité d’évolution du projet en vue d’y intégrer de nouvelles entités (ex. facturation, services, salles).

---

## 1. Contexte et objectifs

* **Modéliser** le domaine hospitalier : patients, médecins, rendez‑vous
* **Mettre en place** une API REST et une interface de test Swagger
* **Assurer** la persistance des données avec JPA
* **Valider** la bonne configuration via des tests unitaires et d’intégration

---

## 2. Analyse et conception

### 2.1. Modélisation du domaine

* **Patient** : id, nom,  date de naissance, score 
* **Médecin** : id, nom, spécialité, email
* **Rendez‑vous** : id, date/heure, patient, médecin, statut



### 2.2. Architecture applicative

* **Couche Modèle** : entités JPA annotées, repository Spring Data
* **Couche Contrôleur** : controllers Spring MVC/REST exposant les endpoints
* **Couche Vue** : pages Thymeleaf pour l’affichage et la saisie
* **Couche Service**  : logique métier de traitement et validation

---

## 3. Mise en œuvre technique

### 3.1. Outils et technologies

* **Langage** : Java 21
* **Build** : Maven (pom.xml avec dépendances Spring Boot, H2/MySQL)
* **Framework** : Spring Boot 2.x (starter-web, starter-data-jpa)
* **Base de données** : H2 en mémoire pour le développement, MySQL pour production

### 3.2. Configuration

* `application.properties` : configuration de la source de données, du port serveur, etc.
* Initialisation du schéma JPA 

### 3.3. Extraits de code clés

```java
![image](https://github.com/user-attachments/assets/7ff10d7a-0e70-467b-bc46-e53933ee3cec)

```




## 4. Tests et validation

### 4.1. Tests unitaires

ajout d'un nouvel patient:
![image](https://github.com/user-attachments/assets/0eaeeabc-44cc-474b-9926-8e5065cc407e)
![image](https://github.com/user-attachments/assets/d6c76676-499e-4d17-b65e-fbf7b5f68015)

lister tous les patients:
![image](https://github.com/user-attachments/assets/8392d4c9-7911-4da5-8832-827d308af7df)
![image](https://github.com/user-attachments/assets/6dfd3b79-4c50-4753-8ca8-78d4b10b9a4b)


Recherche d'un patient a partir de son nom:
![image](https://github.com/user-attachments/assets/670926d3-e59a-4398-acf7-583f73c6562c)
![image](https://github.com/user-attachments/assets/2d62be2c-78bd-4a13-a16a-2efc1fc769b0)

Recherche d'un patient a partir de son Id:
![image](https://github.com/user-attachments/assets/4657d40a-0503-4b04-a7ef-27415154a46f)
![image](https://github.com/user-attachments/assets/be6de24f-44fc-4152-9083-697809538c73)

Modification d'un patient:
![image](https://github.com/user-attachments/assets/717d8dad-d192-47c9-b55d-06bbd281f0b5)
![image](https://github.com/user-attachments/assets/87dca13d-dd44-4f95-90fa-5ecf8265acf1)

Suppression d'un patient:
![image](https://github.com/user-attachments/assets/f60600f5-a7a0-491b-bff6-99dc746d9821)
![image](https://github.com/user-attachments/assets/d4360026-4dff-4b8d-872f-8736069f5594)
![image](https://github.com/user-attachments/assets/0497c696-9ca9-4033-8bbd-1455e42678cc)

En quatre points clés, ce projet m’a permis de :

Appréhender l’architecture MVC avec Spring MVC .

Mettre en pratique les contrôleurs annotés et le routage des requêtes.

Intégrer la persistance via Spring Data JPA .

Structurer une application web modulaire et évolutive avec Spring Boot et Maven.

