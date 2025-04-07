package Subiect_Pantofi.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Pantof {
    private final int numarPantof;
    private final double dimensiuneToc;
    private final TipMaterialBaza materialBaza;
    private final List<String> materialeSuplimentare;
    private final List<String> mesajeText;

    public Pantof(BuilderPantofi builder) {
        this.numarPantof = builder.numarPantof;
        this.dimensiuneToc = builder.dimensiuneToc;
        this.materialBaza = builder.materialBaza;
        this.materialeSuplimentare = builder.materialeSuplimentare;
        this.mesajeText = builder.mesajeText;
    }

    public void detaliiGenerale() {
        StringBuilder stringBuilder = new StringBuilder("\n\tNumar pantof: ");
        stringBuilder.append(this.numarPantof)
                .append("\n\tDimensiune toc: ").append(this.dimensiuneToc).append(" cm")
                .append("\n\tMaterial de baza: ").append(this.materialBaza);
        if (materialeSuplimentare.isEmpty()) {
            stringBuilder.append("\n\tFara materiale suplimentare");
        } else {
            stringBuilder.append("\n\tMateriale suplimentare: ");
            for(int i = 0; i < materialeSuplimentare.size(); i++) {
                stringBuilder.append("\n\t\t" + (i+1) + ") ").append(materialeSuplimentare.get(i));
            }
        }
        if (mesajeText.isEmpty()) {
            stringBuilder.append("\n\tFara mesaje text de imprimat");
        } else {
            stringBuilder.append("\n\tLista mesajelor text dorite pentru imprimare: ");
            for(int i = 0; i < mesajeText.size(); i++) {
                stringBuilder.append("\n\t\t" + (i+1) + ") ").append(mesajeText.get(i));
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public static class BuilderPantofi implements AbstractBuilder{
        private int numarPantof;
        private double dimensiuneToc;
        private TipMaterialBaza materialBaza;
        private List<String> materialeSuplimentare;
        private List<String> mesajeText;

        public BuilderPantofi(int numarPantof, double dimensiuneToc, TipMaterialBaza tipMaterialBaza) {
            this.numarPantof = numarPantof;
            this.dimensiuneToc = dimensiuneToc;
            this.materialBaza = tipMaterialBaza;
            this.mesajeText = new ArrayList<>();
            this.materialeSuplimentare = new ArrayList<>();
        }

        public BuilderPantofi adaugaMaterialSuplimentar(String material) {
            this.materialeSuplimentare.add(material);
            return this;
        }

        public BuilderPantofi adaugaMesaj(String mesaj) {
            this.mesajeText.add(mesaj);
            return this;
        }

        private int getLimitaMateriale(TipPantof tipPantof) {
            return switch (tipPantof) {
                case BALERINI -> 2;
                case TENISI -> 2;
                case GHETE -> 4;
                case STILETTO -> 1;
            };
        }

        @Override
        public Pantof build(TipPantof tipPantof) throws PantofiException {
            List<String> erori = new ArrayList<>();

            if (numarPantof < 35 || numarPantof > 45) {
                erori.add("Numarul pantofului trebuie sa fie intre 35 si 45.");
            }

            if (dimensiuneToc < 0.5 || dimensiuneToc > 12.5) {
                erori.add("Dimensiunea tocului trebuie sa fie intre 0.5 si 12.5 cm.");
            }

            if (materialeSuplimentare.size() > getLimitaMateriale(tipPantof)) {
                erori.add("Prea multe materiale secundare pentru " + tipPantof +
                        " (sunt permise doar " + getLimitaMateriale(tipPantof) + " materiale suplimentare pentru acest tip de pantof)");
            }

            int sumaCaractere = 0;
            for (String mesaje : mesajeText) {
                sumaCaractere += mesaje.length();
            }

            if (sumaCaractere >= numarPantof) {
                erori.add("Textul este prea lung!");
            }

            if (!erori.isEmpty()) {
                throw new PantofiException(String.join("\n", erori));
            }

            return switch (tipPantof) {
                case BALERINI -> new Balerini(this);
                case GHETE -> new Ghete(this);
                case STILETTO -> new Stiletto(this);
                case TENISI -> new Tenisi(this);
                default -> throw new PantofiException("Tip pantof necunoscut.");
            };
        }

    }
    public abstract void descrierePantofi();
}
