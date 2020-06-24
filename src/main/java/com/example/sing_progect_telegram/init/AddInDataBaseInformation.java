package com.example.sing_progect_telegram.init;

import com.example.sing_progect_telegram.model.InformationSigns;
import com.example.sing_progect_telegram.model.MandatorySigns;
import com.example.sing_progect_telegram.repository.*;
import com.example.sing_progect_telegram.service.*;
import com.example.sing_progect_telegram.service.dto.*;
import com.example.sing_progect_telegram.service.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
@EnableJpaRepositories("com.example.sing_progect_telegram.repository")
public class AddInDataBaseInformation {
    final
    InformationSignsRepository informationSignsRepository;
    final
    MandatorySignsRepository mandatorySignsRepository;
    final
    MandatorySignsMapper mandatorySignsMapper;
    final
    MandatorySignsService mandatorySignsService;
    final
    InformationSignsMapper informationSignsMapper;
    final
    InformationSignsService informationSignsService;
    final
    PrioritySignsMapper prioritySignsMapper;
    final
    PrioritySignsService prioritySignsService;
    final
    PrioritySignsRepository prioritySignsRepository;
    final
    ProhibitionSignsMapper prohibitionSignsMapper;
    final
    ProhibitionSignsService prohibitionSignsService;
    final
    ProhibitionSignsRepository prohibitionSignsRepository;
    final
    RoadSignsMapper roadSignsMapper;
    final
    RoadSignsService roadSignsService;
    final
    RoadSignsRepository roadSignsRepository;
    final
    ServiceSignsMapper serviceSignsMapper;
    final
    ServiceSignsService serviceSignsService;
    final
    ServiceSignsRepository serviceSignsRepository;
    final
    WarningSignsMapper warningSignsMapper;
    final
    WarningSignsService warningSignsService;
    final
    WarningSignsRepository warningSignsRepository;

    private static boolean inited;

    @Autowired
    public AddInDataBaseInformation(InformationSignsRepository informationSignsRepository, RoadSignsMapper roadSignsMapper, ServiceSignsService serviceSignsService, WarningSignsMapper warningSignsMapper, WarningSignsRepository warningSignsRepository, MandatorySignsMapper mandatorySignsMapper, MandatorySignsService mandatorySignsService, InformationSignsMapper informationSignsMapper, InformationSignsService informationSignsService, PrioritySignsMapper prioritySignsMapper, ServiceSignsMapper serviceSignsMapper, RoadSignsRepository roadSignsRepository, ServiceSignsRepository serviceSignsRepository, WarningSignsService warningSignsService, PrioritySignsService prioritySignsService, PrioritySignsRepository prioritySignsRepository, ProhibitionSignsMapper prohibitionSignsMapper, ProhibitionSignsService prohibitionSignsService, RoadSignsService roadSignsService, ProhibitionSignsRepository prohibitionSignsRepository, MandatorySignsRepository mandatorySignsRepository) {
        this.mandatorySignsRepository = mandatorySignsRepository;
        this.informationSignsRepository = informationSignsRepository;
        this.roadSignsMapper = roadSignsMapper;
        this.serviceSignsService = serviceSignsService;
        this.warningSignsMapper = warningSignsMapper;
        this.warningSignsRepository = warningSignsRepository;
        this.mandatorySignsMapper = mandatorySignsMapper;
        this.mandatorySignsService = mandatorySignsService;
        this.informationSignsMapper = informationSignsMapper;
        this.informationSignsService = informationSignsService;
        this.prioritySignsMapper = prioritySignsMapper;
        this.serviceSignsMapper = serviceSignsMapper;
        this.roadSignsRepository = roadSignsRepository;
        this.serviceSignsRepository = serviceSignsRepository;
        this.warningSignsService = warningSignsService;
        this.prioritySignsService = prioritySignsService;
        this.prioritySignsRepository = prioritySignsRepository;
        this.prohibitionSignsMapper = prohibitionSignsMapper;
        this.prohibitionSignsService = prohibitionSignsService;
        this.roadSignsService = roadSignsService;
        this.prohibitionSignsRepository = prohibitionSignsRepository;
    }


    @PostConstruct
    public void init() {
        if (inited) return;

        warningSignsService.save(new WarningSignsDto("1.1", "https://drive.google.com/file/d/1UWX9mTCHI3fNLPVfBYbsBtqAcomz64DZ/view?usp=sharing",
                "«Опасный поворот направо»", "Предупреждает о закруглении дороги радиусом менее 500 м вне населенных пунктов и менее 150 м — в населенных пунктах или о закруглении с ограниченной обзорностью"));

        warningSignsService.save(new WarningSignsDto("1.2", "https://drive.google.com/file/d/17zduwrrZybWjmK54KNRKWcb-j8E1VAZY/view?usp=sharing",
                "«Опасный поворот налево»", "Предупреждает о закруглении дороги радиусом менее 500 м вне населенных пунктов и менее 150 м — в населенных пунктах или о закруглении с ограниченной обзорностью"));

        warningSignsService.save(new WarningSignsDto("1.3.1", "https://drive.google.com/file/d/1aXvm8h84pU2E3gTRxd13SAWysQ0k4Jav/view?usp=sharing",
                "«Несколько поворотов»", "Участок дороги с двумя и больше расположенными один за другим опасными поворотами с первым поворотом направо."));

        warningSignsService.save(new WarningSignsDto("1.3.2", "https://drive.google.com/file/d/18m8-Wr9v0Cj4Tx8vQ5-npXy8yH02HIkr/view?usp=sharing",
                "«Несколько поворотов»", "Участок дороги с двумя и больше расположенными один за другим опасными поворотами с первым поворотом налево."));

        warningSignsService.save(new WarningSignsDto("1.4.1", "https://drive.google.com/file/d/1i9aWJ2qCLJvUIpO4gvcaQ85caA8CAMwN/view?usp=sharing",
                "«Направление поворота»(движение направо)", "Показывает направление поворота дороги, обозначенной знаками 1.1 \"Опасный поворот направо\", направление объезда препятствия на дороге, и кроме того, — направление объезда центра перекрестка с круговым движением."));

        warningSignsService.save(new WarningSignsDto("1.4.2", "https://drive.google.com/file/d/1oejORB2YkR4Jt4XhGGM2aqiAvY5svblA/view?usp=sharing",
                "«Направление поворота»(движение налево)", "Показывает направление поворота дороги, обозначенной знаками 1.2 \"Опасный поворот налево\", направление объезда препятствия на дороге."));

        warningSignsService.save(new WarningSignsDto("1.4.3", "https://drive.google.com/file/d/1DGtPdpsLg9s1uj3KZ5q5fBMJxpU6ekQE/view?usp=sharing",
                "«Направление поворота»(движение направо или налево)", "Показывает направление движения на Т-образных перекрестках, разветвлениях дорог или объезда ремонтируемого участка дороги."));

        warningSignsService.save(new WarningSignsDto("1.5.1", "https://drive.google.com/file/d/1H5rNwPBbVTo92xvV1oSX6FUkDe3hIEKj/view?usp=sharing",
                "«Сужение дороги»(сужение дороги с обеих сторон)", "Устанавливается вне населенных пунктов на расстоянии 150–300 м, в населенных пунктах — на расстоянии 50–100 м до начала опасного участка."));

        warningSignsService.save(new WarningSignsDto("1.5.2", "https://drive.google.com/file/d/1zmdZpRlaFyxdItaOojV3HPxNyxpV9OQN/view?usp=sharing",
                "«Сужение дороги»(сужение дороги с правой стороны)", "Устанавливается вне населенных пунктов на расстоянии 150–300 м, в населенных пунктах — на расстоянии 50–100 м до начала опасного участка."));

        warningSignsService.save(new WarningSignsDto("1.5.3", "https://drive.google.com/file/d/1q57eeckeH5vaAakZ7faR_JkUNyKzYw8y/view?usp=sharing",
                "«Сужение дороги»(сужение дороги с левой стороны)", "Устанавливается вне населенных пунктов на расстоянии 150–300 м, в населенных пунктах — на расстоянии 50–100 м до начала опасного участка."));

        warningSignsService.save(new WarningSignsDto("1.6", "https://drive.google.com/file/d/1fn8EdcrklGjzMhuXIg2oMsuz71En7s8X/view?usp=sharing",
                "«Крутой подъем»", "Предупреждает о приближении к подъему, на котором действуют требования раздела 28 этих Правил и устанавливается вне населенных пунктов на расстоянии 150–300 м, в населенных пунктах — на расстоянии 50–100 м до начала опасного участка."));


        warningSignsService.save(new WarningSignsDto("1.7", "https://drive.google.com/file/d/1iCh2Cccqua3d1M7XzdsBRcprFqNAjT9B/view?usp=sharing",
                "«Крутой спуск»", "Предупреждает о приближении к спуску, на котором действуют требования раздела 28 этих Правил и устанавливается вне населенных пунктов на расстоянии 150–300 м, в населенных пунктах — на расстоянии 50–100 м до начала опасного участка."));


        warningSignsService.save(new WarningSignsDto("1.8", "https://drive.google.com/file/d/1X-DVL4Aduh58-U1zvCkoEIK4WoGjL1mD/view?usp=sharing",
                "«Выезд на набережную или берег»", "Обозначает выезд на берег водоема, в том числе на паромную переправу(Табличка 7.11)устанавливается знак вне населенных пунктов на расстоянии 150–300 м, в населенных пунктах — на расстоянии 50–100 м до начала опасного участка."));

        warningSignsService.save(new WarningSignsDto("1.9", "https://drive.google.com/file/d/1Mc7aTxjVY6z1k7rCSw7SD8ohcT6nyWPI/view?usp=sharing",
                "«Тоннель»", "Устанавливается при приближении к сооружению, не имеющему искусственного освещения, обзорность въездного портала которого ограничена или на подъезде к которому сужена проезжая часть."));

        warningSignsService.save(new WarningSignsDto("1.10", "https://drive.google.com/file/d/1aProi0YOnhlmSfMDCdl8Q0pyn5zKu2v7/view?usp=sharing",
                "«Неровная дорога»", "Устанавливается перед участком дороги, которая имеет неровности проезжей части — волнистости, наплывы, вспучивания. знак устанавливается вне населенных пунктов на расстоянии 150–300 м, в населенных пунктах — на расстоянии 50–100 м до начала опасного участка."));


        warningSignsService.save(new WarningSignsDto("1.11", "https://drive.google.com/file/d/1YpRno4jquRrUipcClBYYSKG1VyfuLRPX/view?usp=sharing",
                "«Бугор»", "Устанавливается перед участком дороги с буграми, наплывами или не плавной стыковкой конструкций мостов. Знак также может применяться перед искусственно создаваемыми буграми в местах, где необходимо принудительно ограничить скорость движения транспортных средств (опасные выезды с прилегающих территорий, места с интенсивным движением детей через дорогу и т.п.)."));

        warningSignsService.save(new WarningSignsDto("1.12", "https://drive.google.com/file/d/1YoCWf2Ez1g55jyIzbte1TcK2k9UKOzDB/view?usp=sharing",
                "«Выбоина»", "Устанавливается перед участком дороги с выбоинами или проседаниями дорожного покрытия на проезжей части."));

        warningSignsService.save(new WarningSignsDto("1.13", "https://drive.google.com/file/d/10YXNo7SCCV8Hu7YlHBik4Xgxe5kO4iHn/view?usp=sharing",
                "«Скользкая дорога»", "Устанавливается перед участком дороги с повышенной скользкостью проезжей части."));

        warningSignsService.save(new WarningSignsDto("1.14", "https://drive.google.com/file/d/112QEp0E73Csnm8eRECGK9vgXmHKxSuN4/view?usp=sharing",
                "«Выброс каменистых материалов»", "Устанавливается перед участком дороги, на котором возможен выброс гравия, щебня и т.п. из-под колес транспортных средств."));

        warningSignsService.save(new WarningSignsDto("1.15", "https://drive.google.com/file/d/1WJ5OSEcX5wKh6vt2UXuSZ5UN0mDwN-W6/view?usp=sharing",
                "«Опасная обочина»", "Устанавливается перед повышенной, заниженной, разрушенной обочиной или обочиной, на которой выполняются ремонтные работы."));

        warningSignsService.save(new WarningSignsDto("1.16", "https://drive.google.com/file/d/1Fyblj07l4F1jp7QaaGBVBCpLcW2K21hM/view?usp=sharing",
                "«Падение камней»", "Устанавливается перед участком дороги на котором могут быть падения камней, обвалы, оползни."));

        warningSignsService.save(new WarningSignsDto("1.17", "https://drive.google.com/file/d/1A8ZexI6XDcXlLCMwx5-Pl1KdP6345q52/view?usp=sharing",
                "«Боковой ветер»", "устанавливается перед участками дорог, которые проходят через горные перевалы, высокие насыпи, мосты, путепроводы, вдоль обрывов, рек и т.п., на которых возможен сильный боковой ветер или его внезапные порывы."));

        warningSignsService.save(new WarningSignsDto("1.18", "https://drive.google.com/file/d/1eelej3Dr9e5iRLy5L4T6ftUwpUV6sKhy/view?usp=sharing",
                "«Низколетящие самолеты»", "Устанавливается перед участком дороги, проходящий вблизи аэродрома или над которым самолеты или вертолеты пролетают на небольшой высоте."));

        warningSignsService.save(new WarningSignsDto("1.19", "https://drive.google.com/file/d/1M3yMzkiG1ASWDvIlzMkWaRMUUf5ANpvi/view?usp=sharing",
                "«Пересечение с круговым движением»", "Устанавливается вне населенных пунктов на расстоянии 150–300 м, в населенных пунктах — на расстоянии 50–100 м до начала опасного участка."));

        warningSignsService.save(new WarningSignsDto("1.20", "https://drive.google.com/file/d/18KRIRFpi1PhE8tMpiLttsFEf361tcNBe/view?usp=sharing",
                "«Пересечение с трамвайными путями»", "Устанавливается в месте пересечения дороги с трамвайными путями на перекрестке с ограниченной обзорностью или вне его"));

        warningSignsService.save(new WarningSignsDto("1.21", "https://drive.google.com/file/d/1hnaRoeb8k7aiskbWS2Gwx86eFnjSGTdf/view?usp=sharing",
                "«Пересечение равнозначных дорог»", "устанавливается вне населенных пунктов на расстоянии 150–300 м, в населенных пунктах — на расстоянии 50–100 м до начала опасного участка."));

        warningSignsService.save(new WarningSignsDto("1.22", "https://drive.google.com/file/d/1CFmJR-pWH4TYr9IwsKOrRWBwXqIuRlM9/view?usp=sharing",
                "«Пересечение со второстепенной дорогой»", "Устанавливается вне населенных пунктов на расстоянии 150–300 м, в населенных пунктах — на расстоянии 50–100 м до начала опасного участка."));

        warningSignsService.save(new WarningSignsDto("1.23.1", "https://drive.google.com/file/d/1I33Iu8-Om9Jt0TkRvtnpr-pqaKuVz-W8/view?usp=sharing",
                "«Примыкание второстепенной дороги(примыкание с правой стороны)", "Изображение примыкания соответствует реальной конфигурации перекрестка."));

        warningSignsService.save(new WarningSignsDto("1.23.2", "https://drive.google.com/file/d/1V2O4bi0lKnJi9qHhzb0mym0oHZ4M8icy/view?usp=sharing",
                "«Примыкание второстепенной дороги»(примыкание с левой стороны)", "Изображение примыкания соответствует реальной конфигурации перекрестка."));

        warningSignsService.save(new WarningSignsDto("1.23.3", "https://drive.google.com/file/d/1lQEU2sHfzOBp8-IeeIauvB6pbChOPj75/view?usp=sharing",
                "«Примыкание второстепенной дороги»(примыкание с правой и левой стороны)", "Изображение примыкания соответствует реальной конфигурации перекрестка. Знак устанавливается, когда расстояние между прилеганиями второстепенных дорог менее 50 м в населенных пунктах и 100 м — вне их."));

        warningSignsService.save(new WarningSignsDto("1.23.4", "https://drive.google.com/file/d/1a6dPKOJOcgj43W1NcOMhR2lu_l9t5X1M/view?usp=sharing",
                "«Примыкание второстепенной дороги»(примыкание с левой і правой стороны)", "Изображение примыкания соответствует реальной конфигурации перекрестка. Знак устанавливается, когда расстояние между прилеганиями второстепенных дорог менее 50 м в населенных пунктах и 100 м — вне их."));

        warningSignsService.save(new WarningSignsDto("1.24", "https://drive.google.com/file/d/1IgqmSoknykEnWlB-Pc0i3Khvfo37xXOd/view?usp=sharing",
                "«Светофорное регулирование»", "Устанавливается перед перекрестком, пешеходным переходом или участком дороги, движение на котором регулируется светофором."));

        warningSignsService.save(new WarningSignsDto("1.25", "https://drive.google.com/file/d/1UB7keWuRZ6UJaTRSNfvSv3SChPelXCHA/view?usp=sharing",
                "«Разводной мост»", "Информирует о приближении к разводному мосту."));

        warningSignsService.save(new WarningSignsDto("1.26", "https://drive.google.com/file/d/1lMTDT2CQgG5tharQTcKT72bUwT98RPis/view?usp=sharing",
                "«Двустороннее движение»", "Устанавливается на начале участка дороги (проезжей части) с встречным движением после одностороннего."));

        warningSignsService.save(new WarningSignsDto("1.27", "https://drive.google.com/file/d/11F9OnuzPbauLeTaIqxAhVXEJjoi5nDkQ/view?usp=sharing",
                "«Железнодорожный переезд со шлагбаумом»", "Устанавливается вне населенных пунктов на расстоянии 150–300 м, в населенных пунктах — на расстоянии 50–100 м до начала опасного участка."));


        warningSignsService.save(new WarningSignsDto("1.28", "https://drive.google.com/file/d/1fI54JLs-5WGA4lFmTshmCEFBKHEtsV0N/view?usp=sharing",
                "«Железнодорожный переезд без шлагбаума»", "Устанавливается вне населенных пунктов на расстоянии 150–300 м, в населенных пунктах — на расстоянии 50–100 м до начала опасного участка."));

        warningSignsService.save(new WarningSignsDto("1.29", "https://drive.google.com/file/d/15ySHI7WMmC23MWvcCLXEmAyw89DN7TDF/view?usp=sharing",
                "«Однопутная железная дорога»", "Обозначает не оборудованный шлагбаумом переезд через железную дорогу с одним путем."));

        warningSignsService.save(new WarningSignsDto("1.30", "https://drive.google.com/file/d/1CjoZYXOVv3zbO8EnTzTCuh4tBsh8VOOw/view?usp=sharing",
                "«Многопутная железная дорога»", "Обозначает не оборудованный шлагбаумом переезд через железную дорогу с двумя и более путями."));

        warningSignsService.save(new WarningSignsDto("1.31.1", "https://drive.google.com/file/d/1tnx1eVsKKt1Y9qpGiZrOC55ZQI6f7ZJq/view?usp=sharing",
                "«Приближение к железнодорожному переезду»(основной)", "Дополнительно предупреждает о приближении к железнодорожному переезду вне населенных пунктов и устанавливается с первым (главным) по ходу движения знаком 1.27 З \"Железнодорожный переезд со шлагбаумом\" или 1.28 \"Железнодорожный переезд без шлагбаума\" на расстоянии 150—300 м к началу опасного участка."));


        warningSignsService.save(new WarningSignsDto("1.31.2", "https://drive.google.com/file/d/1lWJHUy2fMQUVy1hOWQALsHDjVtajyMGi/view?usp=sharing",
                "«Приближение к железнодорожному переезду»(основной)", "Дополнительно предупреждает о приближении к железнодорожному переезду вне населенных пунктов и устанавливается самостоятельно (на равномерном расстоянии между знаками 1.31.1 \"Приближение к железнодорожному переезду\" и 1.31.3  \"Приближение к железнодорожному переезду\")."));

        warningSignsService.save(new WarningSignsDto("1.31.3", "https://drive.google.com/file/d/1mMMzvOZiezCHF-5hOeaJJatimyHHF4oo/view?usp=sharing",
                "«Приближение к железнодорожному переезду»(основной)", "Дополнительно предупреждает о приближении к железнодорожному переезду вне населенных пунктов и устанавливается со вторым по ходу движения знаком 1.27 \"Железнодорожный переезд со шлагбаумом\" или 1.28 \"Железнодорожный переезд без шлагбаума\" на расстоянии 50—100 м к началу опасного участка."));

        warningSignsService.save(new WarningSignsDto("1.31.4", "https://drive.google.com/file/d/1gTVwc1LxDMW0bo2xw7bBXvbT1MZVtDJB/view?usp=sharing",
                "«Приближение к железнодорожному переезду»(дублирующий)", "Дополнительно предупреждает о приближении к железнодорожному переезду вне населенных пунктов и устанавливается с первым (главным) по ходу движения знаком 1.27 З \"Железнодорожный переезд со шлагбаумом\" или 1.28 \"Железнодорожный переезд без шлагбаума\" на расстоянии 150—300 м к началу опасного участка."));

        warningSignsService.save(new WarningSignsDto("1.31.5", "https://drive.google.com/file/d/16CaUQHUhdBHz4qkRkUQ6huL6UtO6mMyV/view?usp=sharing",
                "«Приближение к железнодорожному переезду»(дублирующий)", "Дополнительно предупреждает о приближении к железнодорожному переезду вне населенных пунктов и устанавливается самостоятельно (на равномерном расстоянии между знаками 1.31.4 \"Приближение к железнодорожному переезду\" и 1.31.6  \"Приближение к железнодорожному переезду\") на левой стороне проезжей части."));

        warningSignsService.save(new WarningSignsDto("1.31.6", "https://drive.google.com/file/d/199ELGpz684OCGMsGRLu2R2EbLYLUF2n7/view?usp=sharing",
                "«Приближение к железнодорожному переезду»(дублирующий)", "дополнительно предупреждает о приближении к железнодорожному переезду вне населенных пунктов и устанавливается на левой стороне проезжой части со вторым (дублирующим) знаком 1.27  \"Железнодорожный переезд со шлагбаумом\" или 1.28 \"Железнодорожный переезд без шлагбаума\" на расстоянии 50—100 м к началу опасного участка."));

        warningSignsService.save(new WarningSignsDto("1.32", "https://drive.google.com/file/d/12zknUxaDBhJGkrqCo3Q1vjPMwwIjg1El/view?usp=sharing",
                "«Пешеходный переход»", "Информирует о приближении к нерегулируемому пешеходному переходу, обозначенному соответствующими дорожными знаками или дорожной разметкой."));

        warningSignsService.save(new WarningSignsDto("1.33", "https://drive.google.com/file/d/1rFvO6P-XSMz8TFjxK8O62oLfxtypAP1w/view?usp=sharing",
                "«Дети»", "Устанавливается перед участком дороги, на котором возможно появление детей с территории детского учреждения (дошкольное учреждение, школа, оздоровительный лагерь и т.п.), прилегающего непосредственно к дороге."));

        warningSignsService.save(new WarningSignsDto("1.34", "https://drive.google.com/file/d/1Lu77XWcvt1735a-fucvWfCktlxhRHDjQ/view?usp=sharing",
                "«Выезд велосипедистов»", "Устанавливается перед участком дороги, на котором возможно появление велосипедистов, или место пересечения с велосипедной дорожкой вне перекрестка."));

        warningSignsService.save(new WarningSignsDto("1.35", "https://drive.google.com/file/d/16CaUQHUhdBHz4qkRkUQ6huL6UtO6mMyV/view?usp=sharing",
                "«Перегон скота»", "Устанавливается перед участком дороги, на котором возможно появление скота."));

        warningSignsService.save(new WarningSignsDto("1.36", "https://drive.google.com/file/d/1jFEq9O-wLgNEi1Y0AtJxbFzKp2SQXkJE/view?usp=sharing",
                "«Дикие животные»", "Устанавливается перед участком дороги, на котором возможно появление диких животных."));

        warningSignsService.save(new WarningSignsDto("1.37", "https://drive.google.com/file/d/13F56s2c82-ZUM9dVIBLMNNwsgogq7-i5/view?usp=sharing",
                "«Дорожные работы»", "Устанавливается перед участком дороги, на котором проводятся дорожные работы."));

        warningSignsService.save(new WarningSignsDto("1.38", "https://drive.google.com/file/d/1nHn0ygR9GLFQYJfKfAxF0lCngFWIsw6H/view?usp=sharing",
                "«Заторы в дорожном движении»", "Устанавливается перед участком дороги, где сужение проезжей части служит причиной заторов в дорожном движении вследствие выполнения дорожных работ или по иным причинам."));

        warningSignsService.save(new WarningSignsDto("1.39", "https://drive.google.com/file/d/1zxjni7oKpcXudhzH7ZKuHvuuEpfnVICK/view?usp=sharing",
                "«Иная опасность (аварийно-опасный участок)»", "Устанавливается перед опасным участком дороги в местах, где ширина проезжей части, радиусы закруглений и т.п. не соответствуют требованиям строительных норм, а также предупрежается о приближении к  месту или участку концентрации дорожно-транспортных происшествий."));


        warningSignsService.save(new WarningSignsDto("1.40", "https://drive.google.com/file/d/1ZprFk1zSoIlUBuN9LzFgQxJ0plDFiF4L/view?usp=sharing",
                "«Конец дороги с усовершенствованным покрытием»", "Информирует про переход дороги с усовершенствованным покрытием в гравийную или грунтовую дорогу."));

        prioritySignsService.save(new PrioritySignsDto("2.1", "https://drive.google.com/file/d/1ze1GIJ2aE3vnuctZlBbJc2Dg37nZAqOt/view?usp=sharing",
                "«Уступить дорогу»", "Водитель должен уступить дорогу транспортным средствам, которые подъезжают к нерегулируемому перекрестку по главной дороге, а при наличии таблички 7.8 транспортным средствам, движущимся по главной дороге."));

        prioritySignsService.save(new PrioritySignsDto("2.2", "https://drive.google.com/file/d/1IR3KSdmk5zCazhGj4XlG3cB23mrANctQ/view?usp=sharing",
                "«Проезд без остановки запрещен»", "Запрещает проезд без остановки перед разметкой 1.12 (стоп-линия), а если она отсутствует — перед знаком."));

        prioritySignsService.save(new PrioritySignsDto("2.3", "https://drive.google.com/file/d/1FBnCs6SOvJektrGlvTH26fAjUWeoySKm/view?usp=sharing",
                "«Главная дорога»", "Предоставляет право первоочередного проезда нерегулируемых перекрестков."));

        prioritySignsService.save(new PrioritySignsDto("2.4", "https://drive.google.com/file/d/1kqDb402KzUAFjxovkkF0CFMSsOINj6c3/view?usp=sharing",
                "«Конец главной дороги»", "Отменяет право первоочередного проезда нерегулируемых перекрестков."));

        prioritySignsService.save(new PrioritySignsDto("2.5", "https://drive.google.com/file/d/1s2xFhuTscBbibkWQrLOw4WagVfFQLNJR/view?usp=sharing",
                "«Преимущество встречного движения»", "Запрещает въезд на узкий участок дороги, если это может затруднить встречное движение. Водитель должен уступить дорогу встречным транспортным средствам, которые находятся на узком участке."));

        prioritySignsService.save(new PrioritySignsDto("2.6", "https://drive.google.com/file/d/1pdPucp4UVBXkNrSxAywaze46R0DuN2QB/view?usp=sharing",
                "«Преимущество перед встречным движением»", "Устанавливается перед узким участком дороги, во время движения на котором водитель имеет преимущество относительно встречных транспортных средств."));


        prohibitionSignsService.save(new ProhibitionSignsDto("3.1", "https://drive.google.com/file/d/16C6rWmkBeRRxgs7FDYgpW0yCmO8N00W2/view?usp=sharing",
                "«Движение запрещено»", "Запрещает движение всех транспортных средств в случаях, когда:\n" +
                "\n" +
                "Начало пешеходной зоны обозначено знаком 5.33 + \n" +
                "дорога и (или) улица находится в аварийном состоянии и непригодна для движения транспортных средств; в таком случае обязательно дополнительно устанавливается знак 3.43" +
                "\n" +
                "       Не распространяется действие знака:\n" +
                "\n" +
                "на транспортные средства, движущиеся по установленным маршрутам;"));



        prohibitionSignsService.save(new ProhibitionSignsDto("3.2", "https://drive.google.com/file/d/18ToU6f6GnWyiaO6RrIKuNSKL8vZ5bWJW/view?usp=sharing","«Движение механических транспортных средств запрещено»","Запрещает движение всех механических средств.\n" +
                "\n" +
                "Действие знака распространяется на тракторы, самоходные машины и механизмы, а также троллейбусы и транспортные средства с электродвигателем мощностью свыше 3 кВт"));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.3", "https://drive.google.com/file/d/1QlDCwLwuAqDmxBYhwmCQyJZ7AK6ln34e/view?usp=sharing","«Движение грузовых автомобилей запрещено»","Запрещает движение грузовых автомобилей и составов транспортных средств с разрешенной максимальной массой свыше 3,5 т (если на знаке не указанная масса) или превышающей указанную на знаке, а также тракторов, самоходных машин и механизмов.\n" +
                "\n" +
                "       Не распространяется действие знака:\n" +
                "\n" +
                "на транспортные средства, которые обслуживают граждан или принадлежат гражданам, проживающих или работающих в этой зоне, а также на транспортные средства, которые обслуживают предприятия, расположенные в обозначенной зоне. В таких случаях транспортные средства должны въезжать в обозначенную зону и выезжать из нее на ближайшем к месту назначения перекрестке;"));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.4", "https://drive.google.com/file/d/1qBzzhptGSrSVNzKFnVdFPDkP4jYAFdPm/view?usp=sharing","«Движение с прицепом запрещено»","Запрещает движение грузовых автомобилей и тракторов с прицепами любого типа, а также буксировку механических транспортных средств."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.5", "https://drive.google.com/file/d/1YkJ9eBmWN0HVxrRbYTRkyHskuMa12pQd/view?usp=sharing","«Движение тракторов запрещено»","Запрещает движение тракторов, самоходных машин и механизмов."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.6", "https://drive.google.com/file/d/18hCvPvf9YSqua2er33pEwqjK2sJCT2XJ/view?usp=sharing","«Движение мотоциклов запрещено»","Запрещает движение мотоциклов."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.7", "https://drive.google.com/file/d/1fFdSsTGe83f1FVB66eYetkb4TQMmdGON/view?usp=sharing","«Движение на мопедах запрещено»","Запрещает движение на мопедах и велосипедах с подвесным двигателем."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.8", "https://drive.google.com/file/d/1NskMU2TIwlW0w9eRBc0ouM450SOpzXpn/view?usp=sharing","«Движение на велосипедах запрещено»","Запрещает движение на велосипедах."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.9", "https://drive.google.com/file/d/1CCBUB3PnIglECYbBq5jfTff9Lf5R1LWJ/view?usp=sharing","«Движение пешеходов запрещено»","Запрещает движение пешеходов."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.10", "https://drive.google.com/file/d/18HHs9TDMKPEhqkv3yYcT43BQ4mUDH79n/view?usp=sharing","«Движение с ручными тележками запрещено»","Запрещает движение с ручными тележками."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.11", "https://drive.google.com/file/d/1597f914DDE9Qb3POtSWEUX6LWYyDrl6I/view?usp=sharing","«Движение гужевых телег (саней) запрещено»","Запрещает движение гужевых телег (саней), животных под седлом или вьюнком, а также прогон скота."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.12", "https://drive.google.com/file/d/1h5gcteVJW1aKfsM0Y6cFPkMlPixkQQe8/view?usp=sharing","«Движение транспортных средств, перевозящих опасные грузы, запрещено»","Запрещает движение транспортных средств, перевозящих опасные грузы."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.13", "https://drive.google.com/file/d/1YHSvsVJU3WibPwXXYC9vmCEABYTFiwQz/view?usp=sharing","«Движение транспортных средств, перевозящих взрывчатку, запрещено»","Запрещает движение транспортных средств, перевозящих взрывчатые вещества."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.14", "https://drive.google.com/file/d/170H50hH0oXA1EKeLbT4EfqdsdInLfgUs/view?usp=sharing","«Движение транспортных средств, перевозящих вещества, которые загрязняют воду, запрещено»","Запрещает движение транспортных средств, перевозящих вещества, которые загрязняют воду."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.15", "https://drive.google.com/file/d/1napZEFdNq6M0VtjRbtsvad08ARnk4Jgz/view?usp=sharing","«Движение транспортных средств, масса которых превышает ... т, запрещено»","Запрещает движение транспортных средств, в том числе их составов, общая фактическая масса которых превышает указанную на знаке."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.16", "https://drive.google.com/file/d/1EgnnBLGNr2Dv30c6CCY4TGts2bQ7LpIw/view?usp=sharing","«Движение транспортных средств, нагрузка на ось которых превышает ... т, запрещено»","Запрещает движение транспортных средств, у которых фактическая нагрузка на любую ось больше указанной на знаке."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.17", "https://drive.google.com/file/d/1x6wMfbbEnNMYhsMMjQt6xzALfz1DTQcK/view?usp=sharing","«Движение транспортных средств, ширина которых превышает ... м, запрещено»","Запрещает движение транспортных средств, габаритная ширина которых (с грузом или без него) больше указанной на знаке."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.18", "https://drive.google.com/file/d/1E0ghCqoQ3F9G65PK2aN6bCcVyV2o2t7x/view?usp=sharing","«Движение транспортных средств, высота которых превышает ... м, запрещено»","Запрещает движение транспортных средств, габаритная высота которых (с грузом или без него) больше указанной на знаке."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.19", "https://drive.google.com/file/d/1I9xgmSoiPUtFy3326S9fnSjRdnf4nVEZ/view?usp=sharing","«Движение транспортных средств, длина которых превышает ... м, запрещено»","Запрещает движение транспортных средств, габаритная длина которых (с грузом ли без него) больше указанной на знаке."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.20", "https://drive.google.com/file/d/1GrQDAZYa0ysObgNTIGZSLaeGkM4XHpxo/view?usp=sharing","«Движение транспортных средств без соблюдения дистанции ... м запрещено»","Запрещает движение транспортных средств с дистанцией между ними меньше указанной на знаке."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.21", "https://drive.google.com/file/d/1jGAPitPgGAZSVu7rQi4Hujq4UiUNt7wQ/view?usp=sharing","«Въезд запрещен»","запрещает въезд всех транспортных средств с целью:\n" +
                "\n" +
                "• предотвращения встречного движения транспортных средств на участках дорог с односторонним движением;\n" +
                "\n" +
                "• предотвращения выезда транспортных средств навстречу общему потоку на дорогах, обозначенных знаком 5.8 \"Дорога с полосой для движения маршрутных транспортных средств\";\n" +
                "\n" +
                "• организации обособленного въезда и выезда на площадках, используемых для стоянки транспортных средств, площадках отдыха, автозаправочных станций и т.п.;\n" +
                "\n" +
                "• предотвращения въезда на отдельную полосу движения, при этом знак 3.21 должен применяться вместе с табличкой 7.9"));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.22", "https://drive.google.com/file/d/1A0wMvBlffkxNiFgt178aTZXjqaaJsjfk/view?usp=sharing","«Поворот направо запрещен»","Запрещает поворот направо."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.23", "https://drive.google.com/file/d/1mpxJCyfD82BkFUFUfczZVM9dovZqJOs4/view?usp=sharing","«Поворот налево запрещен»","Запрещает поворот налево."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.24", "https://drive.google.com/file/d/10j65T4sfHltzXQmznndF52A3FdS6nOaw/view?usp=sharing","«Разворот запрещен»","Запрещает разворот транспортных средств. При этом поворот налево разрешается."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.25", "https://drive.google.com/file/d/1TwrtAHw5FTmZM87ENjiIliu2iVuoqdRr/view?usp=sharing","«Обгон запрещен»","Запрещает обгон всех транспортных средств, кроме одиночных, движущихся со скоростью менее 30 км/ч (одиночными считаются единичные транспортные средства, автопоезда, а также буксирующее транспортное средство в сцеплении с буксируемым)."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.26", "https://drive.google.com/file/d/17z4ilR5HvrCLK4BR2zBmvtljoWnKCqIs/view?usp=sharing","«Конец запрещения обгона»","Отменяет запрещение обгона всех транспортных средств."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.27", "https://drive.google.com/file/d/17i5IkLYAEkyju4rGanKw9EzlVFSVXE7G/view?usp=sharing","«Обгон грузовым автомобилям запрещен»","Запрещает грузовым автомобилям с разрешенной максимальной массой свыше 3,5 т обгонять все транспортные средства (кроме одиночных, движущихся со скоростью менее 30 км/ч). Тракторам запрещается обгон всех транспортных средств, кроме одиночных велосипедов, гужевых повозок (саней)."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.28", "https://drive.google.com/file/d/1gZQsSSv2CZNDTCbODRae22fURrfXluLB/view?usp=sharing","«Конец запрещения обгона грузовым автомобилям»","Отменяет запрещение обгона грузовым автомобилям с разрешенной максимальной массой свыше 3,5 т."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.29", "https://drive.google.com/file/d/1kYyTHimedwrhuZmuaXLa6KXuJ3ojHb9t/view?usp=sharing","«Ограничение максимальной скорости»","Запрещает движение со скоростью, которая превышает указанную на знаке."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.30", "https://drive.google.com/file/d/1khEzKY4VH22PSpd2HJ9d8cC1ZyRoAbfz/view?usp=sharing","«Конец ограничения максимальной скорости»","Отменяет ограничение максимальной скорости."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.31", "https://drive.google.com/file/d/1RAp1hybbeDyiMAPuAmIiEI3tGT00p3fN/view?usp=sharing","«Зона ограничения максимальной скорости»","Запрещает в зоне (населенный пункт, микрорайон, зона отдыха и т.п.) движение со скоростью, превышающей указанную на знаке."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.32", "https://drive.google.com/file/d/1QqW0X4nnu8DRyUGHuG8RO13Od9O6pmK2/view?usp=sharing","«Конец зоны ограничения максимальной скорости»","Отменяет действие знака 3.31"));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.33", "https://drive.google.com/file/d/13zGksjWr3ZZ68BcpBEBhYRcPzLpneJe9/view?usp=sharing","«Подачу звукового сигнала запрещено»","Запрещает пользоваться звуковыми сигналами, кроме случаев, когда без этого невозможно предотвратить дорожно-транспортное происшествие."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.34", "https://drive.google.com/file/d/1m0XF1LBAvWeVlvhJRHhEjQoWimYpQz7q/view?usp=sharing","«Остановка запрещена»","Запрещает остановку и стоянку транспортных средств, кроме такси, осуществляющего посадку или высадку пассажиров (выгрузку или погрузку груза)."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.35", "https://drive.google.com/file/d/1sGOuQsIsuJgnrWLL7FEjH9qBCnfSvg31/view?usp=sharing","«Стоянка запрещена»","Запрещает стоянку всех транспортных средств."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.36", "https://drive.google.com/file/d/1H6JjHLhTP6inADBELrFeYO2m8XWwDfLI/view?usp=sharing","«Стоянка запрещена по нечетным числам месяца»","Запрещает стоянку транспортных средств по нечетным числам месяца."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.37", "https://drive.google.com/file/d/1Yledeoro9Gl5AUOJyyp7CusNqAkGtrUC/view?usp=sharing","«Стоянка запрещена по четным числам месяца»","Запрещает стоянку транспортных средств по четным числам месяца."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.38", "https://drive.google.com/file/d/1LDzCENwp19AA5yGfVGlW8WIVUU3cMYLw/view?usp=sharing","«Зона ограниченной стоянки»","Определяет территорию в населенном пункте, на которой продолжительность стоянки ограничена независимо от того, взимается ли за это плата."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.39", "https://drive.google.com/file/d/1KHniJ0Ed5zDxRp4eIqH1ut29cgvsN4Zg/view?usp=sharing","«Конец зоны ограниченной стоянки»","Обозначает конец зоны ограниченной стоянки."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.40", "https://drive.google.com/file/d/1vzTieecnsOkCqxiX40rJBZTxpH9x7jOw/view?usp=sharing","«Таможня»","Запрещает проезд без остановки возле таможни и устанавливается непосредственно перед въездом на территорию таможни."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.41", "https://drive.google.com/file/d/1IYG3yZPyFOGmCMgS5n3vwz3JsowVnSXt/view?usp=sharing","«Контроль»","Запрещает проезд без остановки перед контрольными пунктами (пост Национальной полиции, карантинный пост, пограничная зона, закрытая территория, пункт оплаты проезда на платных дорогах и т.п.)."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.42", "https://drive.google.com/file/d/1x9ZZSGJ4uVTgNpkJS2Px9Dd9E7LfD3Jc/view?usp=sharing","«Конец всех запретов и ограничений»","определяет одновременно конец действия всех запретов и ограничений, которые введены запрещающими дорожными знаками 3.20 Знак 3.20 \"Движение транспортных средств без соблюдения дистанции... м запрещено\", 3.25  \"Обгон запрещен\", 3.27  \"Обгон грузовым автомобилям запрещен\", 3.29  \"Ограничение максимальной скорости\", 3.33 , 3.34 , 3.35 , 3.36 , 3.37 ."));

        prohibitionSignsService.save(new ProhibitionSignsDto("3.43", "https://drive.google.com/file/d/1AunWluA5bh6feYWGEajbgws8LpPZy3Va/view?usp=sharing","«Опасность»","Запрещает движение всех без исключения пользователей дорог, улиц, железнодорожных переездов в связи с дорожно-транспортным происшествием, аварией, проявлением стихийного бедствия или другой опасностью для движения (оползень, падение камней, сильный снегопад, наводнение и т.п.)."));

        mandatorySignsService.save(new MandatorySignsDto("4.1","https://drive.google.com/file/d/1GUeAFSme1MiJdxu4Ond1JEYIvJVOSMdz/view?usp=sharing","«Движение прямо»","Разрешает движение только прямо."));

        mandatorySignsService.save(new MandatorySignsDto("4.2","https://drive.google.com/file/d/12nxBZCa64qCnoSXcXaR9p12fwSvNMsCN/view?usp=sharing","«Движение направо»","Разрешает движение только направо."));

        mandatorySignsService.save(new MandatorySignsDto("4.3","https://drive.google.com/file/d/1XYDH1TgKZ8RYokAG5QnYXtVdxoviCoSs/view?usp=sharing","«Движение налево»","Разрешает движение только налево."));

        mandatorySignsService.save(new MandatorySignsDto("4.4","https://drive.google.com/file/d/1CG35s9FKY5RsbaPKFoJDyJ8Mzi6cifZ0/view?usp=sharing","«Движение прямо или направо»","Разрешает движение только прямо или направо.Знак разрешает также разворот транспортных средств."));

        mandatorySignsService.save(new MandatorySignsDto("4.5","https://drive.google.com/file/d/1MYpCq5DKNvUVqtYcIhmwdRbemoA2w6vD/view?usp=sharing","«Движение прямо или налево»","Разрешает движение только прямо или налево. Знак разрешает также разворот транспортных средств."));

        mandatorySignsService.save(new MandatorySignsDto("4.6","https://drive.google.com/file/d/1Uve3kTWuuIcgmVPWnyNh8C9hvp7mLEpq/view?usp=sharing","«Движение направо или налево»","Разрешает движение только направо или налево. Знак разрешает также разворот транспортных средств."));

        mandatorySignsService.save(new MandatorySignsDto("4.7","https://drive.google.com/file/d/1EfSlZnYngCYjQ8F1YngIgvenPKBFCkCZ/view?usp=sharing","«Объезд препятствия с правой стороны»","Применяется, чтобы зазначить, что объезд островков безопасности и разнообразных препятствий, которые находяться на проезжей части, разрешается с правой стороны."));

        mandatorySignsService.save(new MandatorySignsDto("4.8","https://drive.google.com/file/d/1mc9QVRJGZMgFMlQlAvqmsXw5ejeVxpIh/view?usp=sharing","«Объезд препятствия с левой стороны»","Применяется, чтобы зазначить, что объезд островков безопасности и разнообразных препятствий, которые находяться на проезжей части, разрешается с левой стороны."));

        mandatorySignsService.save(new MandatorySignsDto("4.9","https://drive.google.com/file/d/132w3m4iHwhhpJa6wqrIV1Fz0Z2SK5wv3/view?usp=sharing","«Объезд препятствия с правой или левой стороны»","Применяется, чтобы зазначить, что объезд островков безопасности и разнообразных препятствий, которые находяться на проезжей части, разрешается с правой или левой стороны."));

        mandatorySignsService.save(new MandatorySignsDto("4.10","https://drive.google.com/file/d/1oJmGCxdBQsM1C9BNUV31DuRqLHzngnuz/view?usp=sharing","«Круговое движение»","Требует объезда клумбы (центрального островка) в направлении, показанном стрелками на перекрестке с круговым движением."));

        mandatorySignsService.save(new MandatorySignsDto("4.11","https://drive.google.com/file/d/1qHgsa8bf3VtOAYq2iBnHpluMvZKlQSSr/view?usp=sharing","«Движение легковых автомобилей»","Разрешает движение только легковых автомобилей, автобусов, мотоциклов, маршрутных транспортных средств и грузовых автомобилей, разрешенная максимальная масса которых не превышает 3,5 т."));

        mandatorySignsService.save(new MandatorySignsDto("4.12","https://drive.google.com/file/d/1uNSPe0nkIYpFI2fXPpRsM3VWLmzxRAax/view?usp=sharing","«Дорожка для велосипедистов»","Разрешает движение только на велосипедах. Если нет тротуара или пешеходной дорожки, разрешается также движение пешеходов."));

        mandatorySignsService.save(new MandatorySignsDto("4.13","https://drive.google.com/file/d/1lOkFskbabAt9uk67kvcKwTPRWk3kpyqe/view?usp=sharing","«Дорожка для пешеходов»","Разрешает движение только пешеходов."));

        mandatorySignsService.save(new MandatorySignsDto("4.14","https://drive.google.com/file/d/1MPGRs6VeCMjqihpZhBRc7AbFBypN7Vm2/view?usp=sharing","«Дорожка для пешеходов и велосипедистов»","Разрешает движение только пешеходов и велосипедистов."));

        mandatorySignsService.save(new MandatorySignsDto("4.15","https://drive.google.com/file/d/1NkeXY5mZCRDZT7sO6xsoKQJadG79ZL77/view?usp=sharing","«Дорожка для всадников»","Разрешает движение только всадников."));

        mandatorySignsService.save(new MandatorySignsDto("4.16","https://drive.google.com/file/d/1NZHr8XzKxluWzdqZ18x8Q500v0DnlrrM/view?usp=sharing","«Ограничение минимальной скорости»","Разрешает движение с не меньшей скоростью, чем указано на знаке, но и не большей, чем это предусмотрено пунктами 12.4, 12.5, 12.6, 12.7 этих Правил."));

        mandatorySignsService.save(new MandatorySignsDto("4.17","https://drive.google.com/file/d/1ZRwV88YoSmCq3MzssKEVjds8yx42eEXE/view?usp=sharing","«Конец ограничения минимальной скорости»","Применяется для обозначения конца зоны действия знака 4.16"));

        mandatorySignsService.save(new MandatorySignsDto("4.18.1","https://drive.google.com/file/d/1rPVtHxFCIG4MRDLeXQqbOy3Ig4uPb4zA/view?usp=sharing","«Направление движения транспортных средств с опасными грузами»","Показывает разрешенное направление движения (прямо) транспортных средств с опознавательным знаком Опознавательный знак \"Знак опасности\"."));

        mandatorySignsService.save(new MandatorySignsDto("4.18.2","https://drive.google.com/file/d/1HWdju3sJLcQN6ZtLso8Bkc876STa1wpY/view?usp=sharing","«Направление движения транспортных средств с опасными грузами»","Показывает разрешенное направление движения (направо) транспортных средств с опознавательным знаком Опознавательный знак \"Знак опасности\"."));

        mandatorySignsService.save(new MandatorySignsDto("4.18.3","https://drive.google.com/file/d/1DfLEThrI4VdFsWJk1JoCqLRX3o8ehiUf/view?usp=sharing","«Направление движения транспортных средств с опасными грузами»","Показывает разрешенное направление движения (налево) транспортных средств с опознавательным знаком Опознавательный знак \"Знак опасности\"."));


        informationSignsService.save(new InformationSignsDto("5.1", "https://drive.google.com/file/d/1R9YgqBqSBy4kVC3alvTo1RTmLqFJhfiW/view?usp=sharing", "«Автомагистраль»",
                "Применяется для обозначения дорог, на которых установлено соответствующие режимы движения в соответствии с разделом 27 этих Правил. Знак устанавливается в начале автомагистрали."));

        informationSignsService.save(new InformationSignsDto("5.2", "https://drive.google.com/file/d/1HjaOoOxw8MEVBETycqvlbv0OIsrYgzF7/view?usp=sharing", "«Конец автомагистрали»",
                "Применяется для обозначения конца автомагистрали. Знак устанавливается в конце автомагистрали и на начале съездов с нее, а также предварительно с табличкой 7.1.1 \"Расстояние к объекту\" на расстоянии 400 и 1000 м от конца автомагистрали."));

        informationSignsService.save(new InformationSignsDto("5.3", "https://drive.google.com/file/d/1DTQukQI5lbThojAxKnprpJPhvmOVMnTU/view?usp=sharing", "«Дорога для автомобилей»",
                "Применяется для обозначения дороги, предназначенной только для движения автомобилей, автобусов и мотоциклов, и на которой действуют особые условия дорожного движения, предусмотренные разделом 27 данных Правил (за исключением пункта 27.3 данных Правил)."));

        informationSignsService.save(new InformationSignsDto("5.4", "https://drive.google.com/file/d/1qeA4BWkufE7H2fL4PbIDZmbY1dLNSouu/view?usp=sharing", "«Конец дороги для автомобилей»",
                "Применяется для обозначения конца дороги, обозначенной знаком 5.3."));

        informationSignsService.save(new InformationSignsDto("5.5", "https://drive.google.com/file/d/1yJbzSvrnUxuE12zADXddYmEPq3v_ABbS/view?usp=sharing", "«Дорога с односторонним движением»",
                "Применяется для обозначения дороги или отделенной проезжей части, по которой движение транспортных средств по всей ширине осуществляется только в одном направлении."));

        informationSignsService.save(new InformationSignsDto("5.6", "https://drive.google.com/file/d/1vD4wjTi21gRKOeou7COrDVYk9aUMB4st/view?usp=sharing", "«Конец дороги с односторонним движением»",
                "Применяется для обозначения конца дороги или проезжей части, обозначенной знаком 5.5."));

        informationSignsService.save(new InformationSignsDto("5.7.1", "https://drive.google.com/file/d/1PpYHRdM8580DIef2caOFkqVRf9x5Xcdq/view?usp=sharing", "«Выезд на дорогу с односторонним движением»",
                "Указывает направление движения на пересекаемой дороге, если на ней организованно одностороннее движение. Движение транспортных средств по этой дороге или проезжей части разрешается только в направлении показанном стрелкой."));

        informationSignsService.save(new InformationSignsDto("5.7.2", "https://drive.google.com/file/d/1x4Eq2Hqjcoo35hNw7Nujtw2NhPP_PHPA/view?usp=sharing", "«Выезд на дорогу с односторонним движением»",
                "Указывает направление движения на пересекаемой дороге, если на ней организованно одностороннее движение. Движение транспортных средств по этой дороге или проезжей части разрешается только в направлении показанном стрелкой."));

        informationSignsService.save(new InformationSignsDto("5.8", "https://drive.google.com/file/d/1wgNFqdEQcR7TMsG5ssmiGVEH5BO0ZE70/view?usp=sharing", "«Дорога с полосой для движения маршрутных транспортных средств»",
                "Применяется для обозначения дороги, на которой движение транспортных средств осуществляется по установленному маршруту по специально отведенной полосе навстречу общему потоку транспортных средств."));

        informationSignsService.save(new InformationSignsDto("5.9", "https://drive.google.com/file/d/1XGgq2HEiQyagBVKLWPYol2vf1Tz90PQl/view?usp=sharing", "«Конец дороги с полосой для движения маршрутных транспортных средств»",
                "Применяется для обозначения конца действия знака 5.8 \"Дорога с полосой для движения маршрутных транспортных средств\"."));

        informationSignsService.save(new InformationSignsDto("5.10.1", "https://drive.google.com/file/d/12jQP6kT0rN3R32YflgRMZedLfj7DGlzh/view?usp=sharing", "«Выезд на дорогу с полосой для движения маршрутных транспортных средств»",
                "Применяется для обозначения выезда на дорогу, где движение транспортных средств, движущиеся установленными маршрутами, осуществляется специально выделенной полосой навстречу общему потоку транспортных средств, и устанавливается перед всеми боковыми выездами на дорогу."));

        informationSignsService.save(new InformationSignsDto("5.10.2", "https://drive.google.com/file/d/12ki6bBS9ulJwtjZ1D8qvwKtuoTtandwY/view?usp=sharing", "«Выезд на дорогу с полосой для движения маршрутных транспортных средств»",
                "Применяется для обозначения выезда на дорогу, где движение транспортных средств, движущиеся установленными маршрутами, осуществляется специально выделенной полосой навстречу общему потоку транспортных средств, и устанавливается перед всеми боковыми выездами на дорогу."));

        informationSignsService.save(new InformationSignsDto("5.11", "https://drive.google.com/file/d/13AsruObW0yNUvmfmaAv7GsKyGCWvePsQ/view?usp=sharing", "«Полоса для движения маршрутных транспортных средств»",
                "Применяется для обозначения полосы, которая предназначена только для транспортных средств, движущихся по установленным маршрутам, если движение по такой полосе осуществляется попутно с общим потоком транспортных средств. Действие знака распространяется на полосу движения, над которой он установлен. Если знак установлен справа от дороги, его действие распространяется на правую полосу движения."));

        informationSignsService.save(new InformationSignsDto("5.12", "https://drive.google.com/file/d/1ltCv9ffG2chQKa8vy4DjYXZVab4JG3PL/view?usp=sharing", "«Конец полосы для движения маршрутных транспортных средств»",
                "Применяется для обозначения конца полосы, обозначенной знаком 5.11"));

        informationSignsService.save(new InformationSignsDto("5.13", "https://drive.google.com/file/d/1be6yl5lGKSPHBtzSHvwfYZfoeqJ1N6Kh/view?usp=sharing", "«Дорога с реверсивным движением»",
                "Применяется для обозначения начала участка дороги, на котором по одной или нескольких полосах направление движения может изменяться на противоположный."));

        informationSignsService.save(new InformationSignsDto("5.14", "https://drive.google.com/file/d/1X2tdsDwkPt2DyrpRnLLxWW0trTUbKtL6/view?usp=sharing", "«Конец дороги с реверсивным движением»",
                "Применяется для обозначения конца дороги, обозначенной знаком 5.13"));

        informationSignsService.save(new InformationSignsDto("5.15", "https://drive.google.com/file/d/18NCUVlv7TDPGntt4PqLJqXn6kPiYUsY5/view?usp=sharing", "«Выезд на дорогу с реверсивным движением»",
                "Применяется для обозначения выезда на дорогу, обозначенной знаком 5.13 \"Дорога с реверсивным движением\" и устанавливается на всех боковых выездах."));

        informationSignsService.save(new InformationSignsDto("5.16", "https://drive.google.com/file/d/1hFQly7xzY12sOPxrdPrfXr0V4dswxuj0/view?usp=sharing", "«Направления движения по полосам»",
                "Показывает количество полос на перекрестке и разрешенные направления движения по каждой из них."));

        informationSignsService.save(new InformationSignsDto("5.17.1", "https://drive.google.com/file/d/1H67uXvDX2lispihf1EQVbZuwKhch8VBi/view?usp=sharing", "«Направления движения по полосам»",
                "С соответствующим количеством стрелок применяется на дорогах, которые имеют три полосы и более, когда в каждом направлении насчитывается неодинаковое количество полос движения. При помощи этого знака со сменным изображением организовывается реверсивное движение."));

        informationSignsService.save(new InformationSignsDto("5.17.2", "https://drive.google.com/file/d/15lWsltPHbGE2GmC9M59Nqcr34WC03xpj/view?usp=sharing", "«Направления движения по полосам»",
                "С соответствующим количеством стрелок применяется на дорогах, которые имеют три полосы и более, когда в каждом направлении насчитывается неодинаковое количество полос движения. При помощи этого знака со сменным изображением организовывается реверсивное движение."));

        informationSignsService.save(new InformationSignsDto("5.18", "https://drive.google.com/file/d/1vFnt3R9OOIa4A5O5ocBa0Wgr3Y0Ak1UY/view?usp=sharing", "«Направление движения по полосе»",
                "Показывает разрешенное направление движения по полосе. Знак со стрелкой, которая изображает поворот налево иным образом, чем это предусмотрено данными Правилами, означает, что на данном перекрестке поворот налево или разворот осуществляется с выездом за пределы перекрестка направо и объездом клумбы (разделительного островка) в направлении показанном стрелкой"));

        informationSignsService.save(new InformationSignsDto("5.19", "https://drive.google.com/file/d/1KW0E8lIFoBDcpTyiossKcS5J6FMk0Mzf/view?usp=sharing", "«Использование полосы движения»",
                "Информирует водителей об использовании полосы для движения только определенных видов транспортных средств в указанных направлениях. Если на знаке изображен знак, который запрещает или разрешает движение любым транспортным средствам, движение этих транспортных средств по ней соответственно запрещается или разрешается."));

        informationSignsService.save(new InformationSignsDto("5.20.1", "https://drive.google.com/file/d/120DBJMpylSv1GKW6PfRdc2sxc29xXfMx/view?usp=sharing", "«Начало дополнительной полосы движения»",
                "Информирует о начале дополнительной полосы движения на подъеме или полосы торможения."));

        informationSignsService.save(new InformationSignsDto("5.20.2", "https://drive.google.com/file/d/1AXwPNvaVDVisZ88JcY7p9X1kIrBOkcod/view?usp=sharing", "«Начало дополнительной полосы движения»",
                "Информирует о начале дополнительной полосы движения на подъеме или полосы торможения."));

        informationSignsService.save(new InformationSignsDto("5.20.3", "https://drive.google.com/file/d/1GNRu6ew0PCj32Yay9vZtuiaT7NchNkiB/view?usp=sharing", "«Начало дополнительной полосы движения»",
                "Информирует о начале дополнительной полосы движения слева на подъеме или начало полосы торможения перед перекрестком для поворота налево или разворота."));

        informationSignsService.save(new InformationSignsDto("5.21.1", "https://drive.google.com/file/d/1BUrP8M5BgAJhgtqmrA4PykkdQj013MxT/view?usp=sharing", "«Конец дополнительной полосы движения»",
                "Указывает на конец дополнительной полосы или полосы разгона."));

        informationSignsService.save(new InformationSignsDto("5.21.2", "https://drive.google.com/file/d/1klSxobwFgrRXgPP7gZGXlcwQbHB9rGtl/view?usp=sharing", "«Конец дополнительной полосы движения»",
                "Указывает на конец полосы, предназначенной для движения в данном направлении."));

        informationSignsService.save(new InformationSignsDto("5.22", "https://drive.google.com/file/d/1lZFK4YrSxMwnn8CPVvRCPP7DyaXAaQHq/view?usp=sharing", "«Примыкание полосы для разгона транспортных средств»",
                "Информирует о наличии примыкания полосы для разгона на одном уровне с правой стороны."));

        informationSignsService.save(new InformationSignsDto("5.24.1", "https://drive.google.com/file/d/1XTFIh0e9o5AIHFpKd6pWijqDwNxae3ZA/view?usp=sharing", "«Изменение направления движения на дороге с разделительной полосой»",
                "Показывает направление объезда закрытого для движения участка проезжей части на дороге с разделительной полосой."));

        informationSignsService.save(new InformationSignsDto("5.24.2", "https://drive.google.com/file/d/1awRqDJOFrnX59sKAtFgm1lYOJQWqSpsa/view?usp=sharing", "«Изменение направления движения на дороге с разделительной полосой»",
                "Показывает направление движения для возвращения на проездную часть справа."));

        informationSignsService.save(new InformationSignsDto("5.25", "https://drive.google.com/file/d/1V4KPtSvVhgiJNf1yHkFPfZy1hDQGKcEr/view?usp=sharing", "«Полоса движения для аварийной остановки»",
                "Информирует водителя о расположении полосы, специально подготовленной для аварийной остановки транспортных средств (на горных перевалах, крутых спусках и т.п.) в случае отказа тормозной системы."));

        informationSignsService.save(new InformationSignsDto("5.26", "https://drive.google.com/file/d/1tiXxT4ur94ml4Urcz4bvP7pVfsgYbHIm/view?usp=sharing", "«Место для разворота»",
                "Обозначает место для разворота транспортных средств. Поворот налево запрещается."));

        informationSignsService.save(new InformationSignsDto("5.27", "https://drive.google.com/file/d/1V4KPtSvVhgiJNf1yHkFPfZy1hDQGKcEr/view?usp=sharing", "«Зона для разворота»",
                "Обозначает протяженность зоны для разворота транспортных средств. Поворот налево запрещается."));

        informationSignsService.save(new InformationSignsDto("5.28.1", "https://drive.google.com/file/d/1exiOKv8LWZfXEkyq0AngJ9030uiIli5W/view?usp=sharing", "«Направление движения для грузовых автомобилей»",
                "Показывает рекомендованное направление движения для грузовых автомобилей и самоходных машин."));

        informationSignsService.save(new InformationSignsDto("5.28.2", "https://drive.google.com/file/d/10fIU0aHlzXyo6lbrzq7gzTqIqDGshlF6/view?usp=sharing", "«Направление движения для грузовых автомобилей»",
                "Показывает рекомендованное направление движения для грузовых автомобилей и самоходных машин."));

        informationSignsService.save(new InformationSignsDto("5.28.3", "https://drive.google.com/file/d/142k6spG8AFt6d4eJ58tuMGWuADdh7HSm/view?usp=sharing", "«Направление движения для грузовых автомобилей»",
                "Показывает рекомендованное направление движения для грузовых автомобилей и самоходных машин."));

        informationSignsService.save(new InformationSignsDto("5.29.1", "https://drive.google.com/file/d/1DgRj6Tpnn7kJ3z40GVd7gPgBvA3x3unz/view?usp=sharing", "«Тупик»",
                "Применяется для обозначения дороги, которая не имеет сквозного проезда."));

        informationSignsService.save(new InformationSignsDto("5.29.2", "https://drive.google.com/file/d/1L8VxRPLS3tmDmBX0PsEyMXLIZyyz1RTH/view?usp=sharing", "«Тупик»",
                "Применяется для обозначения дороги, которая не имеет сквозного проезда."));

        informationSignsService.save(new InformationSignsDto("5.29.3", "https://drive.google.com/file/d/1c7IjezZQ8vCWQwN8bZ3fYHLQO47uYsH7/view?usp=sharing", "«Тупик»",
                "Применяется для обозначения дороги, которая не имеет сквозного проезда."));

        informationSignsService.save(new InformationSignsDto("5.30", "https://drive.google.com/file/d/1kAGaRCNlt5c254vjOtEtNh6qRLthBvGe/view?usp=sharing", "«Рекомендуемая скорость»",
                "Применяется для указания скорости, с которой рекомендуется движение на данном участке дороги, и устанавливается в начале участка, при этом зона действия знака распространяется к ближайшему перекрестку."));

        informationSignsService.save(new InformationSignsDto("5.31", "https://drive.google.com/file/d/1kk7SwqvjOgMovAKiqo6VZoXE67KeQiyA/view?usp=sharing", "«Жилая зона»",
                "Информирует о въезде на территорию, где действуют особые условия дорожного движения, предусмотренные данными Правилами."));

        informationSignsService.save(new InformationSignsDto("5.32", "https://drive.google.com/file/d/1p0PTp4vnwkh5DBZOXvj1X4Ygk8J4RAVn/view?usp=sharing", "«Конец жилой зоны»",
                "Применяется для обозначения конца жилой зоны."));

        informationSignsService.save(new InformationSignsDto("5.33", "https://drive.google.com/file/d/1GqCT90ysc7Ja2n1vUdLtmiATd69bYTJH/view?usp=sharing", "«Пешеходная зона»",
                "Информирует об особенностях и условиях дорожного движения, предусмотренные данными Правилами."));

        informationSignsService.save(new InformationSignsDto("5.34", "https://drive.google.com/file/d/1YgBC8W0oZKWTwPFyelYlAzEi6SPmjbUJ/view?usp=sharing", "«Конец пешеходной зоны»",
                "Применяется для обозначения конца пешеходной зоны."));

        informationSignsService.save(new InformationSignsDto("5.35.1", "https://drive.google.com/file/d/18jx8NA94p0lQY9JWojm5PEm5a3sQqDxR/view?usp=sharing", "«Пешеходный переход»",
                "Применяется для обозначения мест, предназначенных для организованного перехода пешеходов через проезжую часть."));

        informationSignsService.save(new InformationSignsDto("5.35.2", "https://drive.google.com/file/d/12OAtWoDblYSpgInokSMqAOk4yuAF6FrP/view?usp=sharing", "«Пешеходный переход»",
                "Применяется для обозначения мест, предназначенных для организованного перехода пешеходов через проезжую часть. Знак устанавливается слева от дороги на дальней границе перехода."));

        informationSignsService.save(new InformationSignsDto("5.36.1", "https://drive.google.com/file/d/1DPIunDUNfT0qDr8Ssl9ofbG9LMXQCJPw/view?usp=sharing", "«Подземный пешеходный переход»",
                "Используется для обозначения подземных пешеходных переходов."));

        informationSignsService.save(new InformationSignsDto("5.36.2", "https://drive.google.com/file/d/1z8eZv6P6IX76Kg0R6TthOcHHPqbbMNZ9/view?usp=sharing", "«Подземный пешеходный переход»",
                "Используется для обозначения подземных пешеходных переходов."));

        informationSignsService.save(new InformationSignsDto("5.37.1", "https://drive.google.com/file/d/1JkkQxuP7iED7ZLzlVTYUYGENcMUSbXNV/view?usp=sharing", "«Надземный пешеходный переход»",
                "Используется для обозначения надземных пешеходных переходов."));

        informationSignsService.save(new InformationSignsDto("5.37.2", "https://drive.google.com/file/d/1aErErqAOE4PvGcN9ksvFNcNanjFZ_0Qi/view?usp=sharing", "«Надземный пешеходный переход»",
                "Используется для обозначения надземных пешеходных переходов."));

        informationSignsService.save(new InformationSignsDto("5.38", "https://drive.google.com/file/d/1riuWAnl8w6mwXTkR46p1aM2jeMemMf3S/view?usp=sharing", "«Место для стоянки»",
                "применяется для обозначения мест и площадок для стоянки транспортных средств. Знак \"Место для стоянки\" применяется для крытых стоянок. Знак \"Место для стоянки\" применяется для крытых стоянок с возможностью пересадки на маршрутные транспортные средства."));

        informationSignsService.save(new InformationSignsDto("5.39", "https://drive.google.com/file/d/1XwA6vbWkuekQzrgPZ0LZIujG8vYKNDTd/view?usp=sharing", "«Зона стоянки»",
                "Определяет зону, где разрешена стоянка, при условиях, которые отмечаются на знаке или дополнительных табличках под ним."));

        informationSignsService.save(new InformationSignsDto("5.40", "https://drive.google.com/file/d/13dscKpVNGVIp5dDrgPXevNAVNB5n83rc/view?usp=sharing", "«Конец зоны стоянки»",
                "Применяется для обозначения конца зоны стоянки."));

        informationSignsService.save(new InformationSignsDto("5.41.1", "https://drive.google.com/file/d/1qHxC7EBGdweBIgLG3JN2pThdSkDU0kU9/view?usp=sharing", "«Пункт остановки автобуса»",
                "Обозначает начало посадочной площадки автобуса. обозначает начало посадочной площадки автобуса."));

        informationSignsService.save(new InformationSignsDto("5.41.2", "https://drive.google.com/file/d/1GPWWrrJQLikiHR53CcHugpuGZNzfSIWo/view?usp=sharing", "«Конец пункта остановки автобуса»",
                "Знак может устанавливаться в конце посадочной площадки пункта остановки автобуса."));

        informationSignsService.save(new InformationSignsDto("5.42.1", "https://drive.google.com/file/d/1ldlsJvOQTmiNiLmk2af52tEKnCP6ZW16/view?usp=sharing", "«Пункт остановки трамвая»",
                "Обозначает начало посадочной площадки трамвая."));

        informationSignsService.save(new InformationSignsDto("5.42.2", "https://drive.google.com/file/d/1iszf5XwSfkKW6uupYFM4GXnPQaXhkgc2/view?usp=sharing", "«Конец пункта остановки трамвая»",
                "Знак может устанавливаться в конце посадочной площадки пункта остановки трамвая."));

        informationSignsService.save(new InformationSignsDto("5.43.1", "https://drive.google.com/file/d/1cMyUzleZVrYzSL1poUbpu4nbuyVH6Q9l/view?usp=sharing", "«Пункт остановки троллейбуса»",
                "Обозначает начало посадочной площадки троллейбуса. За пределами населенных пунктов знак может быть установлен на павильоне со стороны прибытия маршрутных транспортных средств."));

        informationSignsService.save(new InformationSignsDto("5.43.2", "https://drive.google.com/file/d/1GratENAqesfJiuqwuTrJKBptpAdi4sdn/view?usp=sharing", "«Конец пункта остановки троллейбуса»",
                "Знак может устанавливаться в конце посадочной площадки пункта остановки троллейбуса."));

        informationSignsService.save(new InformationSignsDto("5.44", "https://drive.google.com/file/d/1aIMFjMXwr3HVsFEix4AEIazbtHfNDKLw/view?usp=sharing", "«Место остановки такси»",
                "Применяется для обозначения остановочного пункта такси, которое движется по установленному маршруту."));

        informationSignsService.save(new InformationSignsDto("5.45", "https://drive.google.com/file/d/1JIJOw8WhXDPK2walkDhkpCE32mQ24kc0/view?usp=sharing", "«Начало населенного пункта»",
                "Применяется для обозначения начала населенного пункту, в котором действуют требования данных."));

        informationSignsService.save(new InformationSignsDto("5.46", "https://drive.google.com/file/d/1lXjHTPtgGZvHogDnUOSS0jPDz2yCL7RY/view?usp=sharing", "«Конец населенного пункта»",
                "Обозначает место, с которого на данной дороге теряют действие требования данных Правил, определяющие порядок движения в населенных пунктах."));

        informationSignsService.save(new InformationSignsDto("5.47", "https://drive.google.com/file/d/1WfAo6E3x8t4Az090wmPXCd5tjsh5Ftz1/view?usp=sharing", "«Начало населенного пункта»",
                "Применяется для обозначения начала населенного пункта, в котором на дороге, где установлен этот знак, не действуют требования данных Правил, определяющие порядок движения в населенных пунктах."));

        informationSignsService.save(new InformationSignsDto("5.48", "https://drive.google.com/file/d/1Q9hLxNTS8M2idih3pJGmhIfvDdDmN1tO/view?usp=sharing", "«Конец населенного пункта»",
                "Обозначает конец населенного пункта, обозначенного знаком 5.47."));

        informationSignsService.save(new InformationSignsDto("5.49", "https://drive.google.com/file/d/1xtZ103xWT6xkUPDsvBMFk0MlAbsBRd98/view?usp=sharing", "«Указатель общих ограничений скорости»",
                "Информирует об общих ограничениях скорости на территории Украины."));

        informationSignsService.save(new InformationSignsDto("5.50", "https://drive.google.com/file/d/16kwfoySpXhb5e2VnEHhV7rvUBlIHIvGT/view?usp=sharing", "«Возможность использования дороги»",
                "Информирует о возможности движения по горной дороге, в частности в случае переезда через перевал, название которого отмечается в верхней части знака. Таблички 1, 2 и 3 — сменные."));

        informationSignsService.save(new InformationSignsDto("5.51", "https://drive.google.com/file/d/13qlh0UXwEdbYPwggqmRlMHYJ9eVRJIlE/view?usp=sharing", "«Предварительный указатель направлений»",
                "Применяется для обозначения направления движения к указанным на знаке населенных пунктов и другим объектам."));

        informationSignsService.save(new InformationSignsDto("5.52", "https://drive.google.com/file/d/1pZL0XA05u7sXRH3hYfqtgdoDwGVAkzd7/view?usp=sharing", "«Предварительный указатель направления»",
                "Информирует о направлении движения к указанным на нем пунктам."));

        informationSignsService.save(new InformationSignsDto("5.53", "https://drive.google.com/file/d/1cfFJhyneLHSt5Xe2kHvi4Kr5MlJEZzfw/view?usp=sharing", "«Указатель направления»",
                "Информируют о направлении движения к указанным на них пунктам."));

        informationSignsService.save(new InformationSignsDto("5.54", "https://drive.google.com/file/d/1ezgiKpzr6Z1sG1VDFVEBmuSRc4gNRveh/view?usp=sharing", "«Указатель направлений»",
                "Информирует о направлении движения к указанным на нем пунктам."));

        informationSignsService.save(new InformationSignsDto("5.55", "https://drive.google.com/file/d/1nTmieqLF1Y0zjT3lsWDejbdAzKQrwL1x/view?usp=sharing", "«Схема движения»",
                "Применяется в случае необходимости указать маршрут движения, если на перекрестке движение в отдельных направлениях запрещено, или указать разрешенные направления движения на перекрестке со сложным планированием."));

        informationSignsService.save(new InformationSignsDto("5.56", "https://drive.google.com/file/d/1zkC733Bc6w8vhLMcBemG7vUnGbh1tDwg/view?usp=sharing", "«Схема объезда»",
                "Применяется для указания маршрута объезда участка дороги, временно закрытого для движения."));

        informationSignsService.save(new InformationSignsDto("5.57.1", "https://drive.google.com/file/d/17baRdRLjs39l6aeT2LTE4uBhzSkblqqH/view?usp=sharing", "«Направление объезда»",
                "Применяется для указания направления объезда участка дороги, который временно закрыт для движения."));

        informationSignsService.save(new InformationSignsDto("5.57.2", "https://drive.google.com/file/d/1yJe1DplXOT5YtWbP8QLAGg231uGl7oCE/view?usp=sharing", "«Направление объезда»",
                "Применяется для указания направления объезда участка дороги, который временно закрыт для движения."));

        informationSignsService.save(new InformationSignsDto("5.57.3", "https://drive.google.com/file/d/1EeidecSdUgEVCm1KBGQPclkQfKJwP5Dd/view?usp=sharing", "«Направление объезда»",
                "Применяется для указания направления объезда участка дороги, который временно закрыт для движения."));

        informationSignsService.save(new InformationSignsDto("5.58.1", "https://drive.google.com/file/d/1N56GEt7wbgbUm5oiNy8ZoE6r8mlUn6R8/view?usp=sharing", "«Название объекта»",
                "Применяется для указания названия иного объекта иного, нежели населенный пункт (улица, речка, озеро, перевал, достопримечательность и др.)."));

        informationSignsService.save(new InformationSignsDto("5.58.2", "https://drive.google.com/file/d/1uKhfQxNF8mFFAVrlhZluhG5spFIgA6CT/view?usp=sharing", "«Название объекта»",
                "Применяется для указания названия иного объекта иного, нежели населенный пункт (улица, речка, озеро, перевал, достопримечательность и др.)."));

        informationSignsService.save(new InformationSignsDto("5.59", "https://drive.google.com/file/d/1DaB7Tlc2EHVV9m2V6lshzetRm9zpPxXi/view?usp=sharing", "«Указатель расстояний»",
                "Указывает расстояние до населенных пунктов (км), расположенных на маршруте."));

        informationSignsService.save(new InformationSignsDto("5.60", "https://drive.google.com/file/d/1IdCAen7wbHJuVha06V55oe3KcT5guRwS/view?usp=sharing", "«Километровый знак»",
                "Указывает расстояние от начала дороги (км)."));

        informationSignsService.save(new InformationSignsDto("5.61.1", "https://drive.google.com/file/d/1gtEBCf8e4UCKf43nnhnHjQtNWmvZIBPe/view?usp=sharing", "«Номер маршрута»",
                "Указывает номер, присвоенный дороге (маршруту)."));

        informationSignsService.save(new InformationSignsDto("5.61.2", "https://drive.google.com/file/d/1CgN1enfNPA96Ox8gbh85rhF08dLo6tyh/view?usp=sharing", "«Номер маршрута»",
                "Указывает номер и направление дороги (маршрута)."));

        informationSignsService.save(new InformationSignsDto("5.61.3", "https://drive.google.com/file/d/11Sq94wRRjzaVxS7Iu9meTzkOxhxTxEnY/view?usp=sharing", "«Номер маршрута»",
                "Указывает номер и направление дороги (маршрута)."));

        informationSignsService.save(new InformationSignsDto("5.62", "https://drive.google.com/file/d/162ufXbuYnc2N6QHZvLn5QlZiRLOAW-Na/view?usp=sharing", "«Место остановки»",
                "Указывает место остановки транспортных средств во время действия запрещающего сигнала светофора (регулировщика) или перед железнодорожными переездами, движение через которые регулируется светофорами."));

        informationSignsService.save(new InformationSignsDto("5.63.1", "https://drive.google.com/file/d/1v2Y8g3yOINcDdvJSM5b0hn0LgaY0cxZy/view?usp=sharing", "«Начало плотной застройки»",
                "Применяется исключительно в пределах населенных пунктов, начало которых обозначено знаком 5.47 \"Начало населенного пункта\", — после этого знака и на грани начала плотной застройки непосредственно вблизи проезжей части (при условии наличия такой застройки)."));

        informationSignsService.save(new InformationSignsDto("5.63.2", "https://drive.google.com/file/d/1XtFXMSteYIGre7j9h4kmCrNtoVFAxLTx/view?usp=sharing", "«Конец плотной застройки»",
                "Применяется исключительно в пределах населенных пунктов, начало которых обозначено знаком 5.47 \"Начало населенного пункта\", — после такого знака и на грани окончания плотной застройки непосредственно вблизи проезжей части (при условии последующего отсутствия такой застройки)."));

        informationSignsService.save(new InformationSignsDto("5.64", "https://drive.google.com/file/d/1OGbV12eoa7jEInXCjoeIGVsV9Htx3i2k/view?usp=sharing", "«Изменение схемы движения»",
                "Обозначает, что за этим знаком временно или постоянно изменена схема движения и (или) установлены новые дорожные знаки."));

        informationSignsService.save(new InformationSignsDto("5.65", "https://drive.google.com/file/d/1k66WfkSonIkyytfa9apTbaELwqqYMfId/view?usp=sharing", "«Аэропорт»",
                "Информирует о том, что впереди находится аэропорт."));

        informationSignsService.save(new InformationSignsDto("5.66", "https://drive.google.com/file/d/1pYohno2gTyCt5e12nDODBTGeWXGFpH6H/view?usp=sharing", "«Железнодорожный вокзал или пункт остановки поездов»",
                "Информирует о том, что впереди находится железнодорожный вокзал или пункт остановки поездов."));

        informationSignsService.save(new InformationSignsDto("5.67", "https://drive.google.com/file/d/1SGcd4r7l5q7ZsGIh1UYIbO1UuYFI76O8/view?usp=sharing", "«Автовокзал или автостанция»",
                "Информирует о том, что впереди находится автовокзал или автостанция."));

        informationSignsService.save(new InformationSignsDto("5.68", "https://drive.google.com/file/d/1JT8vwztgCMBWQa1D41yBAh6EJva0EGyQ/view?usp=sharing", "«Культовое сооружение»",
                "Информирует о том, что впереди находится культовое сооружение."));

        informationSignsService.save(new InformationSignsDto("5.69", "https://drive.google.com/file/d/1aGidejnXGsN7KpPMWiWiJJzpdLJ4D0ph/view?usp=sharing", "«Промышленная зона»",
                "Информирует о том, что впереди находится промышленная зона."));

        informationSignsService.save(new InformationSignsDto("5.70", "https://drive.google.com/file/d/1IYXVf2KY3YCmBrn4foXoi6Ct4yGhRjFV/view?usp=sharing", "«Фото-, видеофиксация нарушений Правил дорожного движения»",
                "Информирует о возможности осуществления контроля за нарушениями Правил дорожного движения с помощью специальных технических и (или) технических средств."));




        serviceSignsService.save(new ServiceSignsDto("6.1", "https://drive.google.com/file/d/1AvkeNgGjhswGs9XKlZdCwqu2BLRbHt9w/view?usp=sharing", "«Пункт первой медицинской помощи»", "Информирует участников дорожного движения о расположении пункта первой медицинской помощи."));

        serviceSignsService.save(new ServiceSignsDto("6.2", "https://drive.google.com/file/d/142rFfu5tkg9fUBExBc5wgrn06U0CSMQN/view?usp=sharing", "«Больница»", "Информирует участников дорожного движения о расположении больницы."));

        serviceSignsService.save(new ServiceSignsDto("6.3", "https://drive.google.com/file/d/1K60QjoyVxwsNi7tlrt1pVTXHzGuU5Y1t/view?usp=sharing", "«Телефон для вызова аварийной службы»", "Информирует участников дорожного движения о расположении телефона для вызова аварийной службы."));

        serviceSignsService.save(new ServiceSignsDto("6.4", "https://drive.google.com/file/d/1mEHQJ0Av23aEmFna1xHOw4HZmtLBBNBW/view?usp=sharing", "«Огнетушитель»", "Информирует участников дорожного движения о расположении огнетушителя."));

        serviceSignsService.save(new ServiceSignsDto("6.5", "https://drive.google.com/file/d/1NWW5utXUAZ8Gaj5BZfXfToMqKHVKT4xY/view?usp=sharing", "«Пункт технического обслуживания»", "Информирует участников дорожного движения о расположении пункта технического обслуживания."));

        serviceSignsService.save(new ServiceSignsDto("6.6", "https://drive.google.com/file/d/1dnRuyHtQGItDoLfCGTJZch6rCofBT3Lr/view?usp=sharing", "«Пункт мойки автомобилей»", "Информирует участников дорожного движения о расположении пункта мойки автомобилей."));

        serviceSignsService.save(new ServiceSignsDto("6.7.1", "https://drive.google.com/file/d/1Rh1CxD2GNj4KvkfLmkbJA16jvbyE5Kec/view?usp=sharing", "«Автозаправочная станция»", "Информирует участников дорожного движения о расположении автозаправочной станции."));

        serviceSignsService.save(new ServiceSignsDto("6.7.2", "https://drive.google.com/file/d/1Xjt8emrd7it51k3ORJUSbJ6gTkEECb9c/view?usp=sharing", "«Автозаправочная станция»", "Информирует участников дорожного движения о расположении газовой автозаправочной станции."));

        serviceSignsService.save(new ServiceSignsDto("6.7.3", "https://drive.google.com/file/d/1JIJvgH7hqvdAnHo4y8zZCJye8CusdKp2/view?usp=sharing", "«Автозаправочная станция»", "Информирует участников дорожного движения о расположении совместной автозаправочной станции."));

        serviceSignsService.save(new ServiceSignsDto("6.8", "https://drive.google.com/file/d/1bhAJ3iWkOeO0Fbam24ZDKRvlDsrHcWyG/view?usp=sharing", "«Телефон»", "Информирует участников дорожного движения о расположении телефона."));

        serviceSignsService.save(new ServiceSignsDto("6.9", "https://drive.google.com/file/d/1laS6Au9xtKywEtMfgOYrKgAIlWHYIJVh/view?usp=sharing", "«Пункт справочной службы»", "Информирует участников дорожного движения о расположении пункта справочной службы."));

        serviceSignsService.save(new ServiceSignsDto("6.10", "https://drive.google.com/file/d/1BxCFQ1NTciRPqovmUbwsSpRBkDB8Rubu/view?usp=sharing", "«Пост ГАИ»", "Информирует участников дорожного движения о расположении поста ГАИ."));

        serviceSignsService.save(new ServiceSignsDto("6.11", "https://drive.google.com/file/d/1BvrAPPmG1haDvYLIBnhDYQQTIgust6F1/view?usp=sharing", "«Туалет»", "Информирует участников дорожного движения о расположении туалета."));

        serviceSignsService.save(new ServiceSignsDto("6.12", "https://drive.google.com/file/d/19WWNJRI65hjPgRXKeWwGfUppI8AxKYFN/view?usp=sharing", "«Питьевая вода»", "Информирует участников дорожного движения о расположении источника питьевой воды."));

        serviceSignsService.save(new ServiceSignsDto("6.13", "https://drive.google.com/file/d/1GQnlPKVSqZUeEBu2TdzxwFClyZXbH9XS/view?usp=sharing", "«Ресторан или столовая»", "Информирует участников дорожного движения о расположении ресторана или столовой."));

        serviceSignsService.save(new ServiceSignsDto("6.14", "https://drive.google.com/file/d/1xwDYctnCDwFsQ9DgHQ9ecvzsPzkoiINp/view?usp=sharing", "«Кафе»", "Информирует участников дорожного движения о расположении кафе."));

        serviceSignsService.save(new ServiceSignsDto("6.15", "https://drive.google.com/file/d/1UjXtsYxyAY0RJRDwh9AvqyCO5EVoSEij/view?usp=sharing", "«Место отдыха»", "Информирует участников дорожного движения о расположении места отдыха."));

        serviceSignsService.save(new ServiceSignsDto("6.16", "https://drive.google.com/file/d/1SxSq743cq9fCY1PUPY63ZvSW7H5Dsv8M/view?usp=sharing", "«Отель или мотель»", "Информирует участников дорожного движения о расположении отеля или мотеля."));

        serviceSignsService.save(new ServiceSignsDto("6.17", "https://drive.google.com/file/d/144Tf79mHGsIoSnhGigpfjP5dZMwOgomf/view?usp=sharing", "«Туристическая база»", "Информирует участников дорожного движения о расположении туристической базы."));

        serviceSignsService.save(new ServiceSignsDto("6.18", "https://drive.google.com/file/d/1VhdztOi3G9VzLjsHSw2graXWuAbsheKG/view?usp=sharing", "«Кемпинг»", "Информирует участников дорожного движения о расположении кемпинга."));

        serviceSignsService.save(new ServiceSignsDto("6.19", "https://drive.google.com/file/d/1Qei0IXHIeL9INy93AXSctR0ssmRZkWgr/view?usp=sharing", "«Место стоянки прицепов у кемпинга»", "Информирует участников дорожного движения о расположении места стоянки прицепов у кемпинга."));

        serviceSignsService.save(new ServiceSignsDto("6.20", "https://drive.google.com/file/d/1EYypC5KDTPAsF8hc0q037TZT9Es274th/view?usp=sharing", "«Участок для лагеря автотуристов и место стоянки прицепов у кемпинга»", "Информирует участников дорожного движения о расположении участка для лагеря автотуристов и места стоянки прицепов у кемпинга."));

        serviceSignsService.save(new ServiceSignsDto("6.21", "https://drive.google.com/file/d/153HhZE6VbdKnBng2cNeKJZN7e2OoVD9I/view?usp=sharing", "«Дома отдыха»", "Информирует участников дорожного движения о расположении домов для отдыха."));

        serviceSignsService.save(new ServiceSignsDto("6.22", "https://drive.google.com/file/d/1syw7MWOyQNint3Eonx6eMF4uyxW1QubO/view?usp=sharing", "«Начало пешеходного маршрута»", "Информирует участников дорожного движения о расположении начала пешеходного маршрута."));





        inited = true;
    }
}
