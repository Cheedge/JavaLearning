package com.lqz.team.service;


public class Data {
    public static final int EMPLOYEE = 10;
    public static final int WARRIOR = 11;
    public static final int REMEDIAL = 12;
    public static final int COMMANDER = 13;

    public static final int BOOK = 21;
    public static final int WEAPON = 22;
    public static final int MOUNT = 23;

    //Employee  :  10, id, name, age, hp
    //Warrior   :  11, id, name, age, hp
    //Remedial  :  12, id, name, age, hp, logistics
    //Commander :  13, id, name, age, hp, logistics, strategy
    public static final String[][] EMPLOYEES = {
        {"10", "1", "小虾米", "22", "6000"},
        {"13", "2", "田伯光", "32", "18000", "9000", "2000"},
        {"11", "3", "宮本寶藏", "16", "10000"},
        {"11", "4", "忍太郎", "18", "7300"},
        {"12", "5", "阿土伯", "70", "10000", "5000"},
        {"11", "6", "孫小美", "9", "9800"},
        {"12", "7", "錢夫人", "22", "10800","2000"},
        {"13", "8", "沙隆巴斯", "45", "10800", "5000", "2500"},
        {"11", "10", "金贝贝", "1", "6600"},
        {"11", "11", "乌咪", "10", "7100"},
        {"12", "9", "林月如", "18", "9800", "5500"},
        {"12", "12", "赵灵儿", "16", "9600", "4800"}
    };
    
    //如下的EQIPMENTS数组与上面的EMPLOYEES数组元素一一对应
    //TAO	  :20, model, effect, belongId
    //BOOK    :21, model, effect, belongId
    //WEAPON  :22, model, effect, belongId
    //MOUNT   :23, model, effect, belongId
    public static final String[][] EQUIPMENTS = {
    {"22", "朴刀", "攻击", null},
	{"21", "孟德新书", "策略", "12"},
	{"21", "平蠻指掌圖", "策略", "11"},
	{"23", "大宛马", "速度", null},
	{"23", "爪黄飞电", "速度", null},
    {"22", "龙泉剑", "攻击", null},
	{"20", "太平清領書", "大保健", "10"},
    {"23", "的卢", "速度", "9"},
	{"22", "双股剑", "攻击", "9"},
    {"22", "越女剑", "攻击", null},
    {"23", "赤兔", "速度", "1"},
    {"20", "武侯显圣", "大保健", null},
	{"22", "青龙偃月", "攻击", "2"},
    {"22", "七星宝刀", "攻击", "3"},
    {"22", "养由基弓", "攻击", null},
	{"21", "太平要術", "策略", null},
    {"22", "青釭剑", "攻击", "12"},
    {"20", "诸葛禳星", "大保健", null},
    {"20", "南辰北斗", "大保健", "0"},
	{"23", "青囊書", "大保健", "6"},
    {"22", "古锭刀","攻击", "5"},
	{"21", "西蜀地形圖","策略", "7"},
    {"22", "丈八蛇矛", "攻击", "8"},
	{"23", "乌骓马", "速度", "8"}
    };
}
