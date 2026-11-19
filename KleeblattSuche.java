import java.awt.Point;

/**
 * Kara sucht alle von seiner Startposition erreichbaren Felder ab
 * und sammelt dabei Kleeblaetter ein.
 *
 * Algorithmus: rekursive Tiefensuche (Depth-First Search).
 */
public class KleeblattSuche extends JavaKaraProgram {

    private boolean[][] besucht;
    private int kleeblaetter;

    public void myProgram() {
        besucht = new boolean[world.getSizeX()][world.getSizeY()];
        kleeblaetter = 0;

        durchsuchen();

        tools.showMessage(
            "Suche abgeschlossen!\n" +
            "Gefundene Kleeblaetter: " + kleeblaetter
        );
    }

    private void durchsuchen() {
        Point position = kara.getPosition();
        int x = position.x;
        int y = position.y;

        if (besucht[x][y]) {
            return;
        }
        besucht[x][y] = true;

        if (kara.onLeaf()) {
            kara.removeLeaf();
            kleeblaetter++;
        }

        // Alle vier Richtungen pruefen, beginnend mit der aktuellen.
        for (int richtung = 0; richtung < 4; richtung++) {
            if (!kara.treeFront() && !kara.mushroomFront()) {
                kara.move();
                durchsuchen();

                // Rueckweg zum vorherigen Feld.
                kara.turnRight();
                kara.turnRight();
                kara.move();
                kara.turnRight();
                kara.turnRight();
            }

            kara.turnRight();
        }
    }
}
