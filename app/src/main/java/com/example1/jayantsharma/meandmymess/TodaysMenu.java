package com.example1.jayantsharma.meandmymess;

public class TodaysMenu {

    String[][] d = {{"MONDAY", "(Poha, Matki gravy and sev, Sweet corn, Peanut Butter)", "(Veg fried rice, Mix dal tadka, Veg Manchurian, Curd, Rice papad, Rasam)", "(Mirchi Pakoda, Green chutney)", "(Mix Veg, Urad dal, Dalma Sambar, Chilli chana, Water melon, Gajar halwa)"},
            {"TUESDAY", "(Alu Paratha, Paneer bhurji, Moong sprouts)", "(Corn pulao, Toor dal (No ginger-garlic)(Crispy gobi fry (using cornflour), Ginger sambar, Veg Kohlapuri, Masala papad)", "(Dahi Vada)", "(Cabbage-muttor curry, Masoor dal tadka, French beans fry, Rasam, Rasgolla, Black grapes)"},
            {"WEDNESDAY", "(Idli Vada, Sambar and chutny, Boiled red chana)", "(Veg biryani, Moong dal, Alu french fries, Lemon juice, Mix raita (without tomato), Alu Parwali masala, Dalma sambar)", "(Fried Maggie/Veg hakka Noodles)", "(Palak corn, Toor daal (without ginger garlic paste), Kachha bhindi, Rasam, Apple, Boondi ladoo)"},
            {"THURSDAY", "(Vegetable upma and shira, Chana dal chutney, Sweet corn)", "(Jeera rice, Masoor daal tadka, Rajma, Banana fry,Lassi, Rasam, Plain papad)", "(Thali peeth, Chutney)", "(Paneer buttur masala, Chana dal, Dalma sambar, Long chauli fry, Sevai kheer, Papaya)"},
            {"FRIDAY", "(Paneer paratha, Tomato chutney, Moong sprouts)", "(Ghee peas rice, Toor dal tadka (without ginger garlic paste), Rasam, Drumstick mustard sukha masala, Soyabean alu curry, fryum)", "(Fried Idli, Cocunut chutney)", "(Lauki kofta curry, Masoor dal, Dalma sambar, Dahi baigan spicy, Ice cream)"},
            {"SATURDAY", "(Masala dosa, Sambar and coconut chutney, Boiled red chana)", "(Chole masala, Puri, Urad  dal, Hyderbadi sambar, Butter milk, Alu jeera)", "(Samosa, Green chutney, Meethi Chutney)", "(Veg Navaratna, Toor dal, Hyderbadi Sambar, Tinda alu, Gulab jamun, Pineapple)"},
            {"SUNDAY", "(Vegetable upma and shira, Chana dal chutney, Sweet corn)", "(Jeera rice, Masoor daal tadka, Rajma, Banana fry,Lassi, Rasam, Plain papad)", "(Thali peeth, Chutney)", "(Paneer buttur masala, Chana dal, Dalma sambar, Long chauli fry, Sevai kheer, Papaya)"}};


    int i;

    public String getbreakfast(String Day) {
        String c = "Not found";
        for (i = 0; i < 6; i++) {
            if (d[i][0].equalsIgnoreCase(Day)) {
                c = d[i][1];
            }
        }
        return c;
    }

    public String getlunch(String Day) {
        String c = "Not found";
        for (i = 0; i < 6; i++) {
            if (d[i][0].equalsIgnoreCase(Day)) {
                c = d[i][2];
            }
        }
        return c;
    }

    public String getsnacks(String Day) {
        String c = "Not found";
        for (i = 0; i < 6; i++) {
            if (d[i][0].equalsIgnoreCase(Day)) {
                c = d[i][3];
            }
        }
        return c;
    }

    public String getdinner(String Day) {
        String c = "Not found";
        for (i = 0; i < 6; i++) {
            if (d[i][0].equalsIgnoreCase(Day)) {
                c = d[i][4];
            }
        }
        return c;
    }
}
