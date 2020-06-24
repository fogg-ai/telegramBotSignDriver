package com.example.sing_progect_telegram.pollingBot;

import com.example.sing_progect_telegram.model.*;
import com.example.sing_progect_telegram.service.button.CreateButtonService;
import com.example.sing_progect_telegram.service.Sign;
import com.example.sing_progect_telegram.service.state.State;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class SingTelegramPolling extends TelegramLongPollingBot {

    private String state = String.valueOf(State.mainMenu);
    final
    CreateButtonService createButtonService;


    final
    Sign sign;
    public SingTelegramPolling(
            CreateButtonService createButtonService, Sign sign) {
        this.createButtonService = createButtonService;
        this.sign = sign;
    }


    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId());

        createButtonService.setButtonsMain(sendMessage);
        if (message != null && message.hasText()) {
            switch (message.getText()) {
                case "Просмотр":
                    try {
                        createButtonService.setButtonsTypeSing(sendMessage);
                        state = String.valueOf(State.singMenu);

                        execute(sendMessage.setText("Выберите тип знаков."));
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Вышло");

                    break;
                case "Помощь":
                    try {
                        execute(sendMessage.setText("Выберите просмотр.Выберите тип дорожных знаков."));
                        state = String.valueOf(State.singMenu);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Вішло");

                    break;
            }
            if(state.equals("singMenu"))
                switch (message.getText()) {

                    case "Предупреждающие знаки":
                        System.out.println("Предупреждающие знаки");

                        List<WarningSigns> all = sign.getWarning();
                        for (int i = 0; i < all.size(); i++) {

                            String a = "";
                            SendMessage sendMessageW = new SendMessage();
                            sendMessageW.enableMarkdown(true);
                            sendMessageW.setChatId(message.getChatId());

                            a += all.get(i).getImg() + "\n" +
                                    all.get(i).getNumberRule() + "\n" +
                                    all.get(i).getRule() + "\n" +
                                    all.get(i).getText() + "\n";
                            try {
                                execute(sendMessageW.setText(a));
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case "Знаки приоритета":
                        System.out.println("2. Знаки приоритета");

                        List<PrioritySigns> prioritySignsList = sign.getPriority();
                        for (int i = 0; i < prioritySignsList.size(); i++) {

                            String a = "";
                            SendMessage sendMessageW = new SendMessage();
                            sendMessageW.enableMarkdown(true);
                            sendMessageW.setChatId(message.getChatId());

                            a += prioritySignsList.get(i).getImg() + "\n" +
                                    prioritySignsList.get(i).getNumberRule() + "\n" +
                                    prioritySignsList.get(i).getRule() + "\n" +
                                    prioritySignsList.get(i).getText() + "\n";
                            try {
                                execute(sendMessageW.setText(a));
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case "Запрещающие знаки":
                        System.out.println("3. Запрещающие знаки");

                        System.out.println(message.getText());
                        List<ProhibitionSigns> prohibitionSignsList = sign.getProhibition();
                        for (int i = 0; i < prohibitionSignsList.size(); i++) {

                            String a = "";
                            SendMessage sendMessageW = new SendMessage();
                            sendMessageW.enableMarkdown(true);
                            sendMessageW.setChatId(message.getChatId());

                            a += prohibitionSignsList.get(i).getImg() + "\n" +
                                    prohibitionSignsList.get(i).getNumberRule() + "\n" +
                                    prohibitionSignsList.get(i).getRule() + "\n" +
                                    prohibitionSignsList.get(i).getText() + "\n";
                            try {
                                execute(sendMessageW.setText(a));
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case "Предписывающие знаки":
                        System.out.println("3. Предписывающие знаки");

                        List<MandatorySigns> mandatorySignsList = sign.getMandatory();
                        for (int i = 0; i < mandatorySignsList.size(); i++) {

                            String a = "";
                            SendMessage sendMessageW = new SendMessage();
                            sendMessageW.enableMarkdown(true);
                            sendMessageW.setChatId(message.getChatId());

                            a += mandatorySignsList.get(i).getImg() + "\n" +
                                    mandatorySignsList.get(i).getNumberRule() + "\n" +
                                    mandatorySignsList.get(i).getRule() + "\n" +
                                    mandatorySignsList.get(i).getText() + "\n";
                            try {
                                execute(sendMessageW.setText(a));
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case "Информационно-указательные знаки":
                        System.out.println("Информационно-указательные знаки");
                        List<InformationSigns> informationSignsList = sign.getInformationSign();
                        for (int i = 0; i < informationSignsList.size(); i++) {

                            String a = "";
                            SendMessage sendMessageW = new SendMessage();
                            sendMessageW.enableMarkdown(true);
                            sendMessageW.setChatId(message.getChatId());

                            a += informationSignsList.get(i).getImg() + "\n" +
                                    informationSignsList.get(i).getNumberRule() + "\n" +
                                    informationSignsList.get(i).getRule() + "\n" +
                                    informationSignsList.get(i).getText() + "\n";
                            try {
                                execute(sendMessageW.setText(a));
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case "Знаки сервиса":
                        System.out.println("Знаки сервиса");
                        List<ServiceSigns> serviceSignsList = sign.getServiceSign();
                        for (int i = 0; i < serviceSignsList.size(); i++) {

                            String a = "";
                            SendMessage sendMessageW = new SendMessage();
                            sendMessageW.enableMarkdown(true);
                            sendMessageW.setChatId(message.getChatId());

                            a += serviceSignsList.get(i).getImg() + "\n" +
                                    serviceSignsList.get(i).getNumberRule() + "\n" +
                                    serviceSignsList.get(i).getRule() + "\n" +
                                    serviceSignsList.get(i).getText() + "\n";
                            try {
                                execute(sendMessageW.setText(a));
                            } catch (TelegramApiException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    case "Назад к Основному меню":
                        state = String.valueOf(State.singMenu);
                        System.out.println("К основному меню");
                        createButtonService.setButtonsMain(sendMessage);

                        try {
                            execute(sendMessage.setText("Главное меню."));
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }

                        break;
                }

        }

    }

    @Override
    public String getBotUsername() {
        return "";
    }

    @Override
    public String getBotToken() {
        return "";
    }
}
