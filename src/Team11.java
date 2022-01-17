public class Team11
{
    public static void main(String[] arg)
    {
        TeamMember kaiZheng = new TeamMember("郑凯","组长","纽约", "跑步和backpacking");
        TeamMember YiranZheng = new TeamMember("郑一然","副组长","Dallas", "弹钢琴，游泳，打游戏");
        kaiZheng.introduction();
        YiranZheng.introduction();
        kaiZheng.teamIntroduction();
        YiranZheng.fortuneTeller();
    }
}

class TeamMember
{
    static String laiOfferClass = "2021冬季1班";
    static String banZhuRen = "Anna老师";
    int teamNumber = 11 ;
    String title;
    String name;
    String location;
    String hobby;
    public TeamMember(String name, String title, String location, String hobby)
    {
        this.name = name;
        this.title = title;
        this.location = location;
        this.hobby = hobby;
    }

    public void introduction()
    {
        System.out.println("大家好，我是" + laiOfferClass + teamNumber + "组" + title + name + "，坐标" + location + "。平时喜欢" + hobby +"。\n");
    }

    public void teamIntroduction()
    {
        System.out.println("欢迎大家报名加入第11组。目前我们的小组训练计划是组员每天做题打卡，定期开组会交流算法和其他一切与找到一份程序员工作相关的问题。\n" +
                "我们的宗旨是通过小组的活动来提高大家执行力与准备效率，而不让小组活动成为大家的负担。\n" +
                "希望在接下来的几个月时间内，能够与大家互相督促，共同进步。在" + banZhuRen + "的带领下，每个人都能收到自己心仪的Offer。\n" +
                "最后的彩蛋，欢迎大家create自己的TeamMember instance，给自己算上一卦，看看可以收获哪家的offer。\n\n我们先来给一然同学算一卦来看看：\n" );
    }

    public void fortuneTeller()
    {
        String[] techCo = new String[] {"Google", "Meta", "MicroSoft", "Amazon", "Apple", "Netflix"};
        int coIndex = (int)(Math.random() * 5);

        System.out.println("天灵灵，地灵灵！！！ 恭喜你" + this.name +"同学，你会收到来自" + techCo[coIndex] +"的Offer！ \n");

    }



}
