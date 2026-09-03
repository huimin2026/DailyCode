package variable;

public class VariableDemo2 {
    /*
    我方：叉子        对方：长手
攻击：220        攻击：210
防御：85         防御：80
血量：1012.5     血量：1223.3
技能加成： 1.2   技能加成：1.3

技能造成伤害的公式：攻击力 * 技能加成 - 对方防御力
普攻造成伤害的公式：攻击力 - 对方防御力

计算：
    我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
    我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？

规则：经常发生改变的数据，用变量记录
     */

    // 1. 定义变量记录我方攻击力
    int attack1 = 220;

    // 2. 定义变量记录我方防御力
    int defense1 = 85;

    // 3. 定义变量记录我方血量
    double blood1 = 1012.5;

    // 4. 定义变量记录我方技能加成
    double skill1 = 1.2;

    // 5. 定义变量记录对方攻击力
    int attack2 = 210;

    // 6. 定义变量记录对方防御力
    int defense2 = 80;

    // 7. 定义变量记录对方血量
    double blood2 = 1223.3;

    // 8. 定义变量记录对方技能加成
    double skill2 = 1.3;

    public static void main(String[] args) {
        VariableDemo2 game = new VariableDemo2();

        // 9. 我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
        // 普攻造成伤害的公式：攻击力 - 对方防御力
        double damage = game.attack1 - game.defense2;
        game.blood2 = game.blood2 - damage;
        System.out.println("普攻造成伤害: " + damage);
        System.out.println("对方剩余血量: " + game.blood2);

        // 10. 我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？
        // 技能造成伤害的公式：攻击力 * 技能加成 - 对方防御力
        double skillDamage = game.attack1 * game.skill1 - game.defense2;
        game.blood2 = game.blood2 - skillDamage;
        System.out.println("技能攻击造成伤害: " + skillDamage);
        System.out.println("对方剩余血量: " + game.blood2);
    }
}
