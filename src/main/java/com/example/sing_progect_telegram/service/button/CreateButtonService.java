package com.example.sing_progect_telegram.service.button;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreateButtonService {


    public void setButtonsMain(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);


        List<KeyboardRow> keyBoardRowList = new ArrayList();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardTwoRow = new KeyboardRow();

        keyboardFirstRow.add(new KeyboardButton("Просмотр"));
        keyboardTwoRow.add(new KeyboardButton("Помощь"));

        keyBoardRowList.add(keyboardFirstRow);
        keyBoardRowList.add(keyboardTwoRow);

        replyKeyboardMarkup.setKeyboard(keyBoardRowList);
    }

    public void setButtonsTypeSing(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);


        List<KeyboardRow> keyBoardRowList = new ArrayList();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardTwoRow = new KeyboardRow();
        KeyboardRow keyboardThreeRow = new KeyboardRow();

        keyboardFirstRow.add(new KeyboardButton("Предупреждающие знаки"));
        keyboardFirstRow.add(new KeyboardButton("Знаки приоритета"));
        keyboardFirstRow.add(new KeyboardButton("Запрещающие знаки"));
        keyboardTwoRow.add(new KeyboardButton("Предписывающие знаки"));
        keyboardTwoRow.add(new KeyboardButton("Информационно-указательные знаки"));
        keyboardTwoRow.add(new KeyboardButton("Знаки сервиса"));
        keyboardThreeRow.add(new KeyboardButton("Назад к Основному меню"));

        keyBoardRowList.add(keyboardFirstRow);
        keyBoardRowList.add(keyboardTwoRow);
        keyBoardRowList.add(keyboardThreeRow);

        replyKeyboardMarkup.setKeyboard(keyBoardRowList);
    }

}
