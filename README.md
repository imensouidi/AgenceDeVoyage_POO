# Projet Agence de Voyage

Ce projet est une application Java permettant la gestion d'une agence de voyage. Il inclut la création et la gestion des voyages, clients et réservations.

## Fonctionnalités
- Création de voyages personnalisés et organisés
- Ajout et gestion des clients
- Création et suivi des réservations
- Affichage des détails des clients, voyages et réservations
- Modification des informations clients
- Utilisation des principes de la Programmation Orientée Objet (POO) pour une meilleure modularité et réutilisabilité du code
- Optimisation des algorithmes de recherche et de gestion des données
- Amélioration de la gestion des erreurs et des validations d'entrée utilisateur

## Installation et Exécution
### Prérequis
- Java JDK 8 ou supérieur
- Un IDE (IntelliJ IDEA, Eclipse, NetBeans, etc.)

### Instructions
1. Clonez le dépôt :
   ```bash
   git clone https://github.com/votre-repo/agence-voyage.git
   cd agence-voyage
   ```
2. Compilez les fichiers Java :
   ```bash
   javac -d bin src/agence/*.java
   ```
3. Exécutez le programme :
   ```bash
   java -cp bin agence.Main
   ```

## Structure du Projet
```
/agence-voyage
│── src/
│   ├── agence/
│   │   ├── Main.java
│   │   ├── Gestionnaire.java
│   │   ├── Client.java
│   │   ├── Voyage.java
│   │   ├── Reservation.java
│   │   ├── PackPersonnalise.java
│   │   ├── PackOrganise.java
│── bin/ (compilés)
│── README.md
```

## Exemple d'Utilisation
Lors de l'exécution, le menu suivant apparaît :
```
1- Créer voyage
2- Créer client
3- Créer réservation
4- Afficher client
5- Afficher réservation
6- Afficher voyage
7- Modifier un client
8- Exit
```
L'utilisateur peut entrer un numéro correspondant à l'action souhaitée.
