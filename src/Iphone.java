public class Iphone implements InternetBrowser, TelephoneDevice, MusicalReprodutor {
   private String numberCalling;

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music...");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selecting music: " + music);
    }

    @Override
    public void call(String number) {
        this.numberCalling = number;
        System.out.println("Calling number: " + number);
    }

    @Override
    public void answerCall() {
        System.out.println("Answering call from number: " + this.numberCalling);
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voice mail...");
    }

    @Override
    public void displayPage(String url) {
        System.out.println("Displaying page: " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Adding new tab...");
    }

    @Override
    public void updatePage() {
        System.out.println("Updating page...");
    }
}
