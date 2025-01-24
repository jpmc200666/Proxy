public class VideoReal implements Video{
    private String nombreArchivo;
    
    public VideoReal(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
        cargarDelDisco();
    }
    private void cargarDelDisco(){
        System.out.println("Cargando video desde el disco: "+ nombreArchivo);
    }
    @Override
    public void reproducir(){
        System.out.println("Reproduciendo video "+ nombreArchivo);
    }

}
