# Personendaten Verwaltungssystem

## Projektbeschreibung
Dies ist eine JavaFX-basierte Desktop-Anwendung zur Verwaltung von Personendaten. Die Anwendung ermöglicht es Benutzern, persönliche Informationen wie Name, Adresse und weitere Details zu speichern und anzuzeigen.

## Technische Details
- **Programmiersprache:** Java
- **Framework:** JavaFX
- **Datenbank:** MySQL
- **Build-Tool:** Maven

## Funktionen
- Anzeige von Personendaten in einer Tabelle
- Eingabeformular für neue Personendaten
- Speichern und Abbrechen von Dateneingaben
- Datenbankanbindung für persistente Datenspeicherung

## Systemanforderungen
- Java JDK 17 oder höher
- MySQL Server
- Maven

## Installation
1. Klonen Sie das Repository
2. Stellen Sie sicher, dass MySQL Server läuft
3. Erstellen Sie eine Datenbank namens "personendaten"
4. Führen Sie die Anwendung mit Maven aus:
   ```bash
   mvn clean javafx:run
   ```

## Datenbank-Konfiguration
Die Datenbankverbindung erfolgt über folgende Standardeinstellungen:
- Datenbankname: personendaten
- Benutzer: root
- Passwort: (leer)
- URL: jdbc:mysql://localhost/personendaten

## Projektstruktur
```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── person_data/
│   │               ├── Controller.java
│   │               ├── Database_connection.java
│   │               └── Main.java
│   └── resources/
│       └── com/
│           └── example/
│               └── person_data/
│                   └── persondata.fxml
```

## Benutzeroberfläche
Die Anwendung bietet:
- Eine Tabelle zur Anzeige der Personendaten
- Eingabefelder für:
  - Name
  - Nachname
  - Land
  - Stadt
  - Straße
  - Hausnummer
  - Postleitzahl
- Buttons für:
  - Speichern
  - Abbrechen
  - Zeigen
  - Verbinden

## Entwickler


## Lizenz

