# Kara-Such-Algorithmus

Ein JavaKara-Programm, mit dem Kara alle **von seiner Startposition aus erreichbaren Felder** nach Kleeblättern absucht und die gefundenen Kleeblätter einsammelt.

## Datei

- [KleeblattSuche.java](KleeblattSuche.java) – vollständiger Quellcode

## Funktionsweise

Der Algorithmus nutzt eine **Tiefensuche (Depth-First Search, DFS)**:

1. Kara merkt sich die bereits besuchten Felder in einem zweidimensionalen `boolean`-Array.
2. Er sammelt ein Kleeblatt auf seinem aktuellen Feld ein.
3. Er prüft nacheinander alle vier Richtungen und betritt nur Felder ohne Baum oder Pilz.
4. Er durchsucht das erreichbare Gebiet rekursiv und kehrt nach jedem Abstecher auf das vorherige Feld zurück.
5. Am Ende steht Kara wieder auf dem Startfeld und zeigt die Anzahl der eingesammelten Kleeblätter an.

## Verwendung

1. JavaKara öffnen und eine Welt mit Kleeblättern und Hindernissen vorbereiten.
2. Die Datei `KleeblattSuche.java` in die JavaKara-Programmierumgebung übernehmen.
3. Das Programm ausführen.

**Hinweise:** Der Code verwendet die klassische JavaKara-API mit `JavaKaraProgram`, `kara`, `world` und `tools`. Erreichbar bedeutet, dass Kara die Felder ohne Verschieben von Pilzen betreten kann. Vollständig abgesperrte Bereiche werden nicht besucht. Ein großer Weltplan kann wegen der rekursiven Suche viel Aufrufspeicher benötigen.

Der Code wurde hier nicht in der JavaKara-Anwendung ausgeführt oder kompiliert.
