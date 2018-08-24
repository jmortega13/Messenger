
import com.synacy.exercise.*;

public class Main {

    public static void main(String[] args) {

        Contact chuck = new Contact("chuckee", "631234567891", "chuckee.saliente@synacy.com");
        Contact june = new Contact("june", "631234567892", "june.ligan@synacy.com");
        Contact len = new Contact("len", "631234567893", "len.laurito@synacy.com");
        Contact von = new Contact("von", "631234567894", "von.alino@synacy.com");

        Messenger faxMessenger = new FaxMessenger();
        faxMessenger.sendMessage("hello world", chuck);

        Messenger smsMessenger = new SmsMessenger();
        smsMessenger.sendMessage("hello world", june);

        Messenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("hello world", len);

        Messenger voiceMessenger = new VoiceMessenger();
        voiceMessenger.sendMessage("hello world", von);

    }
}
