public class VideoProxy implements Video{
    private String nombreArchivo;
    private VideoReal videoReal;

    public VideoProxy(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    @Override
    public void reproducir(){
        if(videoReal == null){
            videoReal = new VideoReal(nombreArchivo);
        }
        videoReal.reproducir();
    }
}
