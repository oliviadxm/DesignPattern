package structuralPatterns.adapterPattern_06;

/**
 * Adapter pattern works as a bridge between two incompatible interface. This type of design pattern comes under
 * structural pattern as this pattern combines the capability of two independent interfaces.
 *
 * This pattern involves a single class which is responsible to join functionalities of independent or incompatible
 * interfaces. A real life example could be a case of card reader which acts as an adapter between memory card and
 * a laptop. You plugin the memory card into card reader and card reader into the laptop so that memory card can be
 * read via laptop.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
