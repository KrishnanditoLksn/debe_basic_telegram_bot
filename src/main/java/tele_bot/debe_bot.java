package tele_bot;

import org.telegram.telegrambots.meta.api.methods.stickers.GetStickerSet;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendChatAction;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendSticker;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.media.InputMedia;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


                            //BOT MASIH DISIMPAN SECARA LOCAL

public class  debe_bot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "tele_bot.debe_bot";
    }

    @Override
    public String getBotToken() {
        return "";
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName());

        String command=update.getMessage().getText();

        if(command.equals("run")){

            String  message= "Run boy , run  hahahahah ";
            SendMessage response=new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try{
                execute(response);
            }catch (TelegramApiException E){
                E.printStackTrace();
            }
        }

        else if (command.equals("hello")){
                String  message = "Hello, namaku Jono , senang berkenalan dengan anda  ";
                SendMessage response = new SendMessage();
                response.setChatId((update.getMessage().getChatId().toString()));
                response.setText(message);

            try{
                execute(response);
            }catch (TelegramApiException E){
                E.printStackTrace();
            }

        }

        else if (command.equals(("about"))){
                String message="Bot coba - coba yang masih terus di sempurnakan";
                SendMessage response = new SendMessage();
                response.setChatId(update.getMessage().getChatId().toString());
                response.setText(message);
        }


        else if(command.equals("owner nya siapa?")){
            String message="Yang buat otid , namanya juga otid bot hehehe";
            SendMessage response= new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try{
                execute(response);
            }catch (TelegramApiException E){
                E.printStackTrace();
            }
        }
    }
}
