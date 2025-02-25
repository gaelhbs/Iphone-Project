public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //MusicalReprodutor methods
        iphone.selectMusic("Artic Monkeys - Do I Wanna Know?");
        iphone.playMusic();
        iphone.stopMusic();

        //TelephoneDevice methods
        iphone.call("123456789");
        iphone.answerCall();
        iphone.startVoiceMail();

        //InternetBrowser methods
        iphone.displayPage("www.google.com");
        iphone.addNewTab();
        iphone.updatePage();
    }
}