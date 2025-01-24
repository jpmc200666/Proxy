public class App {
    public static void main(String[] args) throws Exception {
        Video video1 = new VideoProxy("video1.mp4");
        Video video2 = new VideoProxy("video2.mp4");

        video1.reproducir();
        System.out.println();
        video1.reproducir();
        System.out.println();
        video2.reproducir();
    }
}
