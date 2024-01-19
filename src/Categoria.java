
public enum Categoria {
    COMPUTADORES("Computadores"),
    CELULARES("Celulares"),
    ELECTRODOMESTICOS("Eletrodomesticos"),
    TV("Tv"),
    ACCESORIOS("Accesorios"),
    VIDEOJUEGOS("Videojuegos"),
    AUDIO_Y_VIDEO("Audio y video");

    private final String categoria;

    private Categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return categoria;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    

    
}
