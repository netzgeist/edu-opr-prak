package katalog5;

import katalog3.Katalogartikel;

/**
 * Ein Objekt dieser Klasse repräsentiert ein Buch.
 */
public class Buch extends Katalogartikel {

    /** Titel dieses Buchs. */
    private String titel;

    /** Autor dieses Buchs. */
    private String autor;

    /** Erscheinungsjahr dieses Buchs. */
    private int erscheinungsjahr;

    /**
     * Erzeugt ein Objekt dieser Klasse für die angegebenen Daten.
     *
     * @param titel  Titel dieses Buchs
     * @param autor  Autor dieses Buchs
     * @param preis  Preis dieses Buchs
     * @param erscheinungsjahr  Erscheinungsjahr dieses Buchs
     */
    public Buch(String titel, String autor, float preis, int erscheinungsjahr) {

        super(preis);
        this.titel = titel;
        this.autor = autor;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    /**
     * Liefert den Autor dieses Buchs.
     *
     * @return Autor dieses Buchs
     */
    public String gibAutor() {

        return autor;
    }

    /**
     * Liefert textuelle Darstellung dieses Buchs.
     *
     * @return textuelle Darstellung dieses Buchs (Titel, Autor,
     *         Erscheinungsjahr und Preis durch Semikolon getrennt)
     */
    @Override
    public String gibText() {

        return (titel + "; " + autor + "; "
                + erscheinungsjahr + "; €" + gibPreis());
    }

    /**
     * Liefert den Suchtext dieses Buchs. Anhand des Suchtexts
     * lässt sich entscheiden, ob das Buch zu einem Suchbegriff passt.
     *
     * @return Suchtext dieses Buchs
     */
    @Override
    protected String gibSuchtext() {

        return (titel + " " + autor);
    }

    /**
     * Gibt an, ob dieses Buch gleich dem angegebenen Objekt ist.
     *
     * @param obj  ein Objekt
     * @return <code>true</code> genau dann, wenn das angegebene
     *         Objekt ein Buch ist und mit diesem Buch in Titel,
     *         Autor und Erscheinungsjahr übereinstimmt.
     */
    @Override
    public boolean equals(Object obj) {

        boolean istGleich = false;
        if (obj instanceof Buch) {
            Buch b = (Buch) obj;
            istGleich = titel.equals(b.titel) && autor.equals(b.autor)
                        && erscheinungsjahr == b.erscheinungsjahr;
        }
        return istGleich;
    }

    /**
     * Liefert den Hash-Code dieses Objekts.
     *
     * @return Hash-Code dieses Objekts
     */
    @Override
    public int hashCode() {

        return titel.hashCode() + autor.hashCode() + erscheinungsjahr;
    }

    /**
     * Liefert standardmäßige textuelle Darstellung dieses Buchs.
     *
     * @return textuelle Darstellung dieses Buchs
     */
    @Override
    public String toString() {

        return titel + " (" + gibPreis() + ")";
    }
}
